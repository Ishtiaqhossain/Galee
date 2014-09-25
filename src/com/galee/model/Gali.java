package com.galee.model;

import android.R.integer;

/**
 * Represents a Gali entity.
 * @author ishtiaq
 *
 */
public class Gali {
  public String name;
  public int sentCount;
  
  public Gali(String name, int sentCount) {
	  this.name = name;
	  this.sentCount = sentCount;
  }
}
