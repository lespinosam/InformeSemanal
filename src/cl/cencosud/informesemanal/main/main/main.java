package cl.cencosud.informesemanal.main.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.net.ssl.TrustManager;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import cl.cencosud.informesemanal.service.semanalService;
import cl.cencosud.informesemanal.service.semanalServiceImpl;

public class main implements TrustManager {

	 private static Properties properties;
	  
	  static
	  {
	    DOMConfigurator.configure("resources/log4j.xml");
	  }
	  
	  protected static final Logger logger = Logger.getLogger(main.class);
	  
	public static void main(String[] args) {
		
		Properties prop = new Properties();
    	InputStream input = null;
    	String filename = null;
		logger.info("--------------------------------------------------------------");
	    logger.info("Iniciando proceso de generar archivo de vitrineo");
		try {
    		logger.info("Comenzando carga de archivo config en variable properties del método Main");
    		FileInputStream fis = new FileInputStream("config.properties");
    		System.out.println("valor : "+ fis);
    		
    		System.out.println("valor : "+ input);
    		if(fis == null){
    		   logger.error("No es posible encontrar el archivo:" + fis);
    		}
    		prop.load(fis);	
    	} catch (IOException ex) {
    		ex.printStackTrace();
    		logger.error("Se produjo por :" + ex);
        } finally {
        	if(input != null){
	    		try {
	    			input.close();
	    		} catch (IOException e) {
	    			e.printStackTrace();
	    			logger.error("Se produjo por :" + e);
	    		}
        	}
        }   
		String fechaInicial = prop.getProperty("fecha_inicial");
		String fechaFin =  prop.getProperty("fecha_fin");
		
		
	    logger.info("********INPUT A INGRESAR*********");
	    logger.info("Fecha Inicial :" + fechaInicial);
	    logger.info("Fecha Final :" + fechaFin);
	    logger.info("********FIN INGRESAR*********");
	}


}
