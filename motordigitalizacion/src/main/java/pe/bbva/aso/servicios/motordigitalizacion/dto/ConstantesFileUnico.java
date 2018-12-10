package pe.bbva.aso.servicios.motordigitalizacion.dto;

public class ConstantesFileUnico {

	public static class KEY {
		public static final String FILE_UNICO = "File Unico";
		public static final String NUMERO_CONTRATO = "Numero Contrato";
		public static final String OFICINA_GESTORA = "Oficina Gestora";
		public static final String ID_CONTRATO = "Id Contrato";
		public static final String ID_GRUPO = "Id Grupo";
		public static final String LISTA_CLIENTES = "Lista Clientes";
		public static final String CODIGO_CENTRAL = "Codigo Central";
		public static final String TIPO_DOCUMENTO = "Tipo Documento";
		public static final String NUMERO_DOCUMENTO = "Número Documento";
		public static final String EMAIL = "Email";
		public static final String LISTA_ITEMS = "Lista Items";
		public static final String FECHA_APERTURA = "Fecha de Apertura";
		public static final String NOMBRE_APELLIDO = "Nombre Apellido";
		public static final String NOMBRE_PRIMER_TITULAR = "Nombre de primer titular";
		public static final String ENTIDAD = "Entidad";
		public static final String CENTRO_OFICINA = "Centro Oficina";
		public static final String CUENTA = "Cuenta";
		public static final String OFERTA_PRIORIDAD = "OfertaPrioridad";
		
		public static final String COD_ENTIDAD_BBVA = "11";
		public static final String TIPODOI = "tipoDoi";
		public static final String NUMERODOI = "numeroDoi";
		public static final String OCUPACION = "ocupacion";
		public static final String TELEFONO = "telefono";
		public static final String CORREO = "correo";
		public static final String DIRECCIONOBJ = "direccionObj";
		public static final String DIRECCION = "direccion";
		public static final String PRODUCTOCUENTA = "productoCuenta";
		
		public static final String MARCA = "marca";
		public static final String TIPO_TARJETA = "tipoTarjeta";
		public static final String PROG_BENEFICIO = "progBeneficio";
		public static final String MONTO_INGRESADO = "montoIngresado";
		public static final String FECHA_PAGO = "fechaPago";
		public static final String TEA = "tea";
		public static final String TCEA = "tcea";
		public static final String ESTADO_CIVIL="estadoCivil";
		public static final String ENVIO_TARJETA="envioTarjeta";
		public static final String ENVIO_DETALLE_TARJETA="envioDetalleTarjeta";
		public static final String NUMERO_TARJETA = "numeroTarjeta";
		public static final String DESCRIPCION_DIVISA = "descripcionDivisa";
		
		/*** Ini -- PI22018-S6-Storm -- Generación de documentos TC - jdavila **/
		public final static String FU_SEG_DIA_INICIO_VIGENCIA_DESC = "DIA_INICIO_VIGENCIA";
		public final static String FU_SEG_MES_INICIO_VIGENCIA_DESC = "MES_INICIO_VIGENCIA";
		public final static String FU_SEG_ANIO_INICIO_VIGENCIA_DESC = "AÑO_INICIO_VIGENCIA";
		public final static String FU_SEG_LUGAR_EMISION_DESC = "LUGAR_EMISION";
		public final static String FU_SEG_DIA_EMISION_DESC = "DIA_EMISION";
		public final static String FU_SEG_MES_EMISION_DESC = "MES_EMISION";
		public final static String FU_SEG_ANIO_EMISION_DESC = "ANIO_EMISION";
		public final static String FU_NUMERO_CONTRATO = "NUM_CONTRATO";
		/*** Fin -- PI22018-S6-Storm -- Generación de documentos TC - jdavila **/
	}

	/** Valores OPERACIONES **/
	public static class ALTA_PRODUCTO {
		public static final String ALTA_CUENTA = "ALTA_CUENTA";
		public static final String ALTA_TARJETA = "ALTA_TARJETA";
		
	}
	
	/** Valores default **/
	public static class DEFAULT_VALUE {
		
