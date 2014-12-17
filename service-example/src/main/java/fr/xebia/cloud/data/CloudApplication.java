/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.xebia.cloud.data;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

//http://spring.io/guides/gs/accessing-data-rest/
//http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html
//@Configuration
@ComponentScan
@Configuration
@EnableAutoConfiguration
//@EnableEurekaClient
//@EnableHystrix
public class CloudApplication {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(CloudApplication.class).web(true).run();
	}
}
