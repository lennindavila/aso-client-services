package pe.bbva.aso.servicios.modifycardblock.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyCardBlockDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("blockId")
	private String blockId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("reason")
	private ReasonDTO reason;

	@JsonProperty("reference")
	private String reference;

	@JsonProperty("blockDate")
	private String blockDate;

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public ReasonDTO getReason() {
		return reason;
	}

	public void setReason(ReasonDTO reason) {
		this.reason = reason;
	}
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(String blockDate) {
		this.blockDate = blockDate;
	}
}

