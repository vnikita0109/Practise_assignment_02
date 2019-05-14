
 import java.io.*;

class Readnprint{

    public static void main (String[] args) throws Exception{

        String filepath="/home/nikita/IdeaProjects/Readnprint/file.txt";        // initializing string with path

        int i=0;
        FileInputStream f=new FileInputStream(filepath);                        //passing the file path to object

        int j=0;
        while ((j=f.read())!=-1)                                                //reading file content
        {
            if (Character.isLowerCase(j))
            {
                j=Character.toUpperCase(j);                                     //uppercasing character by character
            }
            System.out.print((char)j);
            i++;
        }
        System.out.println(i-1);                                                //display the file content


    }

}