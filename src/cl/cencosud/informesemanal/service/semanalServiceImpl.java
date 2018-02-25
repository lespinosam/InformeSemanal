package cl.cencosud.informesemanal.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;

public class semanalServiceImpl implements semanalService{
	 protected static final Logger logger = Logger.getLogger(semanalServiceImpl.class);
	 private Properties properties;
	 
	public boolean obtenerArchivo(Integer idVitrineo, String rut, String swEjecucion, Properties prop){
		logger.info("Ingresando a Semanal Service Implement");
	return true;
  }
}

