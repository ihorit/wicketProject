
package com.wicketproject.pages.login;

import com.wicketproject.BasePage;
import com.wicketproject.MenuItemEnum;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class LoginCheck extends BasePage { 
    public LoginCheck(){
        //add(new Label("button"));
        add(new LoginForm("loginForm"));
    }

    @Override
    public MenuItemEnum getActiveMenu() {
        return MenuItemEnum.LOGIN;
    }
    
    public class LoginForm extends Form{
    	private TextField usernameField;
    	private PasswordTextField passwordField;
    	private Label loginStatus;
    		
    	public LoginForm(String id) {
    		super(id);
    			
    		usernameField = new TextField("username", Model.of(""));
    		passwordField = new PasswordTextField("password", Model.of(""));			
    		loginStatus = new Label("loginStatus", Model.of(""));
    			
    		add(usernameField);
    		add(passwordField);
    		add(loginStatus);
    	}

    	public final void onSubmit() {
    		String username = (String)usernameField.getDefaultModelObject();
    		String password = (String)passwordField.getDefaultModelObject();
    			
    		if(username.equals("test") && password.equals("test"))
                {
    		     loginStatus.setDefaultModelObject("Congratulations!");
                     setResponsePage(AdminTab.class);
                     //super.setResponsePage("Admin", AdminTab.class);
                }
    		else
    		     loginStatus.setDefaultModelObject("Wrong username or password!");			
    	}
    }
}
