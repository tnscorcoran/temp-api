package com.clients;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _3scaleClientsController {
		private List<Store> stores = new ArrayList<Store>();
		public _3scaleClientsController() {
			super();
			
			Store store = new Store ("Coles Melbourne Cbd", "Elizabeth St & Flinders St");
			stores.add(store);
			store = new Store ("Coles Central Melbourne Central", "211 Latrobe St 3000 Melbourne VIC");
			stores.add(store);
			store = new Store ("Coles Spencer St", "201 Spencer St 3000 Melbourne VIC");
			stores.add(store);
			store = new Store ("Coles Williamstown", "172 Smith St 3066 Melbourne VIC");
			
					
		}
	    
	    
		//Coles
		@RequestMapping(value="/stores/cities/{city}", method=RequestMethod.GET, produces="application/json") 
	    public @ResponseBody List<Store> getStores(@PathVariable("city") String city, HttpServletRequest request, HttpServletResponse response) {
			
			response.setStatus(200);
	    		return stores;
	    	
	    }
}
