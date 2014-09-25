package com.galee.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.galee.model.Gali;

public class FakeGaliProvider implements GaliProvider {

	private static List<Gali> fakeGalis = new ArrayList() {{
		add(new Gali("Gu Kha", 100));
		add(new Gali("Tui gu Kha", 50));
		add(new Gali("Tora gu Kha", 50));
		add(new Gali("Dure gia mor", 50));
		add(new Gali("Pettini kunaner", 50));
		add(new Gali("Koitthe aise", 50));
		add(new Gali("Halar po", 50));
	}};
	
	@Override
	public List<Gali> getGalis() {
		return fakeGalis;
	}

}
