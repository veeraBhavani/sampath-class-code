package com.cb.api;

import com.cb.base.*;

public class JobSearch extends BaseAPI {

	public String serviceURL = "v1/jobsearch";

	public String searchJobs(String category, String keyword) throws Exception {
		String url = serviceBaseUrl + serviceURL + "?developerkey="
				+ developerKey + "&Category=" + category + "&Keywords="
				+ keyword;
		String response = Service.callRestServiceGet(url);
		return response;
	}

}
