package com.tcs.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Animal {
	@Autowired
	@Qualifier("Cat")
	private Sound sound;

	public Sound getsound() {
		return sound;
	}

	public void setSound(Sound sound) {
		this.sound = sound;
	}
	
}
