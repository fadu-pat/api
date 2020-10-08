package com.fadu.serverapi.util;

public class PagingView {

	public static String Paging() {
		
		String view = "<ul class='pagination'>\r\n"
				+ "				    <li class='page-item disabled'>\r\n"
				+ "				      <a class='page-link' href='#'>&laquo;</a>\r\n"
				+ "				    </li>\r\n"
				+ "				    <li class='page-item active'>\r\n"
				+ "				      <a class='page-link' href='#'>1</a>\r\n"
				+ "				    </li>\r\n"
				+ "				    <li class='page-item'>\r\n"
				+ "				      <a class='page-link' href='#'>2</a>\r\n"
				+ "				    </li>\r\n"
				+ "				    <li class='page-item'>\r\n"
				+ "				      <a class='page-link' href='#'>3</a>\r\n"
				+ "				    </li>\r\n"
				+ "				    <li class='page-item'>\r\n"
				+ "				      <a class='page-link' href='#'>4</a>\r\n"
				+ "				    </li>\r\n"
				+ "				    <li class='page-item'>\r\n"
				+ "				      <a class='page-link' href='#'>5</a>\r\n"
				+ "				    </li>\r\n"
				+ "				    <li class='page-item'>\r\n"
				+ "				      <a class='page-link' href='#'>&raquo;</a>\r\n"
				+ "				    </li>\r\n"
				+ "				  </ul>";
		
		return view;
	}
	
}
