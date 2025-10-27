package com.ssg.springwebmvc.sample;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
@Qualifier("event")
public class EventSampleDAOImpl implements SampleDAO {

}
