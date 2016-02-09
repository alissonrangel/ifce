package com.j7ss.view.convert;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import lombok.Setter;

import com.j7ss.entity.Curso;
import com.j7ss.view.AlunoCadastroBean;


@ManagedBean
@ViewScoped
public class CursoConverter implements Converter {

	@Setter
	@ManagedProperty(value="#{alunoCadastroBean}")
	private AlunoCadastroBean alunoCadastroBean;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return alunoCadastroBean.getCursoByNome(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return (value != null) ? ((Curso) value).getNome() : null;
	}

}