		public static final String DEFAULT_TIPO_CONTRATO = "INDIVIDUAL";
		public static final String DEFAULT_ID_DEPARTMENT = "DEPARTMENT";
		public static final String DEFAULT_ID_PROVINCE = "PROVINCE";
		public static final String DEFAULT_ID_DISTRICT = "DISTRICT";
		public static final String DEFAULT_ID_INTERIOR_NUMBER = "INTERIOR_NUMBER";
		public static final String DEFAULT_ID_EXTERIOR_NUMBER = "EXTERIOR_NUMBER";
		public static final String DEFAULT_ID_BLOCK = "BLOCK";
		public static final String DEFAULT_ID_LOT = "LOT";
		public static final String DEFAULT_ID_AVENUE = "AVENUE";
		public static final String DEFAULT_ID_URBANIZACION = "URBANIZATION";
		public static final String DEFAULT_FLAG_FATCA = "1";
		public static final String DEFAULT_LUGAR_NACIMIENTO = "PERU";
		public static final String DEFAULT_NACIONALIDAD = "PER";
		public static final String DEFAULT_X = "X";
		public static final String CLAS_RIESGO_BAJO = "I";
		public static final String CLAS_RIESGO_MEDIO = "II";
		public static final String CLAS_RIESGO_ALTO = "III";
		public static final String DES_RIESGO_BAJO = "B";
		public static final String DES_RIESGO_MEDIO = "M";
		public static final String DES_RIESGO_ALTA = "A";
		public static final String ID_TIPO_CLIENTE = "F";
		public static final String ID_RIESGO_DOCUMENTO_1 = "E2843 Inf. Apertura de cuenta PN";
		public static final String ID_TIPODOI_L = "DNI";
		public static final String PROCEDENCIA = "NA";
		public static final String GESTDOC = "online";
		public static final String IDGRUPO = "3";
		public static final String IDGRUPO_TC = "4";
		public static final String IDGRUPO_LPDP = "1";
		public static final String CODPRODUCTO = "02";
		public static final String IDTRXHUELLADIGITAL = "idTrxHuellaDigital";
		public static final String FLAG_TARJETA_NUEVA = "flagTarjetaNueva";
		public static final String SUELDO_PRODUCTO = "flagTarjetaNueva";
		public static final String NROTARJETA = "nroTarjeta";
		public static final String ENABLE_LPDP = "enableLPDP";
		public static final String COD_PRODUCTO = "CONTIAHORRO";
		public static final String SUELDO_MENSUAL = "SUELDOMENSUAL";
		public static final String FLAG_CLIENTE_NUEVO = "flagClienteNuevo";
		public static final String CODIGO_INTER_INTERBANCARIO = "00-";
		public static final String GUION = "-";
		public static final String CODIGO_INTERNO = " INT ";
		public static final String CODIGO_EXTERNO = " EXT ";
		public static final String DEFAULT_NUMERO_CONTRATO = "00000000000000000000";
		public static final String DEFAULT_ID_CONTRATO = "99001CLS";
		public static final String DEFAULT_CONFIRMACION = "S";
		public static final String DEFAULT_NEGACION = "N";
		public static final String INDICADOR_FEMENINO = "F";
		public static final String INDICADOR_MASCULINO = "M";
		public static final String DESCRIPCION_FEMENINO= "Femenino";
		public static final String DESCRIPCION_MASCULINO = "Masculino";
	
		public static final String IDCONTRATO_DOMICILIO = "409999ED"; 
		public static final String IDCONTRATO_OFICINA   = "409999EO"; 
		public static final String DEFAULT_DATO_VACIO   = "-";
	}
	
	/** POSICIONES DE SUBSTRING PARA NUMERO DE CUENTA **/
	public static class POSICION_NUMERO_CUENTA {
		public static final int INICIO_ENTIDAD = 0;
		public static final int FIN_ENTIDAD = 4;
		public static final int INICIO_OFICINA = 4;
		public static final int FIN_OFICINA = 8;
		public static final int INICIO_DIGITO_CONTROL = 8;
		public static final int FIN_DIGITO_CONTROL = 10;
		public static final int INICIO_CUENTA = 10;
	}
	
	/** CODIGOS CONTRATOS **/
	public static class CODIGOS_CONTRATOS {
		
