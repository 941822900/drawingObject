# MyLine
[��back to catalogue](summary.md)
## ����
> �����߶�
## Ӧ����㵼�µĻ��Ƴ��ļ�Сͼ��
    double lengthSquare = (currentLine.getStartX()-currentLine.getEndX())*(currentLine.getStartX()-currentLine.getEndX())+(currentLine.getStartY()-currentLine.getEndY())*(currentLine.getStartY()-currentLine.getEndY());
            if(lengthSquare<4)
            {
                pane.delete(currentLine);
            }
            else if(lengthSquare<100)
            {
                AlertBox alertBox = new AlertBox("The object you draw is small, Do you still want to add it?", "Too Small", "yes", "no");
                if (alertBox.getMode() != 1)pane.delete(currentLine);
            }
> ��Ϊ����ģʽ����С��С. ��С��ֱ��ɾ����С��ѯ���û��Ƿ���ɾ��