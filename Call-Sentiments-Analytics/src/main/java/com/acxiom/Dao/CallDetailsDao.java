package com.acxiom.Dao;

import com.acxiom.entity.CallDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallDetailsDao extends CrudRepository<CallDetails,String> {

    CallDetails findByCallId(String callId);
}