		public final static String FU_CTR_FECHA_APERTURA = "CTR0|A01";
		public final static String FU_CTR_ENTIDAD = "CTR0|A02";
		public final static String FU_CTR_CENTRO_OFICINA = "CTR0|A03";
		public final static String FU_CTR_CUENTA = "CTR0|A04";
		public final static String FU_CTR_DIGITO_CONTROL = "CTR0|A05";
		public final static String FU_CTR_DIRECCION_1 = "CTR0|A06";
		public final static String FU_CTR_DIRECCION_2 = "CTR0|A07";
		public final static String FU_CTR_DESCRIPCION_DIVISA = "CTR0|A08";
		public final static String FU_CTR_TIPO_CONTRATO = "CTR0|A09";
		public final static String FU_CTR_PAGINA = "CTR0|A10";
		public final static String FU_CTR_PAGINA_FICTICIA = "CTR0|A11";
		public final static String FU_CTR_NOMBRE_PRIMER_TITULAR = "CTR0|G01";
		public final static String FU_CTR_NOMBRE_SEGUND_TITULAR = "CTR0|G02";
		public final static String FU_CTR_DOCUM_PRIMER_TITULAR = "CTR0|G03";
		public final static String FU_CTR_FECHA_EXTENDIDAD = "CTR0|G04";
		public final static String FU_CTR_DOCUM_SEGUND_TITULAR = "CTR0|G05";
		public final static String FU_CTR_NOMBRE_CORTO = "CTR0|G06";
		public final static String FU_CTR_INDICADOR_FIRM_ADICIONAL = "CTR0|P22";

		/** CODIGOS CONFIGURACION **/
		public final static String FU_CFG_NOMBRE_FORMATO = "CFG0|P00";
		public final static String FU_CFG_NUMERO_CONTRATO = "CFG0|P01";
		public final static String FU_CFG_OFICINA_GESTORA = "CFG0|P02";
		public final static String FU_CFG_TIPO_DOCUMENTO_PRIMER_TITULAR = "CFG0|P03";
		public final static String FU_CFG_NUMERO_DOCUMENTO_PRIMER_TITULAR = "CFG0|P04";
		public final static String FU_CFG_NOMBRE_COMPLETO_PARTICIPE = "CFG0|P05";
		public final static String FU_CFG_CODIGO_CENTRAL_PRIMER_TITULAR = "CFG0|P07";
		public final static String FU_CFG_CODIGO_PRECEDENCIA = "CFG0|P09";
		public final static String FU_CFG_DESCRIPCION_DIVISA = "CFG0|P10";
		public final static String FU_CFG_EMAIL_PRIMER_TITULAR = "CFG0|P11";
		public final static String FU_CFG_FLAG_CLIENTE_PEP = "CFG0|P13";
		public final static String FU_CFG_FLAG_FAMILIAR_PEP = "CFG0|P14";
		public final static String FU_CFG_FLAG_CLIENTE_FATCA = "CFG0|P15";
		public final static String FU_CFG_CODIGO_INTERBANCARIO = "CFG0|P16";
		public final static String FU_CFG_TRANSACCION_HUELLA_DIGITAL = "CFG0|P17";
		public final static String FU_CFG_INDICADOR_RBA = "CFG0|P18";
		public final static String FU_CFG_TARJETA_NUEVA = "CFG0|P19";
		public final static String FU_CFG_CLIENTE_NUEVO = "CFG0|P20";
		public final static String FU_CFG_CLAVE_PROD_Y_SUBPRO = "CFG0|P21";
		public final static String FU_CFG_FECHA_APERTURA = "CFG0|P23";
		public final static String FU_CFG_FECHA_CANCELACION = "CFG0|P25";
		public final static String FU_CFG_SUBPRODUCTO = "CFG0|P26";
		public final static String FU_CFG_NUMERO_CONTRATO_METADATA = "CFG0|P27";
		public final static String FU_CFG_FLAG_FU_O_BATCH = "CFG0|P28";
		public final static String FU_CFG_GRUPO_PETICION = "CFG0|P29";
		public final static String FU_CFG_VARIABLE_NUM_CERTIFICADO = "CFG0|P30";
		public final static String FU_CFG_VARIABLE_PAGO_MENSUAL = "CFG0|P31";
		public final static String FU_CFG_ENVIO_VOUCHER_CUENTA_ASOC = "CFG0|P32";
		public final static String FU_CFG_PLANTILLA_LPDP = "CFG0|P33";

