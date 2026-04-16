//package com.example;
//
//import com.example.service.UserDetailServiceImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@Configuration
////@EnableWebSecurity
//public class SecurityConfig {
//
//    private final UserDetailServiceImpl userDetailsService;
//
//    public SecurityConfig(UserDetailServiceImpl userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
////    @Override
////	  protected void configure(HttpSecurity http) throws Exception {
////		  // Add this row to allow access to all endpoints
//
//    /// /		  http.csrf().disable().cors().and().authorizeRequests().anyRequest().permitAll();
////		 http.csrf().disable().cors().and().authorizeRequests()
////		  .antMatchers(HttpMethod.POST, "/login").permitAll()
////	        .anyRequest().authenticated()
////	        .and()
////	        // Filter for the api/login requests
////	        .addFilterBefore(new LoginFilter("/login", authenticationManager()),
////	                UsernamePasswordAuthenticationFilter.class)
////	        // Filter for other requests to check JWT in header
////	        .addFilterBefore(new AuthenticationFilter(),
////	                UsernamePasswordAuthenticationFilter.class);
////	  }
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http, AuthenticationManager authenticationManager) throws Exception {
////		LoginFilter loginFilter = new LoginFilter("/login", authenticationManager);
//		http
//				.csrf(AbstractHttpConfigurer::disable)
//				.cors(cors -> cors.configurationSource(corsConfigurationSource()))
//				.authorizeHttpRequests(auth -> auth
//						.requestMatchers(HttpMethod.POST, "/login").permitAll()
//						.anyRequest().authenticated()
//				)
//				// Filter for the api/login requests
//				.addFilterBefore(new LoginFilter("/login", authenticationManager), UsernamePasswordAuthenticationFilter.class)
//				// Filter for other requests to check JWT in header
//				.addFilterBefore(new AuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//
//		return http.build();
//	}
//
//		@Bean
//		public AuthenticationManager authenticationManager (AuthenticationConfiguration authenticationConfiguration) throws Exception {
//			return authenticationConfiguration.getAuthenticationManager();
//		}
//
//		@Bean
//		public PasswordEncoder passwordEncoder () {
//			return new BCryptPasswordEncoder();
//		}
//
//		@Bean
//		public CorsConfigurationSource corsConfigurationSource() {
//			UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//			CorsConfiguration config = new CorsConfiguration();
////			config.setAllowedOrigins(Arrays.asList("*"));
//			config.setAllowedOrigins(Arrays.asList("http://localhost:3000"));
//			config.setAllowedMethods(Arrays.asList("*"));
//			config.setAllowedHeaders(Arrays.asList("*"));
//			config.setAllowCredentials(true);
//			config.applyPermitDefaultValues();
//			source.registerCorsConfiguration("/**", config);
//			return source;
//		}
//
//	}
//
////        @Autowired
////        public void configureGlobal (AuthenticationManagerBuilder auth) throws Exception {
////            auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
////        }
//
////    }