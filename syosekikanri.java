import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
//import javax.swing.text.BadLocationException;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class syosekikanri extends JFrame implements ActionListener{

    JPanel cardPanel;
    CardLayout layout;
    JLabel label;
    JTextField text;


    public static void main(String[] args) {
        syosekikanri frame = new syosekikanri();
        frame.setTitle("���ЊǗ��V�X�e��");
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public syosekikanri() {

        // panel01
        JPanel panel01 = new JPanel();
        JButton btn01 = new JButton("���ЊǗ�");
        panel01.add(btn01);

        // panel02
        text = new JTextField("��΂̍��P");
        JTextField text1 = new JTextField("2013�N7��23��");

        text.setPreferredSize(new Dimension(500, 500));
        JPanel panel02 = new JPanel();
        panel02.setLayout(null);
        JLabel label2 = new JLabel("���Ж�");
        panel02.add(label2);
        label2.setBounds(125,75,50,25);
        panel02.add(text);
        text.setBounds(100,100,100,25);
        JLabel label3 = new JLabel("������");
        panel02.add(label3);
        label3.setBounds(250,75,50,25);
        panel02.add(text1);
        text1.setBounds(225,100,100,25);
        JLabel label4 = new JLabel("�����");
        panel02.add(label4);
        label4.setBounds(375,75,50,25);
        JTextField tf1 = new JTextField("�s��t�q");
        panel02.add(tf1);
        tf1.setBounds(350,100,100,25);
        JTextField text10 = new JTextField("��΂̍��Q");
        panel02.add(text10);
        text10.setBounds(100,130,100,25);
        JTextField text11 = new JTextField("��΂̍��R");
        panel02.add(text11);
        text11.setBounds(100,160,100,25);
        JTextField text12 = new JTextField("��΂̍��S");
        panel02.add(text12);
        text12.setBounds(100,190,100,25);
        JTextField text13 = new JTextField("��΂̍��T");
        panel02.add(text13);
        text13.setBounds(100,220,100,25);
        JTextField text14 = new JTextField("��΂̍��U");
        panel02.add(text14);
        text14.setBounds(100,250,100,25);
        JTextField text15 = new JTextField("��΂̍��V");
        panel02.add(text15);
        text15.setBounds(100,280,100,25);
        JTextField text16 = new JTextField("��΂̍��W");
        panel02.add(text16);
        text16.setBounds(100,310,100,25);
        JTextField text17 = new JTextField("��΂̍��X");
        panel02.add(text17);
        text17.setBounds(100,340,100,25);
        JTextField text18 = new JTextField("��΂̍��P�O");
        panel02.add(text18);
        text18.setBounds(100,370,100,25);
        JTextField text19 = new JTextField("��΂̍��P�P");
        panel02.add(text19);
        text19.setBounds(100,400,100,25);
        JTextField text20 = new JTextField("���Ɖ�");
        panel02.add(text20);
        text20.setBounds(100,430,100,25);
        JTextField text21 = new JTextField("�Q�T���̃o�J���X");
        panel02.add(text21);
        text21.setBounds(100,460,100,25);
        JTextField text22 = new JTextField("���̉���");
        panel02.add(text22);
        text22.setBounds(100,490,100,25);
        JTextField text23 = new JTextField("2014�N1��23��");
        panel02.add(text23);
        text23.setBounds(225,130,100,25);
        JTextField text24 = new JTextField("2014�N8��22��");
        panel02.add(text24);
        text24.setBounds(225,160,100,25);
        JTextField text25 = new JTextField("2015�N5��22��");
        panel02.add(text25);
        text25.setBounds(225,190,100,25);
        JTextField text26 = new JTextField("2015�N11��20��");
        panel02.add(text26);
        text26.setBounds(225,220,100,25);
        JTextField text27 = new JTextField("2016�N9��23��");
        panel02.add(text27);
        text27.setBounds(225,250,100,25);
        JTextField text28 = new JTextField("2017�N5��23��");
        panel02.add(text28);
        text28.setBounds(225,280,100,25);
        JTextField text29 = new JTextField("2017�N11��22��");
        panel02.add(text29);
        text29.setBounds(225,310,100,25);
        JTextField text30 = new JTextField("2018�N10��23��");
        panel02.add(text30);
        text30.setBounds(225,340,100,25);
        JTextField text31 = new JTextField("2019�N8��23��");
        panel02.add(text31);
        text31.setBounds(225,370,100,25);
        JTextField text32 = new JTextField("2020�N7��20��");
        panel02.add(text32);
        text32.setBounds(225,400,100,25);
        JTextField text33 = new JTextField("2009�N11��20��");
        panel02.add(text33);
        text33.setBounds(225,430,100,25);
        JTextField text34 = new JTextField("2011�N9��23��");
        panel02.add(text34);
        text34.setBounds(225,460,100,25);
        JTextField text35 = new JTextField("2017�N11��22��");
        panel02.add(text35);
        text35.setBounds(225,490,100,25);
        JTextField text36 = new JTextField("�s��t�q");
        panel02.add(text36);
        text36.setBounds(350,130,100,25);
        JTextField text37 = new JTextField("�s��t�q");
        panel02.add(text37);
        text37.setBounds(350,160,100,25);
        JTextField text38 = new JTextField("�s��t�q");
        panel02.add(text38);
        text38.setBounds(350,190,100,25);
        JTextField text39 = new JTextField("�s��t�q");
        panel02.add(text39);
        text39.setBounds(350,220,100,25);
        JTextField text40 = new JTextField("�s��t�q");
        panel02.add(text40);
        text40.setBounds(350,250,100,25);
        JTextField text41 = new JTextField("�s��t�q");
        panel02.add(text41);
        text41.setBounds(350,280,100,25);
        JTextField text42 = new JTextField("�s��t�q");
        panel02.add(text42);
        text42.setBounds(350,310,100,25);
        JTextField text43 = new JTextField("�s��t�q");
        panel02.add(text43);
        text43.setBounds(350,340,100,25);
        JTextField text44 = new JTextField("�s��t�q");
        panel02.add(text44);
        text44.setBounds(350,370,100,25);
        JTextField text45 = new JTextField("�s��t�q");
        panel02.add(text45);
        text45.setBounds(350,400,100,25);
        JTextField text46 = new JTextField("�s��t�q");
        panel02.add(text46);
        text46.setBounds(350,430,100,25);
        JTextField text47 = new JTextField("�s��t�q");
        panel02.add(text47);
        text47.setBounds(350,460,100,25);
        JTextField text48 = new JTextField("�s��t�q");
        panel02.add(text48);
        text48.setBounds(350,490,100,25);

        


        JButton btn02 = new JButton("�{�I");
        panel02.add(btn02);
        btn02.setBounds(100,50,100,25);


        // panel03
        JPanel panel03 = new JPanel();
        //panel03.setBackground(Color.LIGHT_GRAY);
        panel03.setLayout(null);
        JLabel label5 = new JLabel("���Ж�");
        panel03.add(label5);
        label5.setBounds(125,75,50,25);
        JTextField text2 = new JTextField("����");
        panel03.add(text2);
        text2.setBounds(100,100,100,25);
        JLabel label6 = new JLabel("�����");
        panel03.add(label6);
        label6.setBounds(250,75,50,25);
        JTextField text3 = new JTextField("��F���m");
        panel03.add(text3);
        text3.setBounds(225,100,100,25);
        JLabel label7 = new JLabel("�l�i");
        panel03.add(label7);
        label7.setBounds(375,75,50,25);
        JTextField text4 = new JTextField("2970");
        panel03.add(text4);
        text4.setBounds(350,100,100,25);
        JTextField text49 = new JTextField("���l�P");
        panel03.add(text49);
        text49.setBounds(100,130,100,25);
        JTextField text50 = new JTextField("���l�Q");
        panel03.add(text50);
        text50.setBounds(100,160,100,25);
        JTextField text51 = new JTextField("���l�R");
        panel03.add(text51);
        text51.setBounds(100,190,100,25);
        JTextField text52 = new JTextField("���l�S");
        panel03.add(text52);
        text52.setBounds(100,220,100,25);
        JTextField text53 = new JTextField("���l�T");
        panel03.add(text53);
        text53.setBounds(100,250,100,25);
        JTextField text54 = new JTextField("���l�U");
        panel03.add(text54);
        text54.setBounds(100,280,100,25);
        JTextField text55 = new JTextField("���l�V");
        panel03.add(text55);
        text55.setBounds(100,310,100,25);
        JTextField text56 = new JTextField("�_�[�E�B�����ςP");
        panel03.add(text56);
        text56.setBounds(100,340,100,25);
        JTextField text57 = new JTextField("�_�[�E�B�����ςQ");
        panel03.add(text57);
        text57.setBounds(100,370,100,25);
        JTextField text58 = new JTextField("�_�[�E�B�����ςR");
        panel03.add(text58);
        text58.setBounds(100,400,100,25);
        JTextField text59 = new JTextField("�g�����I���Q�[��");
        panel03.add(text59);
        text59.setBounds(100,430,100,25);
        JTextField text60 = new JTextField("������");
        panel03.add(text60);
        text60.setBounds(225,130,100,25);
        JTextField text61 = new JTextField("������");
        panel03.add(text61);
        text61.setBounds(225,160,100,25);
        JTextField text62 = new JTextField("������");
        panel03.add(text62);
        text62.setBounds(225,190,100,25);
        JTextField text63 = new JTextField("������");
        panel03.add(text63);
        text63.setBounds(225,220,100,25);
        JTextField text64 = new JTextField("������");
        panel03.add(text64);
        text64.setBounds(225,250,100,25);
        JTextField text65 = new JTextField("������");
        panel03.add(text65);
        text65.setBounds(225,280,100,25);
        JTextField text66 = new JTextField("������");
        panel03.add(text66);
        text66.setBounds(225,310,100,25);
        JTextField text67 = new JTextField("���߂��킵���");
        panel03.add(text67);
        text67.setBounds(225,340,100,25);
        JTextField text68 = new JTextField("���߂��킵���");
        panel03.add(text68);
        text68.setBounds(225,370,100,25);
        JTextField text69 = new JTextField("���߂��킵���");
        panel03.add(text69);
        text69.setBounds(225,400,100,25);
        JTextField text70 = new JTextField("��_����Y");
        panel03.add(text70);
        text70.setBounds(225,430,100,25);
        JTextField text71 = new JTextField("748");
        panel03.add(text71);
        text71.setBounds(350,130,100,25);
        JTextField text72 = new JTextField("748");
        panel03.add(text72);
        text72.setBounds(350,160,100,25);
        JTextField text73 = new JTextField("748");
        panel03.add(text73);
        text73.setBounds(350,190,100,25);
        JTextField text74 = new JTextField("748");
        panel03.add(text74);
        text74.setBounds(350,220,100,25);
        JTextField text75 = new JTextField("748");
        panel03.add(text75);
        text75.setBounds(350,250,100,25);
        JTextField text76 = new JTextField("748");
        panel03.add(text76);
        text76.setBounds(350,280,100,25);
        JTextField text77 = new JTextField("748");
        panel03.add(text77);
        text77.setBounds(350,310,100,25);
        JTextField text78 = new JTextField("748");
        panel03.add(text78);
        text78.setBounds(350,340,100,25);
        JTextField text79 = new JTextField("748");
        panel03.add(text79);
        text79.setBounds(350,370,100,25);
        JTextField text80 = new JTextField("748");
        panel03.add(text80);
        text80.setBounds(350,400,100,25);
        JTextField text81 = new JTextField("650");
        panel03.add(text81);
        text81.setBounds(350,430,100,25);


        

        JButton btn03 = new JButton("�~��������");
        panel03.add(btn03);
        btn03.setBounds(100,50,100,25);
        


        JPanel panel04 = new JPanel();
        //panel04.setBackground(Color.BLUE);
        panel04.setLayout(null);
        JLabel label8 = new JLabel("���Ж�");
        panel04.add(label8);
        label8.setBounds(125,75,50,25);
        JTextField text5 = new JTextField("SANDA 2");
        panel04.add(text5);
        text5.setBounds(100,100,100,25);
        JTextField text82 = new JTextField("������l�͍��点����");
        panel04.add(text82);
        text82.setBounds(100,130,100,25);
        JTextField text83 = new JTextField("�C������G���h���[�� 2");
        panel04.add(text83);
        text83.setBounds(100,160,100,25);
        JTextField text84 = new JTextField("��p���� 19");
        panel04.add(text84);
        text84.setBounds(100,190,100,25);
        JTextField text85 = new JTextField("�n�C�E�F�C�X�^�[");
        panel04.add(text85);
        text85.setBounds(100,220,100,25);
        JTextField text86 = new JTextField("����Ȃ�ɂ��ۂ�");
        panel04.add(text86);
        text86.setBounds(100,250,100,25);
        JTextField text87 = new JTextField("HUNTER�~HUNTER 37");
        panel04.add(text87);
        text87.setBounds(100,280,100,25);
        JTextField text88 = new JTextField("��΂̍� 12");
        panel04.add(text88);
        text88.setBounds(100,310,100,25);
        JLabel label9 = new JLabel("�����");
        panel04.add(label9);
        label9.setBounds(250,75,50,25);
        JTextField text6 = new JTextField("�_�b��");
        panel04.add(text6);
        text6.setBounds(225,100,100,25);
        JTextField text89 = new JTextField("�ԍ�A�J");
        panel04.add(text89);
        text89.setBounds(225,130,100,25);
        JTextField text90 = new JTextField("���炿�˃W����");
        panel04.add(text90);
        text90.setBounds(225,160,100,25);
        JTextField text91 = new JTextField("�H�� ���X");
        panel04.add(text91);
        text91.setBounds(225,190,100,25);
        JTextField text92 = new JTextField("��F���m");
        panel04.add(text92);
        text92.setBounds(225,220,100,25);
        JTextField text93 = new JTextField("��F���m");
        panel04.add(text93);
        text93.setBounds(225,250,100,25);
        JTextField text94 = new JTextField("�y�~�`��");
        panel04.add(text94);
        text94.setBounds(225,280,100,25);
        JTextField text95 = new JTextField("�s��t�q");
        panel04.add(text95);
        text95.setBounds(225,310,100,25);
        JLabel label10 = new JLabel("�l�i");
        panel04.add(label10);
        label10.setBounds(375,75,50,25);
        JTextField text7 = new JTextField("473");
        panel04.add(text7);
        text7.setBounds(350,100,100,25);
        JTextField text96 = new JTextField("648");
        panel04.add(text96);
        text96.setBounds(350,130,100,25);
        JTextField text97 = new JTextField("660");
        panel04.add(text97);
        text97.setBounds(350,160,100,25);
        JTextField text98 = new JTextField("459");
        panel04.add(text98);
        text98.setBounds(350,190,100,25);
        JTextField text99 = new JTextField("2970");
        panel04.add(text99);
        text99.setBounds(350,220,100,25);
        JTextField text100 = new JTextField("2970");
        panel04.add(text100);
        text100.setBounds(350,250,100,25);
        JTextField text101 = new JTextField("����");
        panel04.add(text101);
        text101.setBounds(350,280,100,25);
        JTextField text102 = new JTextField("����");
        panel04.add(text102);
        text102.setBounds(350,310,100,25);


        JLabel label11 = new JLabel("������");
        panel04.add(label11);
        label11.setBounds(500,75,50,25);
        JTextField text8  = new JTextField("2022�N2��8��");
        panel04.add(text8);
        text8.setBounds(475,100,100,25);
        JTextField text103 = new JTextField("2022�N3��18��");
        panel04.add(text103);
        text103.setBounds(475,130,100,25);
        JTextField text104 = new JTextField("2022�N2��16��");
        panel04.add(text104);
        text104.setBounds(475,160,100,25);
        JTextField text105 = new JTextField("2022�N4��4��");
        panel04.add(text105);
        text105.setBounds(475,190,100,25);
        JTextField text106 = new JTextField("2022�N5��20��");
        panel04.add(text106);
        text106.setBounds(475,220,100,25);
        JTextField text107 = new JTextField("2022�N7��20��");
        panel04.add(text107);
        text107.setBounds(475,250,100,25);
        JTextField text108 = new JTextField("����");
        panel04.add(text108);
        text108.setBounds(475,280,100,25);
        JTextField text109 = new JTextField("����");
        panel04.add(text109);
        text109.setBounds(475,310,100,25);
        JLabel label12 = new JLabel("�w�����T");
        panel04.add(label12);
        label12.setBounds(625,75,50,25);
        JTextField text9 = new JTextField("���T�y�[�p�[");
        panel04.add(text9);
        text9.setBounds(600,100,100,25);
        JTextField text113 = new JTextField("");
        panel04.add(text113);
        text113.setBounds(600,130,100,25);
        JTextField text114 = new JTextField("�������낵������");
        panel04.add(text114);
        text114.setBounds(600,160,100,25);
        JTextField text115 = new JTextField("");
        panel04.add(text115);
        text115.setBounds(600,190,100,25);
        JTextField text116 = new JTextField("�X�e�b�J�[");
        panel04.add(text116);
        text116.setBounds(600,220,100,25);
        JTextField text117 = new JTextField("�X�e�b�J�[");
        panel04.add(text117);
        text117.setBounds(600,250,100,25);
        JTextField text118 = new JTextField("����");
        panel04.add(text118);
        text118.setBounds(600,280,100,25);
        JTextField text119 = new JTextField("����");
        panel04.add(text119);
        text119.setBounds(600,310,100,25);


        JButton btn04 = new JButton("�V�����");
        panel04.add(btn04);
        btn04.setBounds(100,50,100,25);


        // CardLayout�p�p�l��
        cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        cardPanel.add(panel01, "���ЊǗ�");
        cardPanel.add(panel02, "�{�I");
        cardPanel.add(panel03, "�~��������");
        cardPanel.add(panel04, "�V�����");

        // �J�[�h�ړ��p�{�^��
        JButton firstButton = new JButton("���ЊǗ�");
        firstButton.addActionListener(this);
        firstButton.setActionCommand("���ЊǗ�");

        JButton secondButton = new JButton("�{�I");
        secondButton.addActionListener(this);
        secondButton.setActionCommand("�{�I");

        JButton thirdButton = new JButton("�~��������");
        thirdButton.addActionListener(this);
        thirdButton.setActionCommand("�~��������");

        JButton fourButton = new JButton("�V�����");
        fourButton.addActionListener(this);
        fourButton.setActionCommand("�V�����");

        JTextField firstField = new JTextField();
        firstField.addActionListener(this);
        



        JPanel btnPanel = new JPanel();
        btnPanel.add(firstButton);
        btnPanel.add(secondButton);
        btnPanel.add(thirdButton);
        btnPanel.add(fourButton);

        // cardPanel�ƃJ�[�h�ړ��p�{�^����JFrame�ɔz�u
        Container contentPane = getContentPane();
        contentPane.add(cardPanel, BorderLayout.CENTER);
        contentPane.add(btnPanel, BorderLayout.PAGE_END);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        layout.show(cardPanel, cmd);
    }
}