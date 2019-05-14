
 import java.io.*;

class Readnprint{

    public static void main (String[] args) throws Exception{

        String filepath="/home/nikita/IdeaProjects/Readnprint/file.txt";

        int i=0;
        FileInputStream f=new FileInputStream(filepath);

        int j=0;
        while ((j=f.read())!=-1)
        {
            if (Character.isLowerCase(j))
            {
                j=Character.toUpperCase(j);
            }
            System.out.print((char)j);
            i++;
        }
        System.out.println(i-1);


    }

}