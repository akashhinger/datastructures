import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;





public class FlippingBits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static long flippingBits(long n) {
        // Write your code here
        String bin = Long.toBinaryString(n);
        String invBinString = "";
        while(bin.length()<32){
            bin = '0' +bin;
        }
        for(int i =0;i<32;i++){
            if(bin.charAt(i)=='0'){
                invBinString +='1';
            }
            if(bin.charAt(i)=='1'){
                invBinString+='0';
            }
        }
        return Long.parseLong(invBinString, 2);
        }
}
