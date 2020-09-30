import java.io.*;

class EscribirArchivoBytes{
	public static void main(String []ar){
		FileOutputStream fos=null;
		byte[] datosIn=new byte[100]; //Buffer Temp para guardar lo del teclado
		
		try{
		System.out.println("Mensaje a guardar:");		
		System.in.read(datosIn); //Solo lee del teclado
	
		//File archivo=new File("TextoTeclado.txt");
		fos=new FileOutputStream("OtroArchivoTexto.txt",true);
		fos.write(datosIn);
		} catch(IOException ioe){
			System.out.println("error!!");
		}finally{
			try{
			fos.close();
			}catch(IOException uoe){
				System.out.println("Error al cerrar flujo!");
			}
		}


	}
}