		/** CODIGOS FAT **/
		public final static String FU_FAT_FECDOC = "FAT0|A01";
		public final static String FU_FAT_RAZDOC = "FAT0|A02";
		public final static String FU_FAT_TIPODOC = "FAT0|A03";
		public final static String FU_FAT_NRODOC = "FAT0|A04";
		public final static String FU_FAT_PAISRF = "FAT0|A05";
		public final static String FU_FAT_FECHA_NACIMIENTO = "FAT0|A06";
		public final static String FU_FAT_DIRECCION = "FAT0|A07";
		public final static String FU_FAT_DEPARTAMENTO = "FAT0|A08";
		public final static String FU_FAT_CPOS = "FAT0|A09";
		public final static String FU_FAT_NACIONALIDAD = "FAT0|A10";
		public final static String FU_FAT_NACIONALIDAD_ADIC_1 = "FAT0|A11";
		public final static String FU_FAT_NACIONALIDAD_ADIC_2 = "FAT0|A12";
		public final static String FU_FAT_PAIS_DOMICILIO_1 = "FAT0|A13";
		public final static String FU_FAT_PAIS_DOMICILIO_2 = "FAT0|A14";
		public final static String FU_FAT_PAIS_RESIDENCIA_FISCAL_1 = "FAT0|A15";
		public final static String FU_FAT_PAIS_RESIDENCIA_FISCAL_2 = "FAT0|A16";
		public final static String FU_FAT_PAIS_RESIDENCIA_FISCAL_3 = "FAT0|A17";
		public final static String FU_FAT_TIPO_DOCUMENTO = "FAT0|A18";
		public final static String FU_FAT_NR_DOCUMENTO = "FAT0|A19";
		public final static String FU_FAT_COD_DOCUMENTO = "FAT0|A20";
		public final static String FU_FAT_DIA_DOCUMENTO = "FAT0|A21";
		public final static String FU_FAT_NRO_DOCUMENTO = "FAT0|A22";
		public final static String FU_FAT_RAZSOC = "FAT0|A23";

