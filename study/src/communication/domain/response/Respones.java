package communication.domain.response;

import communication.domain.body.Body;
import communication.domain.header.Header;

public class Respones {
	private Header header;
	private Body body;
	
	public Respones(Header header, Body body) {
		this.header = header;
		this.body = body;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
	
	
	
	
	
	
}
