package com.sample;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

public class MessageUnit implements RuleUnitData {

	private DataStore<Message> messages = DataSource.createStore();

	public DataStore<Message> getMessages() {
		return messages;
	}

	public void setMessages(DataStore<Message> messages) {
		this.messages = messages;
	}

	public MessageUnit() {
		this( DataSource.createStore());
	}

	public MessageUnit(DataStore<Message> messages) {
		this.messages = messages;
	}
}