		/** CODIGOS RBA **/
		public final static String FU_RBA_NUM_CLIENTE = "RBA0|P01";
		public final static String FU_RBA_NOM_CLIENTE = "RBA0|P02";
		public final static String FU_RBA_TIP_CLIENTE = "RBA0|P03";
		public final static String FU_RBA_CLASIFICACION_RIESGO = "RBA0|P04";
		public final static String FU_RBA_DESCRIPCION = "RBA0|P05";
		public final static String FU_RBA_ = "RBA0|P06";
		public final static String FU_RBA_DOCUMENTO_1 = "RBA0|P07";
		public final static String FU_RBA_DOCUMENTO_2 = "RBA0|P08";
		public final static String FU_RBA_DOCUMENTO_3 = "RBA0|P09";
		public final static String FU_RBA_DOCUMENTO_4 = "RBA0|P10";
		public final static String FU_RBA = "RBA0|P11";
		public final static String FU_RBA_TERMINAL = "RBA0|P12";
		public final static String FU_RBA_REGISTRO_USUARIO = "RBA0|P13";
		public final static String FU_RBA_HORA = "RBA0|P14";
		public final static String FU_RBA_FECHA = "RBA0|P15";
		/** CODIGOS CLS **/
		public final static String FU_CLS_FECHA_EXTENDIDA = "CLS0|G01";
		public final static String FU_CLS_NOMBRE_COMPLETO = "CLS0|G02";
		public final static String FU_CLS_DOI = "CLS0|G03";
		/** CODIGOS HAD **/
		public final static String FU_HAD_NUMERO_DOCUMENTO = "HAD0|G01";
		public final static String FU_HAD_NOMBRE_COMPLETO = "HAD0|G02";
		public final static String FU_HAD_EMAIL = "HAD0|G03";
		public final static String FU_HAD_EMAIL_1 = "HAD0|G04";
		public final static String FU_HAD_DIRECCION = "HAD0|G05";
		public final static String FU_HAD_DIRECCION_2 = "HAD0|G06";
		public final static String FU_HAD_TELEFONO_1 = "HAD0|G07";
		public final static String FU_HAD_TELEFONO_2 = "HAD0|G08";
		public final static String FU_HAD_TELEFONO_3 = "HAD0|G09";
		public final static String FU_HAD_CONTROL = "HAD0|G10";
		public final static String FU_HAD_EMAIL_2 = "HAD0|G11";
		public final static String FU_HAD_EMAIL_3 = "HAD0|G12";
		public final static String FU_HAD_EMAIL_4 = "HAD0|G13";
		public final static String FU_HAD_EMAIL_5 = "HAD0|G14";
		public final static String FU_HAD_EMAIL_6 = "HAD0|G15";
		public final static String FU_HAD_EMAIL_7 = "HAD0|G16";
		public final static String FU_HAD_EMAIL_8 = "HAD0|G17";
		public final static String FU_HAD_EMAIL_9 = "HAD0|G18";
		public final static String FU_HAD_EMAIL_10 = "HAD0|G19";
		public final static String FU_HAD_TELEFONO_4 = "HAD0|G20";
		public final static String FU_HAD_TELEFONO_5 = "HAD0|G21";
		public final static String FU_HAD_TELEFONO_6 = "HAD0|G22";
		public final static String FU_HAD_TELEFONO_7 = "HAD0|G23";
		public final static String FU_HAD_TELEFONO_8 = "HAD0|G24";
		public final static String FU_HAD_TELEFONO_9 = "HAD0|G25";
		public final static String FU_HAD_TELEFONO_10 = "HAD0|G26";
		public final static String FU_HAD_LPDP = "HAD0|G27";
		public final static String FU_HAD_FECHA = "HAD0|G28";

		public final static String CLIENTE_NUEVO = "S";
		public final static String TARJETA_NUEVA = "N";

		public final static String PRODUCTO_DIVISA = "PEN";
		public final static String TIPO_MONEDA_SOLES = "SOLES";
		public final static String TIPO_MONEDA_DOLARES = "DOLORES";

		public final static String FU_RBA_VALOR = "1";
	}
	
