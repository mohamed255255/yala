public class ServiceProviderUI {
    private ServiceProvidor ServiceProvidor ;
    private ICommand formHandlerCommand  ;
    private ICommand getFormCommand;
    private  User user;
    private SPForm form ;

    ServiceProviderUI(ServiceProvider ServiceProvider){
          this.ServiceProvidor = ServiceProvider;
    }

    public void setForm(SPForm form) {
        this.form = form;
    }
    public void loadForm(){

    }

}
