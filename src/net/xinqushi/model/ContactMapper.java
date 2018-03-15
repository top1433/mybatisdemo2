package net.xinqushi.model;

public interface ContactMapper {
	public void insertContact(Contact contact);
	
	public Contact selectContactById(int id);
}
