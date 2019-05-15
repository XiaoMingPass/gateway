/**
 * 
 */
package com.z.gateway.common.entity;

import java.io.Serializable;

/**
 * 后端服务接口信息
 * 
 * @author Administrator
 *
 */
public class ApiInterface implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2148889461513154891L;
	private String apiId;
	private String version;// 版本号
	private String requestMethod;// 请求方法

	// 下面的数据构成访问地址
	private String protocol;// 请求协议，分为http,https
	private String hostAddress;// 服务器地址
	private Integer port;// 服务端口
	private String targetUrl; // 后端接口服务路径

	/**
	 * 
	 * 以上参数可以组织出api的访问地址 protocol://hostAddress:port//targetUrl
	 */
	private String url; // 解析之后服务路径

	// http://192.168.2.100:8089/targetUrl
	public String getUrl() {
		StringBuffer sb = new StringBuffer(protocol);
		sb.append("://");
		sb.append(hostAddress);
		if (port != null) {
			sb.append(":");
			sb.append(port);
		}
		sb.append("/");
		if (targetUrl != null) {
			sb.append(targetUrl);
		} 
		this.url = sb.toString();
		return url;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
