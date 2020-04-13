package amatskevych.bean;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Locale;

@Named(value = "localeBean")
@SessionScoped
public class LocaleBean implements Serializable {
    private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();

    @SuppressWarnings("unused")
    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    public void setLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
}
