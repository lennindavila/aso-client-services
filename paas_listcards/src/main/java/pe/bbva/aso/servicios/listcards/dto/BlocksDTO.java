package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlocksDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("blockId")
	private String blockId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("reason")
	private ReasonDTO reason;

	@JsonProperty("blockDate")
	private String blockDate;

	@JsonProperty("isActive")
	private String isActive;

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
	public String getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(String blockDate) {
		this.blockDate = blockDate;
	}
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}