	/** CODIGOS DE SOLICITUD EN CUENTA **/
	public static class _CUENTA {
		public final static String FU_SOL_FECHA = "SOL0|A01";
		public final static String FU_SOL_CLIENTE = "SOL0|A02";
		public final static String FU_SOL_PRODUCTO = "SOL0|A03";
		public final static String FU_SOL_SUBPRODUCTO = "SOL0|A04";
		public final static String FU_SOL_CUENTA = "SOL0|A05";
		public final static String FU_SOL_TIPCTA = "SOL0|A06";
		public final static String FU_SOL_NOMBRES = "SOL0|A07";
		public final static String FU_SOL_APELLIDOS = "SOL0|A08";
		public final static String FU_SOL_DOCUMENTO_IDENTIDAD = "SOL0|A09";
		public final static String FU_SOL_FECHA_NACIMIENTO = "SOL0|A10";
		public final static String FU_SOL_PROFESION_OCUPACION = "SOL0|A11";
		public final static String FU_SOL_CENTRO_LABORES = "SOL0|A12";
		public final static String FU_SOL_PUESTO_DESEMPENO = "SOL0|A13";
		public final static String FU_SOL_INGRESO_MENSUAL = "SOL0|A14";
		public final static String FU_SOL_LUGAR_NACIMIENTO = "SOL0|A15";
		public final static String FU_SOL_NACIONALIDAD = "SOL0|A16";
		public final static String FU_SOL_CORREO_ELECTRONICO = "SOL0|A17";
		public final static String FU_SOL_IND_VIAL = "SOL0|A18";
		public final static String FU_SOL_CALLE = "SOL0|A19";
		public final static String FU_SOL_NUMERO_EXTENSION = "SOL0|A20";
		public final static String FU_SOL_DEPARTAMENTO = "SOL0|A21";
		public final static String FU_SOL_PROVINCIA = "SOL0|A22";
		public final static String FU_SOL_DISTRITO = "SOL0|A23";
		public final static String FU_SOL_REFERENCIA_DOMICILIO = "SOL0|A24";
		public final static String FU_SOL_TELEFONO_FIJO = "SOL0|A25";
		public final static String FU_SOL_TIPO_DIR_ALTERNA = "SOL0|A26";
		public final static String FU_SOL_DIRECCION_ALTERNA = "SOL0|A27";
		public final static String FU_SOL_NUMERO_LOTE = "SOL0|A28";
		public final static String FU_SOL_TELEFONO_2_ALTERNATIVO = "SOL0|A29";
		public final static String FU_SOL_NACIDO_EXTRANJERO_SI = "SOL0|A30";
		public final static String FU_SOL_NACIDO_EXTRANJERO_NO = "SOL0|A31";
		public final static String FU_SOL_NACIDO_EXTRANJERO_CIUDAD = "SOL0|A32";
		public final static String FU_SOL_NACIDO_EXTRANJERO_PAIS = "SOL0|A33";
		public final static String FU_SOL_RESIDE_EXTRANJERO_SI = "SOL0|A34";
		public final static String FU_SOL_RESIDE_EXTRANJERO_NO = "SOL0|A35";
		public final static String FU_SOL_DIRECCION_OFICINA = "SOL0|A36";
		public final static String FU_SOL_RESIDE_EXTRANJERO_PAIS = "SOL0|A37";
		public final static String FU_SOL_DIRECCION_EXTRANJERO = "SOL0|A38";
		public final static String FU_SOL_CLIENTE_PEP_SI = "SOL0|A39";
		public final static String FU_SOL_CLIENTE_PEP_NO = "SOL0|A40";
		public final static String FU_SOL_CLIENTE_PEP_CARGO = "SOL0|A41";
		public final static String FU_SOL_CLIENTE_PEP_FECHA = "SOL0|A42";
		public final static String FU_SOL_CLIENTE_PEP_INSITUCION = "SOL0|A43";
		public final static String FU_SOL_CLIENTE_FPEP_SI = "SOL0|A44";
		public final static String FU_SOL_CLIENTE_FPEP_NO = "SOL0|A45";
		public final static String FU_SOL_NOMBRE_APELLIDO = "SOL0|A46";
		public final static String FU_SOL_FUNCION_1 = "SOL0|A47";
		public final static String FU_SOL_PAIS = "SOL0|A48";
		public final static String FU_SOL_VINCULAR_FAMILIAR = "SOL0|A49";
		public final static String FU_SOL_PROP_MAYOR_25_SI = "SOL0|A50";
		public final static String FU_SOL_PROP_MENOR_25_NO = "SOL0|A51";
		public final static String FU_SOL_ACT_ADICIONAL_SI = "SOL0|A52";
		public final static String FU_SOL_ACT_ADICIONAL_NO = "SOL0|A53";
		public final static String FU_SOL_FECHA_DESEMPENO = "SOL0|A54";
		public final static String FU_SOL_FUNCION_2 = "SOL0|A55";
		public final static String FU_SOL_SOLICITO_NO_GEN_TAR = "SOL0|A56";
		public final static String FU_SOL_NO_GENERAR_TARJETA = "SOL0|A57";
		public final static String FU_SOL_CLIENTE_CON_TB = "SOL0|A58";
		public final static String FU_SOL_CLIENTE_SOL_TB = "SOL0|A59";
		public final static String FU_SOL_LIBRE1 = "SOL0|A60";
		public final static String FU_SOL_NUMERO_TB = "SOL0|A61";
		public final static String FU_SOL_USO_DE_JETFORM = "SOL0|A62";
		public final static String FU_SOL_PROTECCION_DATOS_SI = "SOL0|A63";
		public final static String FU_SOL_PROTECCION_DATOS_NO = "SOL0|A64";
		public final static String FU_SOL_SRV_A_CLI_POLITI_SI = "SOL0|A65";
		public final static String FU_SOL_SRV_A_CLI_POLITI_NO = "SOL0|A66";
	}

