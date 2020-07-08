package com.tts.WeatherApp.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.WeatherApp.model.Zipcode;

@Repository
public interface ZipcodeRepository extends CrudRepository<Zipcode, Long> {
  public List<Zipcode> findAll();
  public List<Zipcode> findAllByOrderByCreatedAtDesc();
}