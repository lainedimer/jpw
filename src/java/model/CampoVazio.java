/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static com.sun.faces.facelets.util.Path.context;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author laine
 */
@FacesValidator(value = "campoVazio")
public class CampoVazio implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
    
    if (o.toString().isEmpty()) {  
        ((UIInput)uic).setValid(false);  
  
        FacesMessage message = new FacesMessage("Invalido");  
        fc.addMessage(uic.getClientId(fc), message);  
    }       
    }
   
    

}
