# AlertBox
[��back to catalogue](summary.md)
## ����
> һ�����ڳ��������ʾ�û�ʱ�����Ի���Ļ����ؼ�
## Constructor
    public AlertBox(String message , String title, String yes, String no);
* message: ��Ҫ��ʾ����Ϣ
* title: ����
* yes: yes��ť��ʾ���ı�
* no: no��ť��ʾ���ı�
## Field
    private int mode = 0; 
* mode = 1�����û������"yes"����ఴť  
* mode = -1�����û������"no"���Ҳఴť  
* mode = 0�����û�û�е����ťֱ���˳�
## Method
    public int getMode();
> mode��getter