	/** CODIGOS DE SOLICITUD EN TARJETA **/
	public static class _TARJETA {
		public static final String FU_SOL_CANAL_SOLCITANTE = "SOL0|A01";
		public static final String FU_SOL_FECHA_HORA = "SOL0|A02";
		public static final String FU_SOL_TARJETA = "SOL0|A03";
		public static final String FU_SOL_PROGRAMA_BENEFICIOS = "SOL0|A04";
		public static final String FU_SOL_NUMERO_LIFEMILES = "SOL0|A05";
		public static final String FU_SOL_LINEA_CREDITO = "SOL0|A06";
		public static final String FU_SOL_TEA = "SOL0|A07";
		public static final String FU_SOL_TCEA = "SOL0|A08";
		public static final String FU_SOL_NOMBRES_APELLIDOS = "SOL0|A09";
		public static final String FU_SOL_DOCUMENTO_IDENTIDAD = "SOL0|A10";
		public static final String FU_SOL_FECHA_NACIMIENTO = "SOL0|A11";
		public static final String FU_SOL_SEXO = "SOL0|A12";
		public static final String FU_SOL_ESTADO_CIVIL = "SOL0|A13";
		public static final String FU_SOL_OCUPACION = "SOL0|A14";
		public static final String FU_SOL_SITUACION_VIVIENDA = "SOL0|A15";
		public static final String FU_SOL_DEPENDIENTES = "SOL0|A16";
		public static final String FU_SOL_DOMICILIO = "SOL0|A17";
		public static final String FU_SOL_DETALLE_DOMICILIO = "SOL0|A18";
		public static final String FU_SOL_PAIS_NACIMIENTO = "SOL0|A19";
		public static final String FU_SOL_PAIS_RESIDENCIA_FISCAL = "SOL0|A20";
		public static final String FU_SOL_TELEFONO = "SOL0|A21";
		public static final String FU_SOL_SITUACION_LABORAL = "SOL0|A22";
		public static final String FU_SOL_EMPRESA = "SOL0|A23";
		public static final String FU_SOL_ACTIVIDAD_ECONOMICA = "SOL0|A24";
		public static final String FU_SOL_ANTIGUEDAD_LABORAL = "SOL0|A25";
		public static final String FU_SOL_INGRESO_TITULAR_NETO = "SOL0|A26";
		public static final String FU_SOL_PAGO_ALQUILER_VIVIENDA = "SOL0|A27";
		public static final String FU_SOL_ENVIO_ESTADO_CUENTA = "SOL0|A28";
		public static final String FU_SOL_DETALLE_ENVIO_ESTADO_CUENTA = "SOL0|A29";
		public static final String FU_SOL_ENVIO_TARJETA= "SOL0|A30";
		public static final String FU_SOL_DETALLE_ENVIO_TARJETA = "SOL0|A31";
		public static final String FU_SOL_ENVIO_DOCUMENTO = "SOL0|A32";
		public static final String FU_SOL_REGISTRO_EJECUTIVO = "SOL0|A33";
		public static final String FU_SOL_NOMBRE_OFICINA = "SOL0|A34";
		public static final String FU_SOL_CODIGO_OFICINA = "SOL0|A35";
		public static final String FU_SOL_DIRECCION_OFICINA = "SOL0|A36";

		public final static String FU_SEG_DIA_INICIO_VIGENCIA = "SEG0|A01";
		public final static String FU_SEG_MES_INICIO_VIGENCIA = "SEG0|A02";
		public final static String FU_SEG_ANIO_INICIO_VIGENCIA = "SEG0|A03";
		public final static String FU_SEG_LUGAR_EMISION = "SEG0|A04";
		public final static String FU_SEG_DIA_EMISION = "SEG0|A05";
		public final static String FU_SEG_MES_EMISION = "SEG0|A06";
		public final static String FU_SEG_ANIO_EMISION = "SEG0|A07";

		public final static String FU_CLS_FECHA_EXTENDIDA = "CLS0|G01";
		public final static String FU_CLS_NOMBRE_APELLIDO = "CLS0|G02";
		public final static String FU_CLS_DOCUMENTO_O_RUC = "CLS0|G03";
	}
}