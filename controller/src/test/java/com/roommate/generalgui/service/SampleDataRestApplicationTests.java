
package com.roommate.generalgui.service;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Integration test to run the application.
 *
 * @author Oliver Gierke
 * @author Andy Wilkinson
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@ActiveProfiles("scratch")
// Separate profile for web tests to avoid clashing databases
@Ignore
public class SampleDataRestApplicationTests {

//	@Autowired
//	private WebApplicationContext context;

//	private MockMvc mvc;

//	@Before
//	public void setUp() {
//		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
//	}

	@Test
	@Ignore
	public void testHome() throws Exception {

//		this.mvc.perform(get("/api")).andExpect(status().isOk())
//				.andExpect(content().string(containsString("hotels")));
	}

	@Test
	@Ignore
	public void findByNameAndCountry() throws Exception {

//		this.mvc.perform(
//				get("/api/cities/search/findByNameAndCountryAllIgnoringCase?name=Melbourne&country=Australia"))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("state", equalTo("Victoria")))
//				.andExpect(jsonPath("name", equalTo("Melbourne")));
	}

	@Test
	@Ignore
	public void findByContaining() throws Exception {

//		this.mvc.perform(
//				get("/api/cities/search/findByNameContainingAndCountryContainingAllIgnoringCase?name=&country=UK"))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("_embedded.cities", hasSize(3)));
	}
}
