/**
 * 
 */
package com.mongo.PerformanceTest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.PerformanceTest.model.User;

/**
 * @author rukamble
 *
 */

public interface Repository extends MongoRepository<User, String> {
	


}
