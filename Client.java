package javaprojectsem2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnknownHostException;
import java.net.InetAddress;
import java.net.socket;
import java.net.UnknownHostException;
import java.swing.*;
import java.util.*;
class Client{
   public static void main(String[] args){
   try{
         Client obj=new Client();
         Socket client=new Socket("localhost",1221);
         //Here the Port number=1221 and hostname="localhost"
         DataInputStream Din=new DataInputStream(client.getInputStream());
         //Inside of DataInputStream client.getInputStream returns the InputStream attached to socket
         DataOutputStream Dout=new DataOutputStream(client.getOutputStream());
         //Inside of DataOutputStream client.getOutputStream returns the OutputStream attached to socket
         JFileChooser ifc=new JFileChooser();
         //JFileChooser points to users default directory
         int i=ifc.showOpenDialog(null);
         //Invokes the showOpenDialog function to show the save dialog
         //IF user selects a file
         if(i == JFileChooser.APPROVE_OPTION){
            File target_file=ifc.getSelectedFile();
            //Set the Label to the path of the seleted File
            Dout.write(obj.CreateDataPacket("124".getBytes("UTF8"), target_file.getName().getBytes("UTF8")));
            Dout.flush();//It is used to flushes the data output stream
            RandomAccessFile raf= new RandomAccessFile(target_file, "r");//RandomAccessFile(File file,String mode)
            long file_pointer=0;
            boolean lbreak=false;
            while(true){
               if(Din.read()==2){
                  byte[] 
               }
            }
         }
      }

   }
}
