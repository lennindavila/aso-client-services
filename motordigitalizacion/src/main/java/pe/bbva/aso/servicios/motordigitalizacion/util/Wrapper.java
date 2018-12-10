package pe.bbva.aso.servicios.motordigitalizacion.util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import pe.bbva.aso.servicios.motordigitalizacion.dto.ConstantesFileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.FileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.OptionsClientes;
import pe.bbva.aso.servicios.motordigitalizacion.dto.OptionsItems;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestFileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestListCliente;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestListItems;

public class Wrapper/*<E,S>*/ implements Serializable {
	
/*    
 	final Class<S> typeParameter_S;
    final Class<E> typeParameter_E;

    public Wrapper(Class<E> typeParameter_E,Class<S> typeParameter_S) {
        this.typeParameter_S = typeParameter_S;
        this.typeParameter_E = typeParameter_E;
    }
*/

	private Method getMethod(Object obj,String methodName) {
		Method[] methods = obj.getClass().getDeclaredMethods();
		for(Method method:methods) {			
			if(method.getName().equalsIgnoreCase(methodName)) {
				return method;
			}
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	private String getConstValue(String keyName) throws IllegalArgumentException, IllegalAccessException {			
		Class<?>[] consts = ConstantesFileUnico.class.getDeclaredClasses();		
		for (Class clazz : consts) {			
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				if(field.getName().equalsIgnoreCase(keyName)) {
					Object oValue = field.get(clazz);
					if(oValue!=null) return oValue.toString();					
				}
			}
		}		
		return null;
	}
	
	private List<OptionsItems> WrapperOptionsItems(RequestListItems request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<OptionsItems> listaItems = null; 
		listaItems = new ArrayList<OptionsItems>();
		Method[] methods = request.getClass().getDeclaredMethods();
		for(Method methodGet:methods) {					
			if(methodGet.getName().startsWith("get")) {
				Object value = methodGet.invoke(request, null);
				if(value!=null) {
					if(!value.equals("")) {
						String constName = methodGet.getName().substring(3, methodGet.getName().length()).toLowerCase();
						String valueConst = getConstValue(constName);
						OptionsItems items = new OptionsItems();
						items.setLabel(valueConst);
						items.setValue("" + value);
						listaItems.add(items);
					}						
				}
			}
		}
		return listaItems;
	}
	
	private List<OptionsItems> WrapperOptionsItemsList(List<RequestListItems> requestList) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<OptionsItems> listaItems = null;
		listaItems = new ArrayList<OptionsItems>();
		for(RequestListItems request:requestList) {
			Method[] methods = request.getClass().getDeclaredMethods();
			for(Method methodGet:methods) {					
				if(methodGet.getName().startsWith("get")) {
					Object value = methodGet.invoke(request, null);
					if(value!=null) {
						if(!value.equals("")) {
							String constName = methodGet.getName().substring(3, methodGet.getName().length()).toLowerCase();
							String valueConst = getConstValue(constName);
							OptionsItems items = new OptionsItems();
							items.setLabel(valueConst);
							items.setValue("" + value);
							listaItems.add(items);
						}						
					}
				}
			}
		}
		return listaItems;
	}	
	
	private List<OptionsClientes> WrapperOptionsClientes(List<RequestListCliente> request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<OptionsClientes> lstCliente = null;
		lstCliente = new ArrayList<OptionsClientes>();
		for(RequestListCliente item : request) {
			OptionsClientes optCliente = new OptionsClientes();
			Method[] methods = item.getClass().getDeclaredMethods();
			for(Method methodGet:methods) {						
				if(methodGet.getName().startsWith("get")) {						
					if(methodGet.getReturnType().toString().equals("class java.lang.String")) {												
						String methodName = "set" + methodGet.getName().substring(3, methodGet.getName().length());
						Method methodSet = getMethod(optCliente,methodName);
						Object mvalue = methodGet.invoke(item, null);							
						methodSet.setAccessible(true);
						methodSet.invoke(optCliente, mvalue);
					}
				}
			}
			optCliente.setListaItems(WrapperOptionsItemsList(item.getListaItems()));
			lstCliente.add(optCliente);
		}
		return lstCliente;
	}	
	
	public FileUnico Wrapper(RequestFileUnico request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		FileUnico fileUnico = null;
		fileUnico = new FileUnico();
		Method[] methods = request.getClass().getDeclaredMethods();
		for(Method methodGet:methods) {					
			if(methodGet.getName().startsWith("get")) {
				if(methodGet.getReturnType().toString().equals("class java.lang.String")) {					
					String methodName = "set" + methodGet.getName().substring(3, methodGet.getName().length());
					Method methodSet = getMethod(fileUnico,methodName);
					Object value = methodGet.invoke(request, null);
					methodSet.setAccessible(true);
					methodSet.invoke(fileUnico, value);
				}
			}
		}
		fileUnico.setListaItems(WrapperOptionsItems(request.getListaItems()));
		fileUnico.setListaClientes(WrapperOptionsClientes(request.getListaClientes()));
		return fileUnico;
	}	
	
	
	
	
/*	private S mapping(E objectE,S objectS,Method[] methods,int level) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for(Method methodGet:methods) {
			if(methodGet.getName().startsWith("get")){
				System.out.println("methodGet.getName(): " + methodGet.getName() + " ** " + methodGet.getReturnType());
				if(methodGet.getReturnType().toString().equals("class java.lang.String")) {
					String methodName = "set" + methodGet.getName().substring(3, methodGet.getName().length());
					Method methodSet = getMethod(objectS,methodName);
					Object mValue = methodGet.invoke(objectE, null);
					methodSet.setAccessible(true);
					methodSet.invoke(objectS, mValue);	
				}
			}
		}				
		return objectS;
	}*/
	
/*	public S getWrapp(E objectE) {
		S objectS = null;	
		try {
			S objInstanceS =  typeParameter_S.newInstance();
			Method[] methods = objectE.getClass().getDeclaredMethods();
			objInstanceS = mapping(objectE,objInstanceS,methods,0);
			for(Method methodGet:methods) {
				if(methodGet.getName().startsWith("get")){
					String methodName = "set" + methodGet.getName().substring(3, methodGet.getName().length());
					Method methodSet = getMethod(objInstanceS,methodName);
					Object mValue = methodGet.invoke(objectE, null);
					methodSet.setAccessible(true);
					methodSet.invoke(objInstanceS, mValue);
				}
			}
			objectS = objInstanceS;			
		} catch (InstantiationException e1) {			
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {			
			e1.printStackTrace();
		} catch (IllegalArgumentException e) {			
			e.printStackTrace();
		} catch (InvocationTargetException e) {			
			e.printStackTrace();
		}
		return objectS;
	}*/
	
}
