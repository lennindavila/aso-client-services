package pe.bbva.aso.servicios.motordigitalizacion.dto.request;

import java.io.Serializable;

public class RequestListItems  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fu_ctr_fecha_apertura;
	private String fu_ctr_entidad;
	private String fu_ctr_centro_oficina;
	private String fu_ctr_cuenta;
	private String fu_ctr_digito_control;
	private String fu_ctr_direccion_1;
	private String fu_ctr_direccion_2;
	private String fu_ctr_descripcion_divisa;
	private String fu_ctr_tipo_contrato;
	private String fu_ctr_pagina;
	private String fu_ctr_nombre_primer_titular;
	private String fu_ctr_nombre_segund_titular;
	private String fu_ctr_docum_primer_titular;
	private String fu_ctr_fecha_extendidad;
	private String fu_ctr_docum_segund_titular;
	private String fu_cfg_numero_contrato;
	private String fu_cfg_tipo_documento_primer_titular;
	private String fu_cfg_numero_documento_primer_titular;
	private String fu_cfg_nombre_completo_participe;
	private String fu_cfg_codigo_central_primer_titular;
	private String fu_cfg_descripcion_divisa;
	private String fu_cfg_email_primer_titular;
	private String fu_cfg_flag_cliente_pep;
	private String fu_cfg_flag_familiar_pep;
	private String fu_cfg_flag_cliente_fatca;
	private String fu_cfg_codigo_interbancario;
	private String fu_cfg_transaccion_huella_digital;
	private String fu_cfg_indicador_rba;
	private String fu_cfg_tarjeta_nueva;
	private String fu_cfg_cliente_nuevo;
	private String fu_cfg_fecha_apertura;
	private String fu_cfg_plantilla_lpdp;
	private String fu_sol_fecha;
	private String fu_sol_cliente;
	private String fu_sol_producto;
	private String fu_sol_subproducto;
	private String fu_sol_cuenta;
	private String fu_sol_tipcta;
	private String fu_sol_nombres;
	private String fu_sol_apellidos;
	private String fu_sol_documento_identidad;
	private String fu_sol_fecha_nacimiento;
	private String fu_sol_profesion_ocupacion;
	private String fu_sol_centro_labores;
	private String fu_sol_puesto_desempeno;
	private String fu_sol_ingreso_mensual;
	private String fu_sol_lugar_nacimiento;
	private String fu_sol_nacionalidad;
	private String fu_sol_correo_electronico;
	private String fu_sol_ind_vial;
	private String fu_sol_calle;
	private String fu_sol_numero_extension;
	private String fu_sol_departamento;
	private String fu_sol_provincia;
	private String fu_sol_distrito;
	private String fu_sol_referencia_domicilio;
	private String fu_sol_telefono_fijo;
	private String fu_sol_tipo_dir_alterna;
	private String fu_sol_direccion_alterna;
	private String fu_sol_numero_lote;
	private String fu_sol_telefono_2_alternativo;
	private String fu_sol_nacido_extranjero_si;
	private String fu_sol_nacido_extranjero_no;
	private String fu_sol_nacido_extranjero_ciudad;
	private String fu_sol_nacido_extranjero_pais;
	private String fu_sol_reside_extranjero_si;
	private String fu_sol_reside_extranjero_no;
	/*private String fu_sol_direccion_oficina;*/
	private String fu_sol_reside_extranjero_pais;
	private String fu_sol_direccion_extranjero;
	private String fu_sol_cliente_pep_si;
	private String fu_sol_cliente_pep_no;
	private String fu_sol_cliente_pep_cargo;
	private String fu_sol_cliente_pep_fecha;
	private String fu_sol_cliente_pep_insitucion;
	private String fu_sol_cliente_fpep_si;
	private String fu_sol_cliente_fpep_no;
	private String fu_sol_nombre_apellido;
	private String fu_sol_funcion_1;
	private String fu_sol_pais;
	private String fu_sol_vincular_familiar;
	private String fu_sol_prop_mayor_25_si;
	private String fu_sol_prop_menor_25_no;
	private String fu_sol_act_adicional_si;
	private String fu_sol_act_adicional_no;
	private String fu_sol_fecha_desempeno;
	private String fu_sol_funcion_2;
	private String fu_sol_solicito_no_gen_tar;
	private String fu_sol_no_generar_tarjeta;
	private String fu_sol_cliente_con_tb;
	private String fu_sol_cliente_sol_tb;
	private String fu_sol_libre1;
	private String fu_sol_numero_tb;
	private String fu_sol_uso_de_jetform;
	private String fu_sol_proteccion_datos_si;
	private String fu_sol_proteccion_datos_no;
	private String fu_sol_srv_a_cli_politi_si;
	private String fu_sol_srv_a_cli_politi_no;
	private String fu_rba_num_cliente;
	private String fu_rba_nom_cliente;
	private String fu_rba_tip_cliente;
	private String fu_rba_clasificacion_riesgo;
	private String fu_rba_descripcion;
	private String fu_rba_;
	private String fu_rba_documento_1;
	private String fu_rba_hora;
	private String fu_rba_fecha;
	private String fu_fat_fecdoc;
	private String fu_fat_razdoc;
	private String fu_fat_tipodoc;
	private String fu_fat_nrodoc;
	private String fu_fat_paisrf;
	private String fu_fat_fecha_nacimiento;
	private String fu_fat_direccion;
	private String fu_fat_departamento;
	private String fu_fat_cpos;
	private String fu_fat_nacionalidad;
	private String fu_fat_nacionalidad_adic_1;
	private String fu_fat_nacionalidad_adic_2;
	private String fu_fat_pais_domicilio_1;
	private String fu_fat_pais_domicilio_2;
	private String fu_fat_pais_residencia_fiscal_1;
	private String fu_fat_pais_residencia_fiscal_2;
	private String fu_fat_pais_residencia_fiscal_3;
	private String fu_fat_tipo_documento;
	private String fu_fat_nr_documento;
	private String fu_fat_cod_documento;
	private String fu_fat_dia_documento;
	private String fu_fat_nro_documento;
	private String fu_fat_razsoc;
	private String fu_ctr_nombre_corto;
	private String fu_ctr_indicador_firm_adicional;
	private String fu_sol_canal_solcitante;
	private String fu_sol_fecha_hora;
	private String fu_sol_tarjeta;
	private String fu_sol_programa_beneficios;
	private String fu_sol_numero_lifemiles;
	private String fu_sol_linea_credito;
	private String fu_sol_tcea;
	private String fu_sol_tea;
	private String fu_sol_nombres_apellidos;
	/*private String fu_sol_documento_identidad;
	private String fu_sol_fecha_nacimiento;*/
	private String fu_sol_sexo;
	private String fu_sol_estado_civil;
	private String fu_sol_ocupacion;
	private String fu_sol_situacion_vivienda;
	private String fu_sol_dependientes;
	private String fu_sol_detalle_domicilio;
	private String fu_sol_pais_nacimiento;
	private String fu_sol_pais_residencia_fiscal;
	private String fu_sol_telefono;
	private String fu_sol_situacion_laboral;
	private String fu_sol_empresa;
	private String fu_sol_actividad_economica;
	private String fu_sol_antiguedad_laboral;
	private String fu_sol_ingreso_titular_neto;
	private String fu_sol_pago_alquiler_vivienda;
	private String fu_sol_envio_estado_cuenta;
	private String fu_sol_detalle_envio_estado_cuenta;
	private String fu_sol_envio_tarjeta;
	private String fu_sol_detalle_envio_tarjeta;
	private String fu_sol_envio_documento;
	private String fu_sol_registro_ejecutivo;
	private String fu_sol_nombre_oficina;
	private String fu_sol_codigo_oficina;
	private String fu_sol_direccion_oficina;
	private String fu_seg_dia_inicio_vigencia;
	private String fu_seg_mes_inicio_vigencia;
	private String fu_seg_anio_inicio_vigencia;
	private String fu_seg_lugar_emision;
	private String fu_seg_dia_emision;
	private String fu_seg_mes_emision;
	private String fu_seg_anio_emision;
	private String fu_cls_fecha_extendida;
	private String fu_cls_nombre_apellido;
	private String fu_cls_documento_o_ruc;
	
	public String getFu_ctr_fecha_apertura() {
		return fu_ctr_fecha_apertura;
	}
	public void setFu_ctr_fecha_apertura(String fu_ctr_fecha_apertura) {
		this.fu_ctr_fecha_apertura = fu_ctr_fecha_apertura;
	}
	public String getFu_ctr_entidad() {
		return fu_ctr_entidad;
	}
	public void setFu_ctr_entidad(String fu_ctr_entidad) {
		this.fu_ctr_entidad = fu_ctr_entidad;
	}
	public String getFu_ctr_centro_oficina() {
		return fu_ctr_centro_oficina;
	}
	public void setFu_ctr_centro_oficina(String fu_ctr_centro_oficina) {
		this.fu_ctr_centro_oficina = fu_ctr_centro_oficina;
	}
	public String getFu_ctr_cuenta() {
		return fu_ctr_cuenta;
	}
	public void setFu_ctr_cuenta(String fu_ctr_cuenta) {
		this.fu_ctr_cuenta = fu_ctr_cuenta;
	}
	public String getFu_ctr_digito_control() {
		return fu_ctr_digito_control;
	}
	public void setFu_ctr_digito_control(String fu_ctr_digito_control) {
		this.fu_ctr_digito_control = fu_ctr_digito_control;
	}
	public String getFu_ctr_direccion_1() {
		return fu_ctr_direccion_1;
	}
	public void setFu_ctr_direccion_1(String fu_ctr_direccion_1) {
		this.fu_ctr_direccion_1 = fu_ctr_direccion_1;
	}
	public String getFu_ctr_direccion_2() {
		return fu_ctr_direccion_2;
	}
	public void setFu_ctr_direccion_2(String fu_ctr_direccion_2) {
		this.fu_ctr_direccion_2 = fu_ctr_direccion_2;
	}
	public String getFu_ctr_descripcion_divisa() {
		return fu_ctr_descripcion_divisa;
	}
	public void setFu_ctr_descripcion_divisa(String fu_ctr_descripcion_divisa) {
		this.fu_ctr_descripcion_divisa = fu_ctr_descripcion_divisa;
	}
	public String getFu_ctr_tipo_contrato() {
		return fu_ctr_tipo_contrato;
	}
	public void setFu_ctr_tipo_contrato(String fu_ctr_tipo_contrato) {
		this.fu_ctr_tipo_contrato = fu_ctr_tipo_contrato;
	}
	public String getFu_ctr_pagina() {
		return fu_ctr_pagina;
	}
	public void setFu_ctr_pagina(String fu_ctr_pagina) {
		this.fu_ctr_pagina = fu_ctr_pagina;
	}
	public String getFu_ctr_nombre_primer_titular() {
		return fu_ctr_nombre_primer_titular;
	}
	public void setFu_ctr_nombre_primer_titular(String fu_ctr_nombre_primer_titular) {
		this.fu_ctr_nombre_primer_titular = fu_ctr_nombre_primer_titular;
	}
	public String getFu_ctr_nombre_segund_titular() {
		return fu_ctr_nombre_segund_titular;
	}
	public void setFu_ctr_nombre_segund_titular(String fu_ctr_nombre_segund_titular) {
		this.fu_ctr_nombre_segund_titular = fu_ctr_nombre_segund_titular;
	}
	public String getFu_ctr_docum_primer_titular() {
		return fu_ctr_docum_primer_titular;
	}
	public void setFu_ctr_docum_primer_titular(String fu_ctr_docum_primer_titular) {
		this.fu_ctr_docum_primer_titular = fu_ctr_docum_primer_titular;
	}
	public String getFu_ctr_fecha_extendidad() {
		return fu_ctr_fecha_extendidad;
	}
	public void setFu_ctr_fecha_extendidad(String fu_ctr_fecha_extendidad) {
		this.fu_ctr_fecha_extendidad = fu_ctr_fecha_extendidad;
	}
	public String getFu_ctr_docum_segund_titular() {
		return fu_ctr_docum_segund_titular;
	}
	public void setFu_ctr_docum_segund_titular(String fu_ctr_docum_segund_titular) {
		this.fu_ctr_docum_segund_titular = fu_ctr_docum_segund_titular;
	}
	public String getFu_cfg_numero_contrato() {
		return fu_cfg_numero_contrato;
	}
	public void setFu_cfg_numero_contrato(String fu_cfg_numero_contrato) {
		this.fu_cfg_numero_contrato = fu_cfg_numero_contrato;
	}
	public String getFu_cfg_tipo_documento_primer_titular() {
		return fu_cfg_tipo_documento_primer_titular;
	}
	public void setFu_cfg_tipo_documento_primer_titular(String fu_cfg_tipo_documento_primer_titular) {
		this.fu_cfg_tipo_documento_primer_titular = fu_cfg_tipo_documento_primer_titular;
	}
	public String getFu_cfg_numero_documento_primer_titular() {
		return fu_cfg_numero_documento_primer_titular;
	}
	public void setFu_cfg_numero_documento_primer_titular(String fu_cfg_numero_documento_primer_titular) {
		this.fu_cfg_numero_documento_primer_titular = fu_cfg_numero_documento_primer_titular;
	}
	public String getFu_cfg_nombre_completo_participe() {
		return fu_cfg_nombre_completo_participe;
	}
	public void setFu_cfg_nombre_completo_participe(String fu_cfg_nombre_completo_participe) {
		this.fu_cfg_nombre_completo_participe = fu_cfg_nombre_completo_participe;
	}
	public String getFu_cfg_codigo_central_primer_titular() {
		return fu_cfg_codigo_central_primer_titular;
	}
	public void setFu_cfg_codigo_central_primer_titular(String fu_cfg_codigo_central_primer_titular) {
		this.fu_cfg_codigo_central_primer_titular = fu_cfg_codigo_central_primer_titular;
	}
	public String getFu_cfg_descripcion_divisa() {
		return fu_cfg_descripcion_divisa;
	}
	public void setFu_cfg_descripcion_divisa(String fu_cfg_descripcion_divisa) {
		this.fu_cfg_descripcion_divisa = fu_cfg_descripcion_divisa;
	}
	public String getFu_cfg_email_primer_titular() {
		return fu_cfg_email_primer_titular;
	}
	public void setFu_cfg_email_primer_titular(String fu_cfg_email_primer_titular) {
		this.fu_cfg_email_primer_titular = fu_cfg_email_primer_titular;
	}
	public String getFu_cfg_flag_cliente_pep() {
		return fu_cfg_flag_cliente_pep;
	}
	public void setFu_cfg_flag_cliente_pep(String fu_cfg_flag_cliente_pep) {
		this.fu_cfg_flag_cliente_pep = fu_cfg_flag_cliente_pep;
	}
	public String getFu_cfg_flag_familiar_pep() {
		return fu_cfg_flag_familiar_pep;
	}
	public void setFu_cfg_flag_familiar_pep(String fu_cfg_flag_familiar_pep) {
		this.fu_cfg_flag_familiar_pep = fu_cfg_flag_familiar_pep;
	}
	public String getFu_cfg_flag_cliente_fatca() {
		return fu_cfg_flag_cliente_fatca;
	}
	public void setFu_cfg_flag_cliente_fatca(String fu_cfg_flag_cliente_fatca) {
		this.fu_cfg_flag_cliente_fatca = fu_cfg_flag_cliente_fatca;
	}
	public String getFu_cfg_codigo_interbancario() {
		return fu_cfg_codigo_interbancario;
	}
	public void setFu_cfg_codigo_interbancario(String fu_cfg_codigo_interbancario) {
		this.fu_cfg_codigo_interbancario = fu_cfg_codigo_interbancario;
	}
	public String getFu_cfg_transaccion_huella_digital() {
		return fu_cfg_transaccion_huella_digital;
	}
	public void setFu_cfg_transaccion_huella_digital(String fu_cfg_transaccion_huella_digital) {
		this.fu_cfg_transaccion_huella_digital = fu_cfg_transaccion_huella_digital;
	}
	public String getFu_cfg_indicador_rba() {
		return fu_cfg_indicador_rba;
	}
	public void setFu_cfg_indicador_rba(String fu_cfg_indicador_rba) {
		this.fu_cfg_indicador_rba = fu_cfg_indicador_rba;
	}
	public String getFu_cfg_tarjeta_nueva() {
		return fu_cfg_tarjeta_nueva;
	}
	public void setFu_cfg_tarjeta_nueva(String fu_cfg_tarjeta_nueva) {
		this.fu_cfg_tarjeta_nueva = fu_cfg_tarjeta_nueva;
	}
	public String getFu_cfg_cliente_nuevo() {
		return fu_cfg_cliente_nuevo;
	}
	public void setFu_cfg_cliente_nuevo(String fu_cfg_cliente_nuevo) {
		this.fu_cfg_cliente_nuevo = fu_cfg_cliente_nuevo;
	}
	public String getFu_cfg_fecha_apertura() {
		return fu_cfg_fecha_apertura;
	}
	public void setFu_cfg_fecha_apertura(String fu_cfg_fecha_apertura) {
		this.fu_cfg_fecha_apertura = fu_cfg_fecha_apertura;
	}
	public String getFu_cfg_plantilla_lpdp() {
		return fu_cfg_plantilla_lpdp;
	}
	public void setFu_cfg_plantilla_lpdp(String fu_cfg_plantilla_lpdp) {
		this.fu_cfg_plantilla_lpdp = fu_cfg_plantilla_lpdp;
	}
	public String getFu_sol_fecha() {
		return fu_sol_fecha;
	}
	public void setFu_sol_fecha(String fu_sol_fecha) {
		this.fu_sol_fecha = fu_sol_fecha;
	}
	public String getFu_sol_cliente() {
		return fu_sol_cliente;
	}
	public void setFu_sol_cliente(String fu_sol_cliente) {
		this.fu_sol_cliente = fu_sol_cliente;
	}
	public String getFu_sol_producto() {
		return fu_sol_producto;
	}
	public void setFu_sol_producto(String fu_sol_producto) {
		this.fu_sol_producto = fu_sol_producto;
	}
	public String getFu_sol_subproducto() {
		return fu_sol_subproducto;
	}
	public void setFu_sol_subproducto(String fu_sol_subproducto) {
		this.fu_sol_subproducto = fu_sol_subproducto;
	}
	public String getFu_sol_cuenta() {
		return fu_sol_cuenta;
	}
	public void setFu_sol_cuenta(String fu_sol_cuenta) {
		this.fu_sol_cuenta = fu_sol_cuenta;
	}
	public String getFu_sol_tipcta() {
		return fu_sol_tipcta;
	}
	public void setFu_sol_tipcta(String fu_sol_tipcta) {
		this.fu_sol_tipcta = fu_sol_tipcta;
	}
	public String getFu_sol_nombres() {
		return fu_sol_nombres;
	}
	public void setFu_sol_nombres(String fu_sol_nombres) {
		this.fu_sol_nombres = fu_sol_nombres;
	}
	public String getFu_sol_apellidos() {
		return fu_sol_apellidos;
	}
	public void setFu_sol_apellidos(String fu_sol_apellidos) {
		this.fu_sol_apellidos = fu_sol_apellidos;
	}
	public String getFu_sol_documento_identidad() {
		return fu_sol_documento_identidad;
	}
	public void setFu_sol_documento_identidad(String fu_sol_documento_identidad) {
		this.fu_sol_documento_identidad = fu_sol_documento_identidad;
	}
	public String getFu_sol_fecha_nacimiento() {
		return fu_sol_fecha_nacimiento;
	}
	public void setFu_sol_fecha_nacimiento(String fu_sol_fecha_nacimiento) {
		this.fu_sol_fecha_nacimiento = fu_sol_fecha_nacimiento;
	}
	public String getFu_sol_profesion_ocupacion() {
		return fu_sol_profesion_ocupacion;
	}
	public void setFu_sol_profesion_ocupacion(String fu_sol_profesion_ocupacion) {
		this.fu_sol_profesion_ocupacion = fu_sol_profesion_ocupacion;
	}
	public String getFu_sol_centro_labores() {
		return fu_sol_centro_labores;
	}
	public void setFu_sol_centro_labores(String fu_sol_centro_labores) {
		this.fu_sol_centro_labores = fu_sol_centro_labores;
	}
	public String getFu_sol_puesto_desempeno() {
		return fu_sol_puesto_desempeno;
	}
	public void setFu_sol_puesto_desempeno(String fu_sol_puesto_desempeno) {
		this.fu_sol_puesto_desempeno = fu_sol_puesto_desempeno;
	}
	public String getFu_sol_ingreso_mensual() {
		return fu_sol_ingreso_mensual;
	}
	public void setFu_sol_ingreso_mensual(String fu_sol_ingreso_mensual) {
		this.fu_sol_ingreso_mensual = fu_sol_ingreso_mensual;
	}
	public String getFu_sol_lugar_nacimiento() {
		return fu_sol_lugar_nacimiento;
	}
	public void setFu_sol_lugar_nacimiento(String fu_sol_lugar_nacimiento) {
		this.fu_sol_lugar_nacimiento = fu_sol_lugar_nacimiento;
	}
	public String getFu_sol_nacionalidad() {
		return fu_sol_nacionalidad;
	}
	public void setFu_sol_nacionalidad(String fu_sol_nacionalidad) {
		this.fu_sol_nacionalidad = fu_sol_nacionalidad;
	}
	public String getFu_sol_correo_electronico() {
		return fu_sol_correo_electronico;
	}
	public void setFu_sol_correo_electronico(String fu_sol_correo_electronico) {
		this.fu_sol_correo_electronico = fu_sol_correo_electronico;
	}
	public String getFu_sol_ind_vial() {
		return fu_sol_ind_vial;
	}
	public void setFu_sol_ind_vial(String fu_sol_ind_vial) {
		this.fu_sol_ind_vial = fu_sol_ind_vial;
	}
	public String getFu_sol_calle() {
		return fu_sol_calle;
	}
	public void setFu_sol_calle(String fu_sol_calle) {
		this.fu_sol_calle = fu_sol_calle;
	}
	public String getFu_sol_numero_extension() {
		return fu_sol_numero_extension;
	}
	public void setFu_sol_numero_extension(String fu_sol_numero_extension) {
		this.fu_sol_numero_extension = fu_sol_numero_extension;
	}
	public String getFu_sol_departamento() {
		return fu_sol_departamento;
	}
	public void setFu_sol_departamento(String fu_sol_departamento) {
		this.fu_sol_departamento = fu_sol_departamento;
	}
	public String getFu_sol_provincia() {
		return fu_sol_provincia;
	}
	public void setFu_sol_provincia(String fu_sol_provincia) {
		this.fu_sol_provincia = fu_sol_provincia;
	}
	public String getFu_sol_distrito() {
		return fu_sol_distrito;
	}
	public void setFu_sol_distrito(String fu_sol_distrito) {
		this.fu_sol_distrito = fu_sol_distrito;
	}
	public String getFu_sol_referencia_domicilio() {
		return fu_sol_referencia_domicilio;
	}
	public void setFu_sol_referencia_domicilio(String fu_sol_referencia_domicilio) {
		this.fu_sol_referencia_domicilio = fu_sol_referencia_domicilio;
	}
	public String getFu_sol_telefono_fijo() {
		return fu_sol_telefono_fijo;
	}
	public void setFu_sol_telefono_fijo(String fu_sol_telefono_fijo) {
		this.fu_sol_telefono_fijo = fu_sol_telefono_fijo;
	}
	public String getFu_sol_tipo_dir_alterna() {
		return fu_sol_tipo_dir_alterna;
	}
	public void setFu_sol_tipo_dir_alterna(String fu_sol_tipo_dir_alterna) {
		this.fu_sol_tipo_dir_alterna = fu_sol_tipo_dir_alterna;
	}
	public String getFu_sol_direccion_alterna() {
		return fu_sol_direccion_alterna;
	}
	public void setFu_sol_direccion_alterna(String fu_sol_direccion_alterna) {
		this.fu_sol_direccion_alterna = fu_sol_direccion_alterna;
	}
	public String getFu_sol_numero_lote() {
		return fu_sol_numero_lote;
	}
	public void setFu_sol_numero_lote(String fu_sol_numero_lote) {
		this.fu_sol_numero_lote = fu_sol_numero_lote;
	}
	public String getFu_sol_telefono_2_alternativo() {
		return fu_sol_telefono_2_alternativo;
	}
	public void setFu_sol_telefono_2_alternativo(String fu_sol_telefono_2_alternativo) {
		this.fu_sol_telefono_2_alternativo = fu_sol_telefono_2_alternativo;
	}
	public String getFu_sol_nacido_extranjero_si() {
		return fu_sol_nacido_extranjero_si;
	}
	public void setFu_sol_nacido_extranjero_si(String fu_sol_nacido_extranjero_si) {
		this.fu_sol_nacido_extranjero_si = fu_sol_nacido_extranjero_si;
	}
	public String getFu_sol_nacido_extranjero_no() {
		return fu_sol_nacido_extranjero_no;
	}
	public void setFu_sol_nacido_extranjero_no(String fu_sol_nacido_extranjero_no) {
		this.fu_sol_nacido_extranjero_no = fu_sol_nacido_extranjero_no;
	}
	public String getFu_sol_nacido_extranjero_ciudad() {
		return fu_sol_nacido_extranjero_ciudad;
	}
	public void setFu_sol_nacido_extranjero_ciudad(String fu_sol_nacido_extranjero_ciudad) {
		this.fu_sol_nacido_extranjero_ciudad = fu_sol_nacido_extranjero_ciudad;
	}
	public String getFu_sol_nacido_extranjero_pais() {
		return fu_sol_nacido_extranjero_pais;
	}
	public void setFu_sol_nacido_extranjero_pais(String fu_sol_nacido_extranjero_pais) {
		this.fu_sol_nacido_extranjero_pais = fu_sol_nacido_extranjero_pais;
	}
	public String getFu_sol_reside_extranjero_si() {
		return fu_sol_reside_extranjero_si;
	}
	public void setFu_sol_reside_extranjero_si(String fu_sol_reside_extranjero_si) {
		this.fu_sol_reside_extranjero_si = fu_sol_reside_extranjero_si;
	}
	public String getFu_sol_reside_extranjero_no() {
		return fu_sol_reside_extranjero_no;
	}
	public void setFu_sol_reside_extranjero_no(String fu_sol_reside_extranjero_no) {
		this.fu_sol_reside_extranjero_no = fu_sol_reside_extranjero_no;
	}
	public String getFu_sol_reside_extranjero_pais() {
		return fu_sol_reside_extranjero_pais;
	}
	public void setFu_sol_reside_extranjero_pais(String fu_sol_reside_extranjero_pais) {
		this.fu_sol_reside_extranjero_pais = fu_sol_reside_extranjero_pais;
	}
	public String getFu_sol_direccion_extranjero() {
		return fu_sol_direccion_extranjero;
	}
	public void setFu_sol_direccion_extranjero(String fu_sol_direccion_extranjero) {
		this.fu_sol_direccion_extranjero = fu_sol_direccion_extranjero;
	}
	public String getFu_sol_cliente_pep_si() {
		return fu_sol_cliente_pep_si;
	}
	public void setFu_sol_cliente_pep_si(String fu_sol_cliente_pep_si) {
		this.fu_sol_cliente_pep_si = fu_sol_cliente_pep_si;
	}
	public String getFu_sol_cliente_pep_no() {
		return fu_sol_cliente_pep_no;
	}
	public void setFu_sol_cliente_pep_no(String fu_sol_cliente_pep_no) {
		this.fu_sol_cliente_pep_no = fu_sol_cliente_pep_no;
	}
	public String getFu_sol_cliente_pep_cargo() {
		return fu_sol_cliente_pep_cargo;
	}
	public void setFu_sol_cliente_pep_cargo(String fu_sol_cliente_pep_cargo) {
		this.fu_sol_cliente_pep_cargo = fu_sol_cliente_pep_cargo;
	}
	public String getFu_sol_cliente_pep_fecha() {
		return fu_sol_cliente_pep_fecha;
	}
	public void setFu_sol_cliente_pep_fecha(String fu_sol_cliente_pep_fecha) {
		this.fu_sol_cliente_pep_fecha = fu_sol_cliente_pep_fecha;
	}
	public String getFu_sol_cliente_pep_insitucion() {
		return fu_sol_cliente_pep_insitucion;
	}
	public void setFu_sol_cliente_pep_insitucion(String fu_sol_cliente_pep_insitucion) {
		this.fu_sol_cliente_pep_insitucion = fu_sol_cliente_pep_insitucion;
	}
	public String getFu_sol_cliente_fpep_si() {
		return fu_sol_cliente_fpep_si;
	}
	public void setFu_sol_cliente_fpep_si(String fu_sol_cliente_fpep_si) {
		this.fu_sol_cliente_fpep_si = fu_sol_cliente_fpep_si;
	}
	public String getFu_sol_cliente_fpep_no() {
		return fu_sol_cliente_fpep_no;
	}
	public void setFu_sol_cliente_fpep_no(String fu_sol_cliente_fpep_no) {
		this.fu_sol_cliente_fpep_no = fu_sol_cliente_fpep_no;
	}
	public String getFu_sol_nombre_apellido() {
		return fu_sol_nombre_apellido;
	}
	public void setFu_sol_nombre_apellido(String fu_sol_nombre_apellido) {
		this.fu_sol_nombre_apellido = fu_sol_nombre_apellido;
	}
	public String getFu_sol_funcion_1() {
		return fu_sol_funcion_1;
	}
	public void setFu_sol_funcion_1(String fu_sol_funcion_1) {
		this.fu_sol_funcion_1 = fu_sol_funcion_1;
	}
	public String getFu_sol_pais() {
		return fu_sol_pais;
	}
	public void setFu_sol_pais(String fu_sol_pais) {
		this.fu_sol_pais = fu_sol_pais;
	}
	public String getFu_sol_vincular_familiar() {
		return fu_sol_vincular_familiar;
	}
	public void setFu_sol_vincular_familiar(String fu_sol_vincular_familiar) {
		this.fu_sol_vincular_familiar = fu_sol_vincular_familiar;
	}
	public String getFu_sol_prop_mayor_25_si() {
		return fu_sol_prop_mayor_25_si;
	}
	public void setFu_sol_prop_mayor_25_si(String fu_sol_prop_mayor_25_si) {
		this.fu_sol_prop_mayor_25_si = fu_sol_prop_mayor_25_si;
	}
	public String getFu_sol_prop_menor_25_no() {
		return fu_sol_prop_menor_25_no;
	}
	public void setFu_sol_prop_menor_25_no(String fu_sol_prop_menor_25_no) {
		this.fu_sol_prop_menor_25_no = fu_sol_prop_menor_25_no;
	}
	public String getFu_sol_act_adicional_si() {
		return fu_sol_act_adicional_si;
	}
	public void setFu_sol_act_adicional_si(String fu_sol_act_adicional_si) {
		this.fu_sol_act_adicional_si = fu_sol_act_adicional_si;
	}
	public String getFu_sol_act_adicional_no() {
		return fu_sol_act_adicional_si;
	}
	public void setFu_sol_act_adicional_no(String fu_sol_act_adiacional_no) {
		this.fu_sol_act_adicional_si = fu_sol_act_adiacional_no;
	}
	public String getFu_sol_fecha_desempeno() {
		return fu_sol_fecha_desempeno;
	}
	public void setFu_sol_fecha_desempeno(String fu_sol_fecha_desempeno) {
		this.fu_sol_fecha_desempeno = fu_sol_fecha_desempeno;
	}
	public String getFu_sol_funcion_2() {
		return fu_sol_funcion_2;
	}
	public void setFu_sol_funcion_2(String fu_sol_funcion_2) {
		this.fu_sol_funcion_2 = fu_sol_funcion_2;
	}
	public String getFu_sol_solicito_no_gen_tar() {
		return fu_sol_solicito_no_gen_tar;
	}
	public void setFu_sol_solicito_no_gen_tar(String fu_sol_solicito_no_gen_tar) {
		this.fu_sol_solicito_no_gen_tar = fu_sol_solicito_no_gen_tar;
	}
	public String getFu_sol_no_generar_tarjeta() {
		return fu_sol_no_generar_tarjeta;
	}
	public void setFu_sol_no_generar_tarjeta(String fu_sol_no_generar_tarjeta) {
		this.fu_sol_no_generar_tarjeta = fu_sol_no_generar_tarjeta;
	}
	public String getFu_sol_cliente_con_tb() {
		return fu_sol_cliente_con_tb;
	}
	public void setFu_sol_cliente_con_tb(String fu_sol_cliente_con_tb) {
		this.fu_sol_cliente_con_tb = fu_sol_cliente_con_tb;
	}
	public String getFu_sol_cliente_sol_tb() {
		return fu_sol_cliente_sol_tb;
	}
	public void setFu_sol_cliente_sol_tb(String fu_sol_cliente_sol_tb) {
		this.fu_sol_cliente_sol_tb = fu_sol_cliente_sol_tb;
	}
	public String getFu_sol_libre1() {
		return fu_sol_libre1;
	}
	public void setFu_sol_libre1(String fu_sol_libre1) {
		this.fu_sol_libre1 = fu_sol_libre1;
	}
	public String getFu_sol_numero_tb() {
		return fu_sol_numero_tb;
	}
	public void setFu_sol_numero_tb(String fu_sol_numero_tb) {
		this.fu_sol_numero_tb = fu_sol_numero_tb;
	}
	public String getFu_sol_uso_de_jetform() {
		return fu_sol_uso_de_jetform;
	}
	public void setFu_sol_uso_de_jetform(String fu_sol_uso_de_jetform) {
		this.fu_sol_uso_de_jetform = fu_sol_uso_de_jetform;
	}
	public String getFu_sol_proteccion_datos_si() {
		return fu_sol_proteccion_datos_si;
	}
	public void setFu_sol_proteccion_datos_si(String fu_sol_proteccion_datos_si) {
		this.fu_sol_proteccion_datos_si = fu_sol_proteccion_datos_si;
	}
	public String getFu_sol_proteccion_datos_no() {
		return fu_sol_proteccion_datos_no;
	}
	public void setFu_sol_proteccion_datos_no(String fu_sol_proteccion_datos_no) {
		this.fu_sol_proteccion_datos_no = fu_sol_proteccion_datos_no;
	}
	public String getFu_sol_srv_a_cli_politi_si() {
		return fu_sol_srv_a_cli_politi_si;
	}
	public void setFu_sol_srv_a_cli_politi_si(String fu_sol_srv_a_cli_politi_si) {
		this.fu_sol_srv_a_cli_politi_si = fu_sol_srv_a_cli_politi_si;
	}
	public String getFu_sol_srv_a_cli_politi_no() {
		return fu_sol_srv_a_cli_politi_no;
	}
	public void setFu_sol_srv_a_cli_politi_no(String fu_sol_srv_a_cli_politi_no) {
		this.fu_sol_srv_a_cli_politi_no = fu_sol_srv_a_cli_politi_no;
	}
	public String getFu_rba_num_cliente() {
		return fu_rba_num_cliente;
	}
	public void setFu_rba_num_cliente(String fu_rba_num_cliente) {
		this.fu_rba_num_cliente = fu_rba_num_cliente;
	}
	public String getFu_rba_nom_cliente() {
		return fu_rba_nom_cliente;
	}
	public void setFu_rba_nom_cliente(String fu_rba_nom_cliente) {
		this.fu_rba_nom_cliente = fu_rba_nom_cliente;
	}
	public String getFu_rba_tip_cliente() {
		return fu_rba_tip_cliente;
	}
	public void setFu_rba_tip_cliente(String fu_rba_tip_cliente) {
		this.fu_rba_tip_cliente = fu_rba_tip_cliente;
	}
	public String getFu_rba_clasificacion_riesgo() {
		return fu_rba_clasificacion_riesgo;
	}
	public void setFu_rba_clasificacion_riesgo(String fu_rba_clasificacion_riesgo) {
		this.fu_rba_clasificacion_riesgo = fu_rba_clasificacion_riesgo;
	}
	public String getFu_rba_descripcion() {
		return fu_rba_descripcion;
	}
	public void setFu_rba_descripcion(String fu_rba_descripcion) {
		this.fu_rba_descripcion = fu_rba_descripcion;
	}
	public String getFu_rba_() {
		return fu_rba_;
	}
	public void setFu_rba_(String fu_rba_) {
		this.fu_rba_ = fu_rba_;
	}
	public String getFu_rba_documento_1() {
		return fu_rba_documento_1;
	}
	public void setFu_rba_documento_1(String fu_rba_documento_1) {
		this.fu_rba_documento_1 = fu_rba_documento_1;
	}
	public String getFu_rba_hora() {
		return fu_rba_hora;
	}
	public void setFu_rba_hora(String fu_rba_hora) {
		this.fu_rba_hora = fu_rba_hora;
	}
	public String getFu_rba_fecha() {
		return fu_rba_fecha;
	}
	public void setFu_rba_fecha(String fu_rba_fecha) {
		this.fu_rba_fecha = fu_rba_fecha;
	}
	public String getFu_fat_fecdoc() {
		return fu_fat_fecdoc;
	}
	public void setFu_fat_fecdoc(String fu_fat_fecdoc) {
		this.fu_fat_fecdoc = fu_fat_fecdoc;
	}
	public String getFu_fat_razdoc() {
		return fu_fat_razdoc;
	}
	public void setFu_fat_razdoc(String fu_fat_razdoc) {
		this.fu_fat_razdoc = fu_fat_razdoc;
	}
	public String getFu_fat_tipodoc() {
		return fu_fat_tipodoc;
	}
	public void setFu_fat_tipodoc(String fu_fat_tipodoc) {
		this.fu_fat_tipodoc = fu_fat_tipodoc;
	}
	public String getFu_fat_nrodoc() {
		return fu_fat_nrodoc;
	}
	public void setFu_fat_nrodoc(String fu_fat_nrodoc) {
		this.fu_fat_nrodoc = fu_fat_nrodoc;
	}
	public String getFu_fat_paisrf() {
		return fu_fat_paisrf;
	}
	public void setFu_fat_paisrf(String fu_fat_paisrf) {
		this.fu_fat_paisrf = fu_fat_paisrf;
	}
	public String getFu_fat_fecha_nacimiento() {
		return fu_fat_fecha_nacimiento;
	}
	public void setFu_fat_fecha_nacimiento(String fu_fat_fecha_nacimiento) {
		this.fu_fat_fecha_nacimiento = fu_fat_fecha_nacimiento;
	}
	public String getFu_fat_direccion() {
		return fu_fat_direccion;
	}
	public void setFu_fat_direccion(String fu_fat_direccion) {
		this.fu_fat_direccion = fu_fat_direccion;
	}
	public String getFu_fat_departamento() {
		return fu_fat_departamento;
	}
	public void setFu_fat_departamento(String fu_fat_departamento) {
		this.fu_fat_departamento = fu_fat_departamento;
	}
	public String getFu_fat_cpos() {
		return fu_fat_cpos;
	}
	public void setFu_fat_cpos(String fu_fat_cpos) {
		this.fu_fat_cpos = fu_fat_cpos;
	}
	public String getFu_fat_nacionalidad() {
		return fu_fat_nacionalidad;
	}
	public void setFu_fat_nacionalidad(String fu_fat_nacionalidad) {
		this.fu_fat_nacionalidad = fu_fat_nacionalidad;
	}
	public String getFu_fat_nacionalidad_adic_1() {
		return fu_fat_nacionalidad_adic_1;
	}
	public void setFu_fat_nacionalidad_adic_1(String fu_fat_nacionalidad_adic_1) {
		this.fu_fat_nacionalidad_adic_1 = fu_fat_nacionalidad_adic_1;
	}
	public String getFu_fat_nacionalidad_adic_2() {
		return fu_fat_nacionalidad_adic_2;
	}
	public void setFu_fat_nacionalidad_adic_2(String fu_fat_nacionalidad_adic_2) {
		this.fu_fat_nacionalidad_adic_2 = fu_fat_nacionalidad_adic_2;
	}
	public String getFu_fat_pais_domicilio_1() {
		return fu_fat_pais_domicilio_1;
	}
	public void setFu_fat_pais_domicilio_1(String fu_fat_pais_domicilio_1) {
		this.fu_fat_pais_domicilio_1 = fu_fat_pais_domicilio_1;
	}
	public String getFu_fat_pais_domicilio_2() {
		return fu_fat_pais_domicilio_2;
	}
	public void setFu_fat_pais_domicilio_2(String fu_fat_pais_domicilio_2) {
		this.fu_fat_pais_domicilio_2 = fu_fat_pais_domicilio_2;
	}
	public String getFu_fat_pais_residencia_fiscal_1() {
		return fu_fat_pais_residencia_fiscal_1;
	}
	public void setFu_fat_pais_residencia_fiscal_1(String fu_fat_pais_residencia_fiscal_1) {
		this.fu_fat_pais_residencia_fiscal_1 = fu_fat_pais_residencia_fiscal_1;
	}
	public String getFu_fat_pais_residencia_fiscal_2() {
		return fu_fat_pais_residencia_fiscal_2;
	}
	public void setFu_fat_pais_residencia_fiscal_2(String fu_fat_pais_residencia_fiscal_2) {
		this.fu_fat_pais_residencia_fiscal_2 = fu_fat_pais_residencia_fiscal_2;
	}
	public String getFu_fat_pais_residencia_fiscal_3() {
		return fu_fat_pais_residencia_fiscal_3;
	}
	public void setFu_fat_pais_residencia_fiscal_3(String fu_fat_pais_residencia_fiscal_3) {
		this.fu_fat_pais_residencia_fiscal_3 = fu_fat_pais_residencia_fiscal_3;
	}
	public String getFu_fat_tipo_documento() {
		return fu_fat_tipo_documento;
	}
	public void setFu_fat_tipo_documento(String fu_fat_tipo_documento) {
		this.fu_fat_tipo_documento = fu_fat_tipo_documento;
	}
	public String getFu_fat_nr_documento() {
		return fu_fat_nr_documento;
	}
	public void setFu_fat_nr_documento(String fu_fat_nr_documento) {
		this.fu_fat_nr_documento = fu_fat_nr_documento;
	}
	public String getFu_fat_cod_documento() {
		return fu_fat_cod_documento;
	}
	public void setFu_fat_cod_documento(String fu_fat_cod_documento) {
		this.fu_fat_cod_documento = fu_fat_cod_documento;
	}
	public String getFu_fat_dia_documento() {
		return fu_fat_dia_documento;
	}
	public void setFu_fat_dia_documento(String fu_fat_dia_documento) {
		this.fu_fat_dia_documento = fu_fat_dia_documento;
	}
	public String getFu_fat_nro_documento() {
		return fu_fat_nro_documento;
	}
	public void setFu_fat_nro_documento(String fu_fat_nro_documento) {
		this.fu_fat_nro_documento = fu_fat_nro_documento;
	}
	public String getFu_fat_razsoc() {
		return fu_fat_razsoc;
	}
	public void setFu_fat_razsoc(String fu_fat_razsoc) {
		this.fu_fat_razsoc = fu_fat_razsoc;
	}
	public String getFu_ctr_nombre_corto() {
		return fu_ctr_nombre_corto;
	}
	public void setFu_ctr_nombre_corto(String fu_ctr_nombre_corto) {
		this.fu_ctr_nombre_corto = fu_ctr_nombre_corto;
	}
	public String getFu_ctr_indicador_firm_adicional() {
		return fu_ctr_indicador_firm_adicional;
	}
	public void setFu_ctr_indicador_firm_adicional(String fu_ctr_indicador_firm_adicional) {
		this.fu_ctr_indicador_firm_adicional = fu_ctr_indicador_firm_adicional;
	}
	public String getFu_sol_canal_solcitante() {
		return fu_sol_canal_solcitante;
	}
	public void setFu_sol_canal_solcitante(String fu_sol_canal_solcitante) {
		this.fu_sol_canal_solcitante = fu_sol_canal_solcitante;
	}
	public String getFu_sol_fecha_hora() {
		return fu_sol_fecha_hora;
	}
	public void setFu_sol_fecha_hora(String fu_sol_fecha_hora) {
		this.fu_sol_fecha_hora = fu_sol_fecha_hora;
	}
	public String getFu_sol_tarjeta() {
		return fu_sol_tarjeta;
	}
	public void setFu_sol_tarjeta(String fu_sol_tarjeta) {
		this.fu_sol_tarjeta = fu_sol_tarjeta;
	}
	public String getFu_sol_programa_beneficios() {
		return fu_sol_programa_beneficios;
	}
	public void setFu_sol_programa_beneficios(String fu_sol_programa_beneficios) {
		this.fu_sol_programa_beneficios = fu_sol_programa_beneficios;
	}
	public String getFu_sol_numero_lifemiles() {
		return fu_sol_numero_lifemiles;
	}
	public void setFu_sol_numero_lifemiles(String fu_sol_numero_lifemiles) {
		this.fu_sol_numero_lifemiles = fu_sol_numero_lifemiles;
	}
	public String getFu_sol_linea_credito() {
		return fu_sol_linea_credito;
	}
	public void setFu_sol_linea_credito(String fu_sol_linea_credito) {
		this.fu_sol_linea_credito = fu_sol_linea_credito;
	}
	public String getFu_sol_tcea() {
		return fu_sol_tcea;
	}
	public void setFu_sol_tcea(String fu_sol_tcea) {
		this.fu_sol_tcea = fu_sol_tcea;
	}
	public String getFu_sol_tea() {
		return fu_sol_tea;
	}
	public void setFu_sol_tea(String fu_sol_tea) {
		this.fu_sol_tea = fu_sol_tea;
	}
	public String getFu_sol_nombres_apellidos() {
		return fu_sol_nombres_apellidos;
	}
	public void setFu_sol_nombres_apellidos(String fu_sol_nombres_apellidos) {
		this.fu_sol_nombres_apellidos = fu_sol_nombres_apellidos;
	}
	public String getFu_sol_sexo() {
		return fu_sol_sexo;
	}
	public void setFu_sol_sexo(String fu_sol_sexo) {
		this.fu_sol_sexo = fu_sol_sexo;
	}
	public String getFu_sol_estado_civil() {
		return fu_sol_estado_civil;
	}
	public void setFu_sol_estado_civil(String fu_sol_estado_civil) {
		this.fu_sol_estado_civil = fu_sol_estado_civil;
	}
	public String getFu_sol_ocupacion() {
		return fu_sol_ocupacion;
	}
	public void setFu_sol_ocupacion(String fu_sol_ocupacion) {
		this.fu_sol_ocupacion = fu_sol_ocupacion;
	}
	public String getFu_sol_situacion_vivienda() {
		return fu_sol_situacion_vivienda;
	}
	public void setFu_sol_situacion_vivienda(String fu_sol_situacion_vivienda) {
		this.fu_sol_situacion_vivienda = fu_sol_situacion_vivienda;
	}
	public String getFu_sol_dependientes() {
		return fu_sol_dependientes;
	}
	public void setFu_sol_dependientes(String fu_sol_dependientes) {
		this.fu_sol_dependientes = fu_sol_dependientes;
	}
	public String getFu_sol_detalle_domicilio() {
		return fu_sol_detalle_domicilio;
	}
	public void setFu_sol_detalle_domicilio(String fu_sol_detalle_domicilio) {
		this.fu_sol_detalle_domicilio = fu_sol_detalle_domicilio;
	}
	public String getFu_sol_pais_nacimiento() {
		return fu_sol_pais_nacimiento;
	}
	public void setFu_sol_pais_nacimiento(String fu_sol_pais_nacimiento) {
		this.fu_sol_pais_nacimiento = fu_sol_pais_nacimiento;
	}
	public String getFu_sol_pais_residencia_fiscal() {
		return fu_sol_pais_residencia_fiscal;
	}
	public void setFu_sol_pais_residencia_fiscal(String fu_sol_pais_residencia_fiscal) {
		this.fu_sol_pais_residencia_fiscal = fu_sol_pais_residencia_fiscal;
	}
	public String getFu_sol_telefono() {
		return fu_sol_telefono;
	}
	public void setFu_sol_telefono(String fu_sol_telefono) {
		this.fu_sol_telefono = fu_sol_telefono;
	}
	public String getFu_sol_situacion_laboral() {
		return fu_sol_situacion_laboral;
	}
	public void setFu_sol_situacion_laboral(String fu_sol_situacion_laboral) {
		this.fu_sol_situacion_laboral = fu_sol_situacion_laboral;
	}
	public String getFu_sol_empresa() {
		return fu_sol_empresa;
	}
	public void setFu_sol_empresa(String fu_sol_empresa) {
		this.fu_sol_empresa = fu_sol_empresa;
	}
	public String getFu_sol_actividad_economica() {
		return fu_sol_actividad_economica;
	}
	public void setFu_sol_actividad_economica(String fu_sol_actividad_economica) {
		this.fu_sol_actividad_economica = fu_sol_actividad_economica;
	}
	public String getFu_sol_antiguedad_laboral() {
		return fu_sol_antiguedad_laboral;
	}
	public void setFu_sol_antiguedad_laboral(String fu_sol_antiguedad_laboral) {
		this.fu_sol_antiguedad_laboral = fu_sol_antiguedad_laboral;
	}
	public String getFu_sol_ingreso_titular_neto() {
		return fu_sol_ingreso_titular_neto;
	}
	public void setFu_sol_ingreso_titular_neto(String fu_sol_ingreso_titular_neto) {
		this.fu_sol_ingreso_titular_neto = fu_sol_ingreso_titular_neto;
	}
	public String getFu_sol_pago_alquiler_vivienda() {
		return fu_sol_pago_alquiler_vivienda;
	}
	public void setFu_sol_pago_alquiler_vivienda(String fu_sol_pago_alquiler_vivienda) {
		this.fu_sol_pago_alquiler_vivienda = fu_sol_pago_alquiler_vivienda;
	}
	public String getFu_sol_envio_estado_cuenta() {
		return fu_sol_envio_estado_cuenta;
	}
	public void setFu_sol_envio_estado_cuenta(String fu_sol_envio_estado_cuenta) {
		this.fu_sol_envio_estado_cuenta = fu_sol_envio_estado_cuenta;
	}
	public String getFu_sol_detalle_envio_estado_cuenta() {
		return fu_sol_detalle_envio_estado_cuenta;
	}
	public void setFu_sol_detalle_envio_estado_cuenta(String fu_sol_detalle_envio_estado_cuenta) {
		this.fu_sol_detalle_envio_estado_cuenta = fu_sol_detalle_envio_estado_cuenta;
	}
	public String getFu_sol_envio_tarjeta() {
		return fu_sol_envio_tarjeta;
	}
	public void setFu_sol_envio_tarjeta(String fu_sol_envio_tarjeta) {
		this.fu_sol_envio_tarjeta = fu_sol_envio_tarjeta;
	}
	public String getFu_sol_detalle_envio_tarjeta() {
		return fu_sol_detalle_envio_tarjeta;
	}
	public void setFu_sol_detalle_envio_tarjeta(String fu_sol_detalle_envio_tarjeta) {
		this.fu_sol_detalle_envio_tarjeta = fu_sol_detalle_envio_tarjeta;
	}
	public String getFu_sol_envio_documento() {
		return fu_sol_envio_documento;
	}
	public void setFu_sol_envio_documento(String fu_sol_envio_documento) {
		this.fu_sol_envio_documento = fu_sol_envio_documento;
	}
	public String getFu_sol_registro_ejecutivo() {
		return fu_sol_registro_ejecutivo;
	}
	public void setFu_sol_registro_ejecutivo(String fu_sol_registro_ejecutivo) {
		this.fu_sol_registro_ejecutivo = fu_sol_registro_ejecutivo;
	}
	public String getFu_sol_nombre_oficina() {
		return fu_sol_nombre_oficina;
	}
	public void setFu_sol_nombre_oficina(String fu_sol_nombre_oficina) {
		this.fu_sol_nombre_oficina = fu_sol_nombre_oficina;
	}
	public String getFu_sol_codigo_oficina() {
		return fu_sol_codigo_oficina;
	}
	public void setFu_sol_codigo_oficina(String fu_sol_codigo_oficina) {
		this.fu_sol_codigo_oficina = fu_sol_codigo_oficina;
	}
	public String getFu_sol_direccion_oficina() {
		return fu_sol_direccion_oficina;
	}
	public void setFu_sol_direccion_oficina(String fu_sol_direccion_oficina) {
		this.fu_sol_direccion_oficina = fu_sol_direccion_oficina;
	}
	public String getFu_seg_dia_inicio_vigencia() {
		return fu_seg_dia_inicio_vigencia;
	}
	public void setFu_seg_dia_inicio_vigencia(String fu_seg_dia_inicio_vigencia) {
		this.fu_seg_dia_inicio_vigencia = fu_seg_dia_inicio_vigencia;
	}
	public String getFu_seg_mes_inicio_vigencia() {
		return fu_seg_mes_inicio_vigencia;
	}
	public void setFu_seg_mes_inicio_vigencia(String fu_seg_mes_inicio_vigencia) {
		this.fu_seg_mes_inicio_vigencia = fu_seg_mes_inicio_vigencia;
	}
	public String getFu_seg_anio_inicio_vigencia() {
		return fu_seg_anio_inicio_vigencia;
	}
	public void setFu_seg_anio_inicio_vigencia(String fu_seg_anio_inicio_vigencia) {
		this.fu_seg_anio_inicio_vigencia = fu_seg_anio_inicio_vigencia;
	}
	public String getFu_seg_lugar_emision() {
		return fu_seg_lugar_emision;
	}
	public void setFu_seg_lugar_emision(String fu_seg_lugar_emision) {
		this.fu_seg_lugar_emision = fu_seg_lugar_emision;
	}
	public String getFu_seg_dia_emision() {
		return fu_seg_dia_emision;
	}
	public void setFu_seg_dia_emision(String fu_seg_dia_emision) {
		this.fu_seg_dia_emision = fu_seg_dia_emision;
	}
	public String getFu_seg_mes_emision() {
		return fu_seg_mes_emision;
	}
	public void setFu_seg_mes_emision(String fu_seg_mes_emision) {
		this.fu_seg_mes_emision = fu_seg_mes_emision;
	}
	public String getFu_seg_anio_emision() {
		return fu_seg_anio_emision;
	}
	public void setFu_seg_anio_emision(String fu_seg_anio_emision) {
		this.fu_seg_anio_emision = fu_seg_anio_emision;
	}
	public String getFu_cls_fecha_extendida() {
		return fu_cls_fecha_extendida;
	}
	public void setFu_cls_fecha_extendida(String fu_cls_fecha_extendida) {
		this.fu_cls_fecha_extendida = fu_cls_fecha_extendida;
	}
	public String getFu_cls_nombre_apellido() {
		return fu_cls_nombre_apellido;
	}
	public void setFu_cls_nombre_apellido(String fu_cls_nombre_apellido) {
		this.fu_cls_nombre_apellido = fu_cls_nombre_apellido;
	}
	public String getFu_cls_documento_o_ruc() {
		return fu_cls_documento_o_ruc;
	}
	public void setFu_cls_documento_o_ruc(String fu_cls_documento_o_ruc) {
		this.fu_cls_documento_o_ruc = fu_cls_documento_o_ruc;
	}
}
