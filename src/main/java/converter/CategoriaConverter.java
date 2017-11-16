package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import entidade.Categoria;
import managedbean.CategoriaMB;



@FacesConverter("categoriaConverter")
public class CategoriaConverter implements Converter {
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                CategoriaMB categoria = (CategoriaMB) fc.getExternalContext().getApplicationMap().get("Categoria");
                return categoria.getCategorias().get(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        }
        else {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((Categoria) object).getDescricao());
        }
        else {
            return null;
        }
    }   
}   