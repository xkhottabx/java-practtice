package day46_static_keyword;

public class Customer {
private String name, email;
static int count;//SHARED BY EVERYONE


public Customer() {
	name="undefined";
	this.email="undefined";
	count++;
}
public Customer(String name, String email) {
	name="Vlad";//can be with or without THIS (THIS will show you call to instance var)
	this.email="kharebov@my.com";
	count++;
}


@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}
