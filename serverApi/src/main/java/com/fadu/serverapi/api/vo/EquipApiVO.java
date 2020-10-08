package com.fadu.serverapi.api.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class EquipApiVO {

	/**
	 * 아이디
	 */
	private String id;
	/*
	 * 서버명
	 */
	private String hostname;
	/**
	 * 사용 용도
	 */
	private String equipUsage;
	/**
	 * os아이피
	 */
	private String osIp;
	/**
	 * os 아이디
	 */
	private String osId;
	/**
	 * os 패스워드
	 */
	private String osPassword;
	/**
	 * ipmi 아이디
	 */
	private String ipmiId;
	/**
	 * ipmi 아이피
	 */
	private String ipmiIp;
	/**
	 * ipmi 패스워드
	 */
	private String ipmiPassword;
	/**
	 * nvme SSD 포트
	 */
	private String nvmePort;
	/**
	 * 서버 타입
	 */
	private String serverType;
	/**
	 * 팀명
	 */
	private String owns;

	/**
	 * 검색용 팀명
	 */
	private String searchOwns;

	/**
	 * 검색용 ipmi 아이피
	 */
	private String searchIpmiIp;

	private int paging;

	private int totalCnt;

	private int setPaging;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getEquipUsage() {
		return equipUsage;
	}

	public void setEquipUsage(String equipUsage) {
		this.equipUsage = equipUsage;
	}

	public String getOsIp() {
		return osIp;
	}

	public void setOsIp(String osIp) {
		this.osIp = osIp;
	}

	public String getOsId() {
		return osId;
	}

	public void setOsId(String osId) {
		this.osId = osId;
	}

	public String getOsPassword() {
		return osPassword;
	}

	public void setOsPassword(String osPassword) {
		this.osPassword = osPassword;
	}

	public String getIpmiId() {
		return ipmiId;
	}

	public void setIpmiId(String ipmiId) {
		this.ipmiId = ipmiId;
	}

	public String getIpmiIp() {
		return ipmiIp;
	}

	public void setIpmiIp(String ipmiIp) {
		this.ipmiIp = ipmiIp;
	}

	public String getIpmiPassword() {
		return ipmiPassword;
	}

	public void setIpmiPassword(String ipmiPassword) {
		this.ipmiPassword = ipmiPassword;
	}

	public String getNvmePort() {
		return nvmePort;
	}

	public void setNvmePort(String nvmePort) {
		this.nvmePort = nvmePort;
	}

	public String getServerType() {
		return serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
	}

	public String getOwns() {
		return owns;
	}

	public void setOwns(String owns) {
		this.owns = owns;
	}

	public String getSearchOwns() {
		return searchOwns;
	}

	public void setSearchOwns(String searchOwns) {
		this.searchOwns = searchOwns;
	}

	public String getSearchIpmiIp() {
		return searchIpmiIp;
	}

	public void setSearchIpmiIp(String searchIpmiIp) {
		this.searchIpmiIp = searchIpmiIp;
	}

	public int getPaging() {
		return paging;
	}

	public void setPaging(int paging) {
		this.paging = paging;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public int getSetPaging() {
		return setPaging;
	}

	public void setSetPaging(int setPaging) {
		this.setPaging = setPaging;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
