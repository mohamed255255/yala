
public class GetServiceProvidersCommand implements ICommand {
	private SearchServiceUI searchServiceUI;
	private ServiceType serviceType;
	GetServiceProvidersCommand(SearchServiceUI searchServiceUI, ServiceType serviceType){
		this.searchServiceUI = searchServiceUI;
		this.serviceType = serviceType;
	}
	@Override
	public void excute() {
		searchServiceUI.setServiceProviders(ServiceProviderDB.getServiceProviders(serviceType));
	}
}