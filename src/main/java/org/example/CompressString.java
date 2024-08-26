package org.example;

import java.io.IOException;

public class CompressString {
    public static void main(String[] args) throws IOException {

        String str = "aaaAAbbCCddd";
        int left =0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)!=str.charAt(i) && i!=str.length()-1){
                count = i-left;
                sb.append(str.charAt(i-1)).append(count);
                left = i;
            }else if(i == str.length()-1){
                sb.append(str.charAt(i)).append(i-left+1);
            }

        }

        System.out.println(sb);

    }
}
