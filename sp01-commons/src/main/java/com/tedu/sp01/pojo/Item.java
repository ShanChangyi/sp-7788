package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//����һ������3
//u��iu��i�͡����avc
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//���
	private Integer id;
	//����
	private String name;
	
	private Integer number;
}