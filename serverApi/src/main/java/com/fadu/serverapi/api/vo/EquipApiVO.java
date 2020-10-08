package com.fadu.serverapi.api.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class EquipApiVO {

	/**
	 * ���̵�
	 */
	private String id;
	/*
	 * ������
	 */
	private String hostname;
	/**
	 * ��� �뵵
	 */
	private String equipUsage;
	/**
	 * os������
	 */
	private String osIp;
	/**
	 * os ���̵�
	 */
	private String osId;
	/**
	 * os �н�����
	 */
	private String osPassword;
	/**
	 * ipmi ���̵�
	 */
	private String ipmiId;
	/**
	 * ipmi ������
	 */
	private String ipmiIp;
	/**
	 * ipmi �н�����
	 */
	private String ipmiPassword;
	/**
	 * nvme SSD ��Ʈ
	 */
	private String nvmePort;
	/**
	 * ���� Ÿ��
	 */
	private String serverType;
	/**
	 * ����
	 */
	private String owns;

	/**
	 * �˻��� ����
	 */
	private String searchOwns;

	/**
	 * �˻��� ipmi ������
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
