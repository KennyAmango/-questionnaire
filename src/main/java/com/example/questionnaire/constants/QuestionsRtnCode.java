package com.example.questionnaire.constants;

public enum QuestionsRtnCode {
	CREATE_QUESTIONNAIRE_SUCCESS("200", "�Ыذݨ����\"),
	CATCH_REQUEST_SUCCESS("200", "�����̸�T�x�s���\"),
	STARTTIME_EMPTY("400", "�}�l�ɶ�����"),
	STARTTIME_REQUIRED("400", "�}�l�ɶ����ভ�󤵤�"),
	ENDTIME_EMPTY("400", "�����ɶ�����"),
	TIME_ERROR("400", "�}�l�ɶ�����j�󵲧��ɶ�"),
	DTAILS_EMPTY("400", "�ݨ���������"),
	NO_QUESTIONNAIRE("400", "�ȵL�ݨ�"),
	NAME_EMPTY("400", "�m�W����"),
	PHONENUM_EMPTY("400", "������X����"),
	EMAIL_EMPTY("400", "email����"),
	AGE_EMPTY("400", "�~�֬���"),
	QUS_EMPTY("400", "���D��J����"),
	ANSOPTIONS_EMPTY("400", "���D�ﶵ����"),
	ANS_EMPTY("400", "�D�ص��׬���"),
	SEX_EMPTY("400", "�ʧO����"),
	TITLE_EMPTY("400", "�ݨ����D����");
	
	private String code;
	
	private String message;
	
	private QuestionsRtnCode(String code, String message) {
		this.code = code;
		
		this.message = message;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}