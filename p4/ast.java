deps/                                                                                               0000777 0002035 0002035 00000000000 14222102116 011000  5                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  deps/java_cup/                                                                                      0000777 0002035 0002035 00000000000 14222102116 012570  5                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  deps/java_cup/action_part.class                                                                     0000666 0002035 0002035 00000002567 14202043766 016151  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 B
  ,	  -
  .
  /
 0 1 2
  3
  4
 0 4 5
 
 6
  7
 
 8 9 :
 
 ; < _code_string Ljava/lang/String; <init> (Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Ljava_cup/action_part; code_str code_string ()Ljava/lang/String; set_code_string new_str 	is_action ()Z equals (Ljava_cup/action_part;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode ()I toString 
SourceFile action_part.java     " =   > " % java_cup/action_part " # ' ( java/lang/StringBuilder  ? )  @ A { } )  java_cup/production_part (Ljava_cup/production_part;)Z java/lang/String ()V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; !                   G     *� *+� �              
                           /     *� �           (                    :     *+� �           -                      !     ,     �           4              " #     T      +� *+� � +� *� � � � �           <                  $    " %     N     +� � �*+� � �           E  F 	 H                $ &   ' (     B     *� *� � � 
*� � 	��           P              )      M     #� 
Y� *� � � *� � � � �           Y        #      *    +                                                                                                                                         deps/java_cup/action_production.class                                                               0000666 0002035 0002035 00000002027 14202043766 017360  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 (
  !	  "	  # $ % indexOfIntermediateResult I _base_production Ljava_cup/production; <init> ^(Ljava_cup/production;Ljava_cup/non_terminal;[Ljava_cup/production_part;ILjava/lang/String;I)V Code LineNumberTable LocalVariableTable this Ljava_cup/action_production; base lhs_sym Ljava_cup/non_terminal; 	rhs_parts [Ljava_cup/production_part; rhs_len 
action_str Ljava/lang/String; 
Exceptions & getIndexOfIntermediateResult ()I base_production ()Ljava_cup/production; 
SourceFile action_production.java 
 '  	   java_cup/action_production java_cup/production java_cup/internal_error H(Ljava_cup/non_terminal;[Ljava_cup/production_part;ILjava/lang/String;)V !             	     
      �     *,-� *+� *� �            
      !    H             	                                             /     *� �           '                    /     *� �           /                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            deps/java_cup/assoc.class                                                                           0000666 0002035 0002035 00000000616 14202043766 014747  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 
     left I ConstantValue     right    nonassoc    no_prec���� <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/assoc; 
SourceFile 
assoc.java   java_cup/assoc java/lang/Object !                       	  
                         /     *� �                                                                                                                                               deps/java_cup/CUP$parser$actions.class                                                              0000666 0002035 0002035 00000047663 14202043766 017211  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1H
 @A
 B
 C	 �DEF
 G	 �H	 �I	 �J	KLM
NO	 �P
 #QR
 ST
 UV
 WX
 YZ
 �S	 �[\]
 S	 �^_
  S	 �`a
 #S	 �b	 �c	 �d
efg
  hijklm
  n
opq
orstuvwxyz{|}~ ���	 +�	 +�	 +�������
 ���
 N�
 #�
 ��
 ���
 ������������
  ���
  �����
 i�
 ���
o��
 ���	 ���
 r�
 ��6	 �	���	 N�	����
 �
 �
 r�
���������
o�������
 �����
 �����������������	����	����	����	������	���	����	�����	�����	 ���
  MAX_RHS I ConstantValue   � 	rhs_parts [Ljava_cup/production_part; rhs_pos multipart_name Ljava/lang/String; multipart_names Ljava/util/Stack; symbols Ljava/util/Hashtable; 	non_terms start_nt Ljava_cup/non_terminal; lhs_nt 	_cur_prec 	_cur_side parser Ljava_cup/parser; add_lab H(Ljava_cup/production_part;Ljava/lang/String;)Ljava_cup/production_part; Code LineNumberTable LocalVariableTable this Ljava_cup/CUP$parser$actions; part Ljava_cup/production_part; lab 
Exceptions new_rhs ()V add_rhs_part (Ljava_cup/production_part;)V update_precedence (I)V p add_precedence (Ljava/lang/String;)V sym Ljava_cup/symbol; sp Ljava_cup/symbol_part; term <init> (Ljava_cup/parser;)V CUP$parser$do_action J(ILjava_cup/runtime/lr_parser;Ljava/util/Stack;I)Ljava_cup/runtime/Symbol; RESULT Ljava/lang/Object; 
the_idleft the_idright the_id this_nt non_term_idleft non_term_idright non_term_id term_idleft term_idright term_id wleft wright w listleft 	listright list argleft argright arg 	an_idleft 
an_idright an_id 	typesleft 
typesright types another_idleft another_idright 
another_id 	labidleft 
labidright labid code_strleft code_strright code_str 	symidleft 
symidright symid symb Ljava_cup/production; term_nameleft term_nameright 	term_name 
lhs_idleft lhs_idright lhs_id start_nameleft start_nameright 
start_name nt symleft symright user_codeleft user_coderight 	user_code idleft idright id start_valleft start_valright 	start_val CUP$parser$act_num CUP$parser$parser Ljava_cup/runtime/lr_parser; CUP$parser$stack CUP$parser$top CUP$parser$result Ljava_cup/runtime/Symbol; 
SourceFile parser.java java_cup/symbol_part	 �
 � � java/lang/Exception >Internal Error: Productions limited to 200 symbols and actions � � � � � � � � 0Unable to add precedence to nonexistent terminal � � � java/lang/StringBuilder � � Could find terminal   while declaring precedence java_cup/terminal ,Precedence declaration: Can't find terminal  � � java_cup/production_part java/lang/String � � java/util/Stack � � java/util/Hashtable � � � � � � empty java_cup/runtime/Symbol opt_semi non_terminal !"#$ Illegal use of reserved word% � ILLEGAL 	robust_id nonassoc right left 
precedence start with scan init nonterminal non terminal action codew �v �& � label_id 	symbol_id nt_id java_cup.runtime.Symbol " " has already been declared  '( Object java_cup/non_terminal �)*+ �, new_non_term_id new_term_id []-. type_id 	import_id .* 	 ? super  wildcard  ? extends   ?  typearguement , typearglist multipart_id/ < >0 NT$13 . 	opt_label java_cup/action_part � � � � 	prod_part12 " has not been declared � � prod_part_list � � java_cup/production �3 � �45678 RESULT = start_val;9 �:! rhs %No terminal for contextual precedence;2<2 �=>? � Invalid terminal  % for contextual precedence assignment rhs_list 
production Syntax Error NT$12 LHS non terminal "@ � NT$11 production_list 
start_spec Start non terminal " NT$10 
Terminal " � � terminal_id terminal_list preced � � NT$9 NT$8 NT$7 precedence_l precedence_list non_term_name_list term_name_list declares_non_term NT$6 declares_term NT$5 symbol NT$4 NT$3 symbol_list� � Redundant scan code (skipping) 	scan_code� � Redundant init code (skipping) 	init_codeA �  Redundant parser code (skipping) parser_code_partB �  Redundant action code (skipping) action_code_part 
code_parts 	code_partC � SymD � 
class_name import_spec� � NT$2 import_list package_specE � NT$1 spec error�5 $START NT$0FG � 3Invalid action number found in internal parse table java_cup/CUP$parser$actions java/lang/Object java_cup/internal_error 	is_action ()Z 
the_symbol ()Ljava_cup/symbol; &(Ljava_cup/symbol;Ljava/lang/String;)V java/lang/System err Ljava/io/PrintStream; java/io/PrintStream println get &(Ljava/lang/Object;)Ljava/lang/Object; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; set_precedence (II)V java_cup/parser getSymbolFactory "()Ljava_cup/runtime/SymbolFactory; peek ()Ljava/lang/Object; java_cup/runtime/SymbolFactory 	newSymbol r(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)Ljava_cup/runtime/Symbol; 	elementAt (I)Ljava/lang/Object; java_cup/ErrorManager 
getManager ()Ljava_cup/ErrorManager; 
emit_error value equals (Ljava/lang/Object;)Z '(Ljava/lang/String;Ljava/lang/String;)V put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; (Ljava_cup/symbol;)V concat &(Ljava/lang/String;)Ljava/lang/String; pop push getErrorCount ()I 6(Ljava_cup/non_terminal;[Ljava_cup/production_part;I)V EOF Ljava_cup/terminal; java_cup/emit _xmlactions Z START_nt start_production precedence_num precedence_side 8(Ljava_cup/non_terminal;[Ljava_cup/production_part;III)V java_cup/symbol note_use emit_warning parser_code action_code parser_class_name symbol_const_class_name package_name java_cup/runtime/lr_parser done_parsing   � �     � �  �    �  � �    � �    � �    � �    � �    � �    � �    � �     � �     � �    � �     � �  �   _     ,� 
+� � +�� Y+� � ,� �    �   
   � � �         � �      � �     � �  �     �  � �  �   0     *� �    �      � �        � �    � �  �   m     )*�  ȡ � Y� �*� 	*� +S*Y� `� �    �      � 
� � � (� �       ) � �     ) � �  �       � �  �   L     *� 
*Y� `� �    �         �        � �      � �   � �  �   �     x+� � � � k*� +� � M,� $� � Y� � +� � � � � :,� N-� � -� *� 
*� � � � � Y� � +� � � �    �   * 
       @ E L ^ w" �   *  E 2 � �   \ � �    x � �     x � �    � �  �   �     [*� * ȵ * Ƚ � 	*� *� Y� � *�  Y� !� "*� #Y� $� *� #Y� $� %*� &*� *� 
*+� '�    �   6   ' � � � � %� 0� ;  F K	 P U( Z) �       [ � �     [ � �   � �  �  32    !.�    !#       t   �   w   K      �  �  �  Y  2  �  �  �    �  �  �  y  R  '  �  >  �  T  (     �  �  |  P    �  �  r  ?    �  �  h  @    �  �  �  p  H    �  �  v  I    �  �  `  �    �  n  B    �    �  �  �  Y  �    �  �  �  �  A    �  j  �  u  "  
�  
H  	�  	�  	z  	+  �  �  �  i  �  �  �  x  %  �  �  K    �  �  �  o  C    �  �  �  g  ;    �  �  �  [  3    �:*� '� ()-� *� +-� *� +� , :�:*� '� (--� *� +-� *� +� , :�:*� '� (--� *� +-� *� +� , :�:*� '� (.-� *� +-� *� +� , :�:*� '� (.-d� /� +-� *� +� , :�:� 01� 23:*� '� (4*-� *� +-� *� +� , :�:5:*� '� (4*-� *� +-� *� +� , :�:6:*� '� (4*-� *� +-� *� +� , :�:7:*� '� (4*-� *� +-� *� +� , :�:8:*� '� (4*-� *� +-� *� +� , :�:9:*� '� (4*-� *� +-� *� +� , :�:::*� '� (4*-� *� +-� *� +� , :�:;:*� '� (4*-� *� +-� *� +� , :�:<:*� '� (4*-� *� +-� *� +� , :�:=:*� '� (4*-� *� +-� *� +� , :�:>:*� '� (4*-� *� +-� *� +� , :�:?:*� '� (4*-� *� +-� *� +� , :�:@:*� '� (4*-� *� +-� *� +� , :�:A:*� '� (4*-� *� +-� *� +� , :�:B:*� '� (4*-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :		:*� '� (4*-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :		:*� '� (F&-� *� +-� *� +� , :�:� 01� 23:*� '� (G%-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :		:*� '� (G%-� *� +-� *� +� , :�:� 01� 23:*� '� (H$-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :		:*� '� (H$-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	*� 	� � %� 0� Y� I� 	� J� � � 2� C*� K� L� 	*M� � NY	*� � O:
*� %	
� PW*� 	� Y
� Q� PW*� '� (R-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	*� 	� � %� 0� Y� I� 	� J� � � 2� 3*� K� L� 	*M� *� 	� Y� Y	*� � S� Q� PW*� '� (T-� *� +-� *� +� , :�:**� U� V� *� '� (W-d� /� +-� *� +� , :�:*� '� (W-� *� +-� *� +� , :�:*� '� (X-� *� +-� *� +� , :�:**� Y� V� *� '� (X-d� /� +-� *� +� , :�:� Y� Z� *� � � :*� Y� � *� '� ([--d� /� +-� *� +� , :�:� Y� \� *� � � :*� Y� � *� '� ([--d� /� +-� *� +� , :�:]:*� '� ([--� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :		:*� '� (^,-� *� +-� *� +� , :�:*� :*� Y� � *� '� (^,-� *� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	-� *� +� C6
-� *� +� D6-� *� +� E� :� Y� 	� _� � � :*� '� (`+-d� /� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :		:*� '� (`+-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	**� 	� V� *� '� (a-� *� +-� *� +� , :�:-d� /� +� E:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	**� "� b� � Y� c� 	� d� � � V� *� '� (a-d� /� +-� *� +� , :�:*� "*� � eW*K� *� '� (f;-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	**� � Y� g� 	� � � V� *� '� (a-d� /� +-� *� +� , :�::*� '� (h'-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :		:*� '� (h'-d� /� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	*� iY	� j� k*� '� (l-� *� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	-� *� +� C6
-� *� +� D6-� *� +� E� :*� 	� � :� .� 0� m� 1� 0� Y� I� 	� n� � � 2� **� o� k*� '� (l-d� /� +-� *� +� , :�:*� '� (p-� *� +-� *� +� , :�:*� '� (p-d� /� +-� *� +� , :�:*� q� z� rY*� q*� 	*� � s:*� &� ^**� q� &*� t**� Y*� &� Qu� o� k*� Y� v� Q� k� w� *� iYx� j� k� rY� y*� 	*� � s� z*� t*� t*� '� ({-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	:
*� q�9	� � |� :
� *� 	� � � :

� E
� � =� rY*� q*� 	*� 
� � }
� � ~� :*� 	� � � � �� 7� � Y� �� 	� �� � � � rY*� q*� 	*� � s:*� &� �**� q� &*� t**� Y*� &� Qu� o� k*� Y� v� Q� k� w� *� iYx� j� k
� 3
� � +� rY� y*� 	*� 
� � }
� � ~� � z� � rY� y*� 	*� � s� z*� t*� t*� '� ({-d� /� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:� 0�� 2*� '� (�:-� *� +-� *� +� , :�:-d� /� +� E:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	*� '� (�-d� /� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	**� %	� � N� q*� q� +� 0� m� "� 0� Y� �� 	� n� � � �*� t*� '� (�9-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�
-� *� +-� *� +� , :�:-d� /� +� E:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	*� '� (�
-d� /� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	*� %	� � N:

� %� 0� Y� �� 	� n� � � 2� \*
� &*� t**� Y*� &� Qu� o� k*� Y� v� Q� k� w� *� iYx� j� k� rY� y*� 	*� � s� z*� t*� '� (�8-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	*� 	� � "� 0� Y� �� 	� n� � � 2	:*� '� (�)-� *� +-� *� +� , :�:-� *� +� C6-� *� +� D6-� *� +� E� :	*	� �	:*� '� (�(-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:*� �*� '� (�7-� *� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:*� �*� '� (�6-� *� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:*� �*� '� (�5-� *� +-� *� +� , :�:*� '� (� -� *� +-� *� +� , :�:*� '� (� -d� /� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:-d� /� +� E:*� '� (�"-d� /� +-� *� +� , :�:*� Y� � *� '� (�4-� *� +-� *� +� , :�:-d� /� +� E:*� '� (�!-d� /� +-� *� +� , :�:*� Y� � *� '� (�3-� *� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:*� Y� � *� '� (�2-� *� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:*� Y� � *� '� (�1-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�	-� *� +-� *� +� , :�:*� '� (�	-d� /� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	� �� � 0�� �� 	� �*� '� (�-d� /� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	� �� � 0�� �� 	� �*� '� (�-d� /� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	� �� � 0�� �� 	� �*� '� (�-d� /� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E� :	� �� � 0�� �� 	� �*� '� (�-d� /� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E� :		� �� Y� 	� �� � � �*� '� (�#-d� /� +-� *� +� , :�:*� '� (�#-� *� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:� �*� � eW*� Y� � *� '� (�0-� *� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�-� *� +-� *� +� , :�:-d� /� +� E:*� '� (�-d� /� +-� *� +� , :�:*� � �*� Y� � *� '� (�/-� *� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� '� (�-d� /� +-� *� +� , :�:*� �� Y� �� Q� PW*� %�� y� PW*� '� (�.-� *� +-� *� +� , :�:-d� /� +� C6-d� /� +� D6-d� /� +� E:		:*� '� (�-d� /� +-� *� +� , :,� ��� Y÷ �    �  	RT  7�<�>	@EG1I4N7PYR\W_Y�[�`�b�d�i�k�l�n�p�u�v�wy~�9�<�?�C�e�h�k�o�����������������������������A�D�G�K�m�p�s�w�������������������������� �#�'�I�L�O�[�g�v�z������ ��������#&)5APTvy#|%�&�(�*�/�0�1�2�3�4�6 ;<=>*A6DXIdJjMyQ�T�W�Y�^�_�`�a�d�gm!n'qEugwj|m}z~������������������	�	)�	,�	/�	R�	x�	{�	~�	��	��	��	��	��	��	��	��
�
�
 �
$�
F�
I�
L�
]�
�
��
��
��
��
��
��
��
��
�� �#�&�2�>�M�Q�s�v�y���������������������Bhkn	�
�������?!B&E'Q(])l*p+�-�2�3�4�5�8�:�<�A�BCD+E7FCGRJ`MeOnP�V�Y�[�`�b�d�i�kmrt#w8|?~G�K�`�n����������������������������
��(�M�b��������������������)�-�1�W�Z�]�������������������������-�=�M `��	�
��������#%@'C,F.l0o5r7�9�>�@�A�B�C�EGL	MN!O0R>SCUe[k^o_�`�a�b�d�g�i�n�o�p�qtw8z<|^~a�d�p�|����������������������!�G�J�M�R�t�w�z����������������������$�F�I�L�n�q�t�������������
�>ADf i%l'�)�.�0�2�4�9�<�>@EGI=K@PCSNUpWs\v^�`�b�g�j�l�n�s�u�wy~!�,�N�Q�T�z�}�������������������&�)�,�R�U�X�h�x������������������� ����<�?�B�R�b�u�{��������������������� �%�(+PSVwz}���!�#�(�*�,�1�35:;)<9=L?Q@hB�D�I�K�M�R�T�V�X�]�`ce0g3l6nWpZu]w�y�~�������������������� � !� $� I� L� O� u� x� {� �� �� �� �� �� �� �� �� ��!�!!�!$� �  � �� " � �  " � � 7 " � � _ " � � � & � � � . � � � & � �  & � � ? & � � k & � � � & � � � & � � � & � �  & � � G & � � s & � � � & � � � & � � � & � � # & � � O M � � [ A � � g 5 � � v & � � 	� M � � � A � � � 5 � � � & � � 	� . � � ) M � � 5 A � � A 5 � � P & � � 	| . � � � M � � � A � � � 5 � � � & � � 	y  � � 
 � � �  � � �  �  � * � � 	� � � � � � � � � � � � � 	m 3 � � � " � � � " � � � 3 � � 	/ I � � 	~ I � � 	� & � � 	� M � � 
 A � 
 5 � 
  & � 	
L 3 � � 
� � � � 
� � � 
� {	 � 
� h
 � 	
� \ � 

� P � 
� A � & M � � 2 A � > 5 � M & � 	y V � � � J � � > � � / � 	� � � � � s �  c �  P � 	n 4 � � � l � � � ` � � T � � E � 	 % � � E Q � � Q E � ] 9 � l * � 	� V � � � J � � > � � / � 	� � � �  � �  � � + � � 	7 � � 
C  � R p � ` b  � � " � � � & � � 8 b �!  � � � M  �! � � �! �� � � ��" � �y# � �j$ � 	�g � � 
] " � � � & � � � 6 � � � * � �  i � � = I% � M 9& � ` &' � 	� � � � � �% � � t& � � e' � 	 " � � F & � � r " � � � i � � � I( � � 9) � � &* � 		 � � �  �( � ! �) � 0 �* � 	> �+ � 
� x � � � l, � � `- �  Q � � 	d S � � p G, � | ;- � � , � � 	� " � � � & � �  6 � � M ' � � z 6 � � � ' � � � 6 � �  ' � � L " � � t & � � � " � � � " � � � " � �  & � � D " � � l & � � � 6 � � � - � �  6 � � C - � � v 6 � � � - � � � 6 � � ! - � � T & � � � & � � � & � � � & � �  " � � , & � � X o � � h _. � x O/ � � <0 � 	� o � � � _. � � O/ �   <0 � 	B o � � R _. � b O/ � u <0 � 	� n � � � ^. � � N/ � � ;0 � 	+ % � � V ! � � } ! � � � ! � � � ! � � � ! � �  u � � ) e1 � 9 U2 � L B3 � 	� " � � � 6 � � � 8 � � 6 ! � � ] % � � � ! � � � 5 � � � 4 � �  $ % � �  O & � �  { C � �  � Y � �  � I4 �  � 95 �  � )6 � 	  !. � �    !.7 �   !.89   !.: �   !.; � 	%<=  �      >   ?                                                                             deps/java_cup/emit.class                                                                            0000666 0002035 0002035 00000054061 14202043766 014600  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1c
 `�	@�	@�	@�	@�	@��
 �	@�	@�	@�	@�	@��	@�	@�	@�	@��	@�	@�	@��
 �	@�
 ��
 �	@������
��
����
����
@������ 
 4
 4
 4	
 

 4
�
 4
 D
 D
 D		@
@
@ !"#$%
 �&'()*+,-.
 a/
0123456789:;<�=>?@A
 �B
CDEF
 �	G
 �HIJK
 ~L
 �M
 �N
OPQRSTUVWXYZ
 �[
 �\]	 D^_
O`a
 �b
cd
ce
@fghi
O	jklmnopqrstuvwxyz{|}~	@����������
 �����
@����	@�
���	��
��	��
��	��
���
 ��
�	�
 �����
 ��
������	@�
��
��	��	������	@���
@�
@�  ���  �����
 ��
 a�
 ��
 ��
 ��
 a�
 ��
 ��
 �
 �
@�����������������
@�
@�
@��������������������������	 4���	 4�����
@�
@�	@��
��
O� 
 �
0	@	 prefix Ljava/lang/String; package_name symbol_const_class_name parser_class_name class_type_argument action_code parser_code 	init_code 	scan_code start_production Ljava_cup/production; import_list Ljava/util/Stack; num_conflicts I nowarn Z not_reduced unused_term unused_non_term symbols_time J parser_time action_code_time production_table_time action_table_time goto_table_time 
_lr_values 
_locations _xmlactions _genericlabels 
UPPERLIMIT ConstantValue  , <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/emit; 	lr_values ()Z 	locations set_lr_values (Z)V b set_locations set_genericlabels set_xmlactions clear pre &(Ljava/lang/String;)Ljava/lang/String; str typeArgument ()Ljava/lang/String; emit_package (Ljava/io/PrintWriter;)V out Ljava/io/PrintWriter; symbols (Ljava/io/PrintWriter;ZZ)V term Ljava_cup/terminal; e Ljava/util/Enumeration; i nt Ljava_cup/non_terminal; emit_non_terms sym_interface class_or_interface 
start_time emit_action_code -(Ljava/io/PrintWriter;Ljava_cup/production;)V 
lastResult s Ljava_cup/symbol; index 
leftstring loffset rightstring result proditeration prod instancecounter 
start_prod 
Exceptions emit_production_table p 	all_prods [Ljava_cup/production; 
prod_table [[S do_action_table 6(Ljava/io/PrintWriter;Ljava_cup/parse_action_table;Z)V red act Ljava_cup/parse_action; j 
temp_table [S nentries row Ljava_cup/parse_action_row; act_tab Ljava_cup/parse_action_table; compact_reduces action_table do_reduce_table 5(Ljava/io/PrintWriter;Ljava_cup/parse_reduce_table;)V goto_st Ljava_cup/lalr_state; red_tab Ljava_cup/parse_reduce_table; reduce_goto_table do_table_as_string (Ljava/io/PrintWriter;[[S)V sa nchar nbytes 
do_newline (Ljava/io/PrintWriter;II)I 
do_escaped (Ljava/io/PrintWriter;C)I c C escape Ljava/lang/StringBuffer; parser j(Ljava/io/PrintWriter;Ljava_cup/parse_action_table;Ljava_cup/parse_reduce_table;ILjava_cup/production;ZZ)V reduce_table start_st suppress_scanner emit_xmlaction_code label sym Ljava_cup/symbol_part; rhsi nested variant lhsname <clinit> 
SourceFile 	emit.javade]R^R`R_RGB java/util/StackMNIBSPOPCBEBHBJBKLDBUPTP java/lang/StringBuilderAB
 $yFB   < > package  ;e 	interface class 6//---------------------------------------------------- J// The following code was generated by CUP v0.11b ${cupversion} (SVN rev )z{ /** CUP generated    containing symbol constants. */ public     {   /* terminals */l java_cup/terminal   public static final int y  = �
 =  public static final String[] terminalNames = new String[] {   " " ,   };   /* non terminals */ java_cup/non_terminal   static final int  }VW C/** Cup generated class to encapsulate user supplied action code.*/ 6@SuppressWarnings({"rawtypes", "unchecked", "unused"}) class  actionsuvxy   private final   parser;   /** Constructor */    ( 
 parser) {     this.parser = parser;   }   /** Method  3 with the actual generated action code for actions   to  . */ '  public final java_cup.runtime.Symbol  do_action_part %08d java/lang/Object java/lang/Integerd !"#     int                         act_num,     java_cup.runtime.lr_parser  parser,     java.util.Stack             stack, top)     throws java.lang.Exception     { 1      /* Symbol object for return from actions */       java_cup.runtime.Symbol  8      /* select the action based on the action number */       switch ( act_num ) 	        {$%&' 5          /*. . . . . . . . . . . . . . . . . . . .*/           case  : // (y             { null java_cup/action_production)*+,-./y )  ((java_cup.runtime.Symbol)  stack .peek() .elementAt( top - ).value                	 RESULT =012 java_cup/symbol_part3R '              // propagate RESULT from                  RESULT = ( ).value;4567y89kl ((java_cup.runtime.Symbol) ' = parser.getSymbolFactory().newSymbol( ", ,  
, RESULT);             }           /* ACCEPT */ 
           .done_parsing();           return            /* . . . . . .*/           default:              throw new Exception( (               "Invalid action number "+ +"found in  internal parse table"); 	        }     } /* end of method */ G  /** Method splitting the generated action code into several parts. */ 	do_action               return                                  top);     }YW @      /* select the action handler based on the action number */ /           /*. . . . . . . .   < #action <  . . . . . . . . . . . .*/ :  2          /* . . . no valid action number: . . .*/ W            throw new Exception("Invalid action number found in internal parse table"); "        }      /* end of switch */ java_cup/production   /** Production table. */ 7  protected static final short _production_table[][] =      unpackFromStrings(�� ); $  /** Access to production table. */ A  public short[][] production_table() {return _production_table;}ZW:;<=>?e@PABCDE java_cup/shift_actionFGH java_cup/reduce_actionIJ java_cup/internal_error Unrecognized action code   found in parse tabledKL   /** Parse-action table. */ 3  protected static final short[][] _action_table =  &  /** Access to parse-action table. */ 9  public short[][] action_table() {return _action_table;}[WMN<OPQ (  /** <code>reduce_goto</code> table. */ 3  protected static final short[][] _reduce_table =  2  /** Access to <code>reduce_goto</code> table. */ 9  public short[][] reduce_table() {return _reduce_table;}\W new String[] {     "���� " } ",  " + java/lang/StringBufferRS
TUVWXS import YZ
[ml 6import java_cup.runtime.ComplexSymbolFactory.Location; #import java_cup.runtime.XMLElement; 9/** CUP v0.11b ${cupversion} (SVN rev ) generated parser.   */ @SuppressWarnings({"rawtypes"}) public class  % extends java_cup.runtime.lr_parser { * public final Class getSymbolContainer() {     return  .class;   /** Default constructor. */ 	  public  () {super();} 4  /** Constructor which sets the default scanner. */ ((java_cup.runtime.Scanner s) {super(s);} N(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}�{���� 0  /** Instance of action encapsulation class. */   protected   action_obj; 1  /** Action encapsulation object initializer. */   protected void init_actions()       action_obj = new  (this); -  /** Invoke a user supplied parse action. */ +  public java_cup.runtime.Symbol do_action( '    int                        act_num, &    java_cup.runtime.lr_parser parser, %    java.util.Stack            stack, #    int                        top)   { &    /* call code in generated class */     return action_obj. 
do_action( act_num, parser, stack, top);   /** Indicates start state. */ #  public int start_state() {return  ;} $  /** Indicates start production. */ (  public int start_production() {return  '  /** <code>EOF</code> Symbol index. */   public int EOF_sym() {return \� )  /** <code>error</code> Symbol index. */ !  public int error_sym() {return ]� "  /** User initialization code. */ 4  public void user_init() throws java.lang.Exception %  /** Scan to get the next Symbol. */ '  public java_cup.runtime.Symbol scan()����XW "                XMLElement RESULT;^�y_l ,(XMLElement) ,new XMLElement.Terminal( xleft," xright)8`ab 5                RESULT = new XMLElement.NonTerminal(" CUP$QR java_cup/emit append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString java/io/PrintWriter println (Ljava/lang/String;)V java/lang/System currentTimeMillis ()J all ()Ljava/util/Enumeration; java/util/Enumeration hasMoreElements nextElement ()Ljava/lang/Object; name ()I (I)Ljava/lang/StringBuilder; number print find (I)Ljava_cup/terminal; (I)V java/lang/String format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; (I)Ljava_cup/production; java/lang/Math min (II)I to_simple_string getIndexOfIntermediateResult lhs ()Ljava_cup/symbol_part; 
the_symbol ()Ljava_cup/symbol; java_cup/symbol 
stack_type 
rhs_length rhs (I)Ljava_cup/production_part; is_embedded_action action ()Ljava_cup/action_part; java_cup/action_part code_string equals (Ljava/lang/Object;)Z java_cup/parse_action_table 
num_states under_state [Ljava_cup/parse_action_row; java_cup/parse_action_row compute_default default_reduce size 
under_term [Ljava_cup/parse_action; java_cup/parse_action kind shift_to ()Ljava_cup/lalr_state; java_cup/lalr_state reduce_with ()Ljava_cup/production; 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V java_cup/parse_reduce_table java_cup/parse_reduce_row [Ljava_cup/parse_reduce_row; under_non_term [Ljava_cup/lalr_state; toOctalString (I)Ljava/lang/String; ,(Ljava/lang/String;)Ljava/lang/StringBuffer; length insert (IC)Ljava/lang/StringBuffer; toHexString 	elementAt (I)Ljava/lang/Object; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; EOF error java_cup/production_part is_non_term (Ljava_cup/symbol_part;)Z replace (CC)Ljava/lang/String; !@ `    	AB   	CB   	DB   	EB   	FB   	GB   	HB   	IB   	JB   	KL   	MN   	OP   	QR   	SP   	TP   	UP   	VW   	XW   	YW   	ZW   	[W   	\W   ]R   ^R   _R   `R   aP b   c  de f   /     *� �   g       hh       ij   	kl f         � �   g       � 	ml f         � �   g       � no f   /     � �   g       �h       pR   qo f   /     � �   g       �h       pR   ro f   /     � �   g       �h       pR   so f   L     � � �� � �   g       �  � 	 �  �  �h       pR   	te f   �      M� � � � � � Y� � 	� 
� � � � � � � � � � �   g   J    �  �  �  �  �  �  � " � & � * � . � 3 � 7 � ; � ? � D � H � L � uv f   J      � Y� � � � � � *� � �   g       h        wB   xy f   >      &� � � � Y� � � �  � � �   g      	 z{ f   [     )� � %*� Y� !� � � "� � � #*� $�   g        (h       )|}   	~ f  �  	  y� %� &:� '7*� $*(� #*)� #*(� #*� $*� **� Y� +� � ,� � � #*� Y� -� � .� � � /� � � #*0� #� 1:� 2 � <� 3 � 4N*� Y� 5� -� 6� 7� -� 8� 9"� � � #���*:� #6� ;� 5*<� =*� >� 6� =*?� =� ;d� 	*@� =*� $����*A� #� X*� $*B� #� C:� 2 � ?� 3 � D:*� Y� E� � F� 7� � G� 9"� � � #���*H� #*� $� 'e� I�   g   � "  & ( + , - ". (/ ,0 03 M5 u8 {; �= �@ �E �F �G �H �I �J �K �M FORTUX)Z5aegkhojxkh   f 
 � .��  � C��  � :�P 5 0��  F��   y|}    y�R   y�R  l�B  g�W  �� f  r 	   ָ 'B*� $*J� #*K� #*� Y� L� M� N� � O� /� � � #� � *� $*� � #*� Y� P� � � � O� Q� � � #*� $*R� #*� Y� S� M� N� T� � � � O� U� � � #*V� #*W� #*� $6� X,l�6*� Y� Y� � 9Z� ,h� 9[� `,h� 9\� � � #*� Y� ]� ^� N� _� `Y� aY� bS� c� T� � � #*� Y� d� e� N� � � #*� Y� f� g� N� � � #*� Y� h� i� N� � � #*� Y� d� j� N� � � #*k� #*l� #*m� #*� Y� n� o� N� "� � � #*� $*p� #*� Y� q� r� N� s� � � #*t� #,h6� uM`,h� X� v��*w� #*� Y� x� ,� y� 9z� ,� {� � � #*|� #}:,� ~� },� ~� 6� n� Y� T� ,� �� �� �� �� �� �� N� � �� +� Y� �� �� N� �� d� 9s� � � �� � :*� Y� �� ,� �� �� �� �� � "� � � #,� �d6� �,� �� �� � �,� �� �� �:		� D� � �	� D� �� � �,� �dd6
*� Y� �� 	� �� � � #*� Y� �� ,� �� �� �� �� �� �� N� 
� �� )� Y� �� �� N� �� 
� 9s� � � �� � � #� 	����/,� �� $,� �� �� ,� �� �� *,� �� �� #� �� �� Y� �� �� N� �� s� � :
,� �� 

:	� \,� �d6� Y� �� �� N� � �� )� Y� �� �� N� �� � 9s� � � s� � :	*� Y� �� o� N� �� ?� ,� �� �� �� �� ,� �� �� �� 9�� 	� �� 
� �� � � #� L*� Y� �� o� N� �� ?� ,� �� �� �� �� ,� �� �� �� 9�� � � #*�� #,+� )*�� #*� Y� �� � N� �� � � #*� Y� �� o� N� "� � � #*� $�� uM��l*�� #*�� #*�� #*� Y� �� r� N� �� �� � � #*� $*�� #*�� #����*� $*�� #*� Y� ]� �� N� T� � � #*� Y� d� e� N� � � #*� Y� f� g� N� � � #*� Y� h� i� N� � � #*� Y� d� j� N� � � #*k� #*l� #� X,� �*� Y� �� ^� N� _� `Y� aY� bS� c� T� � � #*� Y� �� e� N� � � #*� Y� �� g� N� � � #*� Y� �� i� N� � � #*� Y� �� �� N� � � #*�� #*H� #*� $� '!e� ��*�� #*� Y� q� r� N� �� ,� 9s� � � #*t� #6� X,l� �*� Y� �� ,h� 9�� `,h� 9�� � � #*� Y� x� � 9�� � � #*� Y� �� ^� N� _� `Y� aY� bS� c� T� � � #*� Y� �� e� N� � � #*� Y� �� g� N� � � #*� Y� �� i� N� � � #*� Y� �� �� N� � � #����*�� #*�� #*�� #*� $*�� #*�� #*H� #*� $� '!e� ��   g  � x  y | } � � :� @� D� K� o� s� y� �� �� �� �� ���<�W�r������������������
���+�1�W�]�a�h�q�w�����-�;�F�T�_�z�������
���>ELT	�NTY _!%�&���*�+�,�-�/�0�1���5 67&9A:\;w<�=�>�@�A�B�CD/EJFPIVJZLbMcQiR�S�V�X�Y�Z/[J\e]�^�V�a�b�c�d�e�h�k�l�n�oh   � q q�P ; ��� 	_ ��P 
 ��P I �B 	T Q�P � ]�B 	> ��B 
aB�B ��P ��L  �?�P ��P   �|}    ��L  ��W �     � �{ f  l     �� 'B� X� �L� �:� 2 � � 3 � �M+,� y,S��� X� �:6� X� ,+2M2,� �� �� ��V2,� ��V����*� $*�� #*�� #*�� =*� �*ö #*� $*Ķ #*Ŷ #� '!e� Ʊ   g   Z   { ~  � %� /� 9� D� I� [� g� m� q� w� }� �� �� �� �� �� �� ��h   R  % 
�L   ��  I $�L  < 1�P    �|}    ���   ��W  9 o��  �� f  �    �� '7+� ǽ �:6		+� Ǣ6+� �	2N� 
-� ʧ -� �� �h�	:
66� ̢ �-� �2:� Ι �� �� '
��V
�� ϶ ж �`�V� n� �� 5� Ҷ Ӷ y6-� ˟ O
��V
�`t�V� 3� �� � '� �Y� Y� ն � ζ 9ֶ � � ׿���L	`�	S
	2� �	2�V-� �� 	2�-� �`t�V� 	2�V�	���*� $*ٶ #*ڶ #*�� =*� �*ö #*� $*۶ #*ܶ #� 'e� ݱ   g   � )  � � � � "� &� -� 2� ;� >� I� R� Z� c� n� �� �� �� �� �� �� �� �� �����%�;�G�M�Q�W�]�c�i�osy�h   z  � %�P  R ���  A ��P  ;�� 
 >	�P  "+��  <�P 	  �|}    ���   ��R  ��W  {�� �     � �� f  �     ظ '7+� ޽ �:6+� ޢ �� �h�	:6	6

� ߢ 3+� �2� �
2M,� 	�	
�V	�	,� ѓV�
���	`�	S2	� �2	�	V2	�	V���|*� $*� #*� #*�� =*� �*ö #*� $*� #*� #*� $� 'e� �   g   r       # &! 1$ ?' C* N+ [! a/ l0 z3 �4 � �8 �9 �: �; �< �= �@ �A �B �C �E �Fh   \ 	 ? "��  ) 8�P 
 # o��  & l�P 	  ��P    �|}     ���   ��W   ���  �� f  L     �*� #*� ==>*+�z�� �`>*� �=*+��~�� �`>*� �=6+�� b*+2�z�� �`>*� �=*+2��~�� �`>*� �=6+2�� !*+25`�� �`>*� �=���ۄ���*� =�   g   N   J K L M N $O 1P 8Q BR RS YT iU pV }Y �Z �V �Q �] �^h   >  s (�P  ; f�P    �|}     ���   ��P   ��P  �� f   z     0�� *� #*� =� � *� #*� =� `��   g      a b *c .dh        0|}     0�P    0�P  �� f   �     �� �Y� �M �� ,� � �W,� �� 2,0� �W���,� �� �W,� �� ,0� �W���,u� �W,\� �W*,� �� =� �� � � �� �� ��   g   6   h i j k +m 4n Go Oq Wr _u ev rw �xh        �|}     ���   |��  	�� f  t  
  �� '7*� $*(� #*)� #*(� #*� $*� *6		� 	� �� ,*� Y� �� � 		� �� �"� � � #�	��ϸ �� 	*�� #*�� #*� $*�� #* � #*� #*� Y� � � � � O� � � � #*� $*� #*� Y� � � � � � � #*H� #*� $*� #*� Y� � � � 	� � � #� Y*� $*
� #*� Y� � � � � � � #*� $*
� #*� Y� � � � � � � #*�*+�*,�*� #*� Y� � M� N� � � � #*� $*� #*� #*l� #*� Y� � M� N� � O� � � � #*�� #*� $*� #*� #*� #*� #*� #*� #*k� #*� #*� #*� Y� �  � N� !� � � #*W� #*� #*"� #*� Y� #� � 9$� � � #*%� #*� Y� &� � � y� 9$� � � #*� $*'� #*� Y� (� �)� 8� 9$� � � #*� $**� #*� Y� +� �,� 8� 9$� � � #*� $� 
� (*� $*-� #*.� #*l� #*� 
� #*�� #� � .*� $*/� #*0� #*k� #*l� #*� � #*�� #� � *� $*� � #� � *�1� 	*�2*H� #� 'e�3�   g  n [  � � 	� � � � � #� 1� T� Z� `� f� l� p� v� }� �� �� �� �� �� �� �� ������6�:�A�a�e�l�q�x����������������������� �����"�E�K�Q�X�v�}��������������� ��
����%�+15<CIO	V
\bfms|���h   \ 	 & 4�P 	  �|}    ���   ���   ��P   ��L   ��R   ��R  ��W �     � �� f  A 	   �� 'B*� $*J� #*K� #*� Y� L� M� N� � O� /� � � #� � *� $*� � #*� Y� P� � � � O� Q� � � #*� $*R� #*� Y� S� M� N� T� � � � O� U� � � #*V� #*W� #*� $6� X,l��*� Y� Y� � 9Z� ,h� 9[� `,h� 9\� � � #*� Y� ]� ^� N� _� `Y� aY� bS� c� T� � � #*� Y� d� e� N� � � #*� Y� f� g� N� � � #*� Y� h� i� N� � � #*� Y� d� j� N� � � #*k� #*l� #*m� #*� Y� n� o� N� "� � � #*� $*p� #*� Y� q� r� N� s� � � #*t� #,h6� uM`,h� X� v�6*w� #*� Y� x� ,� y� 9z� ,� {� � � #*|� #*4� #:6,� �� �,� �� �� � �,� ��5:	,� �� �:
	� (� � � �� Y� 
� �� �� � 9� :	
� ��6� "� Y� � 7� 	� � :� D� Y� � 8� 	� 9� 	� �� 	� @� 	� :� � :���:,� �� $,� �� �� ,� �� �� *,� �� �� #66		� 	� u� �,� ��;� ��	���,� �� �� �$_�<:	*� Y� =� 	� �� � 9� ö � � #� �� �� Y� �� �� N� �� s� � :,� �� 
:� \,� �d6
� Y� �� �� N� 
� �� )� Y� �� �� N� �� 
� 9s� � � s� � :*� Y� �� o� N� �� ?� ,� �� �� �� �� ,� �� �� �� 9�� � �� � �� � � #� L*� Y� �� o� N� �� ?� ,� �� �� �� �� ,� �� �� �� 9�� � � #*�� #,+� )*�� #*� Y� �� � N� �� � � #*� Y� �� o� N� "� � � #*� $�� uM���*�� #*�� #*�� #*� Y� �� r� N� �� �� � � #*� $*�� #*�� #���*� $*�� #*� Y� ]� �� N� T� � � #*� Y� d� e� N� � � #*� Y� f� g� N� � � #*� Y� h� i� N� � � #*� Y� d� j� N� � � #*k� #*l� #� X,� �*� Y� �� ^� N� _� `Y� aY� bS� c� T� � � #*� Y� �� e� N� � � #*� Y� �� g� N� � � #*� Y� �� i� N� � � #*� Y� �� �� N� � � #*�� #*H� #*� $� '!e� ��*�� #*� Y� q� r� N� �� ,� 9s� � � #*t� #6� X,l� �*� Y� �� ,h� 9�� `,h� 9�� � � #*� Y� x� � 9�� � � #*� Y� �� ^� N� _� `Y� aY� bS� c� T� � � #*� Y� �� e� N� � � #*� Y� �� g� N� � � #*� Y� �� i� N� � � #*� Y� �� �� N� � � #����*�� #*�� #*�� #*� $*�� #*�� #*H� #*� $� '!e� ��   g  � {  ) , - 0 1 :3 @5 D6 K: o= s> y? �@ �A �C �D �EF<HWIrJ�K�L�M�N�O�P�Q�RS
VWX+[1\W`]cdghhti�j�k�l�m�n�p�q�s.h4vQx\{_|i}~|��������������T����������.�N�RX^�d�j�p��������D�����������&�A�G�M�V��������������	����C�I�X����������/�J�P�V�\�b�f�l�r�x�|���h   � � ��B 	� ��� 
k ��P b "�P 	� �B  Q�P 
T ]�B � ��B h��B _��P ���B 	��P ��L  ���P L�P   �|}    ��L  ��W �     � �e f   �      c>� � � � � � � � 
� � � Y� � 	� �?� � � 	� I	�3	� �	� �	� �	� �   g   Z    o  t 
 y  ~  �  �  �   � $ � ( � , � 6 � : � > � B � F � J � N � R � V � Z � ^ � �   �                                                                                                                                                                                                                                                                                                                                                                                                                                                                               deps/java_cup/ErrorManager.class                                                                    0000666 0002035 0002035 00000005602 14202043766 016223  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �	 ! K	 ! L	 ! M	 ! N
 # O	 P Q R
  O S
  T
  U
 V W X Y
  Z [ \ ]	 ^ _ ` a
 # U b c
 d e
 f g
 h i
 f j	 ^ k
 f l m
 ^ n o
 ! O p errorManager Ljava_cup/ErrorManager; errors I warnings fatals getFatalCount ()I Code LineNumberTable LocalVariableTable this getErrorCount getWarningCount 
getManager ()Ljava_cup/ErrorManager; <init> ()V 
emit_fatal (Ljava/lang/String;)V message Ljava/lang/String; .(Ljava/lang/String;Ljava_cup/runtime/Symbol;)V sym Ljava_cup/runtime/Symbol; emit_warning 
emit_error 
convSymbol -(Ljava_cup/runtime/Symbol;)Ljava/lang/String; ex Ljava/lang/Exception; i symbol result fields [Ljava/lang/reflect/Field; <clinit> 
SourceFile ErrorManager.java ) ' & ' ( ' $ % 4 5 q r s java/lang/StringBuilder Fatal :  t u v w x y 7 Fatal:   @  t z 
Warning :  Error :  Error:  { | }    (" ") java_cup/sym ~  � � � + � � � � � ; ' � w java/lang/Exception v w java_cup/ErrorManager java/lang/Object java/lang/System err Ljava/io/PrintStream; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; java/io/PrintStream println -(Ljava/lang/Object;)Ljava/lang/StringBuilder; java_cup/runtime/Symbol value Ljava/lang/Object; java/lang/Class 	getFields ()[Ljava/lang/reflect/Field; java/lang/reflect/Field getModifiers java/lang/reflect/Modifier isPublic (I)Z getInt (Ljava/lang/Object;)I getName ! ! #    
 $ %    & '    ( '    ) '     * +  ,   /     *� �    -        .        / %    0 +  ,   /     *� �    -        .        / %    1 +  ,   /     *� �    -        .        / %   	 2 3  ,         � �    -         4 5  ,   N     *� *� *� *� �    -          	 	  
   .        / %    6 7  ,   `     $� � Y� 	� 
+� 
� � *Y� `� �    -          #  .       $ / %     $ 8 9   6 :  ,   s     -� � Y� � 
+� 
� 
,� � � *Y� `� �    -       ! " " , # .        - / %     - 8 9    - ; <   = 7  ,   `     $� � Y� � 
+� 
� � *Y� `� �    -       %  & # ' .       $ / %     $ 8 9   = :  ,   s     -� � Y� � 
+� 
� 
,� � � *Y� `� �    -       * " + , , .        - / %     - 8 9    - ; <   > 7  ,   `     $� � Y� � 
+� 
� � *Y� `� �    -       .  / # 0 .       $ / %     $ 8 9   > :  ,   s     -� � Y� � 
+� 
� 
,� � � *Y� `� �    -       3 " 4 , 5 .        - / %     - 8 9    - ; <  
 ? @  ,  
     �*� � � !� Y� � 
*� � � 
� 
� L � M>,�� C,2� � � � .,2� *� � � Y� ,2� � 
+� 
� �� :����� Y� *�  � 
+� 
� �  I n r   -   & 	   7 + 8 2 9 : : I < o > r = t 9 z @ .   4  t   A B  4 F C '    � D <   + e E 9  2 ^ F G   H 5  ,   '      � !Y� "� �    -   
     
   I    J                                                                                                                              deps/java_cup/internal_error.class                                                                  0000666 0002035 0002035 00000001526 14202043766 016665  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 7
  
   
    
  !
  "
  #
  $
  %
 & ' ( ) <init> (Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Ljava_cup/internal_error; msg Ljava/lang/String; crash ()V 
SourceFile internal_error.java   * + , java/lang/StringBuilder   !JavaCUP Internal Error Detected:  - . / 0 1 0 2  3  4 5 6 java_cup/internal_error java/lang/Exception java_cup/ErrorManager 
getManager ()Ljava_cup/ErrorManager; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; 
getMessage ()Ljava/lang/String; toString 
emit_fatal printStackTrace java/lang/System exit (I)V !               >     *+� �       
    
                            [     %� � Y� � *� � � � 	*� 
� �                 $         %                                                                                                                                                                                    deps/java_cup/lalr_item.class                                                                       0000666 0002035 0002035 00000010630 14202043766 015604  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 ; v	  w x
  y	  z	  {
  | }
  y
  ~
  
  �
  �
  �
  �
  � �
  �
  � � �
  �
  �
  �
  �
  � �
 � �
 � �
 � � �
  �
 � � �
  � �
 $ �
 $ �
 ; �
  �
 ; � � �
 + y
 + � �
 + �
 ; � � �
 " �
  �
 " �
 " � � � � � � 
_lookahead Ljava_cup/terminal_set; _propagate_items Ljava/util/Stack; needs_propagation Z <init> 0(Ljava_cup/production;ILjava_cup/terminal_set;)V Code LineNumberTable LocalVariableTable this Ljava_cup/lalr_item; prod Ljava_cup/production; pos I look 
Exceptions /(Ljava_cup/production;Ljava_cup/terminal_set;)V (Ljava_cup/production;)V 	lookahead ()Ljava_cup/terminal_set; propagate_items ()Ljava/util/Stack; add_propagate (Ljava_cup/lalr_item;)V prop_to propagate_lookaheads (Ljava_cup/terminal_set;)V i incoming change shift ()Ljava_cup/lalr_item; result calc_lookahead 0(Ljava_cup/terminal_set;)Ljava_cup/terminal_set; sym Ljava_cup/symbol; part Ljava_cup/production_part; lookahead_after lookahead_visible ()Z equals (Ljava_cup/lalr_item;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode ()I toString ()Ljava/lang/String; t Ljava/lang/String; 
SourceFile lalr_item.java B � < = java/util/Stack B � > ? @ A B C java_cup/terminal_set � � � h Q R � � S T � o � � java_cup/lalr_item X Y � h java_cup/internal_error )Attempt to shift past end of an lalr_item B � � � � o B Y U V :Attempt to calculate a lookahead set with a completed item � � o � � � � h java_cup/symbol_part � � � � h java_cup/terminal � � java_cup/non_terminal � R � h i � i j n o   java/lang/StringBuilder � � [ p q p q ,  { � o � � � � � q   } NULL LOOKAHEAD!! ] java_cup/lr_item_core (Ljava_cup/production;I)V ()V push &(Ljava/lang/Object;)Ljava/lang/Object; empty add (Ljava_cup/terminal_set;)Z size 	elementAt (I)Ljava/lang/Object; 
dot_at_end (Ljava/lang/String;)V the_production ()Ljava_cup/production; dot_pos java_cup/production 
rhs_length rhs (I)Ljava_cup/production_part; java_cup/production_part 	is_action 
the_symbol ()Ljava_cup/symbol; java_cup/symbol is_non_term (Ljava_cup/terminal;)Z 	first_set nullable (Ljava_cup/lr_item_core;)Z append -(Ljava/lang/String;)Ljava/lang/StringBuilder; number contains (I)Z find (I)Ljava_cup/terminal; name !  ;     < =    > ?    @ A     B C  D   t     *+� *-� *� Y� � *� �    E       .  /  0  1  2 F   *     G H      I J     K L     M =  N       B O  D   J     *+,� �    E   
    <  = F         G H      I J     M =  N       B P  D   F     *+� Y� 	� �    E   
    F  G F        G H      I J  N       Q R  D   /     *� �    E       Q F        G H    S T  D   /     *� �    E       Y F        G H    U V  D   K     *� +� 
W*� �    E       g 	 h  i F        G H      W H   X Y  D   �     X=*� � +� 
+� � �+� *� +� =� 
*� � -*� >*� � � *� � � *� � ����    E   .    u  x  y  |   " � - � 2 � ? � Q � W � F   *  4 # Z L    X G H     X [ =   V \ A  N       ] ^  D   y     5*� � � Y� �� Y*� *� `� Y*� � � L*+� +�    E       �  �  � . � 3 � F       5 G H   .  _ H  N       ` a  D       �*� � � Y� �� Y� 	M*� `>*� � � S*� � :� � ;� �  :� !� ,� "� #W,�,� $� %� W� $� &� ,�����,+� W,�    E   B    �  �  �  � + � 5 � = � G � O � Y � [ � h � s � u � { � � � F   >  G . b c  5 F d e    � G H     � f =   j _ =    c K L  N       g h  D   �     P*� � �*� `>*� � � 6*� � L+� �  +� �  M,� !� �,� $� &� ������    E   & 	   � 	 �  � $ � + � 3 � < � H � N F   *  3  b c  $ * d e   > K L    P G H   N       i j  D   D     +� �*+� '�    E   
     F        G H      k H   i l  D   N     +� � �*+� � (�    E        	 F        G H      k m   n o  D   /     *� )�    E      % F        G H    p q  D  G     �*L� +Y� ,+� -.� -� /L� +Y� ,+� -*� 0� -� /L� +Y� ,+� -1� -� /L*� � f� +Y� ,+� -2� -� /L=� 3� 2*� � 4� !� +Y� ,+� -� 5� 6� -7� -� /L���ͻ +Y� ,+� -8� -� /L� � +Y� ,+� -9� -� /L� +Y� ,+� -:� -� /L+�    E   :   - 1 2 -3 A4 H6 \7 e8 p9 �7 �: �= �> �G F      ^ 6 r L    � G H    � _ s   t    u                                                                                                        deps/java_cup/lalr_item_set.class                                                                   0000666 0002035 0002035 00000011606 14202043766 016463  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 ; | }
  ~	  	  �
  �
  �
  �
  �
  �
  � �
  � � � � �
  �
  �
  �
 $ �
  �
  �
  �
  � � �
  � �
  �
  �
  �
  �
  �
  �
 � � � �
 $ �
  �
  �
  �
  �
  � �
 + ~
 + � �
 . | �
 . � �
 2 | �
 2 �
 2 � �
 2 � �
 . � � _all Ljava/util/Hashtable; hashcode_cache Ljava/lang/Integer; <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/lalr_item_set; (Ljava_cup/lalr_item_set;)V other 
Exceptions all ()Ljava/util/Enumeration; size ()I contains (Ljava_cup/lalr_item;)Z itm Ljava_cup/lalr_item; find *(Ljava_cup/lalr_item;)Ljava_cup/lalr_item; is_subset_of (Ljava_cup/lalr_item_set;)Z e Ljava/util/Enumeration; is_superset_of add remove (Ljava_cup/lalr_item;)V get_one ()Ljava_cup/lalr_item; result the_set not_null (Ljava/lang/Object;)V obj Ljava/lang/Object; compute_closure new_itm add_itm nt Ljava_cup/non_terminal; new_lookaheads Ljava_cup/terminal_set; p prod Ljava_cup/production; 	need_prop Z consider equals Ljava_cup/internal_error; (Ljava/lang/Object;)Z hashCode cnt I toString ()Ljava/lang/String; Ljava/lang/StringBuffer; 
SourceFile lalr_item_set.java @ A java/util/Hashtable @ � < = > ? ` a � � � K L M � s � � java_cup/lalr_item J K � � � � � N O T U � � Y � � � Z � Y S Z [ java_cup/internal_error !Null object used in set operation @ � java_cup/lalr_item_set @ G \ ] � � � � � � � � K java_cup/production java_cup/terminal_set @ � @ � � [ � A q U t M java/lang/Integer � M java/lang/StringBuffer {
 � � java/lang/StringBuilder    � � � � 
 w x } java/lang/Object (I)V clone ()Ljava/lang/Object; elements containsKey get &(Ljava/lang/Object;)Ljava/lang/Object; java/util/Enumeration hasMoreElements ()Z nextElement 	lookahead ()Ljava_cup/terminal_set; (Ljava_cup/terminal_set;)Z put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; (Ljava/lang/String;)V dot_before_nt ()Ljava_cup/non_terminal; calc_lookahead 0(Ljava_cup/terminal_set;)Ljava_cup/terminal_set; lookahead_visible java_cup/non_terminal productions (Ljava_cup/terminal_set;)V /(Ljava_cup/production;Ljava_cup/terminal_set;)V add_propagate crash intValue append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; !  ;     < =    > ?     @ A  B   M     *� *� Y� � *� �    C         1  9   D        E F    @ G  B   r     **� *� Y� � *� *+� *+� � � � �    C       %  1  9  &  ' ) ( D       * E F     * H F  I       J K  B   2     *� � �    C       4 D        E F    L M  B   2     *� � 	�    C       > D        E F    N O  B   =     	*� +� 
�    C       G D       	 E F     	 P Q   R S  B   @     *� +� � �    C       O D        E F      P Q   T U  B   u     '*+� *� M,�  � +,�  � � �����    C       X  [  \ # ] % ` D      
  V W    ' E F     ' H F  I       X U  B   C     *+� +*� �    C   
    j  k D        E F      H F  I       Y S  B   �     4*+� *� +� � M,� ,� +� � W,�*� *� ++� W+�    C   "    y  |    � ! � # � ( � 2 � D        4 E F     4 P Q   # H Q  I       Z [  B   T     *+� *� *� +� W�    C       �  � 
 �  � D        E F      P Q  I       Y G  B   o     %*+� +� M,�  � *,�  � � W���    C       �  �  � $ � D      
  V W    % E F     % H F  I       Z G  B   n     $*+� +� M,�  � *,�  � � ���    C       �  �  � # � D      
  V W    $ E F     $ H F  I       \ ]  B   s     !*� L+�  � +�  � M*,� ,��    C       �  �  �  �  �  � D        ^ Q    ! E F     _ W  I       ` a  B   K     +� � Y� ��    C       �  �  � D        E F      b c  I       d A  B  K  
   �*� � Y*� L+� � t+� M,� :���,,� �  :,� !6	� ":�  ����  � #:� Y� $Y� %� &N*-� :	� 	,� '-���+-� W����    C   F    �  �     	 % / 5 F R e l q w! }$ �) D   f 
  l P Q  e ! e Q  l  f Q    f g h  / W i j  < J k W  R 4 l m  5 Q n o 	   � E F    y p F  I       q U  B   t     +� +� *� � �*+� �M,� (�       C      0 4 5 7 8 D        V r     E F      H F   q s  B   N     +� � �*+� � )�    C      B C 	E D        E F      H c   t M  B   �     B<*� � 4*� M>,�  � ,�  � � *�<����*� +Y� ,� *� � -�    C      M R 	X Y (X .[ :^ D   *   , V W   * u v    B E F    @ ^ v   w x  B   �     Q� .Y� /L+0� 1W*� M,�  � ++� 2Y� 34� 5,�  � � 67� 5� 8� 1W���+9� 1W+� :�    C      f h i k Em Lo D       1 V W    Q E F    I ^ y   z    {                                                                                                                          deps/java_cup/lalr_state.class                                                                      0000666 0002035 0002035 00000027320 14202043766 015772  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1
 �	  !"
 #
 $%	 &	 '	 (	 )
 �*
 �+
 �,	 -
 �.
 �/0	123
456
 7
 8
 9
 :;
 <
 =
 <>?@?ABC
4D
 "E
FG
 0H
 NIJ
FK
 "LM
FN
OPQRS
 "TUV
 >
 WX
 7YZ
 9[\
 <
 "]
 "^	_`
 Ya
 <b
 <c
 <d
 c
 9e
 9f
 9gh
 I
 "i
 Ij
 I>k
 �l
 "m
 "n
 9.
 9o
 <p
 9q
 r
 s
 "tu
 Y	vw	xyz
 ]]
_{
 Y|	}~
�
_�
F9
 ]�
 �
 �
 7�
 N��
 7�
 j�
 N9	��
 7�
 Yf
 �
F�
_�
 �
 �
_��
 w��
 �
 Y�
 �
 ����
 "����
_I���	��
��
�����
 <�
 �
 <��
 ��
 �� _all Ljava/util/Hashtable; _all_kernels 
next_index I _items Ljava_cup/lalr_item_set; _transitions Ljava_cup/lalr_transition; _index <init> (Ljava_cup/lalr_item_set;)V Code LineNumberTable LocalVariableTable this Ljava_cup/lalr_state; itms 
Exceptions all ()Ljava/util/Enumeration; clear ()V number ()I 
find_state /(Ljava_cup/lalr_item_set;)Ljava_cup/lalr_state; items ()Ljava_cup/lalr_item_set; transitions ()Ljava_cup/lalr_transition; index 
dump_state (Ljava_cup/lalr_state;)V part Ljava_cup/production_part; i itm Ljava_cup/lalr_item; e Ljava/util/Enumeration; st propagate_all_lookaheads add_transition )(Ljava_cup/symbol;Ljava_cup/lalr_state;)V on_sym Ljava_cup/symbol; to_st trans build_machine ,(Ljava_cup/production;)Ljava_cup/lalr_state; sym sym2 new_itm existing l fix_itm fix 	new_items linked_items new_st outgoing Ljava_cup/symbol_set; s 
start_prod Ljava_cup/production; start_state start_items kernel 
work_stack Ljava/util/Stack; propagate_lookaheads build_table_entries =(Ljava_cup/parse_action_table;Ljava_cup/parse_reduce_table;)V term Ljava_cup/terminal; 	other_act Ljava_cup/parse_action; t act p 	act_table Ljava_cup/parse_action_table; reduce_table Ljava_cup/parse_reduce_table; our_act_row Ljava_cup/parse_action_row; our_red_row Ljava_cup/parse_reduce_row; conflict_set Ljava_cup/terminal_set; fix_with_precedence K(Ljava_cup/production;ILjava_cup/parse_action_row;Ljava_cup/parse_action;)Z 
term_index 	table_row insert_action H(Ljava_cup/parse_action;Ljava_cup/parse_action;I)Ljava_cup/parse_action; a1 a2 act_type insert_shift G(Ljava_cup/parse_action;Ljava_cup/parse_action;)Ljava_cup/parse_action; insert_reduce report_conflicts (Ljava_cup/terminal_set;)V compare comps 	lookahead 	after_itm Z report_reduce_reduce +(Ljava_cup/lalr_item;Ljava_cup/lalr_item;)V itm1 itm2 
comma_flag message Ljava/lang/String; report_shift_reduce (Ljava_cup/lalr_item;I)V 	shift_sym red_itm conflict_sym equals (Ljava_cup/lalr_state;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode toString ()Ljava/lang/String; result tr <clinit> 
SourceFile lalr_state.java � � � � java_cup/internal_error 7Attempt to construct an LALR state from a null item set �� � � +Attempt to construct a duplicate LALR state � � � � � � � ���� � � � � �� ��� java_cup/lalr_state��� NULL lalr_state��� java/lang/StringBuilder lalr_state [�� � ��� ] { � � � ������ java_cup/lalr_item   [����������  ::= � �� � (*) ����� 	{action}  java_cup/symbol_part  �� ] } � � java_cup/lalr_transition �� java/util/Stack AAttempt to build viable prefix recognizer using a null production java_cup/lalr_item_set ����� ����� � �� ������� java_cup/symbol_set���� java_cup/symbol���������� � � � � �  java_cup/terminal_set������ java_cup/reduce_action � �������� ����� � � � ����� java_cup/shift_action�� � ��  � �  � � � � � � java_cup/nonassoc_action $Unable to resolve conflict correctly $Conflict resolution of bogus actions � � +*** Reduce/Reduce conflict found in state # 
 
  between  
  and        under symbols: { ,  }
  Resolved in favor of  the first production.
 the second production.
	 �
� **** Shift/Reduce conflict found in state #   under symbol  !  Resolved in favor of shifting.
 � ]: � java/util/Hashtable java/lang/Object (Ljava/lang/String;)V put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; elements size get &(Ljava/lang/Object;)Ljava/lang/Object; java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; java/util/Enumeration hasMoreElements ()Z nextElement ()Ljava/lang/Object; print the_production ()Ljava_cup/production; java_cup/production lhs ()Ljava_cup/symbol_part; 
the_symbol ()Ljava_cup/symbol; name 
rhs_length dot_pos rhs (I)Ljava_cup/production_part; java_cup/production_part 	is_action 
dot_at_end C(Ljava_cup/symbol;Ljava_cup/lalr_state;Ljava_cup/lalr_transition;)V (Ljava_cup/production;)V ()Ljava_cup/terminal_set; java_cup/terminal EOF add (Ljava_cup/terminal;)Z *(Ljava_cup/lalr_item;)Ljava_cup/lalr_item; compute_closure push empty pop symbol_after_dot (Ljava_cup/symbol;)Z shift ()Ljava_cup/lalr_item; propagate_items ()Ljava/util/Stack; 	elementAt (I)Ljava/lang/Object; find setElementAt (Ljava/lang/Object;I)V java_cup/parse_action_table under_state [Ljava_cup/parse_action_row; java_cup/parse_reduce_table [Ljava_cup/parse_reduce_row; contains (I)Z java_cup/parse_action_row 
under_term [Ljava_cup/parse_action; java_cup/parse_action kind (I)Ljava_cup/terminal; reduce_with 	on_symbol is_non_term to_state ()Ljava_cup/lalr_state; java_cup/parse_reduce_row under_non_term [Ljava_cup/lalr_state; next precedence_num precedence_side 
intersects (Ljava_cup/terminal_set;)Z to_simple_string java_cup/emit num_conflicts java_cup/ErrorManager 
getManager ()Ljava_cup/ErrorManager; emit_warning (Ljava_cup/lalr_item_set;)Z -(Ljava/lang/Object;)Ljava/lang/StringBuilder; !  �     � �    � �    � �    � �    � �    � �     � �  �   �     G*� *� +� � Y� �+� � � Y� �*� Y`� � 	*+� 
� *� 
*� W�    �   * 
   =  � 	 ?  @  C  D ( H 5 K : N F O �       G � �     G � �  �      	 � �  �         � � �    �       Y 	 � �  �   5      � � � � � �    �       ]  ^  _  ` 	 � �  �         � � �    �       e 	 � �  �   C     *� �� *� � �    �       z  {  } �        � �    � �  �   /     *� 
�    �       � �        � �    � �  �   /     *� �    �       � �        � �    � �  �   /     *� 	�    �       � �        � �    � �  �  �     �*� � � �� � Y� � *� � � � � *� L+� :�   � �� ! � "M� #� $� ,� %� &� '� (� $� )� $6,� %� *� X,� +� � ,� $,� %� -N-� .� � /� $� %� � Y� -� 0� '� (� 1� � � $����,� 2� � ,� $� 3� ��M� 4� �    �   V    �  �  �  � . � 3 � C � N � V � i � q � � � � � � � � � � � � � � � � � � � � � �   >  � : � �  t a � �  N � � �  9 � � �    � � �   3 � � �  �       � �  �   O     � 5K*�   � *� ! � � 6���    �       �  �  � �       � �   �       � �  �   d     � 7Y+,*� � 8N*-� �    �       �  �  � �   *     � �      � �     � �    � �  �      	 � �  �  �    ݻ 9Y� ::*� � Y;� �� <Y� =M� "Y*� >:

� ?� @� AW,
� BW� <Y,� C:,� D� Y,� EL+� FW� +� W� G�o� H� :� IY� J:	� � :�   � &� ! � ":

� K:���	� LW���	� M:�   ���� ! � N:� <Y� =:� <Y� =N� � :�   � 5� ! � ":

� K:� O���-
� P� BW
� BW��ǻ <Y-� C:� � � :� '-� D� Y-� E:� FW� � W� e� :�   � T� ! � ":6� Q� R� 5� Q� S� ":� � T:� � Q� U���ħ��� V��� W+�    �   � /   	& ' + - ). 50 <3 F6 J9 S: Z= d@ lC vF G �I �L �M �Q �S �V �Z �[ �]`adg*l4oArFuJxT{\~j�{������������������� �   �  �  � �   � � � # � � �  � � � ? � � � E � � q [ � �  � � � �  � � � �  vb � � A � � �  Y � � 	 � � �  �O � �  � � �   � � �   S� � �  � � �  F� � �  	� � �  )� � � 
 �       � �  �   ^     "*� � L+�   � +� ! � "� X���    �      � � !� �       � �    " � �   �       � �  �  �    �� YY� Z:	+� [*� 2N,� \*� 2:*� � :

�   � �
� ! � ":� 2��� ]Y� %� ^:6� _� �� ?� `� � �-� a2� b� -� aS� h� c:-� a2:� b� .� b� %� %� d� ]� e� d� #-� aS� *� %-� f� :� 	� AW���g��5*� g:

� �
� h:� i� p� jY
� k� l:-� a� m2� b� -� a� mS� S-� a� m2� ]� e:*� m-� f� -� a� mS	� m� c� AW� � n� m
� kS
� o:
��h	� p� 	*	� q�    �   � %  � 	� � � 1� =� E� S� ^� n� {� �� �� �� �� �  � � �	 � �� � -<$N'_(k)y+|0��5�6�7 �   �  � ^ � �  � U � �  V � � �  = � � �  S � � �  ' � � � 
N + � �  _ � �  � � �  � � � � 
  � � �    � � �   � � �  � � �  � � �  	� � � 	 �       � �  �  x     �� c:+� r� �+� r� s� -� a*-� a2� tS�+� r� s� -� a*-� a2� uS�� v� -� a*-� a2� uS�� v� -� a*-� a2� tS�� v� -� a� wY� xS�� Yy� �� s� -� a*-� a2� uS��    �   Z   W Z ] ^ ,` .d :e Lg Nm Wn ip kt su �w �| �} �~ �� �� �� �� �� �   >    � � �     � � �    � � �    � � �    � � �   � � �  �       � �  �   �     8+� b� ,� b� � Yz� �+� b� +�,� b� ,�� Yz� �    �      � � � "� $� ,� .� �   *    8 � �     8 � �    8 � �    8 � �  �       � �  �   F     *+,� {�    �      � �         � �      � �     � �  �       � �  �   F     *+,� {�    �      � �         � �      � �     � �  �       �   �  m  	   �*� � :�   � �� ! � "M,� 2���6*� � :�   � >� ! � "N,-� 6,-���-� 2������-� ?,� ?� |���*,-� }���,� ?:6� _� #+� `� � `� 
*,� ~���ۧ�b�    �   N   � � � %� (� ;� F� N� S� Z� _� m� v� |� �� �� �� �� �� �   \ 	 F 0 �  1 E �   ( � �  | + �   � � �  ( �  	 � � �    � � �     � � �  �        �  �    >� Y� � *� � �� �� +� �� �� �� ,� �� �� �� � :6� _� \+� ?� `� J,� ?� `� >� � Y� � �� � :� >� Y� � � c� �� � :����� Y� � �� � :+� %� d,� %� d� � Y� � �� � :� � Y� � �� � :� �`� �� �� ��    �   :      F Q i
 � � � � � �  �   >  I a � �    � �     �   	 �  
  F �  �        �  ]     ϻ Y� �� *� � �� �� +� �� �� � :*� � :�   � V� ! � "N-+���-� 2���-� K:� i���� m��˻ Y� � �� -� �� �� � :���� Y� � �� � c� �� �� �� � :� �`� �� �� ��    �   .   ) .- A/ L2 X5 ^6 o9 �= �A �B �C �   H  L H � �  ^ 6 �  7 ] � �    � � �     � �    � �  . �  �        �   L     +� *� +� � �� � �    �      K �        � �      �    �   N     +� � �*+� � ��    �      S T 	V �        � �        �  �   2     *� � ��    �      _ �        � �     �   �     b� Y� � *� � �� *� 
� ��� � L*� gM,� 2� Y� +� ,� �� L� Y� +� �� � L,� oM���+�    �      k (n 1p Dq Xn `t �        b � �   ( :  - 5 �   �  �   9      � �Y� �� � �Y� �� � �    �       V 
 m  �                                                                                                                                                                                                                                                                                                                    deps/java_cup/lalr_transition.class                                                                 0000666 0002035 0002035 00000003335 14202043766 017044  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 U
  4 5 6
  7 8	  9	  :	  ;
  < =
 
 4 >
 
 ?
  @
 A B C
 
 D
 E F
 
 G H I J 
_on_symbol Ljava_cup/symbol; 	_to_state Ljava_cup/lalr_state; _next Ljava_cup/lalr_transition; <init> C(Ljava_cup/symbol;Ljava_cup/lalr_state;Ljava_cup/lalr_transition;)V Code LineNumberTable LocalVariableTable this on_sym to_st nxt 
Exceptions )(Ljava_cup/symbol;Ljava_cup/lalr_state;)V 	on_symbol ()Ljava_cup/symbol; to_state ()Ljava_cup/lalr_state; next ()Ljava_cup/lalr_transition; toString ()Ljava/lang/String; result Ljava/lang/String; 
SourceFile lalr_transition.java  K java_cup/internal_error +Attempt to create transition on null symbol  L *Attempt to create transition to null state         java/lang/StringBuilder transition on  M N ( ) O P /  to state [ . / Q R S M T ] java_cup/lalr_transition java/lang/Object ()V (Ljava/lang/String;)V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; java_cup/symbol name java_cup/lalr_state index ()I (I)Ljava/lang/StringBuilder; !                             �     0*� +� � Y� �,� � Y� �*+� *,� *-� �        & 	              " % # * $ / % !   *    0 "      0 #     0 $     0 %   &        '     J     *+,� 	�        
    /  0 !         "       #      $   &       ( )     /     *� �            : !        "     * +     /     *� �            B !        "     , -     /     *� �            J !        "     . /     �     N� 
Y� � *� � � � � L� 
Y� +� *� � � � L� 
Y� +� � � L+�            U  V 8 W L Y !       N "     / 0 1   2    3                                                                                                                                                                                                                                                                                                   deps/java_cup/Lexer.class                                                                           0000666 0002035 0002035 00000037113 14202043766 014720  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1�	
 
 t	 t	 t	 t
 t
 



 
 
 
 


 u	 t	 t	 t	 t !
 t"
 -#
 -$   	 t%	 t&
'	 t(	 t)	 t*
+,	 t-
+.
 t/	 t01
 -2	 t345
 16
 t7	 t8	 t9	 t:	 t;	 t<
 t=	 t>?
 t@ABCDEFG
 C	 tH	 tI	 tJ
 tK
 tL
 CMN
 tOPQ
 tR
 CSTUVWXYZ[\]^_`abcdefghij
 tkl
mn
 to
 tpqrstuvwx YYEOF I ConstantValue���� YY_BUFFERSIZE  @  CODESEG    	YYINITIAL     yycmap_packed Ljava/lang/String; yycmap [C 	yy_rowMap [I 
yy_packed0 yytrans YY_UNKNOWN_ERROR YY_ILLEGAL_STATE YY_NO_MATCH    YY_PUSHBACK_2BIG    YY_ERROR_MSG [Ljava/lang/String; YY_ATTRIBUTE [B 	yy_reader Ljava/io/Reader; yy_state yy_lexical_state 	yy_buffer yy_markedPos yy_pushbackPos yy_currentPos yy_startRead 
yy_endRead yyline yychar yycolumn yy_atBOL Z yy_atEOF yy_eof_done sb Ljava/lang/StringBuffer; symbolFactory 'Ljava_cup/runtime/ComplexSymbolFactory; csline cscolumn <init> *(Ljava_cup/runtime/ComplexSymbolFactory;)V Code LineNumberTable LocalVariableTable this Ljava_cup/Lexer; sf symbol .(Ljava/lang/String;I)Ljava_cup/runtime/Symbol; name code @(Ljava/lang/String;ILjava/lang/String;)Ljava_cup/runtime/Symbol; lexem emit_warning (Ljava/lang/String;)V message 
emit_error (Ljava/io/Reader;)V in (Ljava/io/InputStream;)V Ljava/io/InputStream; 	yy_unpack ()[I trans offset (Ljava/lang/String;I[I)I count value packed i j l yy_unpack_cmap (Ljava/lang/String;)[C C map 	yy_refill ()Z 	newBuffer numRead 
Exceptionsy yyclose ()V yyreset reader yystate ()I yybegin (I)V newState yytext ()Ljava/lang/String; yycharat (I)C pos yylength yy_ScanError e *Ljava/lang/ArrayIndexOutOfBoundsException; 	errorCode 
yypushback number 	yy_do_eof 
next_token ()Ljava_cup/runtime/Symbol; yy_peek eof yy_input yy_next yy_attributes yy_r 	yy_action yy_currentPos_l yy_startRead_l yy_markedPos_l yy_endRead_l yy_buffer_l yycmap_l 	yytrans_l yy_rowMap_l 	yy_attr_l <clinit> 
SourceFile 
Lexer.java java/io/InputStreamReaderz � � � � � � � �{ .java_cup/runtime/ComplexSymbolFactory$Location Location InnerClasses � y � y � � �|}~}��� java/lang/StringBuilder � � Scanner at ���� ( ): � � � � � � � y � � � � � ��	
 ! ,��+��"#*��
������$,��%��
��&��'��
����(��
����)��
����*+��, ��
��-����
����./��
��0����
��1����
��2��34��
����5
��
����6*��7"'"#8$#��9,��:��
��;����
��<=����
����>��
����?	��
����	@��
����A��
����B	��
��C����
����D��
��E����
����F��
����G��
����H��
��I����
����
J��
����K	��#8$#��L��
��M����
����N��
����O��
����P��
��Q����
��R����
����S��
����T��
����U
��
����V	��
����W��
����X	��
����
Y��
��Z����
��[����
����\]	��
����^��_��
��`����
��a����
����b��
����c	��
����
d��
����e��
����f
��
��g����
����h��
����i	��
��j����
����k��
��l����
����	m��
��n����
����o��
����	p��
����
q��
����r	��
����
s��
����t��
��u����
��v����
��w����
����x��
����y��
����z
��
����{��
����
|��
����}��
��~����
������
������
����
��
������
������
������ � �� �� � � y � y�� � y � y � y��� � �� � � � � y java/lang/String �� � � (java/lang/ArrayIndexOutOfBoundsException java/lang/Error � � � � � � � � � � � � � � � � � y LT � � GT RBRACK LBRACK QESTION PACKAGE EXTENDS java/lang/StringBuffer � � � y � y � � � ��� ID � � Unrecognized character ' ' -- ignored CODE_STRING PERCENT_PREC STAR DOT WITH CLASS SUPER BAR START IMPORT PARSER COLON_COLON_EQUALS NON ACTION 
PRECEDENCE NONTERMINAL INIT RIGHT LEFT SEMI CODE NONASSOC COLON COMMA SCAN � � EOF} �
x	����������
��
	��������"&% #!($')��!����������������Ǌ����������p��������������S������	��&����'	��-��������������������+��c������
������Y��
!	����	��¤��6
��
��������������������������������
��������������������������������������	����������������������
������������������������������
����������������������������������
	������������
����������������
����������
����������������
����������)������������

����������	����������������0����
'����������������������������������
��"������
����������$������$	��9��+
����&
��+����ŉ����������)����!������������9����C�� ����U��ɬ������K������������������4 ������
!����
��X��)��F
������
��
����,����
&����5
������
��X��/��
��	��
��
��&��$��
��
$R������À'��Ė����&��������������5��������������������������������������������������
����������������������)੷��/��/������&
��6	����	������������������ /��Ǖ����	������V������Z����)��^��5��Ȁ��ᦶJ��凌4��ҍC��.��č��
��/������P%��	��g������
P������4��2��
������
������/��
&��)	����
������0��#������	������#����
��⮤����1℄��Į��>��j&������
������������l!��ū��@��6(����������������������
��������Y���������������� � � � � Unkown internal scanner error Internal error: unknown state Error: could not match input #Error: pushback value was too large java_cup/Lexer java/lang/Object java_cup/sym java_cup/runtime/Scanner java/io/IOException java/lang/System %java_cup/runtime/ComplexSymbolFactory (II)V 	newSymbol �(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;)Ljava_cup/runtime/Symbol; �(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;Ljava/lang/Object;)Ljava_cup/runtime/Symbol; java_cup/ErrorManager 
getManager ()Ljava_cup/ErrorManager; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; toString length charAt 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V java/io/Reader read ([CII)I close ([CII)V ,(Ljava/lang/String;)Ljava/lang/StringBuffer; ! t u  v w "  x y  z    {  | y  z    }  ~ y  z      � y  z    �  � �  z    m  � �    � �    � �  z      � �    � y  z    �  � y  z      � y  z    �  � y  z    �  � �    � �    � �    � y    � y    � �    � y    � y    � y    � y    � y    � y    � y    � y    � �    � �    � �    � �    � �    � y    � y     � �  �   P     *� Y� � � *+� �    �      b c d �        � �      � �   � �  �   s 	    5*� +� Y*� `*� `*� 	d� 
� Y*� `*� `� 
� �    �      i �        5 � �     5 � �    5 � y   � �  �   | 	    4*� +� Y*� `*� `� 
� Y*� `*� *� 	`� 
-� �    �      l �   *    4 � �     4 � �    4 � y    4 � �   � �  �   n     6� � Y� � *� `� � *� `� � +� � � �    �   
   o 5p �       6 � �     6 � �   � �  �   n     6� � Y� � *� `� � *� `� � +� � � �    �   
   r 5s �       6 � �     6 � �   � �  �   e     *� *� *@ �� *� *+� �    �      | 3 	7 X } ~ �        � �      � �   � �  �   E     *� Y+� � �    �   
   � � �        � �      � �  
 � �  �   R     �
K<*� <*�    �      � � � � �       � �    
 � y  
 � �  �   �     ?>6*� 6� .*��  6*��  6��,�O��������    �   * 
  � � � � � � %� (� 9� <� �   R    � y  %  � y    ? � �     ? � y    ? � �   = � y   : � y   4 � y  
 � �  �   �     9!�L=>�� **��  6*��  6+�U�������+�    �   & 	  � � � 	� � � $� 4� 7� �   >    � y  $  � �    9 � �    4 � �   2 � y  	 0 � y   � �  �  (     �*� "� U*� *� "*� *� #*� "d� $*Y� #*� "d� #*Y� %*� "d� %*Y� &*� "d� &*Y� '*� "d� '*� "*� %*� ��  *� %h�L*� +*� �� $*+� *� *� *� #*� �*� #d� (<� �*Y� #`� #�    �   B   � �  � -� :� G� T� Y� e� n� }� �� �� �� �� �� �      n  � �    � � �   �  � y  �     �  � �  �   V     *� )**� "� #*� � 
*� � *�    �      � � � � � �        � �   �     �  � �  �   �     A*� +*+� *� *� )**Z� "� #***Z� 'Z� &� %***Z� Z� ,� *� �    �   & 	     	    , ; @ �       A � �     A � �  �     �  � �  �   /     *� �    �       �        � �    � �  �   >     *� �    �   
     �        � �      � y   � �  �   C     � -Y*� *� "*� &*� "d� .�    �      ! �        � �    � �  �   @     *� *� "`4�    �      1 �        � �      � y   � �  �   4     
*� &*� "d�    �      9 �       
 � �    � �  �   y     � /2M� 
N� /2M� 1Y,� 2�     	 0  �      N R 	P 
Q T �   *  
  � �     � �      � y    � �   � �  �   X     *� 	� *� 3*Y� &d� &�    �      a b d e �        � �      � y   � �  �   G     *� 4� *� 4*� +�    �      m n o q �        � �   �     �  � �  �  
i 	   	*� #6*� :� 5:� 6:	� 7:
� 8:*� &66*� ">� �4�      �      
   n      D      D      Y   �   D   (   D   )   D*Y� `� *� 6� B*Y� `� *� 6� -� 	6� "*Y� `� *� � 6*Y� `� ���[� h� 4
� � 6� >*� )� 	6� 1*� 96*� &6*� :� 	6� 4
� � 6� *Y� d� =**Z� "Z� %Y>6**� � :� �4<� I*� )� <� �*� %*� &*� 96*� %>*� &6*� :*� #6� <� T�4<	
*� :.4`.6� � 2*� :*� :36~� *� :=6~� � ��c*� &�    �      �  O  -  -  O  �  ?  �  �  �  �  �  �  �  �  O  ?  ?  ?  ?  �  �  O  ?  ?  ?  ?  ?  ?  ?  0  0  �  �  �  �  ?  ?  ?  ?  ?  ?    ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  q  �  *  �  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  6  ?  �  ?  ?  ?  ?  ?  �  ?  ?  ?  e  ?  }  �  ?  ?  ?  ?  �  �  ?  ?  ?  q  ?  �  ?  ?  ?    �  ?  ?  ?  �  ?  ?  B    ?  ?  ?  ?  �  �  ?  ?  ?  ?    �  ?  ?  ?  M  ?  Y  �  �  �  �  �  �  �    *  -  <  L  n  �  �  �  �  �  �  �        '  3  ?  J  V  b  n  z  �  �  �  �  �  �  �  �*;� <��I*=� <��=*>� <��1*?� <��%*@� <��*A� <��*B � <��*� CY� D� E**� `� F**� `� G*� H�ۧ�*� E*� I� JW��*K"*� I� L���*� Y� M� *� I� N� � � O��*� H*� P#� Y*� F*� G� 
� Y*� `*� `*� 	`� 
*� E� Q� ��U*R� <��I*S� <��=*T� <��1*U� <��%*V!� <��*W� <��*X� <��*Y� <�� �*Z� <�� �*[� <�� �*\� <�� �*]� <�� �*^� <�� �*_� <�� �*`� <�� �*a	� <�� �*b� <�� �*c� <�� *d� <�� s*[� <�� g*e� <�� \*f� <�� P*g� <�� D*h� <�� 8*i
� <�� ,� "*� "*� %� *� )*� j*� k� l�*� 3��    �  V �  � � � � � �  � &� )� 4� |� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� ���	���� �1�@�B�R�Z�`�k�r�t�w�|��������������������������������������� �������������� ������	
+.1=@gMhPmonrp�q�s�t�v�w�y�z�|�}���������������(�+�4�7�@�C�K�N�W�Z�c�f�o�r�{�~����������������������������������������� �   �  �  � �    � �   � � 	 ( � � 1  � � h  � y t  � y �  � y � ) � � � 5 � y �  � y  )� � �   	 � �  �X � y B� � y  .� � y R� � y  &� � y   � y  � � �  � � �  � � � 	 � � � 
  � � �  �     �  � �  �  �     bm� n� 5 ��
YOY*OYTOY~OYTOY �OYTOY �OYTOY	TOY
TOYTOYTOYTOYTOY �OY&OYPOYzOY�OY�OYTOYTOY�OY"OYLOYvOY�OY�OY�OYOYTOY HOY!rOY"�OY#�OY$�OY%OY&DOY'nOY(�OY)�OY*�OY+TOY,OY-@OY.jOY/�OY0�OY1�OY2OY3<OY4fOY5�OY6TOY7�OY8TOY9�OY:OY;8OY<bOY=�OY>�OY?�OY@
OYA4OYB^OYC�OYD�OYE�OYF	OYG	0OYH	ZOYI	�OYJ	�OYK	�OYL
OYM
,OYN
VOYO
�OYP
�OYQ �OYR
�OYS
�OYT(OYU �OYVROYW �OYX �OYY|OYZ�OY[�OY\�OY] �OY^TOY_$OY`NOYaxOYb �OYc�OYd �OYe�OYf�OYg OYh �OYi �OYjJOYktOYl�OYm �OYn�OYo�OYp �OYq �OYrOYsFOYtpOYu�OYv �OYw �OYx�OYy�OYzOY{BOY| �OY} �OY~lOY�OY ��OY � �OY ��OY � �O� 7� o� 6� -YpSYqSYrSYsS� / ��YTYTY	TYTY	TYTY	TYTY	TY		TY
	TY	TY	TY	TY	TYTYTYTYTYTYTY	TY	TYTYTYTYTYTYTYTYTY	TY TY!TY"TY#TY$TY%TY&TY'TY(TY)TY*TY+	TY,TY-TY.TY/TY0TY1TY2TY3TY4TY5TY6	TY7TY8	TY9TY:TY;TY<TY=TY>TY?TY@TYATYBTYCTYDTYETYFTYGTYHTYITYJTYKTYLTYMTYNTYOTYPTYQTYRTYSTYTTYUTYVTYWTYXTYYTYZTY[TY\TY]TY^	TY_TY`TYaTYbTYcTYdTYeTYfTYgTYhTYiTYjTYkTYlTYmTYnTYoTYpTYqTYrTYsTYtTYuTYvTYwTYxTYyTYzTY{TY|TY}TY~TYTY �TY �TY �TY �T� 8�    �       �  ����   �    
   
  	 	                                                                                                                                                                                                                                                                                                                                                                                                                                                     deps/java_cup/lr_item_core.class                                                                    0000666 0002035 0002035 00000007332 14202043766 016304  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 ) _	  ` a b
  c	  d
 e f g	  h
 e i	  j
 e k
 l m n
  o
  p
  q
 r s t
  u v w
 e x
  y
  z
 ) i
 e {
 r | } ~
  _
   �
  � � � � �
  �
  � � _the_production Ljava_cup/production; _dot_pos I _core_hash_cache _symbol_after_dot Ljava_cup/symbol; <init> (Ljava_cup/production;I)V Code LineNumberTable LocalVariableTable part Ljava_cup/production_part; this Ljava_cup/lr_item_core; prod pos 	after_dot 
Exceptions (Ljava_cup/production;)V the_production ()Ljava_cup/production; dot_pos ()I 
dot_at_end ()Z symbol_after_dot ()Ljava_cup/symbol; dot_before_nt ()Ljava_cup/non_terminal; sym 
shift_core ()Ljava_cup/lr_item_core; core_equals (Ljava_cup/lr_item_core;)Z other equals (Ljava/lang/Object;)Z Ljava/lang/Object; core_hashCode hashCode obj_hash to_simple_string ()Ljava/lang/String; result Ljava/lang/String; i toString e Ljava_cup/internal_error; 
SourceFile lr_item_core.java 1 � / 0 java_cup/internal_error 8Attempt to create an lr_item_core with a null production 1 � * + � � B 9Attempt to create an lr_item_core with a bad dot position , - S B . - � � � � D java_cup/symbol_part � F 1 2 E F � � D java_cup/non_terminal C D ,Attempt to shift past end of an lr_item_core java_cup/lr_item_core O � L M O M � � � V $$NULL$$ java/lang/StringBuilder � �  ::=  Z V (*)  	$$NULL$$  	{ACTION}    U V � � java/lang/Object ()V (Ljava/lang/String;)V java_cup/production 
rhs_length rhs (I)Ljava_cup/production_part; java_cup/production_part 	is_action 
the_symbol java_cup/symbol is_non_term (Ljava_cup/production;)Z lhs ()Ljava_cup/symbol_part; name append -(Ljava/lang/String;)Ljava/lang/StringBuilder; crash !  )     * +    , -    . -    / 0     1 2  3       |*� *� N+� � Y� �*+� � *� � � � Y� �*� 	**� � 
h`� *� 	*� � � $*� *� 	� :� � *� � � �    4   >    "  h 	 #  &  '  *  , - - 7 0 < 3 L 6 Z 8 g 9 o : { < 5   4  g  6 7    | 8 9     | : +    | ; -   q < 0  =       1 >  3   ?     *+� �    4   
    E  F 5        8 9      : +  =       ? @  3   /     *� �    4       P 5        8 9    A B  3   /     *� 	�    4       ^ 5        8 9    C D  3   >     *� 	*� � � � �    4       o 5        8 9    E F  3   /     *� �    4       y 5        8 9    G H  3   W     *� L+� +� � +� ��    4       �  �  �  � 5        8 9     I 0   J K  3   U     #*� � � Y� �� Y*� *� 	`� �    4       �  �  � 5       # 8 9   =       L M  3   W     #+�  *� +� � � *� 	+� 	� � �    4       � 5       # 8 9     # N 9   O M  3   :     *+� �    4       � 5        8 9      N 9   O P  3   N     +� � �*+� � �    4       �  � 	 � 5        8 9      N Q   R B  3   /     *� �    4       � 5        8 9    S B  3   /     *� �    4       � 5        8 9    T B  3   /     *� �    4       � 5        8 9    U V  3  �    U*� � � 1*� � � � $*� � � � � *� � � � L� L� Y� +�  !�  � "L>*� � � �*� 	� � Y� +�  #�  � "L*� � � � Y� +�  $�  � "L� �*� � M,� � Y� +�  $�  � "L� p,� � � Y� +�  %�  � "L� R,� � � 4,� � � � '� Y� +�  ,� � � �  &�  � "L� � Y� +�  $�  � "L���#*� 	*� � � � Y� +�  #�  � "L+�    4   V    � ' � 8 � ; � O � \ � d � x � � � � � � � � � � � � � � � � � �+ �1?S 5   4  5  W X  � � 6 7  Q � Y -   U 8 9   ; W X  =       Z V  3   T     *� '�L+� (�        4         
 5       [ \     8 9    ]    ^                                                                                                                                                                                                                                                                                                      deps/java_cup/Main.class                                                                            0000666 0002035 0002035 00000042164 14202043766 014527  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   13
*�
��	)�
 ��
��
��
��
 ��
��
��
 ��
)�	)�
��	)�
��	)�
��	)�
��	)�	���
���	��
 �	)�	)��
)�	)�
��
���
)�	)��
)�	)�	)��
)�
)�	)�	)�
)�	)�
)�
)�	)��
)�	)�
)�
��
����
���
���
���
)�	�����
 F�	)���	����	���	)���
��	)����	) 	�		)
	)	)	)	�	�
 r�
�
 v�
 v 
 v!"#$
 F%&'(
 �)
 �*
 �+	),-./	)0
 1
 �12
 ��34
 �5
 �6
 �7
 �89
�:
 �;<=<>?	 �@	 �A
 �B	�CD
 �EF
�G
 �;H
 �BI
 �EJ
 �K	)LM
 �N	)OP	�Q
 �R	)S	)TUV
 ��	)WX
 ��	)Y
 �;Z
 �[	)\]
 �^	)_	�`a
�b
 �c
�de�	)fgh
 vij
)kl
�mn
 �opq
�r
 �ost
�ouvw
 �oxy	�z	�{|}~�����
)�����
)�����������	���	���	���	���	���	����      �       
�       d�
 v�������
 ���
 ���
���
��
$�
�E�
��
��
������
����� print_progress Z opt_dump_states opt_dump_tables opt_dump_grammar opt_show_timing opt_do_debug opt_compact_red include_non_terms 
no_summary expect_conflicts I 	lr_values 	locations 
xmlactions genericlabels sym_interface suppress_scanner 
start_time J 
prelim_end 	parse_end 	check_end dump_end 	build_end nullability_end 	first_end machine_end 	table_end reduce_check_end emit_end 
final_time 
input_file Ljava/io/BufferedInputStream; parser_class_file Ljava/io/PrintWriter; symbol_class_file dest_dir Ljava/io/File; start_state Ljava_cup/lalr_state; action_table Ljava_cup/parse_action_table; reduce_table Ljava_cup/parse_reduce_table; <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/Main; main ([Ljava/lang/String;)V argv [Ljava/lang/String; 
did_output 
Exceptions�� usage (Ljava/lang/String;)V message Ljava/lang/String; 
parse_args e !Ljava/lang/NumberFormatException; Ljava/io/FileNotFoundException; len i 
open_files Ljava/lang/Exception; fil out_name close_files parse_grammar_spec 
parser_obj Ljava_cup/parser; csf 'Ljava_cup/runtime/ComplexSymbolFactory; check_unused term Ljava_cup/terminal; t Ljava/util/Enumeration; nt Ljava_cup/non_terminal; n build_parser lst st emit_parser plural (I)Ljava/lang/String; val emit_summary (Z)V output_produced 
show_times 
total_time timestr (JJ)Ljava/lang/String; pad time_val neg ms sec 	percent10 dump_grammar tidx cnt nidx prod Ljava_cup/production; pidx dump_machine s ordered [Ljava_cup/lalr_state; dump_tables <clinit> 
SourceFile 	Main.javaXY���=>�Y�����k`7,��8,��9,��:,��+,�� Opening files...��h java/io/BufferedInputStream��X�KL?> ,Parsing specification from standard input...vY@>����� Checking specification...{YA> Building parse tables...�YC>., Writing parser...qY�YI>/,�Y-,�Y�YB> Closing files...uY4,�����Y�CUP v0.11b ${cupversion} (SVN rev )
Usage: java_cup [options] [filename]
  and expects a specification file on standard input if no filename is given.
  Legal options include:
    -package name  specify package generated classes go in [default none]
    -destdir name  specify the destination directory, to store the generated files in
    -parser name   specify parser class name [default "parser"]
    -typearg args  specify type arguments for parser class
    -symbols name  specify name for symbol constant class [default "sym"]
    -interface     put symbols in an interface, rather than a class
    -nonterms      put non terminals in symbol constant class
    -expect #      number of conflicts expected/allowed [default 0]
    -compact_red   compact tables by defaulting to most frequent reduce
    -nowarn        don't warn about useless productions, etc.
    -nosummary     don't print the usual summary of parse states, etc.
    -nopositions   don't propagate the left and right token position values
    -locations     generate handles xleft/xright for symbol positions in actions
    -xmlactions    make the generated parser yield its parse tree as XML
    -genericlabels automatically generate labels to all symbols in XML mode
    -noscanner     don't refer to java_cup.runtime.Scanner
    -progress      print messages to indicate progress of the system
    -time          print time usage summary
    -dump_grammar  produce a human readable dump of the symbols and grammar
    -dump_states   produce a dump of parse state machine
    -dump_tables   produce a dump of the parse tables
    -dump          produce a dump of all of the above
    -version       print the version information for CUP and exit
 -package��� -�� .cup�� "-package must have a name argumentgh�j -destdir "-destdir must have a name argument java/io/FileXhPQ -parser !-parser must have a name argument�j -symbols "-symbols must have a name argument�j 	-nonterms3, -expect !-expect must have a name argument���56 java/lang/NumberFormatException --expect must be followed by a decimal integer -compact_red2, 
-nosummary -nowarn�, -dump_states -dump_tables 	-progress -dump_grammar -dump -time0, -debug1, -nopositions 
-locations -xmlactions -genericlabels 
-interface;, 
-noscanner<, -version�� #CUP v0.11b ${cupversion} (SVN rev ) -typearg�j java/io/FileInputStream�� java/io/FileNotFoundException java/lang/StringBuilder Unable to open "�� " for input�� Unrecognized option " " .javaX� java/io/PrintWriter java/io/BufferedOutputStream java/io/FileOutputStreamX�X�X�MN java/lang/Exception Can't open " " for outputON�Y %java_cup/runtime/ComplexSymbolFactory java_cup/parser java_cup/LexerX�X����� $Internal error: Unexpected exception�h����  java_cup/terminal}}�6 
Terminal "� " was declared but never usedh java_cup/non_terminal Non terminal " '  Computing non-terminal nullability...	YD>   Computing first sets...
YE>   Building state machine...�RSF>   Filling in tables... java_cup/parse_action_tableTU java_cup/parse_reduce_tableVW java_cup/lalr_stateG> )  Checking for non-reduced productions...YH>6 I*** More conflicts encountered than expected -- parser generation aborted�  J> M------- CUP v0.11b ${cupversion} (SVN rev ) Parser Generation Summary -------   �  error��  and �  warning� 	 terminal , h  non-terminal , and   production  declared,    producing   unique parse states.  declared but not used.66  never reduced. 	 conflict 	 detected  (  expected).   Code written to " .java", and " .java".   No code produced.�Y Z---------------------------------------------------- (CUP v0.11b ${cupversion} (SVN rev )) 2. . . . . . . . . . . . . . . . . . . . . . . . .    Timing Summary     Total time       ��       Startup               Parse                 Checking              Parser Build            Nullability           First sets            State build           Table build           Checking            Code Output    >         Symbols      >         Parser class >           Actions     >           Prod table !>           Action tab ">           Reduce tab        Dump Output          �# . %) ===== Terminals ===== [ ]$% ===== Non terminals =====$& ===== Productions =====$' ] ()*+,  ::= -�./01  	{action}  java_cup/symbol_part $===== Viable Prefix Recognizer ===== START �2 ------------------- java_cup/Main java/lang/Object java_cup/internal_error java/io/IOException java/lang/System currentTimeMillis ()J clear java_cup/production java_cup/action_production java_cup/emit java_cup/parse_reduce_row java_cup/parse_action_row set_lr_values set_locations set_xmlactions set_genericlabels err Ljava/io/PrintStream; java/io/PrintStream println in Ljava/io/InputStream; (Ljava/io/InputStream;)V java_cup/ErrorManager 
getManager ()Ljava_cup/ErrorManager; getErrorCount ()I exit (I)V java/lang/String equals (Ljava/lang/Object;)Z 
startsWith (Ljava/lang/String;)Z endsWith package_name parser_class_name symbol_const_class_name java/lang/Integer parseInt (Ljava/lang/String;)I nowarn out class_type_argument setIn append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; #(Ljava/io/File;Ljava/lang/String;)V (Ljava/io/File;)V (Ljava/io/OutputStream;I)V (Ljava/io/OutputStream;)V close *(Ljava_cup/runtime/ComplexSymbolFactory;)V =(Ljava_cup/runtime/Scanner;Ljava_cup/runtime/SymbolFactory;)V debug_parse ()Ljava_cup/runtime/Symbol; parse 
emit_error all ()Ljava/util/Enumeration; java/util/Enumeration hasMoreElements ()Z nextElement ()Ljava/lang/Object; EOF error 	use_count unused_term name emit_warning compute_nullability compute_first_sets start_production build_machine ,(Ljava_cup/production;)Ljava_cup/lalr_state; build_table_entries =(Ljava_cup/parse_action_table;Ljava_cup/parse_reduce_table;)V check_reductions num_conflicts symbols (Ljava/io/PrintWriter;ZZ)V index parser j(Ljava/io/PrintWriter;Ljava_cup/parse_action_table;Ljava_cup/parse_reduce_table;ILjava_cup/production;ZZ)V (I)Ljava/lang/StringBuilder; getWarningCount number print unused_non_term not_reduced symbols_time parser_time action_code_time production_table_time action_table_time goto_table_time (J)Ljava/lang/StringBuilder; find (I)Ljava_cup/terminal; (I)Ljava_cup/non_terminal; (I)Ljava_cup/production; lhs ()Ljava_cup/symbol_part; 
the_symbol ()Ljava_cup/symbol; java_cup/symbol 
rhs_length rhs (I)Ljava_cup/production_part; java_cup/production_part 	is_action (Ljava/lang/Object;)V !)*   $ +,   -,   .,   /,   0,   1,   2,   3,   4,   56   7,   8,   9,   :,   ;,   <,   =>   ?>   @>   A>   B>   C>   D>   E>   F>   G>   H>   I>   J>   KL   MN   ON   PQ   RS   TU   VW    XY Z   /     *� �   [       M\       ]^   	_` Z  
    "<� � � � � � � � 	� 
� *� � � � � � � � � � � � � � Y� � � � � � � � � � � �  � !� "� W� � � #� � $� � %� � � &� � '� � (� !� "� 
� )� � � � *� � +� ,<� � -� .� � /� 0� � 1� )� � 2� � 3� � � 4� � 5� 6� � 7� !� "� d� 8�   [   � .   �  �  �  �  �  �  �  �  �  �   � $ � * � 0 � 6 � < � J � W � ] � c � k � n � t � } � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � �	 � � �! �\      "ab    c, d    ef � gh Z   ^      � � 9� *� � � 9� :� � 8�   [       �       \        ij   k` Z  t    "*�<=�*2;� <� /�� *2=� >� *2?� @� A� B*2� C��*2D� <� 6�� *2=� >� *2?� @� E� B� FY*2� G� H��*2I� <� /�� *2=� >� *2?� @� J� B*2� K�h*2L� <� /�� *2=� >� *2?� @� M� B*2� N�1*2O� <� 
� P�*2Q� <� ;�� *2=� >� *2?� @� R� B*2� S� T��NV� B��*2W� <� 
� X��*2Y� <� 
� 6��*2Z� <� 
� [��*2\� <� 
� 0��*2]� <� 
� )��*2^� <� 
� �p*2_� <� 
� .�^*2`� <� Y� .Y� )� 0�D*2a� <� 
� b�2*2c� <� 
� d� *2e� <� 
� �*2f� <� 
� � �*2g� <� 
� � �*2h� <� 
� � �*2i� <� 
� j� �*2k� <� 
� l� �*2m� <� � no� � 8� �*2p� <� /�� *2=� >� *2?� @� M� B*2� q� c*2=� >� ;d� 4� rY*2� s� t� AN� vY� wx� y*2� yz� y� {� B�  � vY� w|� y*2� y}� y� {� B���� -69 U��� u [   � =  * . 
1 4 36 89 A; L> j@ oB D �G �I �L �N �Q �S �V �X �Z �\
_(a-e6h9f:g?hBjTkflxm�n�o�p�q�r�s�t�vw"x4yF{X}ju�}�����������������������.!�\   4 : lm � ln   "ab   o6  p6  qY Z  Y     ɻ vY� w� K� y~� y� {L� FY� H+� K� �Y� �Y� �Y*� � � �� �� �� &M� � vY� w�� y+� y�� y� {� � 8� vY� w� N� y~� y� {L� FY� H+� K� �Y� �Y� �Y*� � � �� �� �� &M� � vY� w�� y+� y�� y� {� � 8�  " > A � � � � � [   >   � � "� >� A� B� `� d� z� �� �� �� �� �� ��\   *  B "lr  � "lr  " �sQ    �tj  uY Z   I      %� � 	� � �� �� 	� �� �� �� 	� �� ��   [      � � � $�d    f vY Z   �     ;� �Y� �L� �Y� �Y+� �+� �K� d� *� �W� *� �W� M� !�� �,��   , / � [   * 
  � � � � '� ,� /� 0� 8� :�\      0 
lr   "wx    3yz d     � {Y Z  5     �� �M,� � � Z,� � � �K*� �� ���*� �� ���*� ���ղ �`� �� [��Ǹ !� vY� w�� y*� �� y�� y� {� ����� �M,� � � F,� � � �L+� ���� �`� �� [��۸ !� vY� w�� y+� �� y�� y� {� �����   [   >      !	 + 2 : @ d q { �  �! �# �(\   *   M|}    `~  { 9��  h L�  �Y Z  �     � d� 	� � � �� � �� � �� d� 	� � � �� � �� � �� d� 	� � � �� � �� �� �� � �� d� 	� � � �� � �Y� �� �� �Y� �� �� �K*� � � *� � � �L+� �� �� ���� � �� d� 	� � � �� � �� �� � �� �� T� � !¶ ��   [   r   E F G I L )M 1N 4P :S FT NU WW ]Z i[ q\ {] �^ �` �a �c �e �h �i �j �l �o �q �v\     � 
�S  �  �  d    e �Y Z   H      (� �� P� j� ò �� �� �� �� Ĳ �� X� l� ű   [      } ~ '�d    e �� Z   =     � ưǰ   [      � � �\       �6   �� Z  �    � � Ȳ 6� �� ɶ � � vY� wʶ y� !� "� �̶ y� !� "� Ͷ yζ y� !� ϶ �ж y� !� ϸ Ͷ y� {� � � vY� wʶ y� Ѷ �Ҷ y� Ѹ Ͷ yӶ y� {� Բ � vY� w� ն �ֶ y� ո Ͷ y׶ y� {� Բ � vY� w� ض �ٶ y� ظ Ͷ yڶ y� {� � � vY� w۶ y� ܶ �ݶ y� {� � � vY� wʶ y� �� �Ҷ y� �� Ͷ y޶ y� {� � � vY� wʶ y� ߶ �ֶ y� �� Ͷ y޶ y� {� � � vY� wʶ y� � �ٶ y� � Ͷ y� y� {� � � vY� wʶ y� �� �� y� �� Ͷ y� y� y� T� �� y� {� � 1� � vY� w� y� K� y� y� N� y� y� {� � � � � b� � � � �   [   J   � � � � c� �� �� ���1�_������������\      �,   �Y Z  �    #� Ȳ e?� � � �� � � vY� w� y� Ȳ e� � y� {� � � vY� w� y� � e� � y� {� � � vY� w� y�  � e� � y� {� � %	�� &� � vY� w� y� %�  e� � y� {� � %	�� .� (	�� &� � vY� w� y� (� %e� � y� {� � �	�� .� %	�� &� � vY� w�� y� �� %e� � y� {� � �	�� .� �	�� &� � vY� w�� y� �� �e� � y� {� � �	�� .� �	�� &� � vY� w�� y� �� �e� � y� {� � �	�� .� �	�� &� � vY� w�� y� �� �e� � y� {� � �	�� .� �	�� &� � vY� w�� y� �� �e� � y� {� � -	�� .� (	�� &� � vY� w�� y� -� (e� � y� {� � �	�� "� � vY� w�� y� �� � y� {� � �	�� "� � vY� w�� y� �� � y� {� � �	�� "� � vY� w�� y� �� � y� {� � 	�� #� � vY� w� y� � � y� {� �	�� #� � vY� w� y�� � y� {� �	�� #� � vY� w� y�� � y� {� � � vY� w� y� 3� -e� � y� {� �   [   � $  � � � � ;� ^� �� �� �� �� �� ���"�E�U�x�������������8�@�_�g������ ����"	\     �>   �� Z  �     �	7	7	�� � 6� u?q7m7	�� :� (�� 
�:� �� :� �:i m7	� vY� w� =� ƶ y� y�� yqm�q	m�	q�� y� y		m�� y		q�� y� {�   [   >       ! "" )% 2& :' C( J) S* [, _/ h2\   f 
 7 �j  G �j  X �j    ��>     ��>   ��,   ��>   ��>  h v�> 	 _ �j  	�Y Z  G    y� � ;<� Ѣ J� � vY� w� y� �� y�� �� y� y� {� �`p� 	� � 9� ����� � 9� � 9� � ;<� բ J� � vY� w� y� �� y�� �� y� y� {� �`p� 	� � 9� ����� � 9� � 9� � ;� آ ��L� � vY� w� y� �� y+���� y� y� {� �=+� � G+�!�"� � #� ԧ *� � vY� w+�!�$��� y� y� {� Ԅ���� � 9� ��j� � 9�   [   n   < 	= ? D@ R= [B aC gE pF {H �I �F �K �L �O �P �R �ST"U-V9X`TfZlPr\x]\   H   P�6    N�6  r P�6   t N�6  Lp6  � ���  � ��6  d    e 	�Y Z   �     e� ܽ �K� �L+� � � +� � � �M*,� �,S��� %� <� ܢ -*2� �� � &� Բ *2�'� (� ���ұ   [   2   f i k l %m (o 1p :r Ls Ut ^p dv\   *   �S   �  3 1p6   ^��   	�Y Z   3      � � ��'� � ��'�   [      } 	~  �Y Z        y� � 0� )� .� b� d� X� P� 6� T� � � � � j� l	� 	� 	�  	� %	� 3	� (	� �	� �	� �	� �	� �	� -	� �� H�   [   z    S  U  W  Y  [  ]  `  c   e $ g ( k , l 0 m 4 n 8 q < u @ { D } H  L � P � T � X � \ � ` � d � h � l � p � t� �   �                                                                                                                                                                                                                                                                                                                                                                                                            deps/java_cup/non_terminal.class                                                                    0000666 0002035 0002035 00000011133 14202043766 016320  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 ? �	  � �
  �	  � �
  �	  �	  �
  � � �
  � �
  � �
  �
  �
  �	  �	  �	  � �
  �
  �
  �	  �
  �
  � �
  �
  �
  � �
  �
  � � � � �
  �
  �	  �
 + � �
 + �
 + �
  �
 + �
  �
  �
 + �
 � � �
 ? � �
  � � � �
  � �
  �	  � � _all Ljava/util/Hashtable; _all_by_index 
next_index I next_nt START_nt Ljava_cup/non_terminal; is_embedded_action Z _productions 	_nullable 
_first_set Ljava_cup/terminal_set; <init> '(Ljava/lang/String;Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this nm Ljava/lang/String; tp conflict Ljava/lang/Object; (Ljava/lang/String;)V clear ()V all ()Ljava/util/Enumeration; find +(Ljava/lang/String;)Ljava_cup/non_terminal; 	with_name (I)Ljava_cup/non_terminal; indx the_indx Ljava/lang/Integer; number ()I 
create_new prefix 
Exceptions ()Ljava_cup/non_terminal; =(Ljava/lang/String;Ljava/lang/String;)Ljava_cup/non_terminal; type compute_nullability nt e Ljava/util/Enumeration; prod Ljava_cup/production; change compute_first_sets n p 
prod_first productions num_productions add_production (Ljava_cup/production;)V nullable ()Z 	first_set ()Ljava_cup/terminal_set; is_non_term looks_nullable toString ()Ljava/lang/String; <clinit> 
SourceFile non_terminal.java N O H I java/util/Hashtable N � J A java_cup/terminal_set N [ L M @ A � � java_cup/internal_error java/lang/StringBuilder Duplicate non-terminal ( � � 	) created � � N Y � [ C D � D B A java/lang/Integer Z [ E D � ] � � java_cup/non_terminal � f g k g _ NT$ � � \ ] � � } � � | } � } K I java_cup/production � } � � x ] �  � � � � � � � � � BAttempt to add invalid production to non terminal production table � � [ � f ] *   $START F G java_cup/symbol (I)V put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; crash _index elements get &(Ljava/lang/Object;)Ljava/lang/Object; size (I)Ljava/lang/StringBuilder; java/util/Enumeration hasMoreElements nextElement ()Ljava/lang/Object; check_nullable set_nullable (Z)Z check_first_set is_subset_of (Ljava_cup/terminal_set;)Z add lhs ()Ljava_cup/symbol_part; java_cup/symbol_part 
the_symbol ()Ljava_cup/symbol; index !  ?   	  @ A    B A    C D    E D    F G    H I    J A    K I    L M     N O  P   �     s*+,� *� *� Y� � *� Y� � � 	+*� 
N-� %� Y� Y� � +� � � � � *� Y`� � � � Y*� � *� 
W�    Q   * 
     y  �  #  ,   0 % R ( _ + r , R   *    s S G     s T U    s V U  , G W X   N Y  P   ?     *+� �    Q   
    5  6 R        S G      T U  	 Z [  P   =      � 	� � � � � �    Q       C  D  E  F  G 	 \ ]  P         � 	� �    Q       J 	 ^ _  P   C     *� �� 	*� � �    Q       O  P  R R        ` U   	 ^ a  P   L     � Y� L� +� � �    Q   
    ] 	 _ R        b D   	  c d  	 e f  P         � 	� �    Q       e  g _  P   0     *�  �    Q       � R        h U   i       g j  P         � !�    Q       � i       g k  P   b     **� "K� Y� Y� *� � Y`� � #� +� �    Q   
    �  � R       * h U     * l U  i      	 m [  P   �     [;� 4;� $M,� % ���,� & � L+� '���+� (���+� );��ظ *M,� % � ,� & � +N--� ,� -W���    Q   6    �  �  �  �  �  � & � - � 2 � 7 � D � N � Z � R   4    n G   + o p  N  q r   Y s I   ;   o p  i      	 t [  P   �     [;� W;� $L+� % ���+� & � N-� .M,� % ���,� & � +:� /:-� � 0���;-� � 1W��ͱ    Q   2    �  �  �  �  �  � - � 8 � ? � K � M � Z � R   >   N u p  $ 6 v p   ; n G  8 " q r  ?  w M   Y s I   i       x ]  P   2     *� � �    Q       � R        S G    y f  P   2     *� � �    Q       � R        S G    z {  P   k     ++� +� 2� +� 2� 3*� � Y4� �*� ++� 
W�    Q           * R       + S G     + q r  i       | }  P   /     *� )�    Q       R        S G    ~   P   /     *� �    Q       R        S G    � }  P   ,     �    Q       R        S G    � }  P   a     !*� .L+� % � +� & � +� ,�����    Q      ( * + . R       o p    ! S G   i       � �  P   ^     4� Y� *� 5� 6� *� 7� #8� *� '� 9� :� � �    Q      6 R       4 S G    � [  P   Q      )� Y� ;� 	� Y� ;� � � � Y<� =� >�    Q       ? 
 X  j  o  t  �    �                                                                                                                                                                                                                                                                                                                                                                                                                                     deps/java_cup/nonassoc_action.class                                                                 0000666 0002035 0002035 00000001623 14202043766 017016  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 %
  
    
  !��! " # <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/nonassoc_action; 
Exceptions $ kind ()I equals (Ljava_cup/parse_action;)Z other Ljava_cup/parse_action; (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode toString ()Ljava/lang/String; 
SourceFile nonassoc_action.java  	   java_cup/parse_action   NONASSOC java_cup/nonassoc_action java_cup/internal_error !          	  
   3     *� �       
                             
   ,     �                            
   F     +� +� � � �           &                       
   N     +� � *+� � ��           .  /  1                       
   -     �           :                 
   -     �           B                                                                                                                               deps/java_cup/parse_action.class                                                                    0000666 0002035 0002035 00000001667 14202043766 016315  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 *
  %
  & '
  (��#  ) ERROR I ConstantValue     SHIFT    REDUCE    NONASSOC    <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/parse_action; kind ()I equals (Ljava_cup/parse_action;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode toString ()Ljava/lang/String; 
SourceFile parse_action.java     java_cup/parse_action   java/lang/Object !        	  
       	  
       	  
       	  
             3     *� �       
                          ,     �           7                    E     +� +� � � �           ?                          N     +� � *+� � ��           G  H  J                           -     �           R              ! "     -     �           X              #    $                                                                         deps/java_cup/parse_action_row.class                                                                0000666 0002035 0002035 00000002372 14202043766 017176  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 A
  *	  +
 , -
  . /	  0
  *	  1
 2 -
  3 4
  5
 2 6	  7 8 9 _size I reduction_count [I 
under_term [Ljava_cup/parse_action; default_reduce <init> ()V Code LineNumberTable LocalVariableTable i this Ljava_cup/parse_action_row; size ()I clear compute_default prod max_prod max_red <clinit> 
SourceFile parse_action_row.java     : ; !   ! java_cup/parse_action     < = ! java_cup/reduce_action > ? @ !   java_cup/parse_action_row java/lang/Object java_cup/terminal number java_cup/production kind reduce_with ()Ljava_cup/production; index !                                  �     7*� � � 	� � *� � � <� � *� � Y� S����                  #  0  6              7     	   !           � �           % 	 "      )      	� � �           )  *  +  #          v� � � 	�
� <� 	� � O����>6<� � B*� 2� 
� /*� 2� � � =� \.`O� .� � .6>����*� �       F    Q  R  U  V  U # W % X ( [ 1 \ > ` N a W b a d h e j [ p j u k    4  N  $     v      f    % Q %   ( N &    '      %      	� � �       
    "  0  (    )                                                                                                                                                                                                                                                                      deps/java_cup/parse_action_table.class                                                              0000666 0002035 0002035 00000004777 14202043766 017471  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 ' H
 I J	 & K L	 & M
  H
 & N
  O	  P
 Q R S
  T
  U
  V W X W Y Z
  [	 \ ]
 ^ _ `
  H a
  b
  c d
  e
 ^ f g h
  i j k l
  m n o p q _num_states I under_state [Ljava_cup/parse_action_row; <init> ()V Code LineNumberTable LocalVariableTable i this Ljava_cup/parse_action_table; 
num_states ()I check_reductions act Ljava_cup/parse_action; col row prod Ljava_cup/production; p Ljava/util/Enumeration; 
Exceptions r toString ()Ljava/lang/String; cnt result Ljava/lang/String; 
SourceFile parse_action_table.java , - s t 5 ( ) java_cup/parse_action_row * + 4 5 u 5 v w x y 5 java_cup/reduce_action z { | - } ~  � � � � java_cup/production � 5 � � � � � � java/lang/StringBuilder *** Production " � � � B " never reduced A B � � -------- ACTION_TABLE --------
 From state # � � 
  [term  : � � ] ------------------------------ java_cup/parse_action_table java/lang/Object java_cup/internal_error java_cup/lalr_state number size 
under_term [Ljava_cup/parse_action; java_cup/parse_action kind reduce_with ()Ljava_cup/production; note_reduction_use all ()Ljava/util/Enumeration; java/util/Enumeration hasMoreElements ()Z nextElement ()Ljava/lang/Object; num_reductions java_cup/emit nowarn Z java_cup/ErrorManager 
getManager ()Ljava_cup/ErrorManager; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; to_simple_string emit_warning (Ljava/lang/String;)V (I)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; ! & '     ( )    * +     , -  .   �     4*� *� � **� � � <*� � *� � Y� S����    /              !   " - ! 3 # 0       1 )    4 2 3    4 5  .   /     *� �    /       - 0        2 3    6 -  .       �>*� � =6� � ,*� 2� 	2L+� +� 
� +� � � ���҄���� N-�  � >-�  � M,� ��� ��� � Y� � ,� � � � � ����    /   6    C 
 E  H " I . L 8 E > C D R Q T [ W b ] h ` � e 0   >  "  7 8   1 9 )   B : )  [ 1 ; <  H D = >    � 2 3   ?     @  A B  .  a     �L>*� � �� Y� +� � �  � � L=6� � k*� 2� 	2� 
� S� Y� +� !� � "� *� 2� 	2� #$� � L�� � Y� +�  � � L=����� � Y� +�  � � L���K� Y� +� %� � L+�    /   B    o  p  r * s , t 7 w I y { | ~ } �  � � � t � � � p � � � � 0   4  / p 9 )  , � C )   � : )    � 2 3    � D E   F    G deps/java_cup/parse_reduce_row.class                                                                0000666 0002035 0002035 00000001224 14202043766 017163  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 %
  	  
  
   	    ! " _size I under_non_term [Ljava_cup/lalr_state; <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/parse_reduce_row; size ()I clear <clinit> 
SourceFile parse_reduce_row.java   	 
 # $    java_cup/lalr_state   java_cup/parse_reduce_row java/lang/Object java_cup/non_terminal number !       	 
                Q     *� � � 	� � *� � � �                              	             � �             	       !      � �       
    $  %              � �                                                                                                                                                                                                                                                                                                                                                                                             deps/java_cup/parse_reduce_table.class                                                              0000666 0002035 0002035 00000003013 14202043766 017441  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 T
  3
 4 5	  6 7	  8
  3 9
  : ;
 	 3
 	 < =
 	 > ?
 	 @
  A	  B C D E
 4 F G H I J _num_states I under_state [Ljava_cup/parse_reduce_row; <init> ()V Code LineNumberTable LocalVariableTable i this Ljava_cup/parse_reduce_table; 
num_states ()I toString ()Ljava/lang/String; goto_st Ljava_cup/lalr_state; col cnt row result Ljava/lang/String; 
SourceFile parse_reduce_table.java   K L '   java_cup/parse_reduce_row   -------- REDUCE_TABLE --------
 & ' java/lang/StringBuilder M N From state # M O 
 ( ) P ' Q R  [non term  -> state  S ' ] ----------------------------- java_cup/parse_reduce_table java/lang/Object java_cup/lalr_state number append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; size under_non_term [Ljava_cup/lalr_state; index !                         �     4*� *� � **� � � <*� � *� � Y� S����    !                 ! -   3 " "       #     4 $ %    & '      /     *� �    !       - "        $ %    ( )     �     �L6*� � �� 	Y� 
+� � � � � L>6� � w*� 2� 2M,� _� 	Y� 
+� � � � � L� 	Y� 
+� � ,� � � � L�� � 	Y� 
+� � � L>����� � 	Y� 
+� � � L���=� 	Y� 
+� � � L+�    !   J    ?  @  B - C / D : G H J L L j M � P � Q � S � T � D � Y � @ � [ � ] "   >  H f * +  2 | ,   / � -    � .     � $ %    � / 0   1    2                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     deps/java_cup/parser.class                                                                          0000666 0002035 0002035 00000023016 14202043766 015132  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 $ ^
 $ _
 $ `	 # a	 # b	 # c d
  e	 # f
  g h
  ^	 # i j
  k	 # l
  m
 # n o
 p q r
  ^
  s t
  u
 p v	 # w
 x y
 p z { |
 # } ~  � � _production_table [[S _action_table _reduce_table 
action_obj Ljava_cup/CUP$parser$actions; lexer Ljava_cup/Lexer; <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/parser; (Ljava_cup/runtime/Scanner;)V s Ljava_cup/runtime/Scanner; =(Ljava_cup/runtime/Scanner;Ljava_cup/runtime/SymbolFactory;)V sf  Ljava_cup/runtime/SymbolFactory; production_table ()[[S action_table reduce_table init_actions 	do_action J(ILjava_cup/runtime/lr_parser;Ljava/util/Stack;I)Ljava_cup/runtime/Symbol; act_num I parser Ljava_cup/runtime/lr_parser; stack Ljava/util/Stack; top 
Exceptions � start_state ()I start_production EOF_sym 	error_sym 	user_init f 'Ljava_cup/runtime/ComplexSymbolFactory; scan ()Ljava_cup/runtime/Symbol; report_fatal_error '(Ljava/lang/String;Ljava/lang/Object;)V message Ljava/lang/String; info Ljava/lang/Object; report_error <clinit> 
SourceFile parser.java - . - 4 - 7 % & ' & ( & java_cup/CUP$parser$actions - � ) * � @ %java_cup/runtime/ComplexSymbolFactory � 9 java_cup/Lexer - � + , � S � . java_cup/runtime/Symbol � � � java/lang/StringBuilder � � 1
Can't recover from previous error(s), giving up. � � � � � � � � � � � java/lang/StringL��u����0������1����������2����%��%����������������
������������������3����4����5��#��6��$��������������"��"��7�� ��8�� ��9�� ��!��!��*��+��:����������;����<��������������������)��)����=������-��-��.��.��/��/��/��������������&��&��'��'��(��,��,��,��,��,��,��,��,��,��,��,��,��,��,��,��,��	��	������ � �=��¹����������	��
��������#����»��	D
?C��	ﾍﾍﾍ	ﾍ
ﾍﾍﾍﾍ#ﾍ��ﾍﾍﾍ	ﾍ
ﾍﾍﾍﾍ#ﾍ��￻￻￻	￻
￻￻￻￻#￻��"	

$��ﾚﾚﾚﾚﾚﾚﾚﾚﾚ$ﾚ%ﾚ��ﾓﾓﾓﾓﾓﾓﾓﾓﾓ$ﾓ%ﾓ��ﾖﾖﾖﾖﾖﾖﾖﾖﾖ$ﾖ%ﾖ��ﾠﾠﾠﾠﾠﾠﾠﾠﾠ$ﾠ%ﾠ��ﾜﾜﾜﾜﾜﾜﾜﾜﾜ$ﾜ%ﾜ��ﾘﾘﾘﾘﾘﾘﾘﾘﾘ$ﾘ%ﾘ��ﾡﾡﾡﾡﾡﾡﾡﾡﾡ$ﾡ%ﾡ���ﾶ��ﾔﾔﾔﾔﾔﾔﾔﾔﾔ$ﾔ%ﾔ��ﾝﾝﾝﾝﾝﾝﾝﾝﾝ$ﾝ%ﾝ��ﾕﾕﾕﾕﾕﾕﾕﾕﾕ$ﾕ%ﾕ��ﾛﾛﾛﾛﾛﾛﾛﾛﾛ$ﾛ%ﾛ��ﾞﾞﾞﾞﾞﾞﾞﾞﾞ$ﾞ%ﾞ��ﾴﾴﾴﾴﾴﾴ$ﾴ��ﾒﾒﾒﾒﾒﾒﾒﾒﾒ$ﾒ%ﾒ��ﾟﾟﾟﾟﾟﾟﾟﾟﾟ$ﾟ%ﾟ��ﾗﾗﾗﾗﾗﾗﾗﾗﾗ$ﾗ%ﾗ��ﾙﾙﾙﾙﾙﾙﾙﾙﾙ$ﾙ%ﾙ��0�� ��"	

$��ﾷﾷﾷﾷﾷﾷ$ﾷ��$	

 !$��
ﾯﾯ!,"-��ﾰﾰ��ﾪﾪﾪﾶ$ﾪ��)*��ﾱ'ﾱ��ﾳﾳ��(��
ﾩﾩﾩ$ﾩ��$	

 !$��ﾵﾵﾵﾵﾵﾵ$ﾵ��ﾲﾲ��"	

$��"	

$��ﾮ'ﾮ��ﾭ'ﾭ��￼￼￼	￼
￼￼￼￼#￼��4ﾍﾍ	ﾍ
ﾍﾍﾍﾍ#7��￹￹￹	￹
￹￹￹￹#￹��￺￺￺	￺
￺￺￺￺#￺��"	

$��￰￰	￰
￰￰￰￰��￶￶	￶
￶￶￶￶��$8��9��￵￵	￵
￵￵￵￵��;<	D
?GHC��®��«��￯￯	￯
￯￯￯￯��￳￳	￳
￳￳￳￳��	ª��"	

$��￩	￩
￩￩￩￩$￩��￱￱	￱
￱￱￱￱��"ﾐﾐﾐﾐ	ﾐ
ﾐﾐﾐﾐﾐﾐﾐﾐﾐﾐ$ﾐ��"	

$��￴￴	￴
￴￴￴￴��ﾍ	D
?ﾍSC$ﾍ��N��J��￲￲	￲
￲￲￲￲��%K��ﾏﾏ	ﾏ
ﾏﾏﾏMﾏ��￫￫	￫
￫￫￫￫��ﾎﾎ	ﾎ
ﾎﾎﾎﾎ��%O��ﾏﾏ	ﾏ
ﾏﾏﾏMﾏ��￬￬	￬
￬￬￬￬��ﾍm$ﾍ��
ￕￕￕ$ￕ��XYZ��￪	￪
￪￪￪￪$￪��ￗￗ$ￗ��
￘￘S$￘��
ￖￖￖ$ￖ��ￔ$ￔ��ￒ$ￒ��￐$￐��]$\��ﾤﾤﾤﾤﾤﾤ$ﾤ%ﾤ��ﾣﾣﾣﾣﾣﾣ$ﾣ%ﾣ��ￋￋￋ��ￌￌ��cb��ￍￍ��]$\��
ￏￏￏ$ￏ��ￎￎ��]$\��gb��
￑￑￑$￑��]$\��jb��
ￓￓￓ$ￓ��t$o��￈$￈��n��p$o��ﾦﾦ��ﾥ��ￊ��s��￉$￉��ￃﾥ��ￅ��￿t$o��ￆￆ$ￆ��ￇￇ$ￇ��z��ﾍﾍﾍﾍ$ﾍ%ﾍ����ﾼﾼﾼﾼ$ﾼ%ﾼ��￀￀��]ﾾﾾ$\%��ﾺﾺﾺﾺ$ﾺ%ﾺ��ﾍﾍﾍﾍ$ﾍ%ﾍ��]$\��ﾽﾽﾽﾽ$ﾽ%ﾽ��﾿﾿��"	

$��ﾸﾸﾸﾸ$ﾸ%ﾸ��ﾻﾻﾻﾻ$ﾻ%ﾻ��ﾹﾹﾹﾹ$ﾹ%ﾹ��ﾢﾢﾢﾢ$ﾢ%ﾢ��ﾍﾍﾍﾍ$ﾍ%ﾍ��ￄￄ$ￄ��￁￁����ￂￂ$ￂ��ￛￛ��￧	￧
￧￧￧￧$￧��ﾨﾨﾡﾡﾡ$ﾡ��￠��'$��￤ﾒﾒﾒ$ﾒ����￣	￣
￣￣￣￣$￣��ﾨﾨ��￨	￨
￨￨￨￨$￨��$����￟	￟
￟￟￟￟$￟��ￜￜ��ﾧﾧﾡﾡﾡ$ﾡ��￙￙��￞¦��￢ﾒﾒﾒ$ﾒ��'$£��￥	￥
￥￥￥￥$￥��￦	￦
￦￦￦￦$￦��ﾧﾧ��¥��￡	￡
￡￡￡￡$￡��$£��¨��￝	￝
￝￝￝￝$￝��ￚￚ��"ﾑﾑﾑﾑ	ﾑ
ﾑﾑﾑﾑﾑﾑﾑﾑﾑﾑ$ﾑ��%¬��ﾏﾏ	ﾏ
ﾏﾏﾏMﾏ��￭￭	￭
￭￭￭￭��%¯��ﾏﾏ	ﾏ
ﾏﾏﾏMﾏ��￮￮	￮
￮￮￮￮��￸��ﾫ³ﾶ��$	

´$��ﾬ��¶��￷￷￷	￷
￷￷￷￷#￷��ﾍ	D
?ﾍSC$ﾍ��ﾍm$ﾍ��t$o��￾t$o�����¹��0����	?¶@����01����,����������������1=��������������������������,����"$,-#.%/!������=������������"$,.*/!������".,��"-,��������25%4������±°,��9����������D<	?
=EHA@������������"$ ,��������"#,����	?STP Q"U����������K��������O����jk���������� V����7g��8d��9Z��
!_']*`+^��������������']*c+^������
!e']*`+^������
!h']*`+^������uv&t������&p������:q������<��;x��w&t��������
}z|{��������'����)��']+������(,����������}{����������������5��#��3����������������������6¦��4£��$¡������������¨������������¬������¯����2´��=��,��������	?ST· Q"U��¸k��¹v&t��w&t�� java_cup/parser java_cup/runtime/lr_parser java/lang/Exception (Ljava_cup/parser;)V CUP$parser$do_action symbolFactory *(Ljava_cup/runtime/ComplexSymbolFactory;)V 
next_token done_parsing java_cup/ErrorManager 
getManager ()Ljava_cup/ErrorManager; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; 
emit_fatal .(Ljava/lang/String;Ljava_cup/runtime/Symbol;)V 	cur_token Ljava_cup/runtime/Symbol; java/lang/System exit (I)V 
emit_error unpackFromStrings ([Ljava/lang/String;)[[S ! # $     % &    ' &    ( &    ) *    + ,     - .  /   /     *� �    0        1        2 3    - 4  /   :     *+� �    0        1        2 3      5 6   - 7  /   E     *+,� �    0        1         2 3      5 6     8 9   : ;  /   .     � �    0       E 1        2 3    < ;  /   .     � �    0      ! 1        2 3    = ;  /   .     � �    0      w 1        2 3    > .  /   ;     *� Y*� � 	�    0   
    � 1        2 3    ? @  /   _     *� 	,-� 
�    0      � 1   4     2 3      A B     C D     E F     G B  H     I  J K  /   ,     �    0      � 1        2 3    L K  /   ,     �    0      � 1        2 3    M K  /   ,     �    0      � 1        2 3    N K  /   ,     �    0      � 1        2 3    O .  /   Z     � Y� L*+� *� Y+� � �    0      � � � � 1        2 3     P Q  H     I  R S  /   2     *� � �    0      � 1        2 3   H     I  T U  /   �     M*� ,� � #� � Y� +� � � ,� � �  � � Y� +� � � *� � � �    0      � � +� H� L� 1        M 2 3     M V W    M X Y   Z U  /   k     !,� � � +,� � � � +*� � �    0      � � �  � 1        ! 2 3     ! V W    ! X Y   [ .  /   N      .� YS�  � � Y!S�  � � Y"S�  � �    0         H $  \    ]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  deps/java_cup/production.class                                                                      0000666 0002035 0002035 00000024501 14202043766 016024  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1�
 { �	 4 �	 4 �	 4 �	 4 �	 4 
  �	 4	 4
 
 
 4	
  �
 

 
 b
 	 4
 4
 4	 4
 

 
 
 $
 $	 4
 4	 4	 4 	 4!"
 +#
 y$
 b%
 4&
 4'
 4(
 y)
 y*+
 y,
 y-.
 4/
01
02345
06789:
 ;<=>?@ABCDEFGHI
 J	0K
L
M
 4N
 4O
 4P
 4Q
 bR	 bST
 \U
 4V
 4W
 4X
YZ
 bW
 b[
 \
 ]
 4[
 4^_
 4`a
 bcd
 ef
 4ghijk
 lmno
 y �p _all Ljava/util/Hashtable; 
next_index I _lhs Ljava_cup/symbol_part; 	_rhs_prec 
_rhs_assoc _rhs [Ljava_cup/production_part; _rhs_length _action Ljava_cup/action_part; _index _num_reductions _nullable_known Z 	_nullable 
_first_set Ljava_cup/terminal_set; <init> H(Ljava_cup/non_terminal;[Ljava_cup/production_part;ILjava/lang/String;)V Code LineNumberTable LocalVariableTable this Ljava_cup/production; lhs_sym Ljava_cup/non_terminal; 	rhs_parts rhs_l 
action_str Ljava/lang/String; i tail_action declare_str rightlen 
Exceptions 6(Ljava_cup/non_terminal;[Ljava_cup/production_part;I)V J(Ljava_cup/non_terminal;[Ljava_cup/production_part;ILjava/lang/String;II)V prec_num 	prec_side 8(Ljava_cup/non_terminal;[Ljava_cup/production_part;III)V all ()Ljava/util/Enumeration; find (I)Ljava_cup/production; indx clear ()V number ()I lhs ()Ljava_cup/symbol_part; precedence_num precedence_side set_precedence_num (I)V set_precedence_side rhs (I)Ljava_cup/production_part; 
rhs_length action ()Ljava_cup/action_part; index num_reductions note_reduction_use nullable_known ()Z nullable 	first_set ()Ljava_cup/terminal_set; is_id_start (C)Z c C 
is_id_char make_declaration 9(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String; ret 	labelname 
stack_type offset declare_labels B([Ljava_cup/production_part;ILjava/lang/String;)Ljava/lang/String; label part rhs_len final_action declaration pos merge_adjacent_actions ([Ljava_cup/production_part;I)I len from_loc to_loc 	merge_cnt strip_trailing_action 4([Ljava_cup/production_part;I)Ljava_cup/action_part; result remove_embedded_actions new_nt new_prod act_loc lastLocation check_nullable sym Ljava_cup/symbol; Ljava_cup/production_part; set_nullable (Z)Z v check_first_set equals (Ljava_cup/production;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode toString ()Ljava/lang/String; e Ljava_cup/internal_error; to_simple_string <clinit> 
SourceFile production.java � � �  �  �  � � � � java_cup/terminal_set � � �  java_cup/internal_error 1Attempt to construct a production with a null LHS �qr � � � java/lang/StringBuilderst � �u � java_cup/symbol_part �v � � � � � � java_cup/production_part � �wxy java_cup/terminal � � � �  z � 		 java_cup/action_part � � � � ~  �  | } java/lang/Integer � �{|}~ � � � � � � ��� java_cup/production � �� � 4Index out of range for right hand side of production � ��� �� � 		int  !left = ((java_cup.runtime.Symbol) stack�� .peek() .elementAt( top -s� ) ).left;
 "right = ((java_cup.runtime.Symbol) 	).right;
 		Location  >xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol) 	).xleft;
 ?xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol) 
).xright;
    = ( )(( java_cup.runtime.Symbol)  	).value;
 � �� �� � � � � � � � � � � ���� � java_cup/action_production �� � � � � � �� � java_cup/non_terminal � ����� � � production [ � � ]:  � � $$NULL-LHS$$  :: = s� ; � �  { } 
[NULLABLE] [NOT NULLABLE]� � NULL_LHS  ::=  java/util/Hashtable java/lang/Object (Ljava/lang/String;)V 	is_action append -(Ljava/lang/String;)Ljava/lang/StringBuilder; note_use (Ljava_cup/symbol;)V 
the_symbol ()Ljava_cup/symbol; java_cup/symbol code_string put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; add_production (Ljava_cup/production;)V elements get &(Ljava/lang/Object;)Ljava/lang/Object; size java_cup/emit 	lr_values 	locations pre &(Ljava/lang/String;)Ljava/lang/String; (I)Ljava/lang/StringBuilder; _xmlactions name 
create_new =(Ljava/lang/String;Ljava/lang/String;)Ljava_cup/non_terminal; is_embedded_action ^(Ljava_cup/production;Ljava_cup/non_terminal;[Ljava_cup/production_part;ILjava/lang/String;I)V is_non_term add (Ljava_cup/terminal_set;)Z (Ljava_cup/terminal;)Z -(Ljava/lang/Object;)Ljava/lang/StringBuilder; crash ! 4 {     | }    ~     � �    �     �     � �    �     � �    �     �     � �    � �    � �   &  � �  �  �  	  �*� *� *� *� *� *� *� Y� � 	6� *� 
� ,� *,�� 
� *� 
+� � Y� �� ,d2� � d6� 6*,� :� 
:� � Y� � � � :+� *� Y+� � **,*� 
� � 
*,*� 
� :� *Y� 
d� 
**� 
� � 6*� 
� r*� ,2S*� 2� � T*� 2� � � *� 2� � � � 1**� 2� � � � � **� 2� � � �  � ����� !:� )� "� !� Y� � #� � "� � :*� $Y� %� &*� '*� (Y`� (� )� *� +Y*� )� ,*� -W+*� .�    �   � .   >  	 @ K S ] ( B + E / F 7 G ; H D J I M M N W [ [ \ f ] n _ q d | g � h � j � m � p � s � v � w �  � � � � � � � �' �> �U �[ �d �q �� �� �� �� �� �� � �   \ 	  � � �    � � �   � � �   � �    � � �  � � �   �  � �  |J � �  +� �   �       � �  �   U     	*+,� /�    �   
    �  � �   *    	 � �     	 � �    	 � �    	 �   �       � �  �   �     *+,� /*� 0*� 1�    �       � 	 �  �  � �   H     � �      � �     � �     �      � �     �      �   �       � �  �   }     *+,� /*� 0*� 1�    �       �  �  �  � �   >     � �      � �     � �     �      �      �   �      	 � �  �         � *� 2�    �       � 	 � �  �   <     � *� +Y� ,� 3� 4�    �       � �        �    	 � �  �   +      � *� 5� (�    �       �  � 
 � 	 � �  �         � *� 6�    �       �  � �  �   /     *� �    �       � �        � �    � �  �   /     *� �    �       �        � �    � �  �   /     *� �    �       �        � �    � �  �   >     *� �    �   
     �        � �      �    � �  �   >     *� �    �   
     �        � �      �    � �  �   Y     � *� 
� 
*� 2�� Y7� �    �         �        � �      �   �       � �  �   /     *� 
�    �      ' �        � �    � �  �   /     *� &�    �      3 �        � �    � �  �   /     *� )�    �      ; �        � �    � �  �   /     *� �    �      C �        � �    � �  �   5     *Y� `� �    �      F �        � �    � �  �   /     *� �    �      N �        � �    � �  �   /     *� �    �      V �        � �    � �  �   /     *� 	�    �      b �        � �    � �  �   N     $a� 	z� A� 	Z� 	_� � �    �      m �       $ � �    � �  �   C     � 8� 0� 9� � �    �      y �        � �    � �  �  K    Ѹ 9�W� :� �� Y� ;� +� <� =� >� � ?� (� Y� @� A� >� B� � CD� � � E� ;� +� F� =� >� � ?� (� Y� @� A� >� B� � CD� � � G� � :� �� Y� H� +� I� =� >� � ?� (� Y� @� A� >� B� � CD� � � J� H� +� K� =� >� � ?� (� Y� @� A� >� B� � CD� � � L� � :� !:� Y� � #� ,� M� +� N� ,� O� P� =� >� � ?� (� Y� @� A� >� B� � CD� � � Q� � �    �      � � � ��Z�^� �   H  �  � � W  � �   � � �    � � �   � � �   � �  ^ s � �   � �  �    	   �!:6� v+2� � f+2� :� RY:� 	� S� L� � Y� � � T� � C� :� Y� � *� � Udd� V� � :�����    �   & 	  � � � �  � 1� R� z� �� �   R  ( R � �    Z � �    � � �     � � �    � �     � � �    � �   | �    � �  �  3     �+� � �66>� �� +2� � +2� � �� +S� X+2� J+2� � @+2� � 7+� $Y� Y� +2� $� "� +2� $� "� � � %S�� 
++2S���wd�    �   :   � 
� � � � /� 2� =� C� ]� �  � �� � �   >    � � �     � � �    � �    � �    � �    � �    � �  �   �     (+� � �+d2� � +d2� $N+dS-��    �       
 " # $$ &' �   *    � �    ( � �     ( � �    ( �    � �  �   	    �66*� W� �*� X� � o**� !� N*� Y� � U� ZL+� [� \Y*+� Y� -� *� X� $� "� � � � d� ]M*� � Y+� S6���|�    �   .   D F G K (N 7O <R tV �W �F �Y �   >  7 P � �  t  � �  ( _ � �   � �     � � �    � �   �       � �  �   �     ]*� ^� *� _�*� W� 	*� `�>*� W� 7*� XL+� � $+� � M,� a� 	*� `�,� b� c� �����*� `�    �   6   i l o s #u )x 0z 8} ?~ E� O� Qs W� �   *  8  � �  ) . � �    ] � �    B �   �        � �  �   H     *� *� �    �      � � 
� �        � �      � �   � �  �   �     ^<*� W� R*� X� � A*� X� � M,� a� *� 	,� b� d� eW,� b� c� � *� 	,� � fW� 	����*� g�    �   .   � 
� � !� (� 7� A� D� P� S� Y� �      ! 2 � �    ^ � �    \ �   �       � �  �   O     +� �+� )*� )� � �    �   
   � � �        � �      � �   � �  �   N     +� 4� �*+� 4� h�    �      � � 	� �        � �      � �   � �  �   2     *� )h�    �      � �        � �    � �  �  �    � Y� i� *� j� Ck� � L� Y� +� *� Y� *� Y� l� m� � L� Y� +� n� � L=*� W� %� Y� +� *� X� oM� � L���ٻ Y� +� p� � L*� q� 0*� q� "� &� Y� +� r� *� q� "� s� � L*� ^� 5*� _� � Y� +� t� � L� � Y� +� u� � L� 
M,� vL+�      �   J   � � A� U� _� {� �� �� �� �� �� �� �����
�� �   *  W * �    � �    � �    � � �   � �  �   �     m*� Y� *� Y� � T� wL� Y� +� x� � L=*� W� 9*� X� � (� Y� +� *� X� � � T� M� � L����+�    �        + 5 @ e k	 �      - > �     m � �    V � �  �       � �  �   #      � yY� z� *�    �       �  �    �                                                                                                                                                                                               deps/java_cup/production_part.class                                                                 0000666 0002035 0002035 00000002254 14202043766 017053  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 9
  '	  (
  )
 * + ,
  -
 * . /
  '
  0 1
  2 3 4 _label Ljava/lang/String; <init> (Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Ljava_cup/production_part; lab label ()Ljava/lang/String; 	is_action ()Z equals (Ljava_cup/production_part;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode ()I toString 
SourceFile production_part.java  5     6    java_cup/production_part   " # java/lang/StringBuilder 7 8 : $    java/lang/Object ()V java/lang/String append -(Ljava/lang/String;)Ljava/lang/StringBuilder;!                   F     
*� *+� �              	         
       
           /     *� �           %                        f     &+� �*� � *� +� � �+� � � �           5  8  9  ;        &       &            N     +� � �*+� � �           C  D 	 F                 !   " #     =     *� � � 
*� � �           N              $      S     !*� � � Y� 	*� � 
� 
� ��           V  W  Y        !      %    &                                                                                                                                                                                                                                                                                                                                                    deps/java_cup/reduce_action.class                                                                   0000666 0002035 0002035 00000002671 14202043766 016446  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 E
  , - .
  /	  0
  1 2
  3
 4 5 6
 
 , 7
 
 8
 4 9
 
 : ;
 
 < = _reduce_with Ljava_cup/production; <init> (Ljava_cup/production;)V Code LineNumberTable LocalVariableTable this Ljava_cup/reduce_action; prod 
Exceptions reduce_with ()Ljava_cup/production; kind ()I equals (Ljava_cup/reduce_action;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode toString ()Ljava/lang/String; 
SourceFile reduce_action.java  > java_cup/internal_error 8Attempt to create a reduce_action with a null production  ?     java_cup/reduce_action " # @ ' ! java/lang/StringBuilder REDUCE(with prod  A B C ! A D ) ( ) java_cup/parse_action ()V (Ljava/lang/String;)V java_cup/production append -(Ljava/lang/String;)Ljava/lang/StringBuilder; index (I)Ljava/lang/StringBuilder; !                   \     *� +� � Y� �*+� �                                                   /     *� �           &                !     ,     �           -              " #     I     +� +� *� � � �           4                $    " %     N     +� � *+� � ��           <  =  ?                $ &   ' !     2     *� � 	�           H              ( )     I     � 
Y� � *� � � � � �           O              *    +                                                                       deps/java_cup/shift_action.class                                                                    0000666 0002035 0002035 00000002650 14202043766 016311  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 E
  , - .
  /	  0
  1 2
  3
 4 5 6
 
 , 7
 
 8
 4 9
 
 : ;
 
 < = 	_shift_to Ljava_cup/lalr_state; <init> (Ljava_cup/lalr_state;)V Code LineNumberTable LocalVariableTable this Ljava_cup/shift_action; shft_to 
Exceptions shift_to ()Ljava_cup/lalr_state; kind ()I equals (Ljava_cup/shift_action;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode toString ()Ljava/lang/String; 
SourceFile shift_action.java  > java_cup/internal_error 0Attempt to create a shift_action to a null state  ?     java_cup/shift_action " # @ ' ! java/lang/StringBuilder SHIFT(to state  A B C ! A D ) ( ) java_cup/parse_action ()V (Ljava/lang/String;)V java_cup/lalr_state append -(Ljava/lang/String;)Ljava/lang/StringBuilder; index (I)Ljava/lang/StringBuilder; !                   \     *� +� � Y� �*+� �                                                   /     *� �           &                !     ,     �           -              " #     I     +� +� *� � � �           4                $    " %     N     +� � *+� � ��           <  =  ?                $ &   ' !     2     *� � 	�           H              ( )     I     � 
Y� � *� � � � � �           N              *    +                                                                                        deps/java_cup/sym.class                                                                             0000666 0002035 0002035 00000005657 14202043766 014461  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 � � � WITH I ConstantValue    CODE_STRING   # PARSER    SEMI    INIT   	 STAR    SCAN   
 BAR    LT    COMMA    NON    CLASS   ! CODE    DOT    ID   " LEFT    EOF     SUPER    error    START    NONTERMINAL    ACTION    LBRACK    IMPORT    COLON    RBRACK    PACKAGE    NONASSOC    EXTENDS     
PRECEDENCE    QUESTION    PERCENT_PREC    TERMINAL    RIGHT    GT    COLON_COLON_EQUALS    NT$3   1 empty NT$2   0 NT$1   / NT$0   . package_spec 
class_name precedence_list wildcard   - production_list action_code_part 
production 	opt_label   ' nt_id   $ parser_code_part type_id spec terminal_id   ( precedence_l symbol import_spec 
start_spec multipart_id declares_non_term NT$13   ; term_name_list NT$12   : NT$11   9 NT$10   8 import_list 	init_code typearguement   , 	code_part new_non_term_id declares_term preced term_id   ) rhs label_id   & opt_semi prod_part_list 	robust_id   * typearglist   + new_term_id 	prod_part 
code_parts 	scan_code symbol_list terminal_list non_term_name_list 	import_id NT$9   7 	symbol_id   % NT$8   6 NT$7   5 NT$6   4 rhs_list non_terminal NT$5   3 NT$4   2 
SourceFile sym.java java_cup/sym java/lang/Object     `                    	       
                                                                                                      !       "  #       $  %       &  '       (  )       *  +       ,  -       .  /       0  1       2  3       4  5       6  7       8  9       :  ;       <  =       >  ?       @  A       B  C       D  E       F  G       H  I       J  K       L  M       N  O       J  P       Q  R       S  T       U  V       *  W         X         Y       Z  [         \       4  ]       $  ^       _  `       a  b         c       L  d       &  e       f  g       >  h       6  i         j         k       ,  l       "  m       n  o         p       q  r       s  t       u  v       :  w         x       y  z       0  {       2  |         }       B  ~         �       .  �       �  �       
  �       H  �       �  �       �  �       D  �       <  �         �          �         �       (  �       @  �         �       �  �       �  �       �  �       �  �       �  �       8  �       F  �       �  �       �    �    �                                                                                 deps/java_cup/symbol.class                                                                          0000666 0002035 0002035 00000002205 14202043766 015140  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 4
  )	 
 * + ,	 
 -	 
 .
 
 /	 
 0
 
 1 2 3 _name Ljava/lang/String; _stack_type 
_use_count I _index <init> '(Ljava/lang/String;Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Ljava_cup/symbol; nm tp (Ljava/lang/String;)V name ()Ljava/lang/String; 
stack_type 	use_count ()I note_use ()V index is_non_term ()Z toString 
SourceFile symbol.java  "     Object           java_cup/symbol java/lang/Object! 
                         	        x     "*� *� +� L,� M*+� *,� �             D 	     !  " ! #         "       "      "           ?     *+� �       
    ,  -                          /     *� �           7                    /     *� �           ?                     /     *� �           G              ! "     5     *Y� `� �           J              #       /     *� �           X             $ %    &      /     *� 	�           f              '    (                                                                                                                                                                                                                                                                                                                                                                                           deps/java_cup/terminal.class                                                                        0000666 0002035 0002035 00000005316 14202043766 015454  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 ' Y	  Z
 % [ \ ]
  ^ _
  ` a
  b
  c
  d	  e	  f	  g	  h	  i j
  k
  l
  Y
 % m n /
  c	  o 1	  p
 % q
 % r
 % s
 ' t u
  v
  w x y
 % ^ z _precedence_num I _precedence_side _all Ljava/util/Hashtable; _all_by_index 
next_index EOF Ljava_cup/terminal; error <init> )(Ljava/lang/String;Ljava/lang/String;II)V Code LineNumberTable LocalVariableTable this nm Ljava/lang/String; tp precedence_side precedence_num conflict Ljava/lang/Object; '(Ljava/lang/String;Ljava/lang/String;)V (Ljava/lang/String;)V clear ()V all ()Ljava/util/Enumeration; find '(Ljava/lang/String;)Ljava_cup/terminal; 	with_name (I)Ljava_cup/terminal; indx the_indx Ljava/lang/Integer; number ()I is_non_term ()Z toString ()Ljava/lang/String; set_precedence (II)V p new_prec <clinit> 
SourceFile terminal.java 2 ? + , { | java_cup/internal_error java/lang/StringBuilder 2 B Duplicate terminal ( } ~ 	) created P Q 2 @  B . ) � ) ( ) * ) - , java/lang/Integer 2 � 2 3 A B java_cup/terminal / 0 1 0 � D � � � M P Q [ � M } � ] java/util/Hashtable java_cup/symbol put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; crash _index (I)V elements get &(Ljava/lang/Object;)Ljava/lang/Object; size index (I)Ljava/lang/StringBuilder; !  '     ( )    * )    + ,    - ,    . )   	 / 0   	 1 0     2 3  4   �     c*+,� � +*� :� %� Y� Y� � +� 	� � 
� � *� Y`� � *� *� � � Y*� � *� W�    5   & 	        !  & 7 ) D , J - O 0 b 1 6   >    c 7 0     c 8 9    c : 9    c ; )    c < )   S = >   2 ?  4   K     	*+,� �    5   
    :  ; 6        	 7 0     	 8 9    	 : 9   2 @  4   ?     *+� �    5   
    D  E 6        7 0      8 9  	 A B  4   U      )� � � � � � Y� � � Y� � �    5       Y  Z  [  \  ] ( ^ 	 C D  4         � � �    5       a 	 E F  4   C     *� �� *� � �    5       f  g  i 6        G 9   	 E H  4   L     � Y� L� +� � �    5   
    u 	 w 6        I )   	  J K  	 L M  4         � � �    5       }  N O  4   ,     �    5       � 6        7 0    P Q  4   M     #� Y� *�  � !� *� "� #$� � 
�    5       � 6       # 7 0    < M  4   /     *� �    5       � 6        7 0    ; M  4   /     *� �    5       � 6        7 0    R S  4   Q     *� *� �    5       �  � 
 � 6         7 0      T )     U )   V B  4   Y      1� %Y� &� � %Y� &� � � Y� � � Y� � �    5       U 
 p  �  � $ �  W    X                                                                                                                                                                                                                                                                                                                  deps/java_cup/symbol_part.class                                                                     0000666 0002035 0002035 00000003321 14202043766 016166  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 N
  3 4 5
  3	 
 6
 
 7
  8
 
 9
 : ; <
 
 =
  >
 : > ?
  @
  A
  B
  C
  D E F _the_symbol Ljava_cup/symbol; <init> &(Ljava_cup/symbol;Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Ljava_cup/symbol_part; sym lab Ljava/lang/String; 
Exceptions (Ljava_cup/symbol;)V 
the_symbol ()Ljava_cup/symbol; 	is_action ()Z equals (Ljava_cup/symbol_part;)Z other (Ljava/lang/Object;)Z Ljava/lang/Object; hashCode ()I toString ()Ljava/lang/String; 
SourceFile symbol_part.java  G java_cup/internal_error 5Attempt to construct a symbol_part with a null symbol     ( H $ % I ( + java_cup/symbol_part ( ) - . java/lang/StringBuilder  J / 0 K L K M / 0 $$MISSING-SYMBOL$$ java_cup/production_part (Ljava/lang/String;)V (Ljava_cup/production_part;)Z java/lang/Object ()V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; ! 
                  g     *,� +� � Y� �*+� �              	                              !  "        #     ?     *+� �       
    &  '                   "       $ %     /     *� �           1              & '     ,     �           8              ( )     T      +� *+� � *� +� � 	� � �           ?                  *    ( +     N     +� 
� �*+� 
� �           H  I 	 K                * ,   - .     B     *� *� � � 
*� � ��           S              / 0     i     7*� � � Y� *� � *� � � �� Y� *� � � � �           \  ]   _        7      1    2                                                                                                                                                                                                                                                                                                               deps/java_cup/symbol_set.class                                                                      0000666 0002035 0002035 00000006445 14202043766 016025  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 $ T U
  V	  W
  X
  Y
  Z
  [ \ ]
 	 ^
  _
  `
  a b c b d e
  f
  g
  h
  i
  j
  k
  [
 	 l m
  n
 $ o p q
  T
  r s
  t u v _all Ljava/util/Hashtable; <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/symbol_set; (Ljava_cup/symbol_set;)V other 
Exceptions all ()Ljava/util/Enumeration; size ()I not_null (Ljava/lang/Object;)V obj Ljava/lang/Object; contains (Ljava_cup/symbol;)Z sym Ljava_cup/symbol; is_subset_of (Ljava_cup/symbol_set;)Z e Ljava/util/Enumeration; is_superset_of add previous remove (Ljava_cup/symbol;)V result Z equals Ljava_cup/internal_error; (Ljava/lang/Object;)Z hashCode I cnt toString ()Ljava/lang/String; Ljava/lang/String; 
comma_flag 
SourceFile symbol_set.java ' ( java/util/Hashtable ' w % & 5 6 x y z 2 3 4 java_cup/internal_error !Null object used in set operation ' { | O } J 1 2 ~  � � y java_cup/symbol 9 : = > � � D � B : D E � ( java_cup/symbol_set H > K 4 { java/lang/StringBuilder � � ,  N O } java/lang/Object (I)V clone ()Ljava/lang/Object; elements (Ljava/lang/String;)V name containsKey java/util/Enumeration hasMoreElements ()Z nextElement put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; &(Ljava/lang/Object;)Ljava/lang/Object; crash append -(Ljava/lang/String;)Ljava/lang/StringBuilder; !  $     % &     ' (  )   D     *� *� Y� � �    *         &   +        , -    ' .  )   i     %*� *� Y� � *+� *+� � � � �    *         &     $  +       % , -     % / -  0     	  1 2  )   2     *� � �    *       ) +        , -    3 4  )   2     *� � �    *       , +        , -    5 6  )   K     +� � 	Y
� ��    *       8  9  : +        , -      7 8  0     	  9 :  )   @     *� +� � �    *       A +        , -      ; <   = >  )   u     '*+� *� M,�  � +,�  � � �����    *       J  M  N # O % R +      
  ? @    ' , -     ' / -  0     	  A >  )   C     *+� +*� �    *   
    \  ] +        , -      / -  0     	  B :  )   b     *+� *� +� +� M,� � �    *       j  m  p +         , -      ; <   
 C 8  0     	  D E  )   N     *+� *� +� � W�    *       z  {  | +        , -      ; <  0     	  B >  )   �     4=*+� +� N-�  �  *-�  � � � � � =����    *       �  �  �  � 2 � +   *   & ? @    4 , -     4 / -   2 F G  0     	  D .  )   n     $*+� +� M,�  � *,�  � � ���    *       �  �  � # � +      
  ? @    $ , -     $ / -  0     	  H >  )   t     +� +� *� � �*+� �M,� �     	  *       �  �  �  �  � +        ? I     , -      / -   H J  )   N     +� � �*+� � �    *       �  � 	 � +        , -      / 8   K 4  )   �     .<*� N=-�  � � -�  � � �<�����    *       �  �  � & � , � +   *    . , -    , F L  	 % M L   ' ? @   N O  )   �     gL=*� N-�  � A� � Y� +�  !�  � "L� =� Y� +�  -�  � � �  � "L���� Y� +�  #�  � "L+�    *   & 	   �  �  �  �  � . � 0 � Q � e � +   *  
 G ? @    g , -    d F P   b Q G   R    S                                                                                                                                                                                                                           deps/java_cup/terminal_set.class                                                                    0000666 0002035 0002035 00000005774 14202043766 016337  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
   P Q
 R S
  T	  U
  V
  W X Y
  Z	  [
  \
 R ]
  ^
  _
  `
  a
  b
  c
  d e f g
  P
  h i
  j
 R k
 R l m
  P n EMPTY Ljava_cup/terminal_set; 	_elements Ljava/util/BitSet; <init> ()V Code LineNumberTable LocalVariableTable this (Ljava_cup/terminal_set;)V other 
Exceptions not_null (Ljava/lang/Object;)V obj Ljava/lang/Object; empty ()Z contains (Ljava_cup/terminal;)Z sym Ljava_cup/terminal; (I)Z indx I is_subset_of (Ljava_cup/terminal_set;)Z 
copy_other is_superset_of add result Z remove (Ljava_cup/terminal;)V copy 
intersects equals (Ljava/lang/Object;)Z toString ()Ljava/lang/String; t Ljava/lang/String; 
comma_flag <clinit> 
SourceFile terminal_set.java % & java/util/BitSet o p q % r # $ . / s t java_cup/internal_error !Null object used in set operation % u ! " F < v q w 8 x y F G ; < z r { r E | java_cup/terminal_set { java/lang/StringBuilder } ~ ,  H I  � � I } java/lang/Object java_cup/terminal number ()I (I)V clone ()Ljava/lang/Object; (Ljava/lang/String;)V index get or (Ljava/util/BitSet;)V set clear (Ljava/util/BitSet;)Z append -(Ljava/lang/String;)Ljava/lang/StringBuilder; find (I)Ljava_cup/terminal; name !        ! "    # $     % &  '   E     *� *� Y� � � �    (            )        * "    % +  '   X     *� *+� *+� � � � �    (          	    ! )        * "      , "  -       . /  '   K     +� � Y	� 
��    (       ;  <  = )        * "      0 1  -       2 3  '   2     *� � �    (       D )        * "    4 5  '   I     *+� *� +� � �    (   
    O  P )        * "      6 7  -       4 8  '   =     	*� � �    (       Z )       	 * "     	 9 :   ; <  '   k     !*+� +� � � M,*� � ,+� � �    (       e  h  k  n )        ! * "     ! , "    = $  -       > <  '   C     *+� +*� �    (   
    y  z )        * "      , "  -       ? 5  '   p     "*+� *� +� � =� *� +� � �    (       �  �  �  �   � )        " * "     " 6 7    @ A  -       B C  '   M     *+� *� +� � �    (       �  �  � )        * "      6 7  -       ? <  '   v     ,*+� *� � � M*� +� � *� ,� � � �    (       �  �  �  � )        , * "     , , "    D $  -       E <  '   I     *+� *� +� � �    (   
    �  � )        * "      , "  -       F <  '   N     +� �*� +� � �    (       �  �  � )        * "      , "   F G  '   N     +� � �*+� � �    (       �  � 	 � )        * "      , 1   H I  '   �     kL=>� � J*� � � 9� � Y� +� � � L� =� Y� +� � � � � L����� Y� +� � � L+�    (   .    �  �  �  �  �  � 4 � 6 � O � U � i � )   *   N J :    k * "    h @ K   f L A   M &  '   #      � Y� � �    (       (  N    O    deps/java_cup/version.class                                                                         0000666 0002035 0002035 00000001252 14202043766 015321  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 &
      major I ConstantValue     minor    update Ljava/lang/String; ! version_str " 	title_str # 
author_str $ program_name % <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/version; 
SourceFile version.java   java_cup/version java/lang/Object b beta 20140226 v0.11b beta 20140226 #CUP v0.11b ${cupversion} (SVN rev ) DScott E. Hudson, Frank Flannery, Michael Petter and C. Scott Ananian java_cup !                       	  
                                                    /     *� �                                                                                                                                                                                                                                                                                                                                                                                   deps/java_cup/anttask/                                                                              0000777 0002035 0002035 00000000000 14222102116 014235  5                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  deps/java_cup/anttask/CUPTask.class                                                                 0000666 0002035 0002035 00000024107 14202043766 016557  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1�
 s �	 r �	 r �	 r �	 r 	 r	 r	 r	 r	 r	 r	 r	 r	 r		 r
	 r	 r	 r	 r	 r	 r	 r	 r	 r	 r	 r
  � v !"#$%&'()*+,-./
 r012
 r34
567
 < �8
 <9
 <:;
 A<
 A=>
 A?@AB
 ACDE
 AFG
 <HIJKLMNO
 APQR
 W<STUVW
XYZ[\]
 c<
 b^
 b_
 b`a
 ]bc
 ]d
 ]ef
 ]g
 ]hijkl srcfile Ljava/lang/String; parser _package symbols destdir 
_interface Z nonterms expect compact_red nowarn 	nosummary progress dump_grammar dump_states dump_tables dump time debug nopositions 
xmlactions genericlabels 	locations 	noscanner force quiet <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/anttask/CUPTask; execute 
parserfile Ljava/io/File; symfile cupfile i I e Ljava/lang/Exception; sc Ljava/util/List; packagename dest args [Ljava/lang/String; 
Exceptions inspect &(Ljava/lang/String;)Ljava/lang/String; result line br Ljava/io/BufferedReader; ioe Ljava/io/IOException; getQuiet ()Z setQuiet (Z)V argquiet getForce setForce argforce 
getPackage ()Ljava/lang/String; 
setPackage (Ljava/lang/String;)V arg_package 
getDestdir 
setDestdir isInterface setInterface arg_interface 
getSrcfile 
setSrcfile 
newSrcfile 	getParser 	setParser 	argParser 
getSymbols 
setSymbols 
argSymbols 
isNonterms setNonterms argNonterms 	getExpect 	setExpect 	argExpect isCompact_red setCompact_red argCompact_red isNowarn 	setNowarn 	argNowarn isNosummary setNosummary argNosummary 
isProgress setProgress argProgress isDump_grammar setDump_grammar argDump_grammar isDump_states setDump_states argDump_states isDump_tables setDump_tables argDump_tables isDump setDump argDump isTime setTime argTime isDebug setDebug argDebug isNopositions setNopositions argNopositions isLocations setLocations argLocations isNoscanner setNoscanner argNoscanner isXmlactions setXmlactions isGenericlabels setGenericlabels 
SourceFile CUPTask.java � � t u v u w u x u y u z { | { } u ~ {  { � { � { � { � { � { � { � { � { � { � { � { � { � { � { � { java/util/ArrayList -parsermno -package -symbols sym -expect 
-interface 	-nonterms -compact_red -nowarn 
-nosummary 	-progress -dump_grammar -dump_states -dump_tables -dump -time -debug -nopositions 
-locations -genericlabels -xmlactions 
-noscanner +This is CUP v0.11b ${cupversion} (SVN rev )p � NAuthors : Scott E. Hudson, Frank Flannery, Michael Petter and C. Scott Ananian Bugreports to petter@cs.tum.edu � � user.dirqr � java/lang/StringBuilder =No destination directory specified; using working directory: stu � java/io/File � �v � 6Destination directory didn't exist; creating new one: w � Oanyway, this generation will be processed because of option force set to "true" 'checking, whether this run is necessary .java �x ,Either Parserfile or Symbolfile didn't exist &Parserfile and symbolfile are existingyz Parserfile s{  isn't actual 
 is actual Symbolfile  
Symbolfile skipping generation of  #use option force="true" to override -destdir| � #org/apache/tools/ant/BuildException 6Input file needed: Specify <cup srcfile="myfile.cup">  Input file not found: srcfile=" " }~ java/lang/String���� java/lang/Exception  CUP error occured int CUP task:  java/io/BufferedReader java/io/FileReader ��� �� � package�� ;���� file.separator���� java/io/IOException   java_cup/anttask/CUPTask org/apache/tools/ant/Task java/util/List add (Ljava/lang/Object;)Z log java/lang/System getProperty append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString exists mkdirs '(Ljava/lang/String;Ljava/lang/String;)V lastModified ()J -(Ljava/lang/Object;)Ljava/lang/StringBuilder; getAbsolutePath size ()I get (I)Ljava/lang/Object; java_cup/Main main ([Ljava/lang/String;)V (Ljava/io/Reader;)V ready readLine 
startsWith (Ljava/lang/String;)Z indexOf (Ljava/lang/String;)I 	substring (II)Ljava/lang/String; charAt (I)C replace (CC)Ljava/lang/String; ! r s     t u    v u    w u    x u    y u    z {    | {    } u    ~ {     {    � {    � {    � {    � {    � {    � {    � {    � {    � {    � {    � {    � {    � {    � {    � {   5  � �  �       �*� *� *� *� *� *� *� *� *� 	*� 
*� *� *� *� *� *� *� *� *� *� *� *� *� *� *� *� �    �   j    &  ( 	 )  *  +  ,  - " . ' / , 0 1 1 6 2 ; 3 @ 4 E 5 J 6 O 7 T 8 Y 9 ^ : c ; h < m = r > w ? | @ �       � � �    � �  �  Y    �� Y� L*� � +�  W+*� �  W� 	*� *� � + �  W+*� �  W*� � +!�  W+*� �  W� 	*"� *� 	� +#�  W+*� 	�  W*� � +$�  W*� � +%�  W*� 
� +&�  W*� � +'�  W*� � +(�  W*� � +)�  W*� � +*�  W*� � ++�  W*� � +,�  W*� � +-�  W*� � +.�  W*� � +/�  W*� � +0�  W*� � +1�  W*� � +2�  W*� � +3�  W*� � +4�  W*� � 	*5� 6*� � 	*7� 6*� � 	*8� 6**� � 9M*� � -*:� ;� *� � *� <Y� =>� ?*� � ?� @� 6� AY� <Y� =*� � ?,� ?� @� BN-� C� 5*� � !*� <Y� =D� ?*� � ?,� ?� @� 6-� EW*� ��*� � *� � *F� 6� *� � 	*G� 6� AY� <Y� =*� � ?,� ?� @� <Y� =*� � ?H� ?� @� I:� AY� <Y� =*� � ?,� ?� @� <Y� =*� � ?H� ?� @� I:� AY*� � B:� C� � C� *� � 	*J� 6*� � *� � 	*K� 6� L� L�� /*� �  *� <Y� =M� ?� NO� ?� @� 6*� � '*� �  *� <Y� =M� ?� NP� ?� @� 6� L� L�� /*� �  *� <Y� =Q� ?� NO� ?� @� 6*� � '*� �  *� <Y� =R� ?� NP� ?� @� 6*� � 2*� � *� <Y� =S� ?*� � ?� @� 6*� � 	*T� 6�+U�  W+-� V�  W*� � � WYX� Y�� AY*� � B� C� &� WY� <Y� =Z� ?*� � ?[� ?� @� Y�+*� �  W+� \ � ]:6�� +� ^ � ]S����� _� :*� <Y� =a� ?� N� @� 6� ��� `  �   E   J  L & M , N G O e P k Q � R � S � T � U � V � W � X � Y Z [& \6 ]F ^V _f `v a� b� c� d� e� h� l� m� n� p q r@ sE tM wd xq z� {� |� ~�  � � �& �J �R �v �� �� �� �� �� �� �	 �
 � � �/ �c �n �y �� �� �� �� �� � �   f 
�e � � �1 � � �$ � � |  � � �  � �   � � �   � � � �� � u � � � y D � �  �     W  � �  �       q� bY� cY+� d� eM,� f� V,� gN-h� i� E-j� k� ;--j� k� l:.m� ;� n� o:� <Y� =m� ;� ?� ?� @����� Mq�    f m p g j m p  �   .    �  �  �  � / � = � O � g � j � m � n � �   >  = * � u   K � u   Z � �  n   � �    q � �     q � u   � �  �   /     *� �    �       � �        � �    � �  �   >     *� �    �   
    �  � �        � �      � {   � �  �   /     *� �    �       � �        � �    � �  �   >     *� �    �   
    �  � �        � �      � {   � �  �   /     *� �    �       � �        � �    � �  �   >     *+� �    �   
    �  � �        � �      � u   � �  �   /     *� �    �       � �        � �    � �  �   >     *+� �    �   
     �        � �      y u   � �  �   /     *� �    �       �        � �    � �  �   >     *� �    �   
     �        � �      � {   � �  �   /     *� �    �        �        � �    � �  �   >     *+� �    �   
   ( ) �        � �      � u   � �  �   /     *� �    �      3 �        � �    � �  �   >     *+� �    �   
   < = �        � �      � u   � �  �   /     *� �    �      E �        � �    � �  �   >     *+� �    �   
   N O �        � �      � u   � �  �   /     *� �    �      W �        � �    � �  �   >     *� �    �   
   ` a �        � �      � {   � �  �   /     *� 	�    �      i �        � �    � �  �   >     *+� 	�    �   
   r s �        � �      � u   � �  �   /     *� 
�    �      { �        � �    � �  �   >     *� 
�    �   
   � � �        � �      � {   � �  �   /     *� �    �      � �        � �    � �  �   >     *� �    �   
   � � �        � �      � {   � �  �   /     *� �    �      � �        � �    � �  �   >     *� �    �   
   � � �        � �      � {   � �  �   /     *� �    �      � �        � �    � �  �   >     *� �    �   
   � � �        � �      � {   � �  �   /     *� �    �      � �        � �    � �  �   >     *� �    �   
   � � �        � �      � {   � �  �   /     *� �    �      � �        � �    � �  �   >     *� �    �   
   � � �        � �      � {   � �  �   /     *� �    �      � �        � �    � �  �   >     *� �    �   
   � � �        � �      � {   � �  �   /     *� �    �      � �        � �    � �  �   >     *� �    �   
     �        � �      � {   � �  �   /     *� �    �       �        � �    � �  �   >     *� �    �   
     �        � �      � {   � �  �   /     *� �    �       �        � �    � �  �   >     *� �    �   
   & ' �        � �      � {   � �  �   /     *� �    �      / �        � �    � �  �   >     *� �    �   
   8 9 �        � �      � {   � �  �   /     *� �    �      @ �        � �    � �  �   >     *� �    �   
   I J �        � �      � {   � �  �   /     *� �    �      R �        � �    � �  �   >     *� �    �   
   [ \ �        � �      � {   � �  �   /     *� �    �      _ �        � �    � �  �   >     *� �    �   
   c d �        � �      � {   � �  �   /     *� �    �      g �        � �    � �  �   >     *� �    �   
   k l �        � �      � {   �    �                                                                                                                                                                                                                                                                                                                                                                                                                                                         deps/java_cup/runtime/                                                                              0000777 0002035 0002035 00000000000 14222102116 014253  5                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  deps/java_cup/runtime/ComplexSymbolFactory$ComplexSymbol.class                                      0000666 0002035 0002035 00000006030 14202043766 024225  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 d
  >	  ?
  @	  A	  B C
  D E
  F
  G H
  I J K
  L
  M O
  P
  Q	  R	  S
  T U name Ljava/lang/String; xleft V Location InnerClasses 0Ljava_cup/runtime/ComplexSymbolFactory$Location; xright <init> (Ljava/lang/String;I)V Code LineNumberTable LocalVariableTable this ComplexSymbol 5Ljava_cup/runtime/ComplexSymbolFactory$ComplexSymbol; id I ((Ljava/lang/String;ILjava/lang/Object;)V value Ljava/lang/Object; toString ()Ljava/lang/String; getName (Ljava/lang/String;II)V state H(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)V left Ljava_cup/runtime/Symbol; right v(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;)V Z(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)V �(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;Ljava/lang/Object;)V getLeft 2()Ljava_cup/runtime/ComplexSymbolFactory$Location; getRight 
SourceFile ComplexSymbolFactory.java   W     X     java/lang/StringBuilder   Y Symbol:  Z [ - .  ( Z \  -  )   ]   ^ _ 3java_cup/runtime/ComplexSymbolFactory$ComplexSymbol ` a   b 3 ) 5 )   c java_cup/runtime/Symbol .java_cup/runtime/ComplexSymbolFactory$Location (I)V (ILjava/lang/Object;)V ()V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; (II)V 6(ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)V %java_cup/runtime/ComplexSymbolFactory 
access$000 3(Ljava_cup/runtime/ComplexSymbolFactory$Location;)I (III)V (IIILjava/lang/Object;)V !                         !  "   Q     *� *+� �    #       }  ~ 
  $         % '            ( )     *  "   \     *-� *+� �    #       �  �  � $   *     % '            ( )     + ,   - .  "   �     Y*� � 
*� � � Y� � 	*� � 	� 
�� Y� � 	*� � 	� 	*� � � 	*� � � 	� 
�    #   
    � % � $       Y % '    / .  "   /     *� �    #       � $        % '      0  "   \     *� *+� �    #       �  �  � $   *     % '            ( )     1 )     2  "   �     .*-� *+� -� *-� � � � *� � � �    #       �  �  �  � - � $   4    . % '     .      . ( )    . 3 4    . 5 4     6  "   �     *-� � � *+� *-� *� �    #       �  �  �  �  � $   4     % '            ( )     3      5      7  "   �     6*-� � � *+� -� *-� � � � *� � � �    #       �  �  � $ � 5 � $   >    6 % '     6      6 ( )    6 3 4    6 5 4    6 + ,     8  "   �     !*-� � � *+� *-� *� �    #       �  �  �  �   � $   >    ! % '     !      ! ( )    ! 3     ! 5     ! + ,   9 :  "   /     *� �    #       � $        % '    ; :  "   /     *� �    #       � $        % '    <    =       N  	  N & 	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        deps/java_cup/runtime/ComplexSymbolFactory$Location.class                                           0000666 0002035 0002035 00000004774 14202043766 023215  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 q	  F
  G
   H I	  J	  K	  L
  M N
 	 H
  O
 	 P Q
  R
 	 S T
  U V W
 	 X Y Z [ \ Z ] = ^ _ ` & Z a c d unit Ljava/lang/String; line I column offset <init> (Ljava/lang/String;III)V Code LineNumberTable LocalVariableTable this Location InnerClasses 0Ljava_cup/runtime/ComplexSymbolFactory$Location; (Ljava/lang/String;II)V (III)V (II)V 	getColumn ()I getLine getUnit ()Ljava/lang/String; toString toXML 7(Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;)V writer "Ljavax/xml/stream/XMLStreamWriter; orientation 
Exceptions e 	getOffset 
access$000 3(Ljava_cup/runtime/ComplexSymbolFactory$Location;)I x0 
SourceFile ComplexSymbolFactory.java & $ ' 0 ' f unknown ! " # $ % $ ' 2 java/lang/StringBuilder 6 7 g h : 5 4 g i / 3 4 ( ) 8 7 location j k l compilationunit m n 
linenumber   columnnumber o f p .java_cup/runtime/ComplexSymbolFactory$Location java/lang/Object #javax/xml/stream/XMLStreamException ()V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder;  javax/xml/stream/XMLStreamWriter writeStartElement (Ljava/lang/String;)V writeAttribute '(Ljava/lang/String;Ljava/lang/String;)V writeEndElement %java_cup/runtime/ComplexSymbolFactory !        ! "    # $    % $    & $     ' (  )   h     *+� *� �    *            ! +   4     , /      ! "     # $     % $     & $   ' 0  )        *� *� *� *+� *� *� �    *       )   
   *  +  ,  - +   *     , /      ! "     # $     % $   ' 1  )   \     *� *� �    *       6  7  8 +   *     , /      # $     % $     & $   ' 2  )   l     *� *� *� *� *� �    *       ?   
   @  A  B +         , /      # $     % $   3 4  )   /     *� �    *       H +        , /    5 4  )   /     *� �    *       O +        , /    6 7  )   /     *� �    *       V +        , /    8 7  )   e     ;� 	Y� 
*� � � *� � � *� � � *� � � � �    *       ] +       ; , /    9 :  )   �     ~+�  +*� �  +,�  +� 	Y� 
*� � � � �  +� 	Y� 
*� � � � �  +� 	Y� 
*� � � � �  +�  �    *   "    f  g  h  i ; j Y k w l } m +        ~ , /     ~ ; <    ~ = "  >     ?  @ 4  )   /     *� �    *       s +        , /   A B  )   /     *� �    *        +        C /    D    E .   
   b - 	    deps/java_cup/runtime/ComplexSymbolFactory.class                                                    0000666 0002035 0002035 00000005300 14202043766 021442  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 B
  . /
  0
  1
  2
  3
  4
  5
  6 7 8 9 ComplexSymbol InnerClasses : Location <init> ()V Code LineNumberTable LocalVariableTable this 'Ljava_cup/runtime/ComplexSymbolFactory; 	newSymbol �(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;Ljava/lang/Object;)Ljava_cup/runtime/Symbol; name Ljava/lang/String; id I left 0Ljava_cup/runtime/ComplexSymbolFactory$Location; right value Ljava/lang/Object; �(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;)Ljava_cup/runtime/Symbol; r(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)Ljava_cup/runtime/Symbol; Ljava_cup/runtime/Symbol; `(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)Ljava_cup/runtime/Symbol; .(Ljava/lang/String;I)Ljava_cup/runtime/Symbol; @(Ljava/lang/String;ILjava/lang/Object;)Ljava_cup/runtime/Symbol; startSymbol /(Ljava/lang/String;II)Ljava_cup/runtime/Symbol; state 
SourceFile ComplexSymbolFactory.java   3java_cup/runtime/ComplexSymbolFactory$ComplexSymbol  ;  <  =  >  ?  @  A %java_cup/runtime/ComplexSymbolFactory java/lang/Object java_cup/runtime/SymbolFactory .java_cup/runtime/ComplexSymbolFactory$Location �(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;Ljava/lang/Object;)V v(Ljava/lang/String;ILjava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;)V Z(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)V H(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)V (Ljava/lang/String;I)V ((Ljava/lang/String;ILjava/lang/Object;)V (Ljava/lang/String;II)V ! 
              3     *� �       
      y                    k     � Y+-� �           �    >                                     ! "    #     _     � Y+-� �           �    4                                    $     k     � Y+-� �           �    >                         %       %     ! "    &     _     � Y+-� �           �    4                         %       %    '     H     
� Y+� �           �         
       
      
      (     S     � Y+-� �           �    *                        ! "   ) *     S     � Y+� 	�           �    *                        +    ,    -       
  	  
  	                                                                                                                                                                                                                                                                                                                                deps/java_cup/runtime/DefaultSymbolFactory.class                                                    0000666 0002035 0002035 00000004021 14202043766 021416  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 =
  * +
  ,
  -
  .
  /
  0
  1
  2 3 4 5 <init> ()V Code LineNumberTable LocalVariableTable this 'Ljava_cup/runtime/DefaultSymbolFactory; 
Deprecated 	newSymbol r(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)Ljava_cup/runtime/Symbol; name Ljava/lang/String; id I left Ljava_cup/runtime/Symbol; right value Ljava/lang/Object; `(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)Ljava_cup/runtime/Symbol; B(Ljava/lang/String;IIILjava/lang/Object;)Ljava_cup/runtime/Symbol; 0(Ljava/lang/String;III)Ljava_cup/runtime/Symbol; startSymbol /(Ljava/lang/String;II)Ljava_cup/runtime/Symbol; state .(Ljava/lang/String;I)Ljava_cup/runtime/Symbol; @(Ljava/lang/String;ILjava/lang/Object;)Ljava_cup/runtime/Symbol; 
SourceFile DefaultSymbolFactory.java   java_cup/runtime/Symbol  6  7  8  9  :  ;  < %java_cup/runtime/DefaultSymbolFactory java/lang/Object java_cup/runtime/SymbolFactory H(ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)V 6(ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)V (IIILjava/lang/Object;)V (III)V (II)V (I)V (ILjava/lang/Object;)V ! 
              3     *� �       
                               j     � Y-� �                >                                               ^     � Y-� �           #    4                                   !     j     � Y� �           &    >                                         "     ^     � Y� �           )    4                                  # $     R     
� Y� �           ,    *    
       
      
      
 %     &     G     	� Y� �           /         	       	      	      '     R     
� Y-� 	�           2    *    
       
      
      
     (    )                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               deps/java_cup/runtime/lr_parser.class                                                               0000666 0002035 0002035 00000036340 14202043766 017316  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1Xd
 e
 �f
 �e	 �gh
 e	 �i	 �j
 �k
 �e
 �l	 �m
 �nop
 �qr
 �stu
 �v
 �wxy
 z|	}~
 e
 ��
 ��
 �
 ��
 �
 �
��
��
���	 )��
 ����
 ��
 ���
 2e�������
 7�
 ��
 2�	}��
 ��
��
��
�����
 �	 )�	 ��
 ��
 7����
 J�
 J�
 ��
 J�
 ��
 ��	 ��
 J�
 ��
 ��
 ��	 ��
 ��
 ��
 ��
 ��
 ��
 ��	 ��
 ��
 ��t�
 �	 ��	 )���
 fz	 )�
 ��
 �
 ��
 ��
 ���
 ���
 ��
 ������������
 ~z���
 ~�
 ~����
 ���
 �������
 ���
 ���
 ��	 ����
 ���
 ��
 �� 
 �
 t	
 �
	 �
 �
 ~" symbolFactory  Ljava_cup/runtime/SymbolFactory; _error_sync_size I ConstantValue    _done_parsing Z tos 	cur_token Ljava_cup/runtime/Symbol; stack Ljava/util/Stack; production_tab [[S 
action_tab 
reduce_tab _scanner Ljava_cup/runtime/Scanner; 	lookahead [Ljava_cup/runtime/Symbol; lookahead_pos <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/runtime/lr_parser; 
Deprecated RuntimeVisibleAnnotations Ljava/lang/Deprecated; #(Ljava_cup/runtime/SymbolFactory;)V fac (Ljava_cup/runtime/Scanner;)V s =(Ljava_cup/runtime/Scanner;Ljava_cup/runtime/SymbolFactory;)V symfac getSymbolFactory "()Ljava_cup/runtime/SymbolFactory; error_sync_size ()I production_table ()[[S action_table reduce_table start_state start_production EOF_sym 	error_sym done_parsing 
setScanner 
getScanner ()Ljava_cup/runtime/Scanner; 	do_action J(ILjava_cup/runtime/lr_parser;Ljava/util/Stack;I)Ljava_cup/runtime/Symbol; 
Exceptions 	user_init init_actions scan ()Ljava_cup/runtime/Symbol; sym report_fatal_error '(Ljava/lang/String;Ljava/lang/Object;)V message Ljava/lang/String; info Ljava/lang/Object; report_error cs ComplexSymbol InnerClasses 5Ljava_cup/runtime/ComplexSymbolFactory$ComplexSymbol; syntax_error (Ljava_cup/runtime/Symbol;)V getSymbolContainer ()Ljava/lang/Class; report_expected_token_ids expected Ljava/lang/Integer; i$ Ljava/util/Iterator; ids Ljava/util/List; list Ljava/util/LinkedList; LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; *Ljava/util/LinkedList<Ljava/lang/String;>; symbl_name_from_id (I)Ljava/lang/String; e $Ljava/lang/IllegalArgumentException; "Ljava/lang/IllegalAccessException; f Ljava/lang/reflect/Field; arr$ [Ljava/lang/reflect/Field; len$ id fields expected_token_ids ()Ljava/util/List; i ret parse_state row [S 	Signature '()Ljava/util/List<Ljava/lang/Integer;>; validate_expected_symbol (I)Z vstack &Ljava_cup/runtime/virtual_parse_stack; Ljava/lang/Exception; lhs S rhs_size act unrecovered_syntax_error 
get_action (II)S tag probe first last state 
get_reduce parse handle_size lhs_sym_num lhs_sym debug_message (Ljava/lang/String;)V mess 
dump_stack debug_reduce (III)V prod_num nt_num debug_shift 	shift_tkn debug_stack sb Ljava/lang/StringBuffer; debug_parse error_recovery (Z)Z debug shift_under_error ()Z find_recovery_config error_token right left read_lookahead cur_err_token advance_lookahead restart_lookahead try_parse_ahead parse_lookahead (Z)V unpackFromStrings ([Ljava/lang/String;)[[S j size2 sa [Ljava/lang/String; n size1 result 
SourceFile lr_parser.java %java_cup/runtime/DefaultSymbolFactory � � � � � � java/util/Stack � � � � � � � � � � � � � � � END_OF_FILE � � � � � � java/lang/Exception $Can't recover from previous error(s) �< 3java_cup/runtime/ComplexSymbolFactory$ComplexSymbol ! java/lang/StringBuilder"#  for input symbol "$% " spanning from &)"*  to +),%-.</<0 � java_cup/runtime/SymbolQ �  at character "1 	 of input   Syntax error � java/util/LinkedList23456M78 java/lang/Integer9 �:;<! #instead expected token classes are =>?@AB$% "java/lang/IllegalArgumentException  java/lang/IllegalAccessException invalid symbol idC8  � � �%& �D $java_cup/runtime/virtual_parse_stack �EF �/0GDTM � � � �H �60I � "Couldn't repair and continue parse � � � � � � � � � � � � � � � � � �J � START � �KLGM � �N � java/lang/Error -Symbol recycling detected (fix your scanner). � � � �H8 IJ. )# Stack dump requested, but stack is null;< *============ Parse Stack Dump ============O � Symbol: PQ  State:  *========================================== # Reduce with prod #  [NT= ,  SZ= ] # Shift under term #  to state # java/lang/StringBuffer 	## STACK:  <state  , sym  >"R 	          # Initializing parser # Current Symbol is #C # Current token is ?@ # Reduce rule: top state  
, lhs sym  
 -> state  # Goto state # # Attempting error recoveryNJ # Error recovery failsR � # Trying to parse aheadVJ � � # Error recovery fails at EOF # Consuming Symbol #U � ,# Parse-ahead ok, going back to normal parseWX � � !# Finding recovery state on stackLM  # Pop stack by one, state was # SM "# No recovery state found on stack # Recover state found (# ) # Shifting on error to state # ERRORT � � � �S � # Parse-ahead shifts Symbol #  into state # # Parse-ahead accepts %# Parse-ahead reduces: handle size =   lhs = #  from state # $# Reparsing saved input with actions # Current state is # # Completed reparseUV java_cup/runtime/lr_parser java/lang/Object java_cup/runtime/Scanner 
next_token java_cup/runtime/SymbolFactory 	newSymbol .(Ljava/lang/String;I)Ljava_cup/runtime/Symbol; %java_cup/runtime/ComplexSymbolFactory java/lang/System err Ljava/io/PrintStream; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; getName ()Ljava/lang/String; getLeftW Location 2()Ljava_cup/runtime/ComplexSymbolFactory$Location; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; getRight toString java/io/PrintStream println print flush (I)Ljava/lang/StringBuilder; java/util/List iterator ()Ljava/util/Iterator; java/util/Iterator hasNext next ()Ljava/lang/Object; intValue add (Ljava/lang/Object;)Z out java/lang/Class 	getFields ()[Ljava/lang/reflect/Field; java/lang/reflect/Field getInt (Ljava/lang/Object;)I peek (I)V (Ljava/util/Stack;)V top push pop printStackTrace removeAllElements startSymbol /(Ljava/lang/String;II)Ljava_cup/runtime/Symbol; &(Ljava/lang/Object;)Ljava/lang/Object; used_by_parser size 	elementAt (I)Ljava/lang/Object; ,(Ljava/lang/String;)Ljava/lang/StringBuffer; empty `(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)Ljava_cup/runtime/Symbol; charAt (I)C .java_cup/runtime/ComplexSymbolFactory$Location! � �     � �    � �  �    �  � �    � �    � �    � �    � �    � �    � �    � �    � �    � �   0  � �  �   :     *� Y� � �    �   
    �  � �        � �   �     �     �    � �  �   ^     *� *� *� Y� � *+� 	�    �       �  � 	  �  � �        � �      � �   � �  �   E     *+� Y� � 
�    �   
    �  � �        � �      � �  �     �     �    � �  �   Y     *� *,� 	*+� �    �       �  � 	 �  � �         � �      � �     � �   � �  �   /     *� 	�    �       � �        � �    � �  �   ,     �    �       � �        � �   � �   � �   � �   � �   � �   � �   � �    � �  �   4     *� �    �   
     �        � �    � �  �   :     *+� �    �      5 �        � �      � �   � �  �   /     *� �    �      : �        � �   � �  �       � �  �   +      �    �      Y �        � �   �      � �  �       � �  �   Z     "*� �  L+� +� *� *� �  �    �   
   n 
o �       " � �   
  � �  �       � �  �   Z     *� *+,� � Y� �    �      � � 
� �         � �      � �     � �  �       � �  �       �,� � A,� N� � Y� +� � -� �  � -� !� "#� -� $� "� %� &�� +� '� � (,� )� =,� )� *� *� � Y� +� ,� )� *� ,-� � %� &� � .� &�    �   .   � � � D� E� L� R� Y� d� �� �� �   *   9 � �    � � �     � � �    � � �     �   H     */+� *� 0�    �      � � � �        � �      � �    �   ,     �    �      � �        � �    �  �   �     S*� 1L� 2Y� 3M+� 4 N-� 5 � -� 6 � 7:,*� 8� 9� :W��޲ ;� Y� <� ,� "� %� &�    �      � � � (� 6� 9� R� �   4  (    %    S � �    N	
   F       N	   F    �   �     A*� =� >M,N-�66� )-2:� ?� 	� @�� 
:� :����C�   - 1 A  - 6 B  �   * 
  � � � (� .� 1� 3� 6� 8� >� �   \ 	 3    8       
 4   0 �   - �    A � �     A �   9    �   �     Z� 2Y� 3L*� � D� )� E=*� F2N6-�� 4-5� � #*-5� G� � +� 7Y-5� H� I W����+�    �   & 	  � � � � '� 2� @� R� X� �   4    8 �    Z � �    R
   D  �   =!"       R #   $ %&  �  R     �� JY*� � K:*� L� M6� �� d� N*� O����td*� P� �*� Qtd25=*� Qtd25>6� � R����*� L� S� N���:� T�     �    6 �  7 D �  E � �   �   :   � � �  � %� .� 7� E R _ s � � � �   R  b  �   x'(  � )    � � �     � �  R <*+  _ /,+   u- �  .  �   @     *U+� V�    �   
     �        � �      � �  �      /0  �  ]     �*� F2:�� -6�� {�5>� � 	5�����6�dld6� >`l6h5� h`5�h5� `6���d6����d5��    �   J   . 1 2 5 $6 .9 42 :? =@ HA OC XD cE mF xG �I �M �R �   f 
 $ 1+   '2 �  X 22 �  = V3 �  H K4 �    � � �     �5 �    � � �  � 2 �   �!"  60  �   �     ;*� W2:� �6�� "�5>� � 	5������    �   & 	  d g h j m #n -q 3j 9u �   >  # 1+   '2 �    ; � �     ;5 �    ; � �   3!"  7 �  �  m    uM**� X� Q**� Y� F**� Z� W*� [*� \**� ]� ^*� � _*� *� `*� a� b � cW*� d*� *� �*� ^� e� � fYg� h�**� � D� )� E*� ^� i� M<� 6*� ^d� E*� ^� e*� *� ^� cW*Y� d`� d**� ]� ^���� �*td**� *� d� jM*� Qtd256*� Qtd25>6� *� � kW*Y� dd� d����**� � D� )� E� S<,� E,� e*� ,� cW*Y� d`� d����**� ^� l*� m� **� ^� n*� ���*� � D� )M���,�    �   � (  � � 
� � � � "� *� 1� I� N� Z� d� n� �� �� �� �� �� �� �� �� �� �� �� �� ����"�'�,�5�B�F�N�V�^�e�s� �   >  �  �  � U8+  � a9+  � �- �   u � �   s: �  �      ;<  �   @     � +� &�    �   
   � � �        � �     = �  > �  �   �     h*� � 
*o� p�*q� p<*� � r� C*� Y� s� *� � t� )� i� ,u� *� � t� )� E� ,� %� p����*v� p�    �   & 	  � � � �  ! [ a g �      K �    h � �   ?@  �   �     4*� Y� w� � ,x� � ,y� z� � ,{� � %� p�    �   
    3 �   *    4 � �     4A �    4B �    4, �  C  �   _     '*� Y� |� +� i� ,}� +� E� ,� %� p�    �   
    &! �       ' � �     'D �  E �  �   �     |� ~Y� �L=*� � r� g*� � t� )N+� Y� �� -� E� ,�� -� i� ,�� � %� �Wp� *� � rd� *+� �� p� ~Y�� �L�����    �   & 	  ( 
) * #+ O, c- k. u) {1 �   *  # R � �   o �    | � �   
 rFG  H �  �  &    M**� X� Q**� Y� F**� Z� W*�� p*� [*� \**� ]� ^*� Y� �� *� ^� i� ,� %� p*� � _*� *� `*� a� b � cW*� d*� *� ��*� ^� e� � fYg� h�**� � D� )� E*� ^� i� M<� X*� ^d� E*� ^� e**� ^� �*� *� ^� cW*Y� d`� d**� ]� ^*� Y� �� *� ^� "� %� p��v� �*td**� *� d� jM*� Qtd256*� Qtd25>*td� �6� *� � kW*Y� dd� d����**� � D� )� E� S<*� Y� �� *� � D� )� E� ,�� � ,�� � ,� %� p,� E,� e*� ,� cW*Y� d`� d*� Y� �� � ,� %� p������**� ^� l*� m� **� ^� n*� ��w*� � D� )M��i,�    �   � /  A G 
H I K  N $Q (T 0V MY TZ l[ q^ }a �b �h �k �n �o �p �q �r �u �vy|&�2�=�F�N�X�^�r����������������������� �   > @  � 2 �8+ & �9+  �f- �    � �   : �  �      IJ  �       �� 	*�� p*� �� � 	*�� p�*� �� 	*�� p*� �� � I*� �2� i*� � � 	*�� p�� "*� Y� �� *� �2� i� ,� %� p*� ����� 	*�� p*� ��    �   F   � 
� � � � "� ,� 4� 7� G� Q� S� W� v� }� �� �� �       � � �     �K �  �      LM  �   H     **� � D� )� E*� �� M� � �    �       �        � �   NJ  �  �    � 	*�� p*� � D� )::*� �� V� &*� Y� �� *� � D� )� E� ,� %� p*� � k� ):*Y� dd� d*� � ����� 	*�� p�**� � D� )� E*� �� M>� D*� Y� �� *� � D� )� E� ,�� � %� p*� Y� �� d� ,� %� p*� �*� �� � M,d� E,� e*� ,� cW*Y� d`� d�    �   V    
   !" %# H% T& ^) h+ r, t1 �2 �4 �6 �: �; �< �= �>@ �   >    � �    K �  � !O �  � z- �   �P �   �Q �  R �  �        3**� �� )� �<*� �� *� �*� ^S**� ]� ^����*� ��    �      S V X Y 'V -] 2^ �        �    3 � �   �      S �  �   4     
*� �*� �2�    �      c �       
 � �   TM  �   I     *Y� �`� �*� �*� �� � �    �   
   m 
p �        � �   U �  �   �     ;<*� �� *� �d*� �2S����*� �*� �d*� ^S**� ]� ^*� ��    �      { 
| { � -� 5� :� �       �    ; � �   �      VJ  �  �    � JY*� � K:*� L*� �� i� M=� �� @d� N� +*� Y� �� *� �� i� ,�� d� ,� %� p*� O����td*� P� � 	*�� p�*� Qtd25>*� Qtd2566� � R����� 1*� Y� �� � ,�� � ,�� � L� ,� %� p*� L� S� N��!*� Y� �� � L� ,� %� p��    �   R   � � � $� (� 0� \� e� p� z� |� �� �� �� �� �� �� �� �� �� �   H  �  �    � �    K �   �- �  � �*+  � x,+   '(  �      WX  �  �    �N*� �� I*�� p*� Y� �� *� �� i� ,� %� p*� Y� �� *� � D� )� E� ,� %� p*� �G**� � D� )� E*� �� i� M=� m*� �d� E*� �� e� **� �� �*� *� �� cW*Y� d`� d*� O� � 	*�� p����*� Y� �� *� �� i� ,� %� p��u� �*td**� *� d� jN*� Qtd256*� Qtd256� *td� �6� *� � kW*Y� dd� d����**� � D� )� E� S=-� E-� e*� -� cW*Y� d`� d���*� Y� �� � ,� %� p������*/-� V��    �   � &  � � � � � .� Q� X� q� u   � � � � �	 � � � � � � "%)'1(;%A,U/Z0_1h2r4�9�;�<�A �   H "  �  �8+  �9+  q+- �   � � �    �K �  �: �  �      YZ  �  B     �� ~Y*2� �L=*�� +*2� �W����=+� �x+`� ��>�� �:6� J+� �x+`� ��6��	S6� 2+�� �d�V��������    �   >   I J K J !L #M 7N =O FP [Q dR nS �R �O �U �   \ 	   �  g  [ �  X /\ �  @ M �    �]^    �FG  # m_ �  4 \` �  = Sa �  b   c �     { � 	'{( 	                                                                                                                                                                                                                                                                                                deps/java_cup/runtime/Scanner.class                                                                 0000666 0002035 0002035 00000000323 14202043766 016706  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1  	 
 
next_token ()Ljava_cup/runtime/Symbol; 
Exceptions  
SourceFile Scanner.java java_cup/runtime/Scanner java/lang/Object java/lang/Exception                                                                                                                                                                                                                                                                                                                                   deps/java_cup/runtime/ScannerBuffer.class                                                           0000666 0002035 0002035 00000002167 14202043766 020050  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 8
 
 $ %
  $	 	 &	 	 '
 ( )  * + , - . / inner Ljava_cup/runtime/Scanner; buffer Ljava/util/List; 	Signature +Ljava/util/List<Ljava_cup/runtime/Symbol;>; <init> (Ljava_cup/runtime/Scanner;)V Code LineNumberTable LocalVariableTable this  Ljava_cup/runtime/ScannerBuffer; getBuffered ()Ljava/util/List; -()Ljava/util/List<Ljava_cup/runtime/Symbol;>; 
next_token ()Ljava_cup/runtime/Symbol; buffered Ljava_cup/runtime/Symbol; 
Exceptions 0 
SourceFile ScannerBuffer.java  1 java/util/LinkedList     2 3 4   5 6 7 java_cup/runtime/ScannerBuffer java/lang/Object java_cup/runtime/Scanner java/lang/Exception ()V java/util/Collections unmodifiableList "(Ljava/util/List;)Ljava/util/List; java/util/List add (Ljava/lang/Object;)Z ! 	 
                          U     *� *� Y� � *+� �             	                              2     *� � �                                    S     *� �  L*� +�  W+�            
                
           !  "    #                                                                                                                                                                                                                                                                                                                                                                                                         deps/java_cup/runtime/Symbol.class                                                                  0000666 0002035 0002035 00000003265 14202043766 016572  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 J	  4	  5
  6
  7
  8	  9
  :
  ;	  <	  =	  > ?
  ; @
  A
  B
  C D E sym I parse_state used_by_parser Z left right value Ljava/lang/Object; <init> H(ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)V Code LineNumberTable LocalVariableTable this Ljava_cup/runtime/Symbol; id o 6(ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)V (IIILjava/lang/Object;)V l r (ILjava/lang/Object;)V (III)V (I)V sym_num (II)V state toString ()Ljava/lang/String; 
SourceFile Symbol.java      '  +  ,    .  F       java/lang/StringBuilder # G H G I 0 1 java_cup/runtime/Symbol java/lang/Object ()V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; !                                             f     *,� -� � �        
       ! !   4     " #      $       #      #     %     &     Z     *,� -� � �        
    #  $ !   *     " #      $       #      #    '     x     *� *� *� *� �            *  + 
 ,  -  . !   4     " #      $      (      )      %     *     K     	*,� �        
    5  6 !        	 " #     	 $     	 %     +     U     	*� �        
    =  > !   *    	 " #     	 $     	 (     	 )     ,     Q     *� *� *� �            E  F  G  H !        " #      -      .     b     *� *� 	*� 
*� �            N  a 	 O  P  Q !         " #      -      /    0 1     A     � Y� � *� 
� � �            m !        " #    2    3                                                                                                                                                                                                                                                                                                                                           deps/java_cup/runtime/SymbolFactory.class                                                           0000666 0002035 0002035 00000001074 14202043766 020116  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1    	newSymbol r(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;Ljava/lang/Object;)Ljava_cup/runtime/Symbol; `(Ljava/lang/String;ILjava_cup/runtime/Symbol;Ljava_cup/runtime/Symbol;)Ljava_cup/runtime/Symbol; @(Ljava/lang/String;ILjava/lang/Object;)Ljava_cup/runtime/Symbol; .(Ljava/lang/String;I)Ljava_cup/runtime/Symbol; startSymbol /(Ljava/lang/String;II)Ljava_cup/runtime/Symbol; 
SourceFile SymbolFactory.java java_cup/runtime/SymbolFactory java/lang/Object                         	    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        deps/java_cup/runtime/virtual_parse_stack.class                                                     0000666 0002035 0002035 00000003371 14202043766 021370  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 W
  6 7 8
  9	  : ;
  6	  <	  =
  >
  ?
  @ A B	  C
  D
  E
  F G
  H
  I J
  K L M 
real_stack Ljava/util/Stack; 	real_next I vstack <init> (Ljava/util/Stack;)V Code LineNumberTable LocalVariableTable this &Ljava_cup/runtime/virtual_parse_stack; shadowing_stack 
Exceptions get_from_real ()V 	stack_sym Ljava_cup/runtime/Symbol; empty ()Z top ()I pop push (I)V 	state_num 
SourceFile virtual_parse_stack.java  ) java/lang/Exception ;Internal parser error: attempt to create null virtual stack  N   java/util/Stack     ( ) O / P Q java_cup/runtime/Symbol java/lang/Integer R   2 1 S , - :Internal parser error: top() called on empty virtual stack T U V / 3Internal parser error: pop from empty virtual stack 0 U $java_cup/runtime/virtual_parse_stack java/lang/Object (Ljava/lang/String;)V size 	elementAt (I)Ljava/lang/Object; parse_state &(Ljava/lang/Object;)Ljava/lang/Object; peek ()Ljava/lang/Object; intValue !                           !   |     ,*� +� � Y� �*+� *� Y� � *� 	*� 
�    "   "           $  % " & ' ) + * #       , $ %     , &   '       ( )  !   �     F*� 	*� � � �*� *� � d*� 	d� � L*Y� 	`� 	*� � Y+� � � W�    "       T  W ( Z 2 ] E ^ #       F $ %   (  * +   , -  !   2     *� � �    "       g #        $ %    . /  !   T     "*� � � � Y� �*� � � � �    "       o 
 p  s #       " $ %   '       0 )  !   i     +*� � � � Y� �*� � W*� � � *� 
�    "       { 
 |  �  � & � * � #       + $ %   '       1 2  !   I     *� � Y� � W�    "   
    �  � #        $ %      3    4    5                                                                                                                                                                                                                                                                       deps/java_cup/runtime/XMLElement$Error.class                                                        0000666 0002035 0002035 00000004006 14202043766 020347  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 ] :
  ;
  ;	  <	  = >
  ; ?
  @
  A B C
  D E F G -
  H I F J /
  K F L M N l P Location InnerClasses 0Ljava_cup/runtime/ComplexSymbolFactory$Location; r 
selectById $(Ljava/lang/String;)Ljava/util/List; Code LineNumberTable LocalVariableTable this Error #Ljava_cup/runtime/XMLElement$Error; s Ljava/lang/String; 	Signature C(Ljava/lang/String;)Ljava/util/List<Ljava_cup/runtime/XMLElement;>; <init> c(Ljava_cup/runtime/ComplexSymbolFactory$Location;Ljava_cup/runtime/ComplexSymbolFactory$Location;)V left 2()Ljava_cup/runtime/ComplexSymbolFactory$Location; right toString ()Ljava/lang/String; dump %(Ljavax/xml/stream/XMLStreamWriter;)V writer "Ljavax/xml/stream/XMLStreamWriter; 
Exceptions Q 
SourceFile XMLElement.java java/util/LinkedList + R     java/lang/StringBuilder <error left=" S T S U 	" right=" "/> 0 1 error V W X - .   Y Z / . [ R !java_cup/runtime/XMLElement$Error java_cup/runtime/XMLElement \ .java_cup/runtime/ComplexSymbolFactory$Location #javax/xml/stream/XMLStreamException ()V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder;  javax/xml/stream/XMLStreamWriter writeStartElement (Ljava/lang/String;)V writeAttribute '(Ljava/lang/String;Ljava/lang/String;)V writeEndElement %java_cup/runtime/ComplexSymbolFactory !                        !   <     � Y� �    "       � #        $ &      ' (  )    *  + ,  !   Y     *� *+� *,� �    "       �  � 	 �  � #         $ &                - .  !   /     *� �    "       � #        $ &    / .  !   /     *� �    "       � #        $ &    0 1  !   R     (� Y� � 	*� � 
� 	*� � 
� 	� �    "       � #       ( $ &    2 3  !   �     K+�  +� Y� *� � 
� 	� �  +� Y� *� � 
� 	� �  +�  �    "       �  � & � D � J � #       K $ &     K 4 5  6     7  8    9       O  	   % 	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          deps/java_cup/runtime/XMLElement$NonTerminal.class                                                  0000666 0002035 0002035 00000007311 14202043766 021506  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 � d
  e	 / f
 g h
  i	 / j
  k l m l n o
 
 p
  q
 
 e	 / r
 s t
  u
 
 v
  w
  x y
  e z
  { |
  } ~
   �
 / v
  � �
 / � �
 �  � � � � � � � 0 � P
 Q �
 
 � V � � � variant I list Ljava/util/LinkedList; 	Signature 5Ljava/util/LinkedList<Ljava_cup/runtime/XMLElement;>; 
selectById $(Ljava/lang/String;)Ljava/util/List; Code LineNumberTable LocalVariableTable 	selection Ljava/util/List; e Ljava_cup/runtime/XMLElement; i$ Ljava/util/Iterator; this NonTerminal InnerClasses )Ljava_cup/runtime/XMLElement$NonTerminal; s Ljava/lang/String; response LocalVariableTypeTable /Ljava/util/List<Ljava_cup/runtime/XMLElement;>; C(Ljava/lang/String;)Ljava/util/List<Ljava_cup/runtime/XMLElement;>; <init> 4(Ljava/lang/String;I[Ljava_cup/runtime/XMLElement;)V tagname l [Ljava_cup/runtime/XMLElement; left � Location 2()Ljava_cup/runtime/ComplexSymbolFactory$Location; loc 0Ljava_cup/runtime/ComplexSymbolFactory$Location; right it 3Ljava/util/Iterator<Ljava_cup/runtime/XMLElement;>; toString ()Ljava/lang/String; ret dump %(Ljavax/xml/stream/XMLStreamWriter;)V writer "Ljavax/xml/stream/XMLStreamWriter; 
Exceptions � 
SourceFile XMLElement.java java/util/LinkedList K � M F � � � � � 2 3 � � � � � � � java_cup/runtime/XMLElement 6 7 � � 0 1 � � � K � P S � � � � java/lang/StringBuilder <nonterminal id=" � � " variant=" � � " /> Y Z " left=" � � 	" right=" V S "> � </nonterminal> nonterminal � � � id � �   � � \ ] � � 'java_cup/runtime/XMLElement$NonTerminal � .java_cup/runtime/ComplexSymbolFactory$Location #javax/xml/stream/XMLStreamException ()V java/lang/String equals (Ljava/lang/Object;)Z add iterator ()Ljava/util/Iterator; java/util/Iterator hasNext ()Z next ()Ljava/lang/Object; addAll (Ljava/util/Collection;)Z java/util/Arrays asList %([Ljava/lang/Object;)Ljava/util/List; (Ljava/util/Collection;)V descendingIterator isEmpty append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; java/lang/Object  javax/xml/stream/XMLStreamWriter writeStartElement (Ljava/lang/String;)V writeAttribute '(Ljava/lang/String;Ljava/lang/String;)V toXML 7(Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;)V writeEndElement %java_cup/runtime/ComplexSymbolFactory ! / 
     0 1     2 3  4    5   6 7  8   �     I� Y� M*� +� � 	,*� W*� � N-�  �  -� 	 � 
:+� :,� W���,�    9   "    R  S  T  U 5 V = W D X G Y :   >  =  ; <  5  = >  ! & ? @    I A D     I E F   A G 3  H     =  ; I   A G 5  4    J � K L  8   v     *� *+� *� *� Y-� � � �    9       ]  ^ 	 _  `  a :   *     A D      M F     0 1     N O   P S  8   �     +*� � L+�  � +� 	 � 
M,� N-� -�����    9       d  e   f & g ) h :   *     T U    = >   ! ? @    + A D    V S  8   �     )*� � L+�  � +� 	 � 
� M,� ,�����    9       k  l  m $ n ' o :        T U    W @    ) A D   H       W X   Y Z  8       �*� � � +� Y� � *� � � *� � � � �� Y� � *� � � *� � � *�  � � *� � !� � L*� � M,�  � &,� 	 � 
N� Y� +� -� "� � L��׻ Y� +� #� � �    9       s 
 t 2 v r x � y � z :   *  �  = >  z , ? @    � A D   r H [ F   \ ]  8   �     ~+$� % +&*� � ' +(� Y� *� � )� � � ' *� M,� 
,+*� +*� � N-�  � -� 	 � 
:+� ,���*�  M,� 
,+-� ++� . �    9   .    ~    � 2 � 7 � B � ^ � g � l � w � } � :   4  ^  = >  J  ? @    ~ A D     ~ ^ _  7 G T U  `     a  b    c C     / 
 B 	 Q � R 	                                                                                                                                                                                                                                                                                                                       deps/java_cup/runtime/XMLElement$Terminal.class                                                     0000666 0002035 0002035 00000005654 14202043766 021043  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 � N
  O	 ! P
 Q R S T
 ! U
 " O	 ! V	 ! W	 ! X Y
  O Z
  [ \
  ] ^
  _ ` a b c d e f d g A
 ! h i C
 ! j d k d l m n l p Location InnerClasses 0Ljava_cup/runtime/ComplexSymbolFactory$Location; r value Ljava/lang/Object; 
selectById $(Ljava/lang/String;)Ljava/util/List; Code LineNumberTable LocalVariableTable this Terminal &Ljava_cup/runtime/XMLElement$Terminal; s Ljava/lang/String; ret Ljava/util/List; LocalVariableTypeTable /Ljava/util/List<Ljava_cup/runtime/XMLElement;>; 	Signature C(Ljava/lang/String;)Ljava/util/List<Ljava_cup/runtime/XMLElement;>; <init> u(Ljava_cup/runtime/ComplexSymbolFactory$Location;Ljava/lang/String;Ljava_cup/runtime/ComplexSymbolFactory$Location;)V 
symbolname �(Ljava_cup/runtime/ComplexSymbolFactory$Location;Ljava/lang/String;Ljava/lang/Object;Ljava_cup/runtime/ComplexSymbolFactory$Location;)V i ()Ljava/lang/Object; left 2()Ljava_cup/runtime/ComplexSymbolFactory$Location; right toString ()Ljava/lang/String; dump %(Ljavax/xml/stream/XMLStreamWriter;)V writer "Ljavax/xml/stream/XMLStreamWriter; 
Exceptions q 
SourceFile XMLElement.java java/util/LinkedList ; r s 4 t u v w x v ; > # ' ( ' ) * java/lang/StringBuilder <terminal id=" y z "/> D E " left=" y { 	" right=" "> </terminal> terminal | } ~ id  � A B   C B � ~ � r $java_cup/runtime/XMLElement$Terminal java_cup/runtime/XMLElement � .java_cup/runtime/ComplexSymbolFactory$Location #javax/xml/stream/XMLStreamException ()V tagname java/lang/String equals (Ljava/lang/Object;)Z java/util/List add append -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder;  javax/xml/stream/XMLStreamWriter writeStartElement (Ljava/lang/String;)V writeAttribute '(Ljava/lang/String;Ljava/lang/String;)V writeCharacters writeEndElement %java_cup/runtime/ComplexSymbolFactory ! ! "      # '     ( '     ) *     + ,  -   u     � Y� M*� +� � ,*�  W,�    .       �  �  � /         0 2      3 4    5 6  7       5 8  9    :  ; <  -   U     	*+,-� �    .   
    �  � /   *    	 0 2     	 # '    	 = 4    	 ( '   ; >  -   �     *� *+� *� 	*-� 
*,� �    .       �  � 	 �  �  �  � /   4     0 2      # '     = 4     ? *     ( '   ) @  -   /     *� 
�    .       � /        0 2    A B  -   /     *� �    .       � /        0 2    C B  -   /     *� 	�    .       � /        0 2    D E  -   �     e*� 
� !� Y� � *� � � � � B� Y� � *� � � *� � � *� 	� � *� 
� � � �    .       � /       e 0 2    F G  -   �     z+�  +*� �  +� Y� *� � � � �  +� Y� *� � � � �  *� 
� +� Y� *� 
� � � �  +�   �    .       �  �  � 2 � P � s � y � /       z 0 2     z H I  J     K  L    M &     $ o % 	 ! " 1 	                                                                                    deps/java_cup/runtime/XMLElement.class                                                              0000666 0002035 0002035 00000007104 14202043766 017273  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   1 �
 . a
 - b c d e f g h e i j e k H l e m e n o
 - p q
 r s t u v w v x y {	  | } ~
   e �
  � ]
 Z � �
   a
   � �
   �
   �
  � Y �
  � e � e � e � � � � Terminal InnerClasses � Error � NonTerminal tagname Ljava/lang/String; <init> ()V Code LineNumberTable LocalVariableTable this Ljava_cup/runtime/XMLElement; 
selectById $(Ljava/lang/String;)Ljava/util/List; 	Signature C(Ljava/lang/String;)Ljava/util/List<Ljava_cup/runtime/XMLElement;>; dump U(Ljavax/xml/stream/XMLStreamWriter;Ljava_cup/runtime/XMLElement;[Ljava/lang/String;)V writer "Ljavax/xml/stream/XMLStreamWriter; elem 	blacklist [Ljava/lang/String; 
Exceptions � u(Ljava_cup/runtime/ScannerBuffer;Ljavax/xml/stream/XMLStreamWriter;Ljava_cup/runtime/XMLElement;[Ljava/lang/String;)V s arr$ len$ I i$ cs ComplexSymbol 5Ljava_cup/runtime/ComplexSymbolFactory$ComplexSymbol; Ljava_cup/runtime/Symbol; Ljava/util/Iterator; buffer  Ljava_cup/runtime/ScannerBuffer; right � Location 2()Ljava_cup/runtime/ComplexSymbolFactory$Location; left %(Ljavax/xml/stream/XMLStreamWriter;)V 
SourceFile XMLElement.java 8 9 C L utf-8 1.0 � � � xml-stylesheet href="tree.xsl" type="text/xsl" � � document � � symbol � � � 9 	parsetree C ^ tokensequence � � � � � � � � � � � java_cup/runtime/Symbol � 3java_cup/runtime/ComplexSymbolFactory$ComplexSymbol � � token name � � � � � \ � � java/lang/StringBuilder � �   � � � � � \ keyword � � � 9 � 9 � 9 java_cup/runtime/XMLElement java/lang/Object $java_cup/runtime/XMLElement$Terminal !java_cup/runtime/XMLElement$Error 'java_cup/runtime/XMLElement$NonTerminal #javax/xml/stream/XMLStreamException .java_cup/runtime/ComplexSymbolFactory$Location  javax/xml/stream/XMLStreamWriter writeStartDocument '(Ljava/lang/String;Ljava/lang/String;)V writeProcessingInstruction writeStartElement (Ljava/lang/String;)V writeCharacters writeEndElement java_cup/runtime/ScannerBuffer getBuffered ()Ljava/util/List; java/util/List iterator ()Ljava/util/Iterator; java/util/Iterator hasNext ()Z next ()Ljava/lang/Object; %java_cup/runtime/ComplexSymbolFactory value Ljava/lang/Object; getName ()Ljava/lang/String; writeAttribute getLeft toXML 7(Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;)V append -(Ljava/lang/Object;)Ljava/lang/StringBuilder; -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString getRight writeEndDocument flush close! - .     6 7     8 9  :   3     *� �    ;   
      � <        = >   ? @  A    B � C D  :   J     *+,� �    ;   
       <         E F      G >     H I  J     K � C L  :  �    �+�  +�  +	� 
 -�� F+� 
 -:�66� &2:+� 
 +�  +�  ����+�  +� 
 ,+� +�  *�*+� 
 *� �  :�  ��  � :� � �� :� � T+� 
 +� �  � +� +�  Y� !� � "#� $� %�  � &+'� +�  � l+(� 
 +�  Y� !� � "#� $� %�  +'�  Y� !� &� "#� $� %�  +�  Y� !� � $#� $� %�  +�  � $� � +� 
 +� )�  +�  ���+�  +�  +� * +� + +� , �    ;   � +    
      !  )  B  J  R  X  ^   d # l $ q % w ' { ( � ) � * � + � , � - � . � / � 0 � 1 2 5 63 7R 8o 9u ;x =� >� ?� @� B� C� E� F� G� H� I <   p  B  M 7  , 2 N I  1 - O P  4 * Q P  � � R T  � � M U  � Q V   � W X    � E F   � G >   � H I  J     K Y \   ] \   C ^  J     K  _    ` 1   *  / - 0 	 2 - 3 	 4 - 5 	  z S 	 Z z [ 	                                                                                                                                                                                                                                                                                                                                                                                                                                                            deps/JLex/                                                                                          0000777 0002035 0002035 00000000000 14222102117 011643  5                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  deps/JLex/CAccept.class                                                                             0000666 0002035 0002035 00000001324 14202043766 014210  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 
  	  	  	     m_action [C m_action_read I m_line_number <init> ([CII)V Code LineNumberTable StackMapTable   (LJLex/CAccept;)V mimic 
SourceFile 	Main.java   	 
    
 JLex/CAccept java/lang/Object ()V                	 
      
            �     6*� *� **� �� 6*� � *� +4U����*� �       "   m p 	r s u *s 0x 5y     �               �     ;*� *+� � **� �� =*� � *� +� 4U����*+� � �       "   � � � �  � ,� 2� :�     �               h     /*+� � **� �� =*� � *� +� 4U����          � � � � (� .�     �                                                                                                                                                                                                                                                                                                                   deps/JLex/CAcceptAnchor.class                                                                       0000666 0002035 0002035 00000000451 14202043766 015343  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 
  	  	     m_accept LJLex/CAccept; m_anchor I <init> ()V Code LineNumberTable 
SourceFile 	Main.java 
     	 JLex/CAcceptAnchor java/lang/Object                 	      
      3     *� *� *� �          � � 	� �                                                                                                                                                                                                                             deps/JLex/CAlloc.class                                                                              0000666 0002035 0002035 00000002602 14202043766 014043  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 W
  * +	 , -
 . /
  0
 . 1 2
  *
  3
  4	  5	  6	  7	  8 9
  *	  :
  ;	 , <	  = >
  *	 , ? @ A <init> ()V Code LineNumberTable newCDfa (LJLex/CSpec;)LJLex/CDfa; newCNfaPair ()LJLex/CNfaPair; 	newNLPair (LJLex/CSpec;)LJLex/CNfaPair; StackMapTable 2 newCNfa (LJLex/CSpec;)LJLex/CNfa; 
SourceFile 	Main.java   	JLex/CDfa B C D E F G  H I J JLex/CNfaPair   ! & ' K L M L N L O P 	JLex/CSet Q R S H T P U L 	JLex/CNfa V D JLex/CAlloc java/lang/Object 
JLex/CSpec m_dfa_states Ljava/util/Vector; java/util/Vector size ()I (I)V 
addElement (Ljava/lang/Object;)V m_end LJLex/CNfa; m_start m_next m_edge I m_set LJLex/CSet; add m_dtrans_ncols m_next2 m_nfa_states                       *� �          �        9     � Y*� � � L*� +� +�          � � �    !     &     
� Y� K*�       
   � �  " #    a     � 	L+*� 
� +*� 
� +� *� 
� +� � � +� � � Y� � +� � � 
� *� d�� #+� � � � +� � � �� +� � +� � +� *� 
� +� � � +� � *� 
� +� � � +� � +� � � *� 
� +� � � � 
� +� � � � +� � +�       N   � � � � � *� ;� J� V� f� v� �� �� �� �� �� �� �� �� $    � v %  & '     <     � Y� L*� +� +�� +�          � � � �  (    )                                                                                                                              deps/JLex/CBunch.class                                                                              0000666 0002035 0002035 00000000707 14202043766 014054  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3  
  	  	  	  	  	     	m_nfa_set Ljava/util/Vector; 	m_nfa_bit LJLex/SparseBitSet; m_accept LJLex/CAccept; m_anchor I m_accept_index <init> ()V Code LineNumberTable 
SourceFile 	Main.java   	 
         JLex/CBunch java/lang/Object          	 
                                    N     *� *� *� *� *� *� �          _ ` 	a b c d e                                                               deps/JLex/CDfa.class                                                                                0000666 0002035 0002035 00000001022 14202043766 013476  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 (
 
 	 	 	 	 	 	  	 	 !	 	 "	 	 #	 	 $ % & m_group I m_mark Z m_accept LJLex/CAccept; m_anchor 	m_nfa_set Ljava/util/Vector; 	m_nfa_bit LJLex/SparseBitSet; m_label <init> (I)V Code LineNumberTable 
SourceFile 	Main.java  '               	JLex/CDfa java/lang/Object ()V   	 
                                                       `     (*� *� *� *� *� *� *� *� �       & 	  J K 	L N O Q R "T 'U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    deps/JLex/CDTrans.class                                                                             0000666 0002035 0002035 00000000737 14202043766 014213  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 %
  	  	  	  	  	     ! m_dtrans [I m_accept LJLex/CAccept; m_anchor I m_label F ConstantValue���� <init> (ILJLex/CSpec;)V Code LineNumberTable 
SourceFile 	Main.java  " # $  	 
       JLex/CDTrans java/lang/Object ()V 
JLex/CSpec m_dtrans_ncols          	 
                                       J     *� *,� �
� *� *� *� �          + , - . / 0                                       deps/JLex/CEmit.class                                                                               0000666 0002035 0002035 00000050067 14202043766 013717  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3G
^�	]�	]�	]�	]�	]�
]�	]�	]�
��	���
��	���
 ��
 �
 �
 �
��	��
�����	 ���	 �	 �
 ��	���	 #�	����
 �	��
���
]�
]�
]�
]�
]�
]��
���������	����	��	��	���	��	��
��������	���	�����
���	���	��
 ��	���	��������������������� 	�	�	�
	


^�	�	�	�	�	�
] !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}~���������	����
����	�������	����
]�����
���
�
��
�
�
��
 ��
 �
�
 �
]��	��	����	����	���	����������������������	��	���������������������
]������������������ m_spec LJLex/CSpec; m_outstream Ljava/io/PrintWriter; START I ConstantValue    END    NONE    EDBG Z NOT_EDBG     <init> ()V Code LineNumberTable reset set $(LJLex/CSpec;Ljava/io/PrintWriter;)V StackMapTable print_details��� emit 
Exceptions� emit_construct emit_states�� emit_helpers emit_header 
emit_table� emit_table_as_string ([[I)V�� emit_driver emit_actions (Ljava/lang/String;)V emit_footer 
SourceFile 	Main.javaopcdgdidklmlsp_`ab������ >---------------------- Transition Table ----------------------������ java/lang/StringBuilder State ��� � JLex/CAccept  [nonaccepting]  [accepting, line 	d  < java/lang/String
do >] JLex/CDTrans�� 	goto   on [�d ]tu�p~p�p�p�p (	private final int YY_BUFFER_SIZE = 512;� 	private final int YY_F = -1; $	private final int YY_NO_STATE = -1; %	private final int YY_NOT_ACCEPT = 0;  	private final int YY_START = 1; 	private final int YY_END = 2; $	private final int YY_NO_ANCHOR = 4; 	private final int YY_BOL = d ; 	private final int YY_EOF = dll 	public final int YYEOF = -1;d *	private java.io.BufferedReader yy_reader; 	private int yy_buffer_index; 	private int yy_buffer_read; 	private int yy_buffer_start; 	private int yy_buffer_end; 	private char yy_buffer[];l 	private int yychar;l 	private int yyline; 	private boolean yy_at_bol; 	private int yy_lexical_state;�p 	l public o  (java.io.Reader reader) 			throws  d 		{  { 
		this (); 		if (null == reader) { =			throw (new Error("Error: Bad input stream initializer.")); 		} 1		yy_reader = new java.io.BufferedReader(reader); 	}  (java.io.InputStream instream) 		if (null == instream) { R		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream)); 		private   () '		yy_buffer = new char[YY_BUFFER_SIZE]; 		yy_buffer_read = 0; 		yy_buffer_index = 0; 		yy_buffer_start = 0; 		yy_buffer_end = 0; 		yychar = 0; 		yyline = 0; 		yy_at_bol = true; 		yy_lexical_state = YYINITIAL;!"d#$%&'�()*+ 	private final int   = ,- (	private final int yy_state_dtrans[] = {.� 		 , 	}; %	private boolean yy_eof_done = false;/ 	private void yy_do_eof ()01d 		if (false == yy_eof_done) {2d 		yy_eof_done = true;p #	private void yybegin (int state) { 		yy_lexical_state = state; 	private int yy_advance () 		throws java.io.IOException { 		int next_read; 		int i; 		int j; )		if (yy_buffer_index < yy_buffer_read) { '			return yy_buffer[yy_buffer_index++]; 		if (0 != yy_buffer_start) { 			i = yy_buffer_start; 				j = 0; 			while (i < yy_buffer_read) {  				yy_buffer[j] = yy_buffer[i]; 				++i; 				++j; 			} 3			yy_buffer_end = yy_buffer_end - yy_buffer_start; 			yy_buffer_start = 0; 			yy_buffer_read = j; 			yy_buffer_index = j; (			next_read = yy_reader.read(yy_buffer, 					yy_buffer_read, (					yy_buffer.length - yy_buffer_read); 			if (-1 == next_read) { 				return YY_EOF; /			yy_buffer_read = yy_buffer_read + next_read; -		while (yy_buffer_index >= yy_buffer_read) { -			if (yy_buffer_index >= yy_buffer.length) { %				yy_buffer = yy_double(yy_buffer); &		return yy_buffer[yy_buffer_index++]; 	private void yy_move_end () { (		if (yy_buffer_end > yy_buffer_start && )		    '\n' == yy_buffer[yy_buffer_end-1]) 			yy_buffer_end--; )		    '\r' == yy_buffer[yy_buffer_end-1]) &	private boolean yy_last_was_cr=false;  	private void yy_mark_start () { 7		for (i = yy_buffer_start; i < yy_buffer_index; ++i) { 1			if ('\n' == yy_buffer[i] && !yy_last_was_cr) { 				++yyline; 			if ('\r' == yy_buffer[i]) { 				yy_last_was_cr=true; 			} else yy_last_was_cr=false; 		yychar = yychar '			+ yy_buffer_index - yy_buffer_start; $		yy_buffer_start = yy_buffer_index; 	private void yy_mark_end () { "		yy_buffer_end = yy_buffer_index; 	private void yy_to_mark () { "		yy_buffer_index = yy_buffer_end; 2		yy_at_bol = (yy_buffer_end > yy_buffer_start) && 4		            ('\r' == yy_buffer[yy_buffer_end-1] || 4		             '\n' == yy_buffer[yy_buffer_end-1] || :		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] || 9		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]); %	private java.lang.String yytext () { )		return (new java.lang.String(yy_buffer, 			yy_buffer_start, %			yy_buffer_end - yy_buffer_start)); 	private int yylength () { )		return yy_buffer_end - yy_buffer_start; (	private char[] yy_double (char buf[]) { 		char newbuf[]; "		newbuf = new char[2*buf.length]; $		for (i = 0; i < buf.length; ++i) { 			newbuf[i] = buf[i]; 		return newbuf; %	private final int YY_E_INTERNAL = 0; "	private final int YY_E_MATCH = 1; /	private java.lang.String yy_error_string[] = { 		"Error: Internal error.\n", 		"Error: Unmatched input.\n" 1	private void yy_error (int code,boolean fatal) { 4		java.lang.System.out.print(yy_error_string[code]); 		java.lang.System.out.flush(); 		if (fatal) { %			throw new Error("Fatal Error.\n"); D	private int[][] unpackFromString(int size1, int size2, String st) { 		int colonIndex = -1; 		String lengthString; 		int sequenceLength = 0; 		int sequenceInteger = 0; 		int commaIndex; 		String workString; &		int res[][] = new int[size1][size2]; "		for (int i= 0; i < size1; i++) { #			for (int j= 0; j < size2; j++) { 				if (sequenceLength != 0) { !					res[i][j] = sequenceInteger; 					sequenceLength--; 					continue; 				} !				commaIndex = st.indexOf(','); (				workString = (commaIndex==-1) ? st : !					st.substring(0, commaIndex); $				st = st.substring(commaIndex+1); )				colonIndex = workString.indexOf(':'); 				if (colonIndex == -1) { ,					res[i][j]=Integer.parseInt(workString); 				lengthString = (					workString.substring(colonIndex+1); 2				sequenceLength=Integer.parseInt(lengthString); 2				workString=workString.substring(0,colonIndex); 1				sequenceInteger=Integer.parseInt(workString);  				res[i][j] = sequenceInteger; 				sequenceLength--; 		return res; class 3  implements  	private int yy_acpt[] = {45 		/*   */ 6� YY_START | YY_END YY_START YY_END YY_NO_ANCHOR YY_NOT_ACCEPT7� *	private int yy_cmap[] = unpackFromString( [I�� )[0]; *	private int yy_rmap[] = unpackFromString( +	private int yy_nxt[][] = unpackFromString( );8 java/lang/StringBuffer�9 :�:;5 "<= " +<>o��?�p 	public int @Al 	public java.lang.Integer  	public B   		throws java.io.IOExceptionC , Dd 		int yy_lookahead; 		int yy_anchor = YY_NO_ANCHOR; 3		int yy_state = yy_state_dtrans[yy_lexical_state]; "		int yy_next_state = YY_NO_STATE; )		int yy_last_accept_state = YY_NO_STATE; 		boolean yy_initial = true; 		int yy_this_accept; 		yy_mark_start(); %		yy_this_accept = yy_acpt[yy_state]; (		if (YY_NOT_ACCEPT != yy_this_accept) { #			yy_last_accept_state = yy_state; 			yy_mark_end(); 		while (true) { 6			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL; $			else yy_lookahead = yy_advance(); 			yy_next_state = YY_F; D			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]]; 6			if (YY_EOF == yy_lookahead && true == yy_initial) { 				yy_do_eof(); 				return YYEOF;EFd 				return null; 			if (YY_F != yy_next_state) { 				yy_state = yy_next_state; 				yy_initial = false; '				yy_this_accept = yy_acpt[yy_state]; *				if (YY_NOT_ACCEPT != yy_this_accept) { %					yy_last_accept_state = yy_state; 					yy_mark_end(); 				else { .				if (YY_NO_STATE == yy_last_accept_state) { :					throw (new Error("Lexical Error: Unmatched Input.")); 
				else { /					yy_anchor = yy_acpt[yy_last_accept_state]; %					if (0 != (YY_END & yy_anchor)) { 						yy_move_end(); 					} 					yy_to_mark(); $					switch (yy_last_accept_state) { 					�� 					default: $						yy_error(YY_E_INTERNAL,false); 					case -1: 					yy_initial = true; 2					yy_state = yy_state_dtrans[yy_lexical_state]; !					yy_next_state = YY_NO_STATE; (					yy_last_accept_state = YY_NO_STATE; 					yy_mark_start(); (					yy_this_accept = yy_acpt[yy_state]; +					if (YY_NOT_ACCEPT != yy_this_accept) { &						yy_last_accept_state = yy_state; 						yy_mark_end(); case  	break; } 
JLex/CEmit java/lang/Object java/io/IOException java/util/Enumeration [[I java/io/PrintWriter JLex/CUtility ASSERT (Z)V java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println 
JLex/CSpec 	m_row_map append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; print m_accept_vector Ljava/util/Vector; java/util/Vector 	elementAt (I)Ljava/lang/Object; m_line_number m_action [C m_action_read ([CII)V m_dtrans_vector m_dtrans 	m_col_map (C)Ljava/lang/StringBuilder; m_dtrans_ncols (C)V BOL EOF m_integer_type m_yyeof m_class_code m_class_read m_count_chars m_count_lines m_public m_class_name ([C)V m_init_throw_code m_init_throw_read m_init_code m_init_read m_states Ljava/util/Hashtable; java/util/Hashtable keys ()Ljava/util/Enumeration; hasMoreElements ()Z nextElement ()Ljava/lang/Object; get &(Ljava/lang/Object;)Ljava/lang/Object; m_state_dtrans 
m_eof_code m_eof_throw_code m_eof_throw_read 
m_eof_read m_implements_name size ()I m_anchor_array 
m_ccls_map (I)V (I)Ljava/lang/StringBuffer; ,(Ljava/lang/String;)Ljava/lang/StringBuffer; length 	substring (II)Ljava/lang/String; (I)Ljava/lang/String; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; m_function_name m_intwrap_type m_type_name m_yylex_throw_code m_yylex_throw_read m_eof_value_code m_eof_value_read  ]^    _`   ab   cd e   f gd e   h id e   j kl e   f ml e   n   op q   V     "*� *� *� *� *� *� *� �   r   "   � � 	� � � � � !� sp q   +     *� *� 	�   r      � � 
� tu q   [     %+� � � 
,� � � 
*+� *,� 	�   r      � � � � $�v    	@@ wp q  �    z� � <*� � ��^� � Y� � � � � *� � � � :� � � � ?� � Y� � � � � � Y� � �  � !� � � *� � "*� � .� � #:6� $*� � %..6� )6� � Y� &� � '� � (� � =*� � )� p� $*� � %..>� � N� �� *� C6� � +� 6� *6� � Y� &� � '� �� (� � ����� � +� ����� � �   r   ~      / ? E P" �) �+ �, �- �/ �0 �2 �4579>? A(B+D1F4GX2^KcMkqQySv   { � 
� E x    y  ;� W x  zy  �  x zy  � 1 xzy  ,�  x zy  �  x    {u q   �     ?*+,� ,*� � � � 
*� 	� � � 
*� -*� .*� /*� 0*� 1*� �   r   * 
  ` d e &l *m .n 2o 6p :r >sv    @@|    } ~p q  �    *� � � � 
*� 	� � � 
*� 	2� 3*� 	4� 3*� 	5� 3*� 	6� 3*� 	7� 3*� 	8� 3*� 	9� 3*� 	� Y� :� *� � ;� <� � � 3*� 	� Y� =� *� � >� <� � � 3*� � ?� *� � @� *� 	A� 3*� � B�  *� 	� Y*� � B*� � C�  � D*� 	E� 3*� 	F� 3*� 	G� 3*� 	H� 3*� 	I� 3*� 	J� 3*� � K� *� 	L� 3*� � M� *� 	N� 3*� 	O� 3*� 	P� 3*� 	� Q*� 	R� D*� � S� *� 	T� D*� 	� Y*� � U� V� D*� 	W� D*� � X� C*� 	� Q*� 	Y� D*� 	� Y*� � X*� � Z�  � D*� 	� Q*� 	[� 3� *� 	\� 3*� 	]� 3*� 	^� 3*� 	_� 3*� 	`� 3*� 	a� 3*� 	b� 3*� 	� Q*� 	R� D*� � S� *� 	T� D*� 	� Y*� � U� V� D*� 	c� D*� � X� <*� 	� Q*� 	Y� D*� 	� Y*� � X*� � Z�  � 3*� 	[� 3� *� 	\� 3*� 	]� 3*� 	d� 3*� 	_� 3*� 	`� 3*� 	e� 3*� 	b� 3*� 	� Q*� 	f� D*� 	� Y*� � U� V� D*� 	g� D*� � X� <*� 	� Q*� 	Y� D*� 	� Y*� � X*� � Z�  � 3*� 	[� 3� *� 	\� 3*� 	h� 3*� 	i� 3*� 	j� 3*� 	k� 3*� 	l� 3*� � K� *� 	m� 3*� � M� *� 	n� 3*� 	o� 3*� 	p� 3*� � q�  *� 	� Y*� � q*� � r�  � D*� 	b� 3*� 	� Q�   r  j Z  � �  � )� 2� ;� D� M� V� _� �� �� �� �� �� �� ���
���%�/�8�B�K�T�]�d�m�x�������������������������� �)�0�9�D�M�b�k�v�}���������������������������'�.�7�T `ir{	�
����������"�#%v   $ @@� �'� H5� h� Y� a� �?9|    } p q  <     �*� � s� tL+� u � R+� v � M,� � � 
*� 	� Y� w� ,� x� *� � s,� y� z� <� � � 3���*� 	{� 3>*� � |�� L*� 	� Y� }� *� � |.� � � D*� � |�d� *� 	~� 3� 
*� 	� Q����*� 	� 3�   r   :   5 7 9 = +@ cH lI zK �L �N �R �I �U �Vv    � �� �@� :� 
 � G|    } �p q  	    5*� � � � 
*� 	� � � 
*� 	�� 3*� � �� �*� 	�� D*� � �� <*� 	� Q*� 	Y� D*� 	� Y*� � �*� � ��  � 3*� 	[� 3� *� 	\� 3*� 	�� 3*� 	� Y*� � �*� � ��  � D*� 	`� 3*� 	�� 3*� 	b� 3*� �*� 	�� 3*� 	�� 3*� 	b� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	� Q*� 	�� 3*� 	�� 3*� 	`� 3*� 	� Q*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	`� 3*� 	� Q*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	`� 3*� 	�� 3*� 	b� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	b� 3*� 	�� 3*� 	�� 3*� � M� *� � K� �*� � M� ]*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	`� 3*� � K� *� 	�� 3*� 	�� 3*� 	�� 3*� 	b� 3*� 	�� 3*� 	�� 3*� 	b� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	�� 3*� 	b� 3*� 	�� 3*� 	¶ 3*� 	ö 3*� 	Ķ 3*� 	b� 3*� 	Ŷ 3*� 	ƶ 3*� 	b� 3*� 	Ƕ 3*� 	�� 3*� 	ȶ 3*� 	ɶ 3*� 	ʶ 3*� 	˶ 3*� 	`� 3*� 	̶ 3*� 	b� 3*� 	Ͷ 3*� 	ζ 3*� 	϶ 3*� 	ж 3*� 	Ѷ 3*� 	� 3*� 	Ҷ 3*� 	Ӷ 3*� 	Զ 3*� 	ն 3*� 	ֶ 3*� 	`� 3*� 	b� 3*� 	׶ 3*� 	ض 3*� 	ٶ 3*� 	ڶ 3*� 	۶ 3*� 	� Q*� 	ܶ 3*� 	ݶ 3*� 	� Q*� 	޶ 3*� 	߶ 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	�� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	� 3*� 	�� 3*� 	`� 3*� 	�� 3*� 	b� 3�   r  � �  d e  i )j 4l =n Hp Oq Xr ut �x �{ �| �~ � �� �� �� �� �� �� �� ������'�0�9�@�I�R�[�d�m�v����������������������������������(�1�:�C�L�U�^�g�p�y�������������������������������(�1�:�C�L�V�_�h�q�z������������������������ ��
%.7@IR[dmv��������� �!�"�3�5�6789:(;1<8=A>J?S@\AeBnCwD�E�F�G�H�I�J�K�L�M�N�O�P�R�T�VWXY"Z+[4\v    
@@� c� @�� c|    } �p q   �     �*� � � � 
*� 	� � � 
*� 	� Q*� 	� Q*� � S� *� 	T� D*� 	�� D*� 	� Y*� � U*� � U��  � D*� � ��� **� 	�� D*� 	� Y*� � �*� � ���  � D*� 	\� 3�   r   6   i j  m 'n .o 9p Br Ks iu tv }w �z �{v    @@$� X|    } �p q  �  
  *� � � � 
*� 	� � � 
*� 	�� 3*� � � �>=� �*� � � � :*� 	� Y� �� � �� � � D� u*� � �.~� � 6*� � �.~� � 6� � *� 	�� D� <� *� 	�� D� +� *� 	�� D� *� 	 � D� *� 	� Dd� *� 	~� D*� 	� Q���0*� 	� 3*� ���
:<*� ��� *� � %*� �..O����*� 	� D*�YS�*� 	� 3*� 	� Q*� 	� D*�Y*� � S�*� 	� 3*� 	� Q*� � "� �>�:	=� :*� � "� � #:� $�*� � )� � � 
	� $S����*� 	� D*	�*� 		� 3*� 	� Q�   r   � /  � �  � )� 4� ;� K� j� p� �� �� �� �� �� �� �� �� �� �� �� ���	���,�A�G�Q�^�h�o�y���������������������������v   � @@�  � L x    y  @�  x   y  @�  x  y  �  x    y  	�  x   �  	x      &� g�� ( 
xz   �  @�  
x    �  |    } �� q  �  
  �=>�6*� 	+��
*� 	~� D*� 	+�� 
+2�� �
*� 	~� 3�Y�:6+�� �6+2�� �+2.6� %� 	�� L�W�W=>� 4� �W~�W=>� � �W~�W6�K� B�:	*� 	� Y� � 	K�� � � � 3�Y	K��:���C���3� �W� �W�K� B�:*� 	� Y� � K�� � � � 3�YK��:*� 	� Y� � �� � � D�   r   � *  � � � � � � .� 7� @� J� W� `� g� k� q y � � � � � � � � � � � � � � � ��$&!*)-3.:/b0r2�3v   I � * x� ��   x� �� �� 	� #� L� � � H �p q  v    �*� � � � 
*� 	� � � 
*�*� � ?� .*� 	� D*� 	� Y*� �� V� D*� 	g� 3� *� �� .*� 	� D*� 	� Y*� �� V� D*� 	g� 3� J*� 	� D*� 	� Y*� �� V� D*� 	� D*� 	� Y*� �� V� D*� 	g� 3*� 	 � D*� �!� =*� 	"� D*� 	� Y*� �!*� �#�  � D*� 	� Q*� 	[� 3� *� 	\� 3*� 	$� 3*� 	%� 3*� 	&� 3*� 	'� 3*� 	(� 3*� 	)� 3*� 	*� 3*� 	� Q*� 	+� 3*� 	,� 3*� 	-� 3*� 	.� 3*� 	/� 3*� 	`� 3*� 	0� 3*� 	1� 3*� 	2� 3*� 	3� 3*� 	4� 3*� 	5� 3*� � �� *� 	6� 3*� � ?� *� 	7� 3� 8*� �8� #*� 	� Y*� �8*� �9�  � D� *� 	:� 3*� 	�� 3*� 	;� 3*� 	<� 3*� 	=� 3*� 	>� 3*� 	?� 3*� 	@� 3*� 	A� 3*� 	� 3*� 	�� 3*� 	B� 3*� 	C� 3*� 	D� 3*� 	� 3*� 	E� 3*� 	F� 3*� 	G� 3*� 	H� 3*� 	I� 3*� 	J� 3*� 	K� 3*L�M*� 	N� 3*� 	O� 3*� 	P� 3*� 	I� 3*� 	Q� 3*� 	R� 3*� 	S� 3*� 	T� 3*� 	U� 3*� 	V� 3*� 	W� 3*� 	X� 3*� 	Y� 3*� 	I� 3*� 	� 3*� 	�� 3*� 	`� 3*� 	b� 3�   r  n [  @ A  D $F .H 8I MJ YL cN mO �P �T �U �V �W �X �\ �] �_ �`bc$g-j7kAnKpUr_sitsuzw�y�z�{�|�}�������������������)�I�S�\�f�p�z������������������������������!�(�2�<�F�P�Z�d�n�x����������������v    @@;4� F� N� �*	|    } �� q  ]     �*� � � �*� � ��� � � 
�6*� � � �>=� �*� � � � :� �*� 	� Y� +� Z� � � � � 3*� 	� Y� +� R� � � D*� 	� Y� � �  � D*� 	� Q*� 	� Y� +� Z� � � � � 3*� 	� Y� +� [� � � 3�����?�   r   >    # !$ ,% 3' C( I* n, �- �/ �0 �1 �2 �% �5v    @� � �y� |    } �p q   ]     +*� � � � 
*� 	� � � 
*� 	\� 3�   r      B C  F *Gv    @@|    } �   �                                                                                                                                                                                                                                                                                                                                                                                                                                                                         deps/JLex/CError.class                                                                              0000666 0002035 0002035 00000005206 14202043766 014105  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 �
 ( b	 c d e
  b f
  g
  h
 i j k
  l m n	 ' o p q
  r s t u v w x y z { | } ~  � � � � � � � � � � � 	E_BADEXPR I ConstantValue     E_PAREN    E_LENGTH    	E_BRACKET    E_BOL    E_CLOSE    	E_NEWLINE    E_BADMAC    E_NOMAC    
E_MACDEPTH   	 E_INIT   
 E_EOF    E_DIRECT    
E_INTERNAL    E_STATE    E_MACDEF    E_SYNTAX    E_BRACE    E_DASH    E_ZERO    	E_BADCTRL    errmsg [Ljava/lang/String; <init> ()V Code LineNumberTable impos (Ljava/lang/String;)V parse_error (II)V <clinit> 
SourceFile 	Main.java W X � � � java/lang/StringBuilder JLex Error:  � � � � � � \ Error: Parse error at line  � � . Description:  U V java/lang/Error Parse error. W \ java/lang/String Malformed regular expression. Missing close parenthesis. 4Too many regular expressions or expression too long. Missing [ in character class. ,^ must be at start of expression or after [. 4+ ? or * must follow an expression or subexpression. Newline in quoted string. Missing } in macro expansion. Macro does not exist. #Macro expansions nested too deeply. +JLex has not been successfully initialized. Unexpected end-of-file found. )Undefined or badly-formed JLex directive. Internal JLex error. Unitialized state name. Badly formed macro definition. Syntax error. )Missing brace at start of lexical action. `Special character dash - in character class [...] must
	be preceded by start-of-range character. Zero-length regular expression. RIllegal \^C-style escape sequence (character following caret must
	be alphabetic). JLex/CError java/lang/Object java/lang/System out Ljava/io/PrintStream; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; java/io/PrintStream println (I)Ljava/lang/StringBuilder;   ' (     ) *  +    ,  - *  +    .  / *  +    0  1 *  +    2  3 *  +    4  5 *  +    6  7 *  +    8  9 *  +    :  ; *  +    <  = *  +    >  ? *  +    @  A *  +    B  C *  +    D  E *  +    F  G *  +    H  I *  +    J  K *  +    L  M *  +    N  O *  +    P  Q *  +    R  S *  +    T  U V      W X  Y        *� �    Z      �  [ \  Y   6     � � Y� � *� � � �    Z   
   � �  ] ^  Y   e     E� � Y� 	� � 
� � � � � Y� � � 2� � � � Y� �    Z      � � ;�  _ X  Y   �      �� YSYSYSYSYSYSYSYSYSY	SY
SYSYSYSY SY!SY"SY#SY$SY%SY&S� �    Z      �  `    a                                                                                                                                                                                                                                                                                                                                                                                          deps/JLex/CInput.class                                                                              0000666 0002035 0002035 00000002666 14202043766 014122  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 Z
  4
 5 6 7
  8	  9	  :	  ;	  <	  =	  >	  ?
 5 @
  A B
  4
  C D
  E
 F G H I m_input Ljava/io/BufferedReader; m_eof_reached Z m_pushback_line m_line [C m_line_read I m_line_index m_line_number EOF ConstantValue    NOT_EOF     <init> (Ljava/io/Reader;)V Code LineNumberTable StackMapTable H J getLine ()Z K 
Exceptions L 
SourceFile 	Main.java & M N O P java/io/BufferedReader & '                Q R S T java/lang/StringBuilder U V 
 W T K X Y JLex/CInput java/lang/Object java/io/Reader java/lang/String java/io/IOException ()V JLex/CUtility ASSERT (Z)V isspace (C)Z readLine ()Ljava/lang/String; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString toCharArray ()[C       	                                            !   "    #  $   "    %    & '  (   �     <*� +� � � *� Y+� � *� *� *� *� 	*� 
*� �    )   * 
  � � � � "� '  , 1 6 ; *    �   + ,  @   - .  (  W     �*� 	� �*� � 7*� =*� � *� 4� � � 	����*� � 
*� �*� � YL� *� 	*� �*� Y� +� � � � � **� �� *Y� 
`� 
=*� 4� � �*� ��� *� ���� *� �    )   n     	  " $ ,& /" 5+ =- B. D4 Q6 V7 [8 ]: w; �< �? �@ �B �C �E �I �K �O �P *    		�  � �  /� .
 0     1  2    3                                                                          deps/JLex/CLexGen.class                                                                             0000666 0002035 0002035 00000066110 14202043766 014177  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3r
)�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(�	(��
 *�	(�	���
 .��
 .��
 .�
����� 
 7�
 6
 5	(
 ?	(
 B�	(	

 E
 G
 B
 J	(
 M�	(
 P�	(
 S�	(
 V�	(
 Y�	(

	 J !
("	 ?#	 ?$%
(&'
(()
 Y*
 5+
 ?,	 ?-	 ?.	 ?/0
 n1
 52
3
4
5
6	 J7	 J8	 J9	 J:	 J;	 J<	 J=
�>	 ??	 J@
(A	 JB
(C	 JD	 JEF
 nG	 JHI	 JJK	 JL	 JM	 JN	 JO	 JP	 JQ	 JR	 JS	 JT	 JU	 JV	 JW	 JX
(Y   	 JZ	 J[
(\]
 S^
 S_
 V`	 Jab
 Mcd
 Pef
�2
gh
(i
�jk
 n�	 Jl
mn
 G�opqrst
 E�u
mv
mwxy
(z{	 �|}~	 �	 ��	 ��
(����	 ���	 �����	 ��	 ����
��	 J�
 B�����
 B����
 G�	 J�
 .���
 ���
 ��
 Bv�
���	 J���
 n�
 n�
 E�
�
�
�
��
 �1	 J�	 J�
(���	 J�
(��������������������	 J���	 ���	 J����	 J�	 J�	����	 �$��	����	������� 
m_instream Ljava/io/Reader; m_outstream Ljava/io/PrintWriter; m_input LJLex/CInput; m_tokens Ljava/util/Hashtable; m_spec LJLex/CSpec; m_init_flag Z 	m_makeNfa LJLex/CMakeNfa; 	m_nfa2dfa LJLex/CNfa2Dfa; 
m_minimize LJLex/CMinimize; m_simplifyNfa LJLex/CSimplifyNfa; m_emit LJLex/CEmit; ERROR ConstantValue     	NOT_ERROR    BUFFER_SIZE I    EOS ANY    AT_BOL    AT_EOL    CCL_END    	CCL_START    CLOSE_CURLY    CLOSE_PAREN    CLOSURE   	 DASH   
 END_OF_INPUT    L    
OPEN_CURLY    
OPEN_PAREN    OPTIONAL    OR    
PLUS_CLOSE    
CLASS_CODE 	INIT_CODE EOF_CODE INIT_THROW_CODE YYLEX_THROW_CODE EOF_THROW_CODE EOF_VALUE_CODE m_state_dir [C 
m_char_dir 
m_line_dir 	m_cup_dir m_class_dir m_implements_dir m_function_dir 
m_type_dir m_integer_dir m_intwrap_dir 
m_full_dir m_unicode_dir m_ignorecase_dir m_notunix_dir m_init_code_dir m_init_code_end_dir m_init_throw_code_dir m_init_throw_code_end_dir m_yylex_throw_code_dir m_yylex_throw_code_end_dir m_eof_code_dir m_eof_code_end_dir m_eof_value_code_dir m_eof_value_code_end_dir m_eof_throw_code_dir m_eof_throw_code_end_dir m_class_code_dir m_class_code_end_dir m_yyeof_dir m_public_dir 
all_states LJLex/SparseBitSet; m_advance_stop <init> (Ljava/lang/String;)V Code LineNumberTable StackMapTable�0 
Exceptions�� generate ()V userCode getName ()[Cq packCode ([C[C[CII)[C userDeclare 	userRules printccl (LJLex/CSet;)V plab (LJLex/CNfa;)Ljava/lang/String; 
interp_int (I)Ljava/lang/String; 	print_nfax��� 	getStates ()LJLex/SparseBitSet;� expandMacro ()Z 	saveMacro 
saveStates expandEscape ()C 
packAccept ()LJLex/CAccept;� advance ()I details 	print_set (Ljava/util/Vector;)V print_header� 
SourceFile 	Main.java��iFjFkFlFmFnFoFpqrqsqtquqvqwqxqyqzq{q|q}q~qq�q�q�q�q�q�q�q�q�q�q�q�q�q�q�q���545 java/io/FileReader��*+��� java/lang/StringBuilder !Error: Unable to open input file �� .����� java/io/PrintWriter java/io/BufferedWriter java/io/FileWriter .java��,- "Error: Unable to open output file  .java. JLex/CInput��./ java/util/Hashtable01 java/lang/Character�� java/lang/Integer���� 
JLex/CSpec��23 JLex/CNfa2Dfa89 JLex/CMinimize:; JLex/CMakeNfa67 JLex/CSimplifyNfa<= 
JLex/CEmit>?�������5 &Processing first section -- user code.���5�F /Processing second section -- JLex declarations.�� *Processing third section -- lexical rules.�� !Outputting lexical analyzer code. ��FqF java/lang/String��	

FFFFFFF5q��5��q5 java_cup.runtime.Scanner�q 
next_token q java_cup.runtime.Symbol!q"q#q$q%F&5'5(q)q*5+5,5-5��.5/q�� $Creating NFA machine representation.0123415F Creating DFA transition table.67  Minimizing DFA transition table.81  [9:;��� --<=>?@ \b \t \n \f \r \  1--------------------- NFA -----------------------A�BC 	JLex/CNfa 
Nfa state �� : DE 
(TERMINAL) --> FEGFHI�� 	 EPSILON     (START STATE)JK  accepting LF ^   <MqNF > $��O1PQ�R�STUV State " " has identifying index  !	Start states of matching rules: W�XY�Z /-------------------- NFA ---------------------- JLex/SparseBitSet Uninitialized State Name: [� Unfinished macro name\� Unfinished macro name at line  Nonexistent macro name]1 Error: Undefined macro " ".^�_`abc
dbe
fb JLex/CAcceptghi5�� m_input.m_line_index =  m_input.m_line_read = j5�� 	** Macros ** Macro name " " has definition " 	** States ** 	** Character Counting ** Character counting is off. Character counting is on. 	** Line Counting ** Line counting is off. Line counting is on. #	** Operating System Specificity ** "Not generating UNIX-specific code. 8(This means that "\r\n" is a newline, rather than "\n".) Generating UNIX-specific code. 8(This means that "\n" is a newline, rather than "\r\n".) 	** Java CUP Compatibility ** Generating CUP compatible code. .(Scanner implements java_cup.runtime.Scanner.) #Not generating CUP compatible code.k= 	** DFA transition table ** empty lF 4/*---------------------- DFA -----------------------mn "	Start index in transition table:  !	No associated transition states. JLex/CDTranso=pn 	 * State   [nonaccepting]  [accepting, line   < >] 	 Anchor:  start  end qn  *    goto   on   *               */ JLex/CLexGen java/lang/Object java/io/FileNotFoundException java/io/IOException java/io/PrintStream java/util/Enumeration java/lang/System out Ljava/io/PrintStream; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; println (Ljava/io/Writer;)V (Ljava/io/Reader;)V (C)V (I)V put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; (LJLex/CLexGen;)V JLex/CError parse_error (II)V JLex/CUtility ASSERT (Z)V 	m_verbose m_eof_reached m_line_number emit $(LJLex/CSpec;Ljava/io/PrintWriter;)V close getLine m_line_read m_line m_line_index ([CII)V print isspace (C)Z 	isnewline charncmp 
([CI[CII)I 
doubleSize ([C)[C m_class_read m_init_read 
m_eof_read m_eof_value_read m_init_throw_read m_yylex_throw_read m_eof_throw_read 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V m_pushback_line m_class_code m_count_chars m_class_name m_cup_compatible toCharArray m_implements_name m_function_name m_type_name 
m_eof_code m_eof_value_code m_eof_throw_code m_dtrans_ncols m_integer_type m_intwrap_type m_init_code m_init_throw_code m_ignorecase m_count_lines m_unix m_public m_yyeof m_yylex_throw_code allocate_BOL_EOF (LJLex/CSpec;)V thompson *(LJLex/CLexGen;LJLex/CSpec;LJLex/CInput;)V simplify m_current_token make_dfa (LJLex/CLexGen;LJLex/CSpec;)V min_dfa 	JLex/CSet contains (I)Z m_nfa_states Ljava/util/Vector; java/util/Vector indexOf (Ljava/lang/Object;)I size 	elementAt (I)Ljava/lang/Object; m_next LJLex/CNfa; m_next2 m_edge m_set LJLex/CSet; m_accept LJLex/CAccept; m_anchor m_action m_action_read m_states keys ()Ljava/util/Enumeration; hasMoreElements nextElement ()Ljava/lang/Object; get &(Ljava/lang/Object;)Ljava/lang/Object; intValue m_state_rules [Ljava/util/Vector; (I)Ljava/lang/StringBuilder; set impos m_macros length charAt (I)C toUpperCase (C)C 
ishexdigit hex2bin 
isoctdigit oct2bin m_lexeme C 
m_in_quote m_in_ccl m_dtrans_vector m_label m_state_dtrans [I m_accept_vector m_anchor_array m_dtrans  ()   F *+   ,-   ./   01   23   45   67   89   :;   <=   >?   @5 A   B C5 A   D EF A   G HF A   D IF A   J KF A   L MF A   N OF A   P QF A   R SF A   T UF A   V WF A   X YF A   Z [F A   \ ]F A   ^ _F A   ` aF A   b cF A   d eF A   f gF A   h iF A   B jF A   D kF A   J lF A   L mF A   N nF A   P oF A   R pq   rq   sq   tq   uq   vq   wq   xq   yq   zq   {q   |q   }q   ~q   q   �q   �q   �q   �q   �q   �q   �q   �q   �q   �q   �q   �q   �q   �q   �q   ��   �5     �� �  	� 	   �*� *� *� *� *� *� *� *� *�Y%UYsUYtUYaUYtUYeUYU� 	*�Y%UYcUYhUYaUYrUYU� 
*�Y%UYlUYiUYnUYeUYU� *�Y%UYcUYuUYpUYU� *�Y%UYcUYlUYaUYsUYsUYU� *�Y%UYiUYmUYpUYlUYeUYmUYeUYnUY	tUY
sUYU� *
�Y%UYfUYuUYnUYcUYtUYiUYoUYnUY	U� *�Y%UYtUYyUYpUYeUYU� *	�Y%UYiUYnUYtUYeUYgUYeUYrUYU� *	�Y%UYiUYnUYtUYwUYrUYaUYpUYU� *�Y%UYfUYuUYlUYlUYU� *	�Y%UYuUYnUYiUYcUYoUYdUYeUYU� *�Y%UYiUYgUYnUYoUYrUYeUYcUYaUY	sUY
eUYU� *	�Y%UYnUYoUYtUYuUYnUYiUYxUYU� *�Y%UYiUYnUYiUYtUY{UYU� *�Y%UYiUYnUYiUYtUY}UYU� *�Y%UYiUYnUYiUYtUYtUYhUYrUYoUY	wUY
{UYU� *�Y%UYiUYnUYiUYtUYtUYhUYrUYoUY	wUY
}UYU� *�Y%UYyUYyUYlUYeUYxUYtUYhUYrUY	oUY
wUY{UYU� *�Y%UYyUYyUYlUYeUYxUYtUYhUYrUY	oUY
wUY}UYU� *�Y%UYeUYoUYfUY{UYU� *�Y%UYeUYoUYfUY}UYU� *	�Y%UYeUYoUYfUYvUYaUYlUY{UYU� *	�Y%UYeUYoUYfUYvUYaUYlUY}UYU�  *�Y%UYeUYoUYfUYtUYhUYrUYoUYwUY	{UY
U� !*�Y%UYeUYoUYfUYtUYhUYrUYoUYwUY	}UY
U� "*�Y%UY{UYU� #*�Y%UY}UYU� $*�Y%UYyUYyUYeUYoUYfUYU� %*�Y%UYpUYuUYbUYlUYiUYcUYU� &*� '*� (*� )*� *Y+� +� ,*� ,� "� -� .Y� /0� 1+� 12� 1� 3� 4�*� 5Y� 6Y� 7Y� .Y� /+� 18� 1� 3� 9� :� ;� <*� <� "� -� .Y� /=� 1+� 1>� 1� 3� 4�*� ?Y*� ,� @� A*� BY� C� D*� D� EY$� F� GY� H� IW*� D� EY(� F� GY� H� IW*� D� EY)� F� GY� H� IW*� D� EY*� F� GY	� H� IW*� D� EY+� F� GY� H� IW*� D� EY-� F� GY
� H� IW*� D� EY.� F� GY� H� IW*� D� EY?� F� GY� H� IW*� D� EY[� F� GY� H� IW*� D� EY]� F� GY� H� IW*� D� EY^� F� GY� H� IW*� D� EY{� F� GY� H� IW*� D� EY|� F� GY� H� IW*� D� EY}� F� GY� H� IW*� JY*� K� L*� MY� N� O*� PY� Q� R*� SY� T� U*� VY� W� X*� YY� Z� [*� )�   �  & I  � � 	� � � � � "� (_ Se xk �q �w �}0�m����� �%�\������2�{����b��������]����&�+0�5�A Igh�������"<Vp��� �!�"	##$='I*T+_,j-u/�2�3�    �h ��  � R�    ��  �� �  �    *� )� 	
� \*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]*� )� ]*� L� ^� � -_� 4*� `*� A� a� *� A� b� \*� L� ^� � -c� 4*� d*� A� a� *� A� b� \*� L� ^� � -e� 4*� f*� L� ^� � -g� 4*� [*� L*� <� h*� L� ^� *� <� i�   �   n   > @ E F +G ;H KI [J bO lQ tS xT �V �Y �[ �^ �_ �a �d �f �h �n �p �r �t �yz�    @@@@@�    �� �� �  E     �<*� )� 	
� \*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]*� A� a� 	� \*� A� j� 	� \*� A� k� .%*� A� l4�  %*� A� l4� *� A*� A� k� m�*� <� nY*� A� l*� A� k� o� p���   �   B   � � 
� � � -� =� M� ]� g� m� w� }� �� �� ���    � @@@@@5�    � �� �  A     �*� A� m*� A� k� )*� A� l*� A� m4� q� *� AY� m`� m���*� A� m*� A� k� 	� \*� A� m=*� A� k� *� A� l4� r� 	����*� A� md�L=*� A� m*� A� k� >*� A� l*� A� m4� r� (+*� A� l*� A� m4U�*� AY� m`� m���+�   �   :   � '� 7� H� N� V� q� w� �� �� �� �� �� ���     6�   �  ��  � K �� �  R    �� (� "� � � � 	� � � ]*� A� l++�d� s� 	� \-�  �N6-�� -� tN*� A+�d� m*� A� m*� A� k� �*� A� j� *� A� b� \*� A� l,,�d� s���*� A,�d� m�      �          ,   8   D   \   h   t   P*� L� u� W*� L� v� K*� L� w� ?*� L� x� 3*� L� y� '*� L� z� *� L� {� *� A� b� \-�*� A� m*� A� k��-*� A� l*� A� m4U�*� AY� m`� m-����-� tN���   �   � %  � 3 H N
 S Y \ c h s � � � �% �' �* �+ �. �/ 2	367:!;$>-?0B9C<FHJJN[PnQqR~T�V�    +@
&� M�    � �� �  
    {*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]*� A� a� *� A� b� \*� A� j�*� A� k� p%*� A� l4� b%*� A� l4� T*� AY� kd� k*� A� l*� A� l*� A� k� |*� A� }*� A� k� 
*� A� l4� *� A� }�*� A� k� ��r%*� A� l4�l*� A� k� *� A� b� \��J*� A� l4�    7   c   {   �  7  �  ^  7  7  �  7  7  0  7  q  7  �  7  7  �  0  t  7  7  7  �  7   s*� A� l*� #*� #�d� s� (*� L**� #*� $*� L� ~*� L� u� � ~���*� A� b� \��*� A� l*� 
*� 
�d� s� *� A*� 
�� m*� L� ���M*� A� l*� *� �d� s� *� A*� �� m*� L*� �� ���*� A� l*� *� �d� s� >*� A*� �� m*� L� �*� L�� �� �*� L�� �� �*� L�� �� ����*� A� b� \���*� A� l*� *� �d� s� (*� L**� *� *� L� �*� L� w� � ���s*� A� l*� *� �d� s� )*� L**� *�  *� L� �*� L� x� � ���2*� A� l*� !*� !�d� s� (*� L**� !*� "*� L� �*� L� {� � ����*� A� b� \���*� A� l*� *� �d� s� *� A*� �� m*� L*� �� ����*� A� l*� *� �d� s� *� A*� �� m*� L � ���z*� A� b� \��k*� A� l*� *� �d� s� *� A*� �� m*� L� ���9*� A� l*� *� �d� s� *� A*� �� m*� L� ���*� A� l*� *� �d� s� (*� L**� *� *� L� �*� L� v� � ����*� A� l*� *� �d� s� (*� L**� *� *� L� �*� L� y� � ����*� A� l*� *� �d� s� *� A*� �� m*� L*� �� ���R*� A� l*� *� �d� s� *� A*� �� m*� L� ��� *� A� b� \��*� A� l*� *� �d� s� *� A*� �� m*� L� ����*� A� b� \���*� A� l*� *� �d� s� *� A*� �� m*� L� ����*� A� b� \���*� A� l*� &*� &�d� s� *� A*� &�� m*� L� ���]*� A� b� \��N*� A� l*� 	*� 	�d� s� *� A*� 	�� m*� ��� *� A� b� \��*� A� l*� *� �d� s� *� A*� �� m*� L*� �� ����*� A� b� \���*� A� l*� *� �d� s� *� A*� �� m*� L�� ����*� A� b� \���*� A� l*� %*� %�d� s� *� A*� %�� m*� L� ���Y*� A� l*� *� �d� s� (*� L**� *� *� L� �*� L� z� � ���*� A� b� \��
*� A� b� \���*� A� m*� ����   �  . �  2 3 4 -5 =6 M9 W< c@ nC �H �I �L �N �Q �T �W �Y �\_acf�i�o�t�x�z�}����4�@�K�N�i�u�}��������������������1�4�O�q�t��������������������������"�*�- HT\	_z����#�%�+,-//6;7C8F<R>UApH|I�J�N�P�S�Z�[�\�`�b�e�l�mn	rtw3~?C�F�R�U�p�|������������������������
��(�J�M�Y�\�h�k�s�z��   E 6	@@@@@� y '� {?14� U?� @?4311??41111-421?�    � �� �  e     �*� )� 	
� \*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]*� L� ^� � -�� 4*� U*� L� �*� U**� L*� A� �*� X*� L� �*� L� �� � � ]*� L� ^� � -�� 4*� O**� L� �*� L� ^� � -�� 4*� R*� L� ��   �   R   � � � � +� ;� K� [� e� m x � �
 � � � � � � ��    @@@@@5@�    � �� �   u     7� -�� �=*� L� �� +� �� � -*� �� ����߲ -]� ��   �      * + - / (+ .2 63�    � 
 �� �   T     '+� � nY�� ��*� L� �+� �=� GY� H� ��   �      @ B E G�     �� �   �     ��     w         ;   	   E   
   O      Y      c       m� nY�� ��� nY�� ��� nY�� ��� nY�� ��� nY�� ��� nY�� ��� EY�� F� ��   �   "   S <V FY P\ Z_ db ne xh�   	 <						  �� �  �  
  d� -�� 4*� L� �� �><�\*� L� �� �� �M� -� .Y� /�� 1*,� �� 1�� 1� 3� �,� �� � -�� �� �� -� .Y� /�� 1*,� �� �� 1� 3� �� -� .Y� /�� 1*,� �� �� 1� 3� �,� ��    0   ����   %����   *,� · ç .� -Ķ �� #� -� .Y� /Ŷ 1*,� �� �� 1� 3� �� � -ƶ �,� ǥ c� -� .Y� /ȶ 1,� �~� ʧ ˶ 1̶ 1� nY,� Ǵ �,� Ǵ η o� 1϶ 1,� �~� Ч ˶ 1� 3� �� -� ф���*� L� Ҷ �:� � � �� � � n:	*� L� �	� �� G:	� � � ]� � � ]� -� .Y� /׶ 1	� 1ض 1� �� 12� 1� 3� 4� -ٶ �� �6*� L� �2� �66� ?*� L� �2� �� �M� -� .Y� /*� L� �,� �� �Ŷ 1� 3� ������ -� ѧ�'� -ݶ 4�   �   � &  ~ � � � )� K� S� ^� ~� �� �� �� �� �� �� �� �� ���g�m�s��������������������)�L�R�[�c��   � �  � H ��  � ]

� % �� ���  �� ���� 4 �� ���  �� ����  �   � �� 0 
� ��   �  @@� O 
� ���  � B�  � �    �� �      �*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]N*� A� l*� A� m4� q� -*� AY� m`� m*� A� m*� A� k���*� A� j����<*� A� l*� A� m4��*� AY� m`� m� �Y� �N*� A� m*� A� k� *� A� j���*� A� b� \-�*� A� l*� A� m4� q� 9*� AY� m`� m*� A� m*� A� k���*� A� j���*� A� b� \-�,*� A� l*� A� m4� � *� AY� m`� m���>*� A� l*� A� m4� (*� AY� m`� m*� A� m*� A� k� *� (-�*� A� m<*� A� l*� A� m4� q� L,*� A� l*� A� m4� 8>*� A� l*� A� m4� $*� AY� m`� m*� A� m*� A� k���� *� A� md=� nY*� A� l� o:*� L� �� �� G:� )� -� .Y� /� 1� 1� 3� 4*� A� b� \-� ڶ ��c*� '� 3*� �Y� ߵ '*� L� Ҷ �66� *� '� ����*� A� m*� A� k� *� (*� '�   �   � 5  � � � -� =� M� O� d� q� �  � �	 � � � � � � �  �"$&))*+/?1B4R7f9s:�<�>�B�E�G�I�L�O�RUV%Y?ZK\W`_bjdve�g�e�k�m�o�   | 	@@@@@�   �!((!(6�  � �  � ^� X ����  �  �  �  � ! �  �    �  �  �  �    � �� �  x    *� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]{*� A� l*� A� m4� *� A� b� \�*� A� m=*� A� m`<*� A� k� 
� ��6}*� A� l4� /�*� A� k��� .Y� /� 1*� A� b� ܶ 3� ��d6>� 
� ��� � � ]� nY*� A� l� o:*� L� �� �� n:� 0� -� .Y� /� 1� 1� 1� 3� 4*� A� b� \�*� A� l��:	6

� (	
*� A� l
4U
	�� � � ]�
���
	�� 
	� t:	6� � '	
� �U�

	�� 
	� t:	����
	�� 
	� t:	`<*� A� k� )	
*� A� l4U�

	�� 
	� t:	����*� A	� l*� A
� k�   �   � 7  � � � -� =� M� a� m� o� w� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �����=�I�K�W�`�o���������������������������������	����   e 	@@@@@$� #�  9�  �  	@� Z� �� � @�  ����  '* �� �  �  	  x*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]<*� A� l4� q� �*� A� k���=*� A� l4� q� .=*� A� l4�  �*� A� k���*� A� b� \���d>� *� A� b� \*� A� l4� q�  �*� A� k���*� A� b� \���=*� A� l4�  �*� A� k� *� A� b� \� *� A� b� \*� A� l4� q�  �*� A� k���*� A� b� \���6666*� A� l4� q� � � 	� �"*� A� l4� � � � 6\*� A� l4� � 	6� 6� 7� 1[*� A� l4� � 6]*� A� l4� � 6�*� A� k��\� d6� *� A� b� \� � � ]� � � ]*� L� � � � ]*� L� � nY*� A� l� o� nY*� A� l� o� IW�   �   � 9     - = M O! ^# a$ l( m- o/ �1 �2 �5 �8 �; �> �B �D �E �H �L �N �ORV"Y1[4\?_NdQeTfWgZk|m�o�r�t�x�z�{�|�}�~������
���*�7�J�w��   Z $	@@@@@� � :� +*+�  	�   !@"�  	�  	@@@ �� �  �    �*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]*� A� a� �%*� A� l4� � � ]s*� A� l4� � � ]*� A� m*� A� k� � � ]*� A� m� � � ]*� A� k� � � ]*� A� m*� A� k� �*� A� m*� A� k� �*� A� l*� A� m4� q� "*� AY� m`� m*� A� m*� A� k��б*� A� m<*� A� l*� A� m4� q� 8,*� A� l*� A� m4� $*� AY� m`� m*� A� m*� A� k���� *� A� md=*� L� һ nY*� A� l� o� GY*� L� Ҷ � H� IW,*� A� l*� A� m4��!*� AY� m`� m*� A� m*� A� k����   �   ~   � � � -� =� M� W� X� n� �� �� �� �� �� �� �� �����"�L�Y�j�m�w��	�
���   . 	@@@@@@@@@@3� � J� h �� �  �    �*� A� m*� A� k� � � ]*� A� k� � � ]*� A� m� � � ]\*� A� l*� A� m4� "*� AY� m`� m*� A� l*� A� md4�=*� AY� m`� m*� A� l*� A� m4�     ~   ^   x   �  ~  ~  ~   |  ~  ~  ~   �  ~  ~  ~  ~  ~  ~  ~   �  ~  ~  ~   �  ~   �    ~  ~  *� AY� m`� m�*� AY� m`� m	�*� AY� m`� m
�*� AY� m`� m�*� AY� m`� m�*� AY� m`� m*� A� l*� A� m4� �<@� 	Z� *� A� b� \@d�<*� AY� m`� m�=*� AY� m`� m<>� � � F*� A� l*� A� m4� � 1x�<*� A� l*� A� m4� <*� AY� m`� m�����*� A� l*� A� m4� � #*� A� l*� A� m4<*� AY� m`� m� O<>� F*� A� l*� A� m4� � 1x�<*� A� l*� A� m4� ���<*� AY� m`� m�����   �   � /  ! " ,# ?& S( `) r- t. �/236)7,:9;<>I?LBYC\FiG|H�I�J�K�L�O�Q�R�S�T�V�W�XS\_$a4bDfFgMhbjgk}l�g�p�   n @@@5� � � + �  �  �   �  �  H�   � � E�  �   5�  �  � G  �� �  �    = �M>*� � � ]*� <� � � ]*� A� � � ]*� D� � � ]*� L� � � ]*� A� m*� A� k� *� A� j���*� A� b� \�*� A� l*� A� m4� q� 9*� AY� m`� m*� A� m*� A� k���*� A� j���*� A� b� \�{*� A� l*� A� m4� *� A� b� \6Y6
Y6	Y6Y6Y66,*� A� l*� A� m4U� � 	� 	6	� �� � \*� A� l*� A� m4� 	6	� d� 0� +� &"*� A� l*� A� m4� � � 6� 2� -� (� #'*� A� l*� A� m4� � � 6� C
�  /*� A� l*� A� m4� Y6
6� �**� A� l*� A� m4� � 6
� m� h� c� ^
� /*� A� l*� A� m4� � 6
� **� A� l*� A� m4� � 6/*� A� l*� A� m4� � 6
� \� W� R� M{*� A� l*� A� m4� 	�� 3}*� A� l*� A� m4� ��� �*� AY� m`� m� i�,�� ,� tM*� AY� m`� m*� A� m*� A� k��Y6
6� � *� A� b� \Y66*� A� j���*� A� b� \�� �Y,*� A� b� �L+� � � ]+�   �   � >  � � � � %� 5� E� U� f� p� |� ~� �� �� �� �� �� �� �� �� �� ����%�C�I�l�{����������������>�Y�m���������������������������������� .
;�   o .�  �@@@@@(!(�  � �  
	+@+@&@+@@@-/ �  ���  @�    �  �� �      �<*� A� a� *� L� �*� L� �*� L� ��*� L� �� *� A� m*� A� k� �*� L� �� *� A� b� \*� (� *� A� m*� A� k� 1*� A� j� *� L� �*� L� �*� L� ��*� A� m� *� (*� A� m*� A� k� )*� A� l*� A� m4� q� *� AY� m`� m���*� A� m*� A� k��o� *� A� m*� A� k� � � ]*� L� �� K{*� A� l*� A� m4� 7*� �� � �*� A� m*� A� k���*� L� �*� L� �*� L� ��"*� A� l*� A� m4� O*� L*� L� �� � � �*� AY� m`� m*� A� m*� A� k��h*� L� �*� L� �*� L� ��*� A� m*� A� k� Z� -� .Y� /�� 1*� A� m� ܶ 3� 4� -� .Y� /�� 1*� A� k� ܶ 3� 4*� A� m*� A� k� � � ]\*� A� l*� A� m4� <� <*� L� �� s*� L� �� 0*� A� l*� A� m4� q� *� L� �*� L� �*� L� ��� *� L*� �� � �*� L*� A� l*� A� m4� �*� AY� m`� m� o� H*� A� m`*� A� k� 5"*� A� l*� A� m`4� *� L"� �*� A*� A� m`� m� &*� L*� A� l*� A� m4� �*� AY� m`� m*� D� EY*� L� � F� �� GM*� L� �� � *� L� �� ,� *� L� �� *� L,� ڵ �*� L� �� *� L� �*� L� �� *� L� �*� L� ��   �   @    ) . / 0 %5 A: K< WA pD zI �J �K �M �Q �U �W �Z �\ �bg&j.l1oBqJrRsZvnx�y�{�}�~�������	�"�6�;�=�H�h�p�x�����������������$�=�L�X�]�i�t������   D !� %"
6@)(e��   � �8� c@� B%� H"� '�
�    � �� �     	  � -� Ѳ -�� 4*� L� � �L+� � � `+� � � nM*� L� �,� �� nN,� � � ]-� � � ]� -� .Y� /�� 1,� 1�� 1-� 1� 1� 3� 4���� -� Ѳ -�� 4*� L� Ҷ �:� � � k� � � n:*� L� �� �� G:� � � ]� � � ]� -� .Y� /׶ 1� 1ض 1� �� 12� 1� 3� 4���� -� Ѳ -�� 4*� L� �� � -�� 4� *� L� �� ]� - � 4� -� Ѳ -� 4*� L� �� � -� 4� *� L� �� ]� -� 4� -� Ѳ -� 4*� L� �� � -� 4� -� 4� � -� 4� -� 4� -� Ѳ -	� 4*� L� �� � -
� 4� -� 4� � -� 4*� L�� � -� Ѳ -� 4�   �   � /  � � � � "� ,� ;� H� U�  � � � � �	 � � �$/ 9#B&H'Q(\*h0r3{6�7�8�:�;�@�A�E�F�G�I�J�O�[�]^h�   ; � �� *��@@� ,�   �� 0��@@� 1#%..  �� �   �     H+� �=� � -� �>� 0+� �� �:� -� .Y� /�� �Ŷ 1� 3� ����ѱ   �   "   v x 
z }  $� A} G��    � � 1 �� �  �    V6� -� 4*� L� Ҷ �L+� � � �+� � � n:	*� L� �	� �� G:
	� � � ]
� � � ]� -� .Y� /׶ 1	� 1ض 1
� �� 12� 1� 3� 4
� �=*� L�.� (� -� .Y� /� 1*� L�.� ܶ 3� 4��^� -� 4��R=*� L�� ��q*� L�� ��:*� L�� �*� L�� ��� &� -� .Y� /� 1� �� 1� 3� ��|� -� .Y� /� 1� �� 1��� �� 1� nY�� ��� η o� 1� 1� 3� ���!� -� .Y� / � 1�~� 	!� ˶ 1�~� 	"� ˶ 1� 3� �� �*� L�� �� �:� &� -� .Y� /� 1� �� 1� 3� �� �� -� .Y� /� 1� �� 1�� �� 1� nY� �� η o� 1� 1� 3� �*� L�.� M� -� .Y� / � 1*� L�.~� 	!� ˶ 1*� L�.~� 	"� ˶ 1� 3� �6>*� L� �� ��#.� y�#.� 2� -� Ѳ -� .Y� /$� 1�#.� �%� 1� 3� �6*� �:� -� �� �`68� � -� Ѳ -&� �6�#.6���q� -� ф���� -'� 4� -� ѱ   �   � 0  � � � �  � +� <� J� X� �� �� �� �� �� �� �� ���*�|����������L�Y����������������� ���(+4�:	@�FOU�  � �  ��    � . ��      ��  @@� f ��     ��  �  ��    �  ��   � _�� { �� � ���  �� � ����  �� � ���  �� � ���� 8  �� z 	�� �  � ���  	�� �  � ����  	�� �  � ���  	�� �  � ���� �  ���  � P� 1�� �  ��    �   �                                                                                                                                                                                                                                                                                                                                                                                                                                                        deps/JLex/CMakeNfa.class                                                                            0000666 0002035 0002035 00000014527 14202043766 014324  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3
 M w
 L x	 L y	 L z	 L {
 | }	 ~ 	 ~ �	 ~ �
 L �	 ~ �
 � � �	 ~ �
  w
 L �	 ~ �	 ~ �
  �
  � �	  �	 ~ �	 � � �
  w �
  �
  � �
  �
 � �
  �
 , �
  �
 � �
 � �	 ~ �
 � �
 L �	  �
 L �	  � �
 , w
 , �	  � �
 0 w	  �
 0 � �	 � �
 4 �	  �
 � �
 L �	 � �	 � �
 � �
 � �
 � �	  �
 L �
 L �
 L �
  �
 L �
 L �	 ~ �
 � �	 ~ �
 0 �
 0 �
 L � � � m_spec LJLex/CSpec; m_lexGen LJLex/CLexGen; m_input LJLex/CInput; <init> ()V Code LineNumberTable reset set *(LJLex/CLexGen;LJLex/CSpec;LJLex/CInput;)V StackMapTable allocate_BOL_EOF (LJLex/CSpec;)V thompson 
Exceptions � discardCNfa (LJLex/CNfa;)V processStates !(LJLex/SparseBitSet;LJLex/CNfa;)V machine ()LJLex/CNfa; � � rule � � expr (LJLex/CNfaPair;)V cat_expr first_in_cat (I)Z factor term dodash (LJLex/CSet;)V 
SourceFile 	Main.java T U X U R S P Q N O � � � � � � � � � � Y Z � � � � � java/util/Vector � � e f � � � � � � 	JLex/CNfa � � � � � � � java/lang/StringBuilder NFA comprised of  � � � �  states. � � � � � � � � p � � � � � � � � � � � � i f � � c d � � JLex/SparseBitSet Y � � � 	JLex/CSet  � JLex/CAccept � T	 l m �
 � � � n m o p q m b a b r m � U s t JLex/CMakeNfa java/lang/Object java/io/IOException JLex/CNfaPair JLex/CUtility ASSERT (Z)V 
JLex/CSpec m_dtrans_ncols I BOL EOF m_states Ljava/util/Hashtable; java/util/Hashtable size ()I m_state_rules [Ljava/util/Vector; m_nfa_start LJLex/CNfa; m_nfa_states Ljava/util/Vector; 	elementAt (I)Ljava/lang/Object; m_label 	m_verbose Z java/lang/System out Ljava/io/PrintStream; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; java/io/PrintStream println (Ljava/lang/String;)V removeElement (Ljava/lang/Object;)Z get 
addElement (Ljava/lang/Object;)V JLex/CAlloc newCNfa (LJLex/CSpec;)LJLex/CNfa; JLex/CLexGen 	getStates ()LJLex/SparseBitSet; m_current_token advance m_next m_next2 (I)V m_edge m_set LJLex/CSet; add JLex/CInput m_line_number ([CII)V m_accept LJLex/CAccept; newCNfaPair ()LJLex/CNfaPair; m_start m_end 	newNLPair (LJLex/CSpec;)LJLex/CNfaPair; JLex/CError parse_error (II)V 
packAccept ()LJLex/CAccept; m_anchor mimic m_lexeme C java/lang/Character isLetter (C)Z m_ignorecase addncase (C)V 
complement   L M     N O    P Q    R S      T U  V   )     	*� *� �    W      { | }  X U  V   4     *� *� *� �    W      � � 
� �  Y Z  V   x     7-� � � +� � � ,� � � *-� *+� *,� �    W      � � � '� ,� 1� 6� [    	@@@   \ ]  V   G     #� ++Y� Z`� � ++Y� Z`� � 	�    W      � � � "�   ^ Z  V  %     �*� *+,-� 
*� � � 6*� � � 6� *� � � Y� S����*� *� � *� � � 66� !*� � � � :� ����*� � � ,� � Y� � *� � � `� � � �  *� �    W   F   � � � � #� -� >� D� O� [� e� v� }� �� �� �� �� [    � & $2 _     `  a b  V   )     *� � +� !W�    W   
   � �  c d  V   m     2*� � � >6�  +� "� *� � 2,� #����    W        
  + 1 [   	 �   e f  V  	    U*� � $L+M*� � %N*� *� W� &*� � 'W*� W*� � &� ,*� (� )*-,� )� **� W*� � &� K*� � %N*� � 'W*� W*� � &� � ',*� � $� +,� +M,*� (� )*-,� )� *���� ,Y� -:6*� � � � � .����,*� � $� +,� +M,*� � $� ),� )� /,� )*� � $� ),� )� 0Y� 1� 2,� )� 2*� � � 3,� )� 2*� � 	� 3,� )� )� 4Y�*� � 5`� 6� 7*,� )� *+�    W   �    # $ 
& ) * '- 8/ @1 I4 Z7 b: j; {= ~A �B �C �E �I �J �K �J �L �M �N �O �P �Q	RS+TIVS^ [    � I g g h4#�  h�  _     `  i f  V  �    N:6� 8L*� W*� � &� :�6*� � 'W*+� 9*� � $N-*� � � /-+� :� )+� ;:� *+� 9+� :N+� ;:*� W*� � &� k*� � 'W*� � <:*� � $� )� )� :� )� )*� � $� +� )� +*� � 	� /� )� +� ;� )� ;:�6� *� � 5� =*� � >� 7� ?-�    W   z   l m n u w y "z *{ /~ 7 B� J� S� X� ]� c� s� {� �� �� �� �� �� �� �� �� �� �� �� �� [    � S  j k  g g  � w _     `  l m  V   �     r+� � � � 8M*+� @*� W*� � &� M*� � 'W*,� @*� � $N-,� :� +-+� :� )+-� :*� � $N+� ;-� ),� ;-� )+-� ;����    W   >   � � � � '� /� 4� <� D� L� Q� Y� a� i� q� [    	@�  k� Z _     `  n m  V   �     V+� � � � 8M**� � &� A� *+� B**� � &� A� &*,� B+� ;,� :� C*,� :� D+,� ;� ;��ұ    W   * 
  � � � � $� 2� 7� B  J U	 [    	@�  k0 _     `  o p  V   �     �     |         S   |   o   S   b   |   |   S   U   |   |   |   |   |   U   S   U�*� � 5� =�*� � 5� =�*� � 5� =��    W   & 	   T V a  c# n$ p' {( }. [   	 � T  q m  V  /     �MN*+� E*� W	*� � &� %*� W*� � &� *� W*� � &� �*� � $M*� � $N,+� :� )+� ;-� )*� W	*� � &� *� W*� � &� ,-� +*� W	*� � &� *� W*� � &� +� ;+� :� ++,� :+-� ;*� � 'W�    W   B   ; < C 	E <I DJ LL TM \O ~R �U �X �[ �\ �] �d [    � < g g� A!
 _     `  r m  V  �    �*� W*� � &� ;*� � 'W*+� 9*� W*� � &� *� � 'W��*� � 5� =�y*� � $M+,� :,*� � $� )+,� )� ;*� W*� � &� *� � F� G� >� >*� W*� � &� "*� W*� � &� *� � H� � � � ,*� � F� /*� � 'W� �,� /,� 0Y� 1� 2*� � H� � ,� 2*� � F� I� �*� W*� � &� ;,� 2
� 3,� 2� 3,� 2*� � � 3,� 2*� � 	� 3,� 2� J� g*� � 'W*� W*� � &� .*� � 'W,� 2*� � � 3,� 2*� � 	� 3,� 2� J*� W*� � &� � � *,� 2� K*� � 'W�    W   � $  y { | ~ /� :� I� Q� V� a� i� �� �� �� �� �� �� �� �� ����$�-�;�I�S�[�k�s������������� [   F :� B g� oC�    j k g .� G� BT�    j k g 
�  _     `  s t  V  *     �=*� W*� � &� �*� W*� � &� �*� W
*� � &� R� M*� � 'W*� � &*� W� +-� 3� b*� � F� L*� � H� +�� I� +� 3����*� � F=*� � H� +*� � F� I� +*� � F� 3*� � 'W��M�    W   J   � � "� 8� @� P� V� Y� d� n� w� |� �� �	  �	 �	 �	 �	 [    � � V

 _     `  u    v                                                                                                                                                                         deps/JLex/CMinimize.class                                                                           0000666 0002035 0002035 00000015340 14202043766 014575  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 �
 ? c
 > d	 > e	 > f	 > g
 h i
 > j
 > k
 > l	 m n
  o
  p q	  r	 m s
 t u
  v w
  c	 m x y
  c	 m z	  {
  |	  }	 m ~
  
  �
 > �
  �
 > �
 > �	 m �
 > �
 > �
  �	 m �
 > �
  �	  �
  �	 t � �
 , c
 , � �
 , �
 , �
 � �	 m �
 > � �
 � � � �
 > � �
 � � � � � � m_spec LJLex/CSpec; m_group Ljava/util/Vector; 	m_ingroup [I <init> ()V Code LineNumberTable reset set (LJLex/CSpec;)V StackMapTable min_dfa col_copy (II)V 	trunc_col row_copy 	col_equiv (II)Z q 	row_equiv reduce � w 
fix_dtrans y minimize init_groups pset (Ljava/util/Vector;)V pgroups 
SourceFile 	Main.java F G J G @ A B C D E � � � K L \ G W G � � C � � � � JLex/CDTrans � E � � � � � � � JLex/SparseBitSet � E java/util/Vector � C � � � � � � � E � � K � S T � � O P Q G � E V T R P � � � E ] G � � � � � � � � java/lang/StringBuilder � � * states after removal of redundant states. � � � � � � � � � Z G   � � 	Group   { ^ _ } � G 	state   is in group  JLex/CMinimize java/lang/Object JLex/CUtility ASSERT (Z)V 
JLex/CSpec m_dtrans_vector size ()I 	elementAt (I)Ljava/lang/Object; m_dtrans m_dtrans_ncols I java/lang/System 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V setElementAt (Ljava/lang/Object;I)V m_anchor_array m_accept_vector m_accept LJLex/CAccept; 
addElement (Ljava/lang/Object;)V m_anchor 	m_col_map get (I)Z (I)V clear 	m_row_map setSize m_state_dtrans removeElementAt m_label contains (Ljava/lang/Object;)Z out Ljava/io/PrintStream; append (I)Ljava/lang/StringBuilder; -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; java/io/PrintStream println (Ljava/lang/String;)V 	m_verbose Z print   > ?      @ A     B C     D E      F G  H   )     	*� *� �    I      	r 	s 	t  J G  H   4     *� *� *� �    I      	~ 	 
	� 	�  K L  H   P     +� � � *+� *� *� �    I      	� 	� 	� 	� 	� M    	@   N L  H   :     *+� *� *� 	*� �    I      	� 	� 		� 	� 	�  O P  H   t     :*� � 
� >6� (*� � 
� � :� � .O���ر    I      	� 	� 	� %	� 3	� 9	� M    � *  Q G  H   �     G*� � 
� <=� 7*� � �
:*� � 
� � N-� �� -� ���ʱ    I   "   	� 	� 	� 	� ,	� :	� @	� F	� M    � 8  R P  H   <     *� � 
� � N*� � 
-� �    I      	� 	� 	�  S T  H   �     @*� � 
� >6� -*� � 
� � :� .� .� ������    I      	� 	� 	� %	� 6	� 8	� >	� M    � � ) U�   V T  H   �     H*� � 
� � :*� � 
� � :>*� � � � .� .� ������    I      
 
  
 -
 >
 @
 F
 M    � " U U  W G  H  �  
  � Y� :*� � 
� 6	*� 	�
� *� � Y� � <	� <*� � 
� � :*� � � � *� � � O� ����*� *� � �
� <*� � � *� � O����6<� *� � .� � � ����<*� � � *� � .� � 	����*� � � � x� � � � *� � .� � � � *� � O`=*� � � +*� � .� *� � *� � O���Є��9><*� � � @� � 1�� *� � .=� � � � � 	*�  ����*� � *� !� � � *� � 
� 6*� �
� "<� *� � "O����6<� *� � ".� � � ����<� *� � ".� � 	����� � s� � � � *� � ".� � � � *� � "O`=� +*� � ".� *� #� *� � "O���Մ��H><� @� � 1�� *� � ".=� � � � � 	*� $����*� � 
� %� � � �    I  V U  
/ 	
2 
3  
4 .
5 6
7 F
8 U
9 c
: i
5 o
> 
? �
A �
? �
E �
I �
K �
I �
O �
Q �
S �
O �
W �
Y �
^
_
b!
d,
g;
iR
k]
gc
Ei
qk
rx
t�
v�
x�
z�
~�
��
��
��
r�
��
��
��
��
��
��
��
��
�
�

�
�%
�.
�;
�>
�D
�J
�M
�_
�t
�z
��
��
��
��
��
��
��
��
��
��
��
��
��
��
��
��
�
�
�
� M  H 8� 0 
 X      Y   >�  
 X     Y   @@@�  
 X    Y   ,�  
 X     Y   �  
 X    Y   � / 
 X   Y   @
�  
 X    Y   @�  
 X   Y   �  
 X  Y   @@@�  
 X Y   '�  
 X  Y   � * 
 X Y   @
�  
 X  Y   @  Z G  H  ;     �� Y� L*� � &�>=� -*� � &.� *� � &*� *� � &..O����*� � >=� ]*� � � :� � :+� 6*� � � *� .� � *� � ..O���Є���*� *� +� 
�    I   N   
� 
� 
� 
� %
� <
� B J Q ^ i o
 ~ � �
 � � � � M    �  [(	� % [ U,�   \ G  H  �    *� '*� � 6d6��6*� � � � � >���*� � � L+� 6� ��� Y� M6+� � :6�c+� � :6*� � �C� .6	� .6
	
�"	� 
� *� 
.*� 	.�+� � � � +� (����,� � 6�*� ,� *� � )*� � dO*� ,� *� � � *� +� *� � � +� *� � � +� *� � � ,� *� � � ,� *� � � +� � � � *� � ).� � � *� � d*� � ).� � � � 	�����������]� +� ,Y� -*� � � ./� 0� 1� 2*� � 3� *� 4�    I   � /  - / 0 2 4 8 2; := F? L@ RB UE ]F `H jI tK M �O �P �R �Y �\ �] �^ �_ �` �b �c �d �fj&l:nLp]rnt�v�w�x�|�M�I�;������ M    "�   X      @�   X     �    X [         �   X [ [  U     �   X [ [ U U    � C  X [ [ U U  @("@@@@@@@@@�   X [ [ U U    �   X [         �   X      (  ] G  H      o*� Y� � >*� � 
� 6*�
� <�>6	*� � 
� � :� )� � � 	� � � *� � � � � =� �*� � � :	� � � � � � � � � :� 6� � � 6� *� � :

� � � � � ����� � � -� *� O6	*� � ).� � � � 	���D	� ,� Y� :� *� *� � O*� � �����*� � 3� �    I   � %  � � � � !� )� ,� <� M� [� n� u� �� �� �� �� �� �� �� �� �� �� �����&�)�/�5�>�E�R�[�^�d�n� M   � � #  X   � % 
 X   U    @@@�  
 X  U    �  
 X  U [   @@�   X  U [ U    @�   X  U [ U   � #  X  U [ U U  @� /@�  
 X  U    .�   X   	  ^ _  H   t     :+� >=� 0+� � :� +� ,Y� -� )� .5� 0� 1� 6���ѱ    I      � �   3� 9 M    � 1  ` G  H   �     �*� � ><� D� +� ,Y� -7� 0� .8� 0� 1� 6**� � � � 9� +:� 2� +� ;����� +� ;*� � 
� =<� 0� +� ,Y� -<� 0� .=� 0*� .� .� 1� 2���ѱ    I   6      - < D J P V a h � �" M    � 
 � E�   X  1  a    b                                                                                                                                                                                                                                                                                                deps/JLex/CNfa.class                                                                                0000666 0002035 0002035 00000002044 14202043766 013515  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 A
  /	  0	  1	  2	  3	  4	  5	  6	  7 8
 
 /
 
 9
  : ; < = m_edge I m_set LJLex/CSet; m_next LJLex/CNfa; m_next2 m_accept LJLex/CAccept; m_anchor m_label m_states LJLex/SparseBitSet; NO_LABEL ConstantValue���� CCL EMPTY���� EPSILON���� <init> ()V Code LineNumberTable mimic (LJLex/CNfa;)V StackMapTable 
SourceFile 	Main.java & '                 	JLex/CSet * > ? @ JLex/SparseBitSet 	JLex/CNfa java/lang/Object (LJLex/CSet;)V clone ()Ljava/lang/Object;                                                                   !          "       #  $       %    & '  (   j     .*� *�� *� *� *� *� *� *� *� 	�    )   * 
  � � 
� � � � � #� (� -�   * +  (   �     u*+� � +� � $*� � *� 
Y� � *� +� � � *� *+� � *+� � *+� � *+� � +� 	� *+� 	� � � 	� *� 	�    )   :   � � � � #� 1� 6� >� F� N� V� ^� o� t� ,    #8  -    .                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            deps/JLex/CNfa2Dfa.class                                                                            0000666 0002035 0002035 00000013123 14202043766 014212  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3
 S }
 R ~	 R 	 R �	 R �
 R �
 R �
 R �	 � �
 R �	 � � �
 � � �
  }	 � �	 � �
  � �	  �
 R � �
  }	  �
  �
  � �	  �
  �	  �	  ����	  �
 R �
 R �	 � �
 R � �
 � �	 M �
 � � �
 * �	 M �	 * �	 M �	 * �	 � �	 M �	 M �
 R �
 R �	 � �	 * �	 M �
  �
 � �	 � �	 � �	 � � �
 = }
  �
 = �
 = �
 = �	  �	  �	  �	  �
  �	  �	  �
 � �
  }
  � �
 � �
  �
 � �
 � � � � m_spec LJLex/CSpec; m_unmarked_dfa I m_lexGen LJLex/CLexGen; NOT_IN_DSTATES ConstantValue���� <init> ()V Code LineNumberTable set (LJLex/CLexGen;LJLex/CSpec;)V reset make_dfa StackMapTable make_dtrans � � � � free_dfa_states free_nfa_states 	e_closure (LJLex/CBunch;)V � � move 6(Ljava/util/Vector;LJLex/SparseBitSet;ILJLex/CBunch;)V 
sortStates (Ljava/util/Vector;)V � get_unmarked ()LJLex/CDfa; add_to_dstates (LJLex/CBunch;)I 
in_dstates 
SourceFile 	Main.java ] ^ c ^ X Y T U V W a b f ^ l ^ � � � k ^ � � � Working on DFA states. � � � JLex/CBunch � � � � � � java/util/Vector � � s t JLex/SparseBitSet � � � � � � 	JLex/CNfa � W a � � � � W � W m n x y � � v w . � ^ � � � � � JLex/CDTrans ] � � W q r z y � � � � � � � ^ � � � � � � java/util/Stack � � � � � � � � � W � �  �  � 	JLex/CDfa	
 � � JLex/CNfa2Dfa java/lang/Object 
JLex/CSpec 	m_verbose Z java/lang/System out Ljava/io/PrintStream; java/io/PrintStream print (Ljava/lang/String;)V m_state_rules [Ljava/util/Vector; m_state_dtrans [I clone ()Ljava/lang/Object; 	m_nfa_set Ljava/util/Vector; 	m_nfa_bit LJLex/SparseBitSet; size ()I 	elementAt (I)Ljava/lang/Object; m_label (I)V m_accept LJLex/CAccept; m_anchor m_accept_index m_dtrans_vector flush m_mark JLex/CUtility ASSERT (Z)V (ILJLex/CSpec;)V m_dtrans_ncols m_dfa_states m_dtrans 
addElement (Ljava/lang/Object;)V println 
m_dfa_sets Ljava/util/Hashtable; m_nfa_states m_nfa_start LJLex/CNfa; get (I)Z push &(Ljava/lang/Object;)Ljava/lang/Object; empty ()Z pop m_edge m_next contains (Ljava/lang/Object;)Z m_next2 m_set LJLex/CSet; 	JLex/CSet setElementAt (Ljava/lang/Object;I)V JLex/CAlloc newCDfa (LJLex/CSpec;)LJLex/CDfa; java/util/Hashtable put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;   R S     T U    V W    X Y    Z W  [    \    ] ^  _   )     	*� *� �    `      < = >  a b  _   4     *+� *,� *� �    `      J K 
L M  c ^  _   4     *� *� *� �    `      W X 
Y Z   d b  _   Z     !*� *+,� *� *� *� � 	� *� 
�    `      h i 
k l n t  u e      f ^  _  �    � � � Y� N*� *� � �6
*� 
�
� 6	
	��-*� � 	2� � � *-� � -� Y� � -� � 66� #-� � � :-� � � ����-� -� - � !*-� "*-� #W*� � 	*� � $� O*� %YM�5� &� � � ',� (� � � ),� (� *Y*� � $� *� � +:,� ,� -,� .� /6*� � 0� �� � � )*� � 0� � � )*,� 1,� 2-� 3-� � *-� "-� � -� � -� � -� � � � )-� � 	6� *-� 46� 
*-� #6*� � 5� � � � )� 6O���H*� � $� ,� 7� � � )*� � $� 8��Ǆ	��1� � 9�    `   � 0  � � � � � *� 4� H� P� [� d� n� |� �� �� �� �� �� �� �� �� �� �� �� �� ���
��"�0�D�S�[�`�������������������� ��� e   � � -  g   h       � 9  g   h     &.� #  g  i h     @� 3  g  i h  j   @@@�   g  i h j   @�   g  i h  j   @�   g  i h     �   g   h         k ^  _   1     *� � 5*� � :�    `          l ^  _   =     *� � ;*� � <*� � �    `           m n  _  �    �+� � � )+� � � � )+� � � � )+� +� + � !� =Y� >M+� � >6� -+� � � :+� � � ?� ),� @W����,� A�/,� B� :� C� ^� +� !� R+� � !+� C� +� D� +� � � � )+� � +� ~� +� ~� � � )�� E���� F� S+� � F� G� C+� � F� � ?� � � )+� � F� � +� � F� 8,� F� @W� H��"+� � H� G��+� � H� � ?� � � )+� � H� � +� � H� 8,� H� @W���+� � *+� � �    `   � %  2 3 4 -7 28 79 =< E= M> V@ dD sG z> �K �M �[ �^ �_ �` �m �n �t �vx|3B�N�X�a�q������������� e   , 	@@@� % o/� L p@@9@'/@� *   q r  _  6     �� � +� 66� �+� � :� E� � E� _� I� J� R� � ,� � � � )� Y� K� � Y� � � � F� 8� � F� � ���}� � � � � � )*� � �    `   F   � � � � � '� F� O� `� l� x� �� �� �� �� �� �� e    
� � 0 p@� @  s t  _  6  
   z+� 6>� n+� � M,� 66`6� (+� � M,� 6� 66����+� � :	+� � M+,� L+	� L�����    `   J   � � � � �  � ,� 6� <� C� G� K� Q  [ e k s� y e   Z �  �  	 g u p   � % 	 g u p  �  	 g u p   � '  g u     v w  _   �     H*� � 5� <*� � 6*� � 5*� � � MM,� (� *� � 	� ,�*Y� `� ����    `   "     ! # %% -- 77 9: F= e    � � + i�   x y  _   �     �+� � � � )+� � � � )+� � +� � � � )*� � NM,+� � � � 1,+� � O� � 2,+� � ,,+� � .,� (*� � :,� 2,� PW,� 7�    `   .   S T  U 8Z @] N^ \_ d` la qd �n e    @@@  z y  _   P     *� � :+� � Q� MM,� ,� 7��    `      � � � � e    �  i  {    |                                                                                                                                                                                                                                                                                                                                                                                                                                             deps/JLex/CNfaPair.class                                                                            0000666 0002035 0002035 00000000431 14202043766 014327  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 
  	  	     m_start LJLex/CNfa; m_end <init> ()V Code LineNumberTable 
SourceFile 	Main.java 	 
     JLex/CNfaPair java/lang/Object                       	 
     3     *� *� *� �          � � 	� �                                                                                                                                                                                                                                             deps/JLex/CSet.class                                                                                0000666 0002035 0002035 00000002505 14202043766 013546  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 S
  , -
  ,	  .	  /
  0
  1
 2 3
 2 4
 2 5
  6
  7
  8
  9 : ; : < =
  > ? @ m_set LJLex/SparseBitSet; m_complement Z <init> ()V Code LineNumberTable 
complement add (I)V addncase (C)V contains (I)Z StackMapTable mimic (LJLex/CSet;)V map (LJLex/CSet;[I)V A 
SourceFile 	Main.java   JLex/SparseBitSet     B    C D E F E G E H # I J K  L M A N O P J java/lang/Integer Q R 	JLex/CSet java/lang/Object java/util/Enumeration set java/lang/Character toLowerCase (C)C toTitleCase toUpperCase get clone ()Ljava/lang/Object; clearAll elements ()Ljava/util/Enumeration; hasMoreElements ()Z nextElement intValue ()I                           9     *� *� Y� � *� �          � � � �         "     *� �       
             %     	*� � �       
         !     F     *� *� � *� 	� *� 
� �               !   " #     P     *� � =*� � � � ��          - 	/ 1 4 $   	 � @    % &     7     *+� � *+� � � � �          ? @ A   ' (     �     D*+� � *� � +� � N-�  � &-�  � � 6,�� *� ,.� ��ױ       "   E F G  H .I 5J @K CL $    �  )(�   *    +                                                                                                                                                                                           deps/JLex/CSimplifyNfa.class                                                                        0000666 0002035 0002035 00000005157 14202043766 015242  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 �
 2 K
 1 L	 M N
 O P Q R Q S T	  U V
 	 K	  W	 1 X
 	 Y	 M Z	 1 [	 M \	 1 ] ^
  K _
  K	 ` a b
 c d
  e
 	 f
  g
  h
  i j k
  l
  m n
 " o
  p
  q
  r
 " s
 c t u
 ) K v
 ) w
 ) x y
 ) z
 c { | } ccls [I original_charset_size I mapped_charset_size <init> ()V Code LineNumberTable simplify (LJLex/CSpec;)V StackMapTable ~ T computeClasses |  ^ _ � � n 
SourceFile 	Main.java 8 9 A =  � � � � � ~ � � � � 	JLex/CNfa � 6 	JLex/CSet � � 3 4 � � � 4 7 6 � 6 5 6 JLex/SparseBitSet java/util/Hashtable � � � Working on character classes. � � � � 9 � � � � � � � � . : � 9 � � java/lang/Integer 8 � � � � � � � � � � 9 java/lang/StringBuilder NFA has  � � � �  distinct character classes. � � � � JLex/CSimplifyNfa java/lang/Object java/util/Enumeration 
JLex/CSpec java/io/PrintStream java/lang/String m_nfa_states Ljava/util/Vector; java/util/Vector elements ()Ljava/util/Enumeration; hasMoreElements ()Z nextElement ()Ljava/lang/Object; m_edge m_set LJLex/CSet; map (LJLex/CSet;[I)V 
m_ccls_map m_dtrans_ncols java/lang/System out Ljava/io/PrintStream; print (Ljava/lang/String;)V clearAll contains (I)Z set (I)V and (LJLex/SparseBitSet;)V size ()I clear get containsKey (Ljava/lang/Object;)Z put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; &(Ljava/lang/Object;)Ljava/lang/Object; intValue println append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; toString ()Ljava/lang/String;   1 2     3 4    5 6    7 6      8 9  :        *� �    ;      	   < =  :   �     }*+� +� � M,�  � Y,�  � N-� ����-� �� ���-� � "� 	Y� 
:-� *� � -� � -*� -� .� ���+*� � +*� � �    ;   >   	 	 	  	  2	! 5	" =	# F	$ S	% Y	& \	' i	) l	, t	- |	. >    �  ?� ' @&� �   A =  :  �  
  �*+� � **� �
� =� Y� N� Y� :� Y� :� � +� � :�  �*�  � :� ����� �� ���-� � 6*� �� C� � � � � � � -*� .� � *� .� ����-� � -� � � � -� � ��\�  6*� �� x-*� .� !� d� � � � Q� � � D� "Y*� .� #:		� $� 	� "Y�� #� %W*� 	� &� "� 'O������Ҳ � (� � )Y� *+� ,� -.� ,� /� 0*� �    ;   � !  	5 	6 	8 	9 %	: .	< 6	= I	> U	? i	@ l	A u	B �	C �	E �	G �	B �	I �	J �	K �	M �	N �	O	P&	R6	S@	TS	Ug	Nm	Wp	Xv	Y�	[�	\ >   h � ?  B C D D E ?  � , @� )� T F�   B C D D E ? @  F G� 7� , H� � �   I    J                                                                                                                                                                                                                                                                                                                                                                                                                 deps/JLex/CSpec.class                                                                               0000666 0002035 0002035 00000005573 14202043766 013715  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 �
 = �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < � �
  �	 < � � �
  � �
  �
  �
  �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < � �
 ! �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < �	 < � � � m_states Ljava/util/Hashtable; m_macros m_nfa_start LJLex/CNfa; m_nfa_states Ljava/util/Vector; m_state_rules [Ljava/util/Vector; m_state_dtrans [I m_dfa_states 
m_dfa_sets m_accept_vector m_anchor_array m_dtrans_vector m_dtrans_ncols I 	m_row_map 	m_col_map 
NUM_PSEUDO ConstantValue    BOL EOF 
m_ccls_map m_current_token m_lexeme C 
m_in_quote Z m_in_ccl 	m_verbose m_integer_type m_intwrap_type m_yyeof m_count_chars m_count_lines m_cup_compatible m_unix m_public m_ignorecase m_init_code [C m_init_read m_init_throw_code m_init_throw_read m_class_code m_class_read 
m_eof_code 
m_eof_read m_eof_value_code m_eof_value_read m_eof_throw_code m_eof_throw_read m_yylex_throw_code m_yylex_throw_read m_class_name m_implements_name m_function_name m_type_name m_lexGen LJLex/CLexGen; NONE     START    END <init> (LJLex/CLexGen;)V Code LineNumberTable 
SourceFile 	Main.java � � w i x i y i z i { | X O Y Z [ \ ] \ java/util/Hashtable > ? java/lang/String 	YYINITIAL � � java/lang/Integer � � � � � � @ ? _ \ ` \ c \ b \ d \ e \ f \ a \ g \ ^ \ A B java/util/Vector C D I D J ? M D N O P H Q H K D L H h i j O k i l O u i v O m i n O o i p O q i r O s i t O G H E F 
JLex/CSpec java/lang/Object ()V (Ljava/lang/String;)V size ()I (I)V put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;   < =   6   > ?     @ ?     A B     C D     E F     G H     I D     J ?     K D     L H     M D     N O     P H     Q H    R O  S    T   U O     V O     W H     X O     Y Z     [ \     ] \     ^ \     _ \     ` \     a \     b \     c \     d \     e \     f \     g \     h i     j O     k i     l O     m i     n O     o i     p O     q i     r O     s i     t O     u i     v O     w i     x i     y i     z i    { |    } O  S    ~   O  S    �  � O  S    T    � �  �  u    �*� *�YYUYyUYlUYeUYxU� *�� *�YyUYyUYlUYeUYxU� *�YYUYyUYtUYoUYkUYeUYnU� *+� **� W� *� *� 	*� 
*� Y� � *� � Y� � Y*� � � � W*� Y� � *� *� *� *� *� *� *� *� *� *� *�  *� !Y� "� #*� !Y� "� $*� Y� � %*� !Y� "� &* �� '*� (*� )*� **� +*� ,*� -*� .*� /*� 0*� 1*� 2*� 3*� 4*� 5*� 6*� 7*� 8*� 9*� :*� ;�    �   � 2  ^ = $A +B KF w_ |b �c �d �e �h �i �l �o �p �q �r �s �t �u �v �w �z �|}�"�-�4�9�>�C�H�M�R�W�\�a�f�k�p�u�z������������  �    �                                                                                                                                     deps/JLex/CUtility.class                                                                            0000666 0002035 0002035 00000005437 14202043766 014465  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 w
  L	 M N O
  L P
  Q R
  S T
  U V
  W
 X Y Z [ \ ] ^ _
  ` a
 b c d e f DEBUG Z ConstantValue    
SLOW_DEBUG 
DUMP_DEBUG DESCENT_DEBUG     	OLD_DEBUG OLD_DUMP_DEBUG FOODEBUG DO_DEBUG INT_MAX I��� MAX_SEVEN_BIT    MAX_EIGHT_BIT   � MAX_SIXTEEN_BIT  �� <init> ()V Code LineNumberTable enter (Ljava/lang/String;CI)V leave ASSERT (Z)V StackMapTable 
doubleSize ([C)[C g ([B)[B h hex2bin (C)C 
ishexdigit (C)Z oct2bin 
isoctdigit isspace 	isnewline bytencmp 
([BI[BII)I charncmp 
([CI[CII)I 
SourceFile 	Main.java / 0 i j k java/lang/StringBuilder 	Entering  l m 
 [lexeme:  l n 
] [token:  l o ] p q r s t Leaving  	 [lexeme: 	] [token: Assertion Failed java/lang/Error Assertion Failed. / t Bad hexidecimal digit u v t Bad octal digit  JLex/CUtility java/lang/Object [C [B java/lang/System out Ljava/io/PrintStream; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (C)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; java/io/PrintStream println (Ljava/lang/String;)V JLex/CError impos                                            !  "       !  #       !  $       !  %       !  & '      (  ) '      *  + '      ,  - '      .    / 0  1        *� �    2      W  3 4  1   M     1� � Y� � *� � � 	� � 
� � � �    2   
   | 0  5 4  1   M     1� � Y� � *� � � � � 
� � � �    2   
   � 0�  6 7  1   E     � � � � Y� ��    2      � � � � 8      9 :  1   U     *�h�L=*�� +*4U����+�    2      � � � � � 8   
 � 	 ;  9 <  1   U     *�h�L=*�� +*3T����+�    2      � � � � � 8   
 � 	 =  > ?  1   �     T0� 9� 	0d��a� f� ad
`��A� F� Ad
`��� Y� � � � � �    2   "   � � � � '� 3� <� R� 8      @ A  1   T     (0� 	9� a� 	f� A� F� ��    2      � $� &� 8      B ?  1   W     *0� 7� 	0d��� Y� � � � � �    2      � � � (  8      C A  1   9     0� 7� ��    2         8      D A  1   R     (� !	� 
� � � 	 � ��    2       $" &% 8    $  E A  1   :     
� 	� ��    2      0 3 6 8      F G  1   �     J6� A*`3� ,`3� �*`3,`3� �*`3,`3� ������    2   & 	  Q 
V Y  [ /^ 1` @c BQ Hh 8   
 �   H I  1   �     J6� A*`4� ,`4� �*`4,`4� �*`4,`4� ������    2   & 	  y 
{ }   /� 1� @� By H� 8   
 �   J    K                                                                                                                                                                                                                                 deps/JLex/Main.class                                                                                0000666 0002035 0002035 00000001277 14202043766 013601  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 /
  	   
   
  
    !
  " # $ <init> ()V Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable ! 
Exceptions % 
SourceFile 	Main.java   & ' ( Usage: JLex.Main <filename> ) * + JLex/CLexGen  + ,  java/lang/Error - . 	JLex/Main java/lang/Object java/io/IOException java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V generate 
getMessage ()Ljava/lang/String; ! 
                   *� �          � 	       {     -*�� � � �� Y*2� L+� � M� ,� 	� �    !      & 	  � � �    !
 " ,     Q 
                                                                                                                                                                                                                                                                                                                                             deps/JLex/Main.java                                                                                 0000666 0002035 0002035 00000617040 14202043766 013416  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  /**************************************************************
  JLex: A Lexical Analyzer Generator for Java(TM)
  Written by Elliot Berk <ejberk@cs.princeton.edu>. Copyright 1996.
  Maintained by C. Scott Ananian <cananian@alumni.princeton.edu>.
  See below for copyright notice, license, and disclaimer.
  New releases from http://www.cs.princeton.edu/~appel/modern/java/JLex/

  Version 1.2.6, 2/7/03, [C. Scott Ananian]
   Renamed 'assert' function 'ASSERT' to accomodate Java 1.4's new keyword.
   Fixed a bug which certain forms of comment in the JLex directives section
     (which are not allowed) to be incorrectly parsed as macro definitions.
  Version 1.2.5, 7/25/99-5/16/00, [C. Scott Ananian]
   Stomped on one more 8-bit character bug.  Should work now (really!).
   Added unicode support, including unicode escape sequences.
   Rewrote internal JavaLexBitSet class as SparseBitSet for efficient
     unicoding.
   Added an NFA character class simplification pass for unicode efficiency.
   Changed byte- and stream-oriented I/O routines to use characters and
     java.io.Reader and java.io.Writer instead --- which means we read in
     unicode specifications correctly and write out a proper unicode java
     source file.  As a happy side-effect, the output java file is written
     with your platform's preferred newline character(s).
   Rewrote CInput to fix bugs with line-counting in the specification file
     and "unusual behaviour" when the last line of the specification wasn't
     terminated with a newline. Thanks to Matt Hanna <mhanna@cs.caltech.edu>
     for pointing out the bug.
   Fixed a bug that would cause JLex not to terminate given certain input
     specifications.  Thanks to Mark Greenstreet <mrg@cs.ubc.ca> and
     Frank B. Brokken <frank@suffix.icce.rug.nl> for reporting this.
   CUP parser integration improved according to suggestions made by
     David MacMahon <davidm@smartsc.com>.  The %cup directive now tells
     JLex to generate a parser conforming to the java_cup.runtime.Scanner
     interface; see manual for more details.
   Fixed bug with null string literals ("") in regexps.  Reported by
     Charles Fischer <fischer@cs.wisc.edu>.
   Rewrote start-of-line and end-of-line handling, closing active bug #5.
     Also fixed line-counting code, closing active bug #12.  All
     new-line handling is now platform-independent.
   Used unpackFromString more extensively to allow larger cmap, etc,
     tables.  This helps unicode support work reliably.  It's also
     prettier now if you happen to read the source to the generated
     lexer.
   Generated lexer now accepts unicode LS (U+2028) and PS (U+2029) as
     line separators for strict unicode compliance; see
     http://www.unicode.org/unicode/reports/tr18/
   Fixed bug with character constants in action strings.  Reported by
     Andrew Appel against 1.2.5b3.
   Fixed bug with illegal \^C-style escape sequences.  Reported by
     Toshiya Iwai <iwai@isdnet.co.jp> against 1.2.5b4.
   Fixed "newline in quoted string" error when unpaired single- or
     double-quotes were present in comments in the action phrase.
     Reported by Stephen Ostermiller <1010JLex@ostermiller.com>
     against 1.2.5b4.  Reported by Eric Esposito <eric.esposito@unh.edu>
     against 1.2.4 and 1.2.5b2.
   Fixed "newline in quoted string" error when /* or // appeared
     in quoted strings in the action phrase.  Reported by
     David Eichmann <david-eichmann@uiowa.edu> against 1.2.5b5.
   Fixed 'illegal constant' errors in case statements caused by
     Sun's JDK 1.3 more closely adhering to the Java Language
     Specification.  Reported by a number of people, but 
     Harold Grovesteen <hgrovesteen@home.com> was the first to direct me to
     a Sun bug report (4119776) which quoted the relevant section of the
     JLS (15.27) to convince me that the JLex construction actually was
     illegal.  Reported against 1.2.5b6, but this bit of code has been
     present since the very first version of JLex (1.1.1).

  Version 1.2.4, 7/24/99, [C. Scott Ananian]
   Correct the parsing of '-' in character classes, closing active 
     bug #1.  Behaviour follows egrep: leading and trailing dashes in
     a character class lose their special meaning, so [-+] and [+-] do
     what you would expect them to.
   New %ignorecase directive for generating case-insensitive lexers by
     expanding matched character classes in a unicode-friendly way.
   Handle unmatched braces in quoted strings or comments within
     action code blocks.
   Fixed input lexer to allow whitespace in character classes, closing
     active bug #9.  Whitespace in quotes had been previously fixed.
   Made Yylex.YYEOF and %yyeof work like the manual says they should.

  Version 1.2.3, 6/26/97, [Raimondas Lencevicius]
   Fixed the yy_nxt[][] assignment that has generated huge code
   exceeding 64K method size limit. Now the assignment
   is handled by unpacking a string encoding of integer array.
   To achieve that, added
   "private int [][] unpackFromString(int size1, int size2, String st)"
   function and coded the yy_nxt[][] values into a string
   by printing integers into a string and representing
   integer sequences as "value:length" pairs.
   Improvement: generated .java file reduced 2 times, .class file
     reduced 6 times for sample grammar. No 64K errors.
   Possible negatives: Some editors and OSs may not be able to handle 
     the huge one-line generated string. String unpacking may be slower
     than direct array initialization.

  Version 1.2.2, 10/24/97, [Martin Dirichs]
  Notes:
    Changed yy_instream to yy_reader of type BufferedReader. This reflects
     the improvements in the JDK 1.1 concerning InputStreams. As a
     consequence, changed yy_buffer from byte[] to char[].
     The lexer can now be initialized with either an InputStream
     or a Reader. A third, private constructor is called by the other
     two to execute user specified constructor code.

  Version 1.2.1, 9/15/97 [A. Appel]
   Fixed bugs 6 (character codes > 127) and 10 (deprecated String constructor).

  Version 1.2, 5/5/97, [Elliot Berk]
  Notes:
    Simply changed the name from JavaLex to JLex.  No other changes.

  Version 1.1.5, 2/25/97, [Elliot Berk]
  Notes:
    Simple optimization to the creation of the source files.
     Added a BufferedOutputStream in the creation of the DataOutputStream
     field m_outstream of the class CLexGen.  This helps performance by
     doing some buffering, and was suggested by Max Hailperin,
     Associate Professor of Computer Science, Gustavus Adolphus College.

  Version 1.1.4, 12/12/96, [Elliot Berk]
  Notes:
    Added %public directive to make generated class public.

  Version 1.1.3, 12/11/96, [Elliot Berk]
  Notes:
    Converted assertion failure on invalid character class 
     when a dash '-' is not preceded with a start-of-range character.
     Converted this into parse error E_DASH.

  Version 1.1.2, October 30, 1996 [Elliot Berk]
    Fixed BitSet bugs by installing a BitSet class of my own,
     called JavaLexBitSet.  Fixed support for '\r', non-UNIX 
     sequences.  Added try/catch block around lexer generation
     in main routine to moderate error information presented 
     to user.  Fixed macro expansion, so that macros following 
     quotes are expanded correctly in regular expressions.
     Fixed dynamic reallocation of accept action buffers.

  Version 1.1.1, September 3, 1996 [Andrew Appel]
    Made the class "Main" instead of "JavaLex", 
     improved the installation instructions to reflect this.

  Version 1.1, August 15, 1996  [Andrew Appel]
    Made yychar, yyline, yytext global to the lexer so that
     auxiliary functions can access them.
  **************************************************************/

/***************************************************************
       JLEX COPYRIGHT NOTICE, LICENSE, AND DISCLAIMER
  Copyright 1996-2000 by Elliot Joel Berk and C. Scott Ananian 

  Permission to use, copy, modify, and distribute this software and its
  documentation for any purpose and without fee is hereby granted,
  provided that the above copyright notice appear in all copies and that
  both the copyright notice and this permission notice and warranty
  disclaimer appear in supporting documentation, and that the name of
  the authors or their employers not be used in advertising or publicity
  pertaining to distribution of the software without specific, written
  prior permission.

  The authors and their employers disclaim all warranties with regard to
  this software, including all implied warranties of merchantability and
  fitness. In no event shall the authors or their employers be liable
  for any special, indirect or consequential damages or any damages
  whatsoever resulting from loss of use, data or profits, whether in an
  action of contract, negligence or other tortious action, arising out
  of or in connection with the use or performance of this software.
  **************************************************************/

/***************************************************************
  Package Declaration
  **************************************************************/
package JLex;

/***************************************************************
  Imported Packages
  **************************************************************/
import java.lang.System;
import java.lang.Integer;
import java.lang.Character;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Hashtable;
import java.util.Vector;

/******************************
  Questions:
  2) How should I use the Java package system
  to make my tool more modularized and
  coherent?

  Unimplemented:
  !) Fix BitSet issues -- expand only when necessary.
  2) Repeated accept rules.
  6) Clean up the CAlloc class and use buffered
  allocation.
  9) Add to spec about extending character set.
  11) m_verbose -- what should be done with it?
  12) turn lexical analyzer into a coherent
  Java package
  13) turn lexical analyzer generator into a
  coherent Java package
  16) pretty up generated code
  17) make it possible to have white space in
  regular expressions
  18) clean up all of the class files the lexer
  generator produces when it is compiled,
  and reduce this number in some way.
  24) character format to and from file: writeup
  and implementation
  25) Debug by testing all arcane regular expression cases.
  26) Look for and fix all UNDONE comments below.
  27) Fix package system.
  28) Clean up unnecessary classes.
  *****************************/

/***************************************************************
  Class: CSpec
 **************************************************************/
class CSpec
{
  /***************************************************************
    Member Variables
    **************************************************************/
    
  /* Lexical States. */
  Hashtable m_states; /* Hashtable taking state indices (Integer) 
			 to state name (String). */

  /* Regular Expression Macros. */ 
  Hashtable m_macros; /* Hashtable taking macro name (String)
				to corresponding char buffer that
				holds macro definition. */

  /* NFA Machine. */
  CNfa m_nfa_start; /* Start state of NFA machine. */
  Vector m_nfa_states; /* Vector of states, with index
				 corresponding to label. */
  
  Vector m_state_rules[]; /* An array of Vectors of Integers.
				    The ith Vector represents the lexical state
				    with index i.  The contents of the ith 
				    Vector are the indices of the NFA start
				    states that can be matched while in
				    the ith lexical state. */
				    

  int m_state_dtrans[];

  /* DFA Machine. */
  Vector m_dfa_states; /* Vector of states, with index
				 corresponding to label. */
  Hashtable m_dfa_sets; /* Hashtable taking set of NFA states
				  to corresponding DFA state, 
				  if the latter exists. */
  
  /* Accept States and Corresponding Anchors. */
  Vector m_accept_vector;
  int m_anchor_array[];

  /* Transition Table. */
  Vector m_dtrans_vector;
  int m_dtrans_ncols;
  int m_row_map[];
  int m_col_map[];

  /* Special pseudo-characters for beginning-of-line and end-of-file. */
  static final int NUM_PSEUDO=2;
  int BOL; // beginning-of-line
  int EOF; // end-of-line

  /** NFA character class minimization map. */
  int m_ccls_map[];

  /* Regular expression token variables. */
  int m_current_token;
  char m_lexeme;
  boolean m_in_quote;
  boolean m_in_ccl;

  /* Verbose execution flag. */
  boolean m_verbose;

  /* JLex directives flags. */
  boolean m_integer_type;
  boolean m_intwrap_type;
  boolean m_yyeof;
  boolean m_count_chars;
  boolean m_count_lines;
  boolean m_cup_compatible;
  boolean m_unix;
  boolean m_public;
  boolean m_ignorecase;

  char m_init_code[];
  int m_init_read;

  char m_init_throw_code[];
  int m_init_throw_read;

  char m_class_code[];
  int m_class_read;

  char m_eof_code[];
  int m_eof_read;

  char m_eof_value_code[];
  int m_eof_value_read;

  char m_eof_throw_code[];
  int m_eof_throw_read;

  char m_yylex_throw_code[];
  int m_yylex_throw_read;

  /* Class, function, type names. */
  char m_class_name[] = {          
    'Y', 'y', 'l', 
    'e', 'x' 
    };
  char m_implements_name[] = {};
  char m_function_name[] = {
    'y', 'y', 'l', 
    'e', 'x' 
    };
  char m_type_name[] = {
    'Y', 'y', 't', 
    'o', 'k', 'e',
    'n'
    };

  /* Lexical Generator. */
  private CLexGen m_lexGen;

  /***************************************************************
    Constants
    ***********************************************************/
  static final int NONE = 0;
  static final int START = 1;
  static final int END = 2;
  
  /***************************************************************
    Function: CSpec
    Description: Constructor.
    **************************************************************/
  CSpec
    (
     CLexGen lexGen
     )
      {
	m_lexGen = lexGen;

	/* Initialize regular expression token variables. */
	m_current_token = m_lexGen.EOS;
	m_lexeme = '\0';
	m_in_quote = false;
	m_in_ccl = false;

	/* Initialize hashtable for lexer states. */
	m_states = new Hashtable();
	m_states.put(new String("YYINITIAL"),new Integer(m_states.size()));

	/* Initialize hashtable for lexical macros. */
	m_macros = new Hashtable();

	/* Initialize variables for lexer options. */
	m_integer_type = false;
	m_intwrap_type = false;
	m_count_lines = false;
	m_count_chars = false;
	m_cup_compatible = false;
	m_unix = true;
        m_public = false;
	m_yyeof = false;
	m_ignorecase = false;

	/* Initialize variables for JLex runtime options. */
	m_verbose = true;

	m_nfa_start = null;
	m_nfa_states = new Vector();
	
	m_dfa_states = new Vector();
	m_dfa_sets = new Hashtable();

	m_dtrans_vector = new Vector();
	m_dtrans_ncols = CUtility.MAX_SEVEN_BIT + 1;
	m_row_map = null;
	m_col_map = null;

	m_accept_vector = null;
	m_anchor_array = null;

	m_init_code = null;
	m_init_read = 0;

	m_init_throw_code = null;
	m_init_throw_read = 0;

	m_yylex_throw_code = null;
	m_yylex_throw_read = 0;

	m_class_code = null;
	m_class_read = 0;

	m_eof_code = null;
	m_eof_read = 0;

	m_eof_value_code = null;
	m_eof_value_read = 0;

	m_eof_throw_code = null;
	m_eof_throw_read = 0;

	m_state_dtrans = null;

	m_state_rules = null;
      }
}

/***************************************************************
  Class: CEmit
  **************************************************************/
class CEmit
{
  /***************************************************************
    Member Variables
    **************************************************************/
  private CSpec m_spec;
  private java.io.PrintWriter m_outstream;

  /***************************************************************
    Constants: Anchor Types
    **************************************************************/
  private final int START = 1;
  private final int END = 2;
  private final int NONE = 4;

  /***************************************************************
    Constants
    **************************************************************/
  private final boolean EDBG = true;
  private final boolean NOT_EDBG = false;

  /***************************************************************
    Function: CEmit
    Description: Constructor.
    **************************************************************/
  CEmit
    (
     )
      {
	reset();
      }

  /***************************************************************
    Function: reset
    Description: Clears member variables.
    **************************************************************/
  private void reset
    (
     )
      {
	m_spec = null;
	m_outstream = null;
      }

  /***************************************************************
    Function: set
    Description: Initializes member variables.
    **************************************************************/
  private void set
    (
     CSpec spec,
     java.io.PrintWriter outstream
     )
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != spec);
	    CUtility.ASSERT(null != outstream);
	  }

	m_spec = spec;
	m_outstream = outstream;
      }

  /***************************************************************
    Function: emit_imports
    Description: Emits import packages at top of 
    generated source file.
    **************************************************************/
  /*void emit_imports
    (
     CSpec spec,
     OutputStream outstream
     )
      throws java.io.IOException      
	{
	  set(spec,outstream);
	  
	  if (CUtility.DEBUG)
	    {
	      CUtility.ASSERT(null != m_spec);
	      CUtility.ASSERT(null != m_outstream);
	    }*/
	  
	  /*m_outstream.println("import java.lang.String;");
	  m_outstream.println("import java.lang.System;");
	  m_outstream.println("import java.io.BufferedReader;");
	  m_outstream.println("import java.io.InputStream;");*/
	/*  
	  reset();
	}*/
  
  /***************************************************************
    Function: print_details
    Description: Debugging output.
    **************************************************************/
  private void print_details
    (
     )
      {
	int i;
	int j;
	int next;
	int state;
	CDTrans dtrans;
	CAccept accept;
	boolean tr;

	System.out.println("---------------------- Transition Table " 
			   + "----------------------");
	
	for (i = 0; i < m_spec.m_row_map.length; ++i)
	  {
	    System.out.print("State " + i);
	    
	    accept = (CAccept) m_spec.m_accept_vector.elementAt(i);
	    if (null == accept)
	      {
		System.out.println(" [nonaccepting]");
	      }
	    else
	      {
		System.out.println(" [accepting, line "
				 + accept.m_line_number 
				 + " <"
				 + (new java.lang.String(accept.m_action,0,
					       accept.m_action_read))
				 + ">]");
	      }
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(m_spec.m_row_map[i]);
	    
	    tr = false;
	    state = dtrans.m_dtrans[m_spec.m_col_map[0]];
	    if (CDTrans.F != state)
	      {
		tr = true;
		System.out.print("\tgoto " + state + " on [" + ((char) 0));
	      }
	    for (j = 1; j < m_spec.m_dtrans_ncols; ++j)
	      {
		next = dtrans.m_dtrans[m_spec.m_col_map[j]];
		if (state == next)
		  {
		    if (CDTrans.F != state)
		      {
			System.out.print((char) j);
		      }
		  }
		else
		  {
		    state = next;
	  	    if (tr)
		      {
			System.out.println("]");
			tr = false;
		      }
		    if (CDTrans.F != state)
		      {
			tr = true;
			System.out.print("\tgoto " + state + " on [" + ((char) j));
		      }
		  }
	      }
	    if (tr)
	      {
		System.out.println("]");
	      }
	  }

	System.out.println("---------------------- Transition Table " 
			   + "----------------------");
      }

  /***************************************************************
    Function: emit
    Description: High-level access function to module.
    **************************************************************/
  void emit
    (
     CSpec spec,
     java.io.PrintWriter outstream
     )
      throws java.io.IOException      
	{
	  set(spec,outstream);
	  
	  if (CUtility.DEBUG)
	    {
	      CUtility.ASSERT(null != m_spec);
	      CUtility.ASSERT(null != m_outstream);
	    }
	  
	  if (CUtility.OLD_DEBUG) {
	    print_details();
	  }

	  emit_header();
	  emit_construct();
	  emit_helpers();
	  emit_driver();
	  emit_footer();
	  
	  reset();
	}

  /***************************************************************
    Function: emit_construct
    Description: Emits constructor, member variables,
    and constants.
    **************************************************************/
  private void emit_construct
    (
     )
      throws java.io.IOException
	{
	  if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != m_spec);
	    CUtility.ASSERT(null != m_outstream);
	  }
	  
	  /* Constants */
	  m_outstream.println("\tprivate final int YY_BUFFER_SIZE = 512;");

	  m_outstream.println("\tprivate final int YY_F = -1;");
	  m_outstream.println("\tprivate final int YY_NO_STATE = -1;");

	  m_outstream.println("\tprivate final int YY_NOT_ACCEPT = 0;");
	  m_outstream.println("\tprivate final int YY_START = 1;");
	  m_outstream.println("\tprivate final int YY_END = 2;");
	  m_outstream.println("\tprivate final int YY_NO_ANCHOR = 4;");

	  // internal
	  m_outstream.println("\tprivate final int YY_BOL = "+m_spec.BOL+";");
	  m_outstream.println("\tprivate final int YY_EOF = "+m_spec.EOF+";");
	  // external
	  if (m_spec.m_integer_type || true == m_spec.m_yyeof)
	    m_outstream.println("\tpublic final int YYEOF = -1;");
	  
          /* User specified class code. */
	  if (null != m_spec.m_class_code)
	    {
	      m_outstream.print(new String(m_spec.m_class_code,0,
						m_spec.m_class_read));
	    }

	  /* Member Variables */
	  m_outstream.println("\tprivate java.io.BufferedReader yy_reader;");
	  m_outstream.println("\tprivate int yy_buffer_index;");
	  m_outstream.println("\tprivate int yy_buffer_read;");
	  m_outstream.println("\tprivate int yy_buffer_start;");
	  m_outstream.println("\tprivate int yy_buffer_end;");
	  m_outstream.println("\tprivate char yy_buffer[];");
	  if (m_spec.m_count_chars)
	    {
	      m_outstream.println("\tprivate int yychar;");
	    }
	  if (m_spec.m_count_lines)
	    {
	      m_outstream.println("\tprivate int yyline;");
	    }
	  m_outstream.println("\tprivate boolean yy_at_bol;");
	  m_outstream.println("\tprivate int yy_lexical_state;");
	  /*if (m_spec.m_count_lines || true == m_spec.m_count_chars)
	    {
	      m_outstream.println("\tprivate int yy_buffer_prev_start;");
	    }*/
	  m_outstream.println();

	  
	  /* Function: first constructor (Reader) */
	  m_outstream.print("\t");
	  if (true == m_spec.m_public) {
	    m_outstream.print("public ");
	  }
          m_outstream.print(new String(m_spec.m_class_name));
	  m_outstream.print(" (java.io.Reader reader)");
	  
	  if (null != m_spec.m_init_throw_code)
	    {
	      m_outstream.println(); 
	      m_outstream.print("\t\tthrows "); 
	      m_outstream.print(new String(m_spec.m_init_throw_code,0,
						m_spec.m_init_throw_read));
	      m_outstream.println();
	      m_outstream.println("\t\t{");
	    }
	  else
	    {
	      m_outstream.println(" {");
	    }

	  m_outstream.println("\t\tthis ();");	  
	  m_outstream.println("\t\tif (null == reader) {");
	  m_outstream.println("\t\t\tthrow (new Error(\"Error: Bad input "
				 + "stream initializer.\"));");
	  m_outstream.println("\t\t}");
	  m_outstream.println("\t\tyy_reader = new java.io.BufferedReader(reader);");
	  m_outstream.println("\t}");
	  m_outstream.println();


	  /* Function: second constructor (InputStream) */
	  m_outstream.print("\t");
	  if (true == m_spec.m_public) {
	    m_outstream.print("public ");
	  }
          m_outstream.print(new String(m_spec.m_class_name));
	  m_outstream.print(" (java.io.InputStream instream)");
	  
	  if (null != m_spec.m_init_throw_code)
	    {
	      m_outstream.println(); 
	      m_outstream.print("\t\tthrows "); 
	      m_outstream.println(new String(m_spec.m_init_throw_code,0,
						m_spec.m_init_throw_read));
	      m_outstream.println("\t\t{");
	    }
	  else
	    {
	      m_outstream.println(" {");
	    }
	  
	  m_outstream.println("\t\tthis ();");	  
	  m_outstream.println("\t\tif (null == instream) {");
	  m_outstream.println("\t\t\tthrow (new Error(\"Error: Bad input "
				 + "stream initializer.\"));");
	  m_outstream.println("\t\t}");
	  m_outstream.println("\t\tyy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));");
	  m_outstream.println("\t}");
	  m_outstream.println();


	  /* Function: third, private constructor - only for internal use */
	  m_outstream.print("\tprivate ");
          m_outstream.print(new String(m_spec.m_class_name));
	  m_outstream.print(" ()");
	  
	  if (null != m_spec.m_init_throw_code)
	    {
	      m_outstream.println(); 
	      m_outstream.print("\t\tthrows "); 
	      m_outstream.println(new String(m_spec.m_init_throw_code,0,
						m_spec.m_init_throw_read));
	      m_outstream.println("\t\t{");
	    }
	  else
	    {
	      m_outstream.println(" {");
	    }
	  
	  m_outstream.println("\t\tyy_buffer = new char[YY_BUFFER_SIZE];");
	  m_outstream.println("\t\tyy_buffer_read = 0;");
	  m_outstream.println("\t\tyy_buffer_index = 0;");
	  m_outstream.println("\t\tyy_buffer_start = 0;");
	  m_outstream.println("\t\tyy_buffer_end = 0;");
	  if (m_spec.m_count_chars)
	    {
	      m_outstream.println("\t\tyychar = 0;");
	    }
	  if (m_spec.m_count_lines)
	    {
	      m_outstream.println("\t\tyyline = 0;");
	    }
	  m_outstream.println("\t\tyy_at_bol = true;");
	  m_outstream.println("\t\tyy_lexical_state = YYINITIAL;");
	  /*if (m_spec.m_count_lines || true == m_spec.m_count_chars)
	    {
	      m_outstream.println("\t\tyy_buffer_prev_start = 0;");
	    }*/

	  /* User specified constructor code. */
	  if (null != m_spec.m_init_code)
	    {
	      m_outstream.print(new String(m_spec.m_init_code,0,
						m_spec.m_init_read));
	    }

	  m_outstream.println("\t}");
	  m_outstream.println();

	}

  /***************************************************************
    Function: emit_states
    Description: Emits constants that serve as lexical states,
    including YYINITIAL.
    **************************************************************/
  private void emit_states
    (
     )
      throws java.io.IOException
	{
	  Enumeration states;
	  String state;
	  int index;

	  states = m_spec.m_states.keys();
	  /*index = 0;*/
	  while (states.hasMoreElements())
	    {
	      state = (String) states.nextElement();
	      
	      if (CUtility.DEBUG)
		{
		  CUtility.ASSERT(null != state);
		}
	      
	      m_outstream.println("\tprivate final int " 
				     + state 
				     + " = " 
				     + (m_spec.m_states.get(state)).toString() 
				     + ";");
	      /*++index;*/
	    }

	  m_outstream.println("\tprivate final int yy_state_dtrans[] = {");
	  for (index = 0; index < m_spec.m_state_dtrans.length; ++index)
	    {
	      m_outstream.print("\t\t" + m_spec.m_state_dtrans[index]);
	      if (index < m_spec.m_state_dtrans.length - 1)
		{
		  m_outstream.println(",");
		}
	      else
		{
		  m_outstream.println();
		}
	    }
	  m_outstream.println("\t};");
	}

  /***************************************************************
    Function: emit_helpers
    Description: Emits helper functions, particularly 
    error handling and input buffering.
    **************************************************************/
  private void emit_helpers
    (
     )
      throws java.io.IOException
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != m_spec);
	    CUtility.ASSERT(null != m_outstream);
	  }

	/* Function: yy_do_eof */
	m_outstream.println("\tprivate boolean yy_eof_done = false;");
	if (null != m_spec.m_eof_code)
	  {
	    m_outstream.print("\tprivate void yy_do_eof ()");

	    if (null != m_spec.m_eof_throw_code)
	      {
		m_outstream.println(); 
		m_outstream.print("\t\tthrows "); 
		m_outstream.println(new String(m_spec.m_eof_throw_code,0,
						  m_spec.m_eof_throw_read));
		m_outstream.println("\t\t{");
	      }
	    else
	      {
		m_outstream.println(" {");
	      }

	    m_outstream.println("\t\tif (false == yy_eof_done) {");
	    m_outstream.print(new String(m_spec.m_eof_code,0,
					      m_spec.m_eof_read));
	    m_outstream.println("\t\t}");
	    m_outstream.println("\t\tyy_eof_done = true;");
	    m_outstream.println("\t}");
	  }

	emit_states();
	
	/* Function: yybegin */
	m_outstream.println("\tprivate void yybegin (int state) {");
	m_outstream.println("\t\tyy_lexical_state = state;");
	m_outstream.println("\t}");

	/* Function: yy_initial_dtrans */
	/*m_outstream.println("\tprivate int yy_initial_dtrans (int state) {");
	m_outstream.println("\t\treturn yy_state_dtrans[state];");
	m_outstream.println("\t}");*/

	/* Function: yy_advance */
	m_outstream.println("\tprivate int yy_advance ()");
	m_outstream.println("\t\tthrows java.io.IOException {");
	/*m_outstream.println("\t\t{");*/
	m_outstream.println("\t\tint next_read;");
	m_outstream.println("\t\tint i;");
	m_outstream.println("\t\tint j;");
	m_outstream.println();

	m_outstream.println("\t\tif (yy_buffer_index < yy_buffer_read) {");
	m_outstream.println("\t\t\treturn yy_buffer[yy_buffer_index++];");
	/*m_outstream.println("\t\t\t++yy_buffer_index;");*/
	m_outstream.println("\t\t}");
	m_outstream.println();

	m_outstream.println("\t\tif (0 != yy_buffer_start) {");
	m_outstream.println("\t\t\ti = yy_buffer_start;");
	m_outstream.println("\t\t\tj = 0;");
	m_outstream.println("\t\t\twhile (i < yy_buffer_read) {");
	m_outstream.println("\t\t\t\tyy_buffer[j] = yy_buffer[i];");
	m_outstream.println("\t\t\t\t++i;");
	m_outstream.println("\t\t\t\t++j;");
	m_outstream.println("\t\t\t}");
	m_outstream.println("\t\t\tyy_buffer_end = yy_buffer_end - yy_buffer_start;");
	m_outstream.println("\t\t\tyy_buffer_start = 0;");
	m_outstream.println("\t\t\tyy_buffer_read = j;");
	m_outstream.println("\t\t\tyy_buffer_index = j;");
	m_outstream.println("\t\t\tnext_read = yy_reader.read(yy_buffer,");
	m_outstream.println("\t\t\t\t\tyy_buffer_read,");
	m_outstream.println("\t\t\t\t\tyy_buffer.length - yy_buffer_read);");
	m_outstream.println("\t\t\tif (-1 == next_read) {");
	m_outstream.println("\t\t\t\treturn YY_EOF;");
	m_outstream.println("\t\t\t}");
	m_outstream.println("\t\t\tyy_buffer_read = yy_buffer_read + next_read;");
	m_outstream.println("\t\t}");
	m_outstream.println();

	m_outstream.println("\t\twhile (yy_buffer_index >= yy_buffer_read) {");
	m_outstream.println("\t\t\tif (yy_buffer_index >= yy_buffer.length) {");
	m_outstream.println("\t\t\t\tyy_buffer = yy_double(yy_buffer);");
	m_outstream.println("\t\t\t}");
	m_outstream.println("\t\t\tnext_read = yy_reader.read(yy_buffer,");
	m_outstream.println("\t\t\t\t\tyy_buffer_read,");
	m_outstream.println("\t\t\t\t\tyy_buffer.length - yy_buffer_read);");
	m_outstream.println("\t\t\tif (-1 == next_read) {");
	m_outstream.println("\t\t\t\treturn YY_EOF;");
	m_outstream.println("\t\t\t}");
	m_outstream.println("\t\t\tyy_buffer_read = yy_buffer_read + next_read;");
	m_outstream.println("\t\t}");

	m_outstream.println("\t\treturn yy_buffer[yy_buffer_index++];");
	m_outstream.println("\t}");
	
	/* Function: yy_move_end */
	m_outstream.println("\tprivate void yy_move_end () {");
	m_outstream.println("\t\tif (yy_buffer_end > yy_buffer_start &&");
	m_outstream.println("\t\t    '\\n' == yy_buffer[yy_buffer_end-1])");
	m_outstream.println("\t\t\tyy_buffer_end--;");
	m_outstream.println("\t\tif (yy_buffer_end > yy_buffer_start &&");
	m_outstream.println("\t\t    '\\r' == yy_buffer[yy_buffer_end-1])");
	m_outstream.println("\t\t\tyy_buffer_end--;");
	m_outstream.println("\t}");

	/* Function: yy_mark_start */
	m_outstream.println("\tprivate boolean yy_last_was_cr=false;");
	m_outstream.println("\tprivate void yy_mark_start () {");
	if (m_spec.m_count_lines || true == m_spec.m_count_chars)
	  {
	    if (m_spec.m_count_lines)
	      {
		m_outstream.println("\t\tint i;");
		m_outstream.println("\t\tfor (i = yy_buffer_start; " 
				       + "i < yy_buffer_index; ++i) {");
		m_outstream.println("\t\t\tif ('\\n' == yy_buffer[i] && !yy_last_was_cr) {");
		m_outstream.println("\t\t\t\t++yyline;");
		m_outstream.println("\t\t\t}");
		m_outstream.println("\t\t\tif ('\\r' == yy_buffer[i]) {");
		m_outstream.println("\t\t\t\t++yyline;");
		m_outstream.println("\t\t\t\tyy_last_was_cr=true;");
		m_outstream.println("\t\t\t} else yy_last_was_cr=false;");
		m_outstream.println("\t\t}");
	      }
	    if (m_spec.m_count_chars)
	      {
		m_outstream.println("\t\tyychar = yychar"); 
		m_outstream.println("\t\t\t+ yy_buffer_index - yy_buffer_start;");
	      }
	  }
	m_outstream.println("\t\tyy_buffer_start = yy_buffer_index;");
	m_outstream.println("\t}");

	/* Function: yy_mark_end */
	m_outstream.println("\tprivate void yy_mark_end () {");
	m_outstream.println("\t\tyy_buffer_end = yy_buffer_index;");
	m_outstream.println("\t}");

	/* Function: yy_to_mark */
	m_outstream.println("\tprivate void yy_to_mark () {");
	m_outstream.println("\t\tyy_buffer_index = yy_buffer_end;");
	m_outstream.println("\t\tyy_at_bol = "+
			    "(yy_buffer_end > yy_buffer_start) &&");
	m_outstream.println("\t\t            "+
			    "('\\r' == yy_buffer[yy_buffer_end-1] ||");
	m_outstream.println("\t\t            "+
			    " '\\n' == yy_buffer[yy_buffer_end-1] ||");
	m_outstream.println("\t\t            "+ /* unicode LS */
			    " 2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||");
	m_outstream.println("\t\t            "+ /* unicode PS */
			    " 2029/*PS*/ == yy_buffer[yy_buffer_end-1]);");
	m_outstream.println("\t}");

	/* Function: yytext */
	m_outstream.println("\tprivate java.lang.String yytext () {");
	m_outstream.println("\t\treturn (new java.lang.String(yy_buffer,");
	m_outstream.println("\t\t\tyy_buffer_start,");
	m_outstream.println("\t\t\tyy_buffer_end - yy_buffer_start));");
	m_outstream.println("\t}");

	/* Function: yylength */
	m_outstream.println("\tprivate int yylength () {");
	m_outstream.println("\t\treturn yy_buffer_end - yy_buffer_start;");
	m_outstream.println("\t}");

	/* Function: yy_double */
	m_outstream.println("\tprivate char[] yy_double (char buf[]) {");
	m_outstream.println("\t\tint i;");
	m_outstream.println("\t\tchar newbuf[];");
	m_outstream.println("\t\tnewbuf = new char[2*buf.length];");
	m_outstream.println("\t\tfor (i = 0; i < buf.length; ++i) {");
	m_outstream.println("\t\t\tnewbuf[i] = buf[i];");
	m_outstream.println("\t\t}");
	m_outstream.println("\t\treturn newbuf;");
	m_outstream.println("\t}");

	/* Function: yy_error */
	m_outstream.println("\tprivate final int YY_E_INTERNAL = 0;");
	m_outstream.println("\tprivate final int YY_E_MATCH = 1;");
	m_outstream.println("\tprivate java.lang.String yy_error_string[] = {");
	m_outstream.println("\t\t\"Error: Internal error.\\n\",");
	m_outstream.println("\t\t\"Error: Unmatched input.\\n\"");
	m_outstream.println("\t};");
	m_outstream.println("\tprivate void yy_error (int code,boolean fatal) {");
	m_outstream.println("\t\tjava.lang.System.out.print(yy_error_string[code]);");
	m_outstream.println("\t\tjava.lang.System.out.flush();");
	m_outstream.println("\t\tif (fatal) {");
	m_outstream.println("\t\t\tthrow new Error(\"Fatal Error.\\n\");");
	m_outstream.println("\t\t}");
	m_outstream.println("\t}");

	/* Function: yy_next */
	/*m_outstream.println("\tprivate int yy_next (int current,char lookahead) {");
	m_outstream.println("\t\treturn yy_nxt[yy_rmap[current]][yy_cmap[lookahead]];");
	m_outstream.println("\t}");*/

	/* Function: yy_accept */
	/*m_outstream.println("\tprivate int yy_accept (int current) {");
	m_outstream.println("\t\treturn yy_acpt[current];");
	m_outstream.println("\t}");*/


	// Function: private int [][] unpackFromString(int size1, int size2, String st)
	// Added 6/24/98 Raimondas Lencevicius
	// May be made more efficient by replacing String operations
	// Assumes correctly formed input String. Performs no error checking
	m_outstream.println("\tprivate int[][] unpackFromString"+
			    "(int size1, int size2, String st) {");
	m_outstream.println("\t\tint colonIndex = -1;");
	m_outstream.println("\t\tString lengthString;");
	m_outstream.println("\t\tint sequenceLength = 0;");
	m_outstream.println("\t\tint sequenceInteger = 0;");
	m_outstream.println();
	m_outstream.println("\t\tint commaIndex;");
	m_outstream.println("\t\tString workString;");
	m_outstream.println();
	m_outstream.println("\t\tint res[][] = new int[size1][size2];");
	m_outstream.println("\t\tfor (int i= 0; i < size1; i++) {");
	m_outstream.println("\t\t\tfor (int j= 0; j < size2; j++) {");
	m_outstream.println("\t\t\t\tif (sequenceLength != 0) {");
	m_outstream.println("\t\t\t\t\tres[i][j] = sequenceInteger;");
	m_outstream.println("\t\t\t\t\tsequenceLength--;");
	m_outstream.println("\t\t\t\t\tcontinue;");
	m_outstream.println("\t\t\t\t}");
	m_outstream.println("\t\t\t\tcommaIndex = st.indexOf(',');");
	m_outstream.println("\t\t\t\tworkString = (commaIndex==-1) ? st :");
	m_outstream.println("\t\t\t\t\tst.substring(0, commaIndex);");
	m_outstream.println("\t\t\t\tst = st.substring(commaIndex+1);");  
	m_outstream.println("\t\t\t\tcolonIndex = workString.indexOf(':');");
	m_outstream.println("\t\t\t\tif (colonIndex == -1) {");
	m_outstream.println("\t\t\t\t\tres[i][j]=Integer.parseInt(workString);");
	m_outstream.println("\t\t\t\t\tcontinue;");
	m_outstream.println("\t\t\t\t}");
	m_outstream.println("\t\t\t\tlengthString =");
	m_outstream.println("\t\t\t\t\tworkString.substring(colonIndex+1);");
	m_outstream.println("\t\t\t\tsequenceLength="+
			    "Integer.parseInt(lengthString);");
	m_outstream.println("\t\t\t\tworkString="+
			    "workString.substring(0,colonIndex);");
	m_outstream.println("\t\t\t\tsequenceInteger="+
			    "Integer.parseInt(workString);");
	m_outstream.println("\t\t\t\tres[i][j] = sequenceInteger;");
	m_outstream.println("\t\t\t\tsequenceLength--;");
	m_outstream.println("\t\t\t}");
	m_outstream.println("\t\t}");
	m_outstream.println("\t\treturn res;");
	m_outstream.println("\t}");
      }

  /***************************************************************
    Function: emit_header
    Description: Emits class header.
    **************************************************************/
  private void emit_header
    (
     )
      throws java.io.IOException
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != m_spec);
	    CUtility.ASSERT(null != m_outstream);
	  }

	m_outstream.println();
	m_outstream.println();
	if (true == m_spec.m_public) {
	  m_outstream.print("public ");
	}
	m_outstream.print("class ");
	m_outstream.print(new String(m_spec.m_class_name,0,
					  m_spec.m_class_name.length));
        if (m_spec.m_implements_name.length > 0) {
	   m_outstream.print(" implements ");	
	   m_outstream.print(new String(m_spec.m_implements_name,0,
					  m_spec.m_implements_name.length));
	}	  
	m_outstream.println(" {");
      }

  /***************************************************************
    Function: emit_table
    Description: Emits transition table.
    **************************************************************/
  private void emit_table
    (
     )
      throws java.io.IOException
      {
	int i;
	int elem;
	int size;
	CDTrans dtrans;
	boolean is_start;
	boolean is_end;
	CAccept accept;

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != m_spec);
	    CUtility.ASSERT(null != m_outstream);
	  }

	m_outstream.println("\tprivate int yy_acpt[] = {");
	size = m_spec.m_accept_vector.size();
	for (elem = 0; elem < size; ++elem)
	  {
	    accept = (CAccept) m_spec.m_accept_vector.elementAt(elem);
	    
	    m_outstream.print("\t\t/* "+elem+" */ ");
	    if (null != accept)
	      {
		is_start = (0 != (m_spec.m_anchor_array[elem] & CSpec.START));
		is_end = (0 != (m_spec.m_anchor_array[elem] & CSpec.END));
		
		if (is_start && true == is_end)
		  {
		    m_outstream.print("YY_START | YY_END");
		  }
		else if (is_start)
		  {
		    m_outstream.print("YY_START");
		  }
		else if (is_end)
		  {
		    m_outstream.print("YY_END");
		  }
		else
		  {
		    m_outstream.print("YY_NO_ANCHOR");
		  }
	      }
	    else 
	      {
		m_outstream.print("YY_NOT_ACCEPT");
	      }
	    
	    if (elem < size - 1)
	      {
		m_outstream.print(",");
	      }
	    
	    m_outstream.println();
	  }
	m_outstream.println("\t};");

	// CSA: modified yy_cmap to use string packing 9-Aug-1999
	int[] yy_cmap = new int[m_spec.m_ccls_map.length];
	for (i = 0; i < m_spec.m_ccls_map.length; ++i)
	    yy_cmap[i] = m_spec.m_col_map[m_spec.m_ccls_map[i]];
	m_outstream.print("\tprivate int yy_cmap[] = unpackFromString(");
	emit_table_as_string(new int[][] { yy_cmap });
	m_outstream.println(")[0];");
	m_outstream.println();

	// CSA: modified yy_rmap to use string packing 9-Aug-1999
	m_outstream.print("\tprivate int yy_rmap[] = unpackFromString(");
	emit_table_as_string(new int[][] { m_spec.m_row_map });
	m_outstream.println(")[0];");
	m_outstream.println();

	// 6/24/98 Raimondas Lencevicius
	// modified to use
	//    int[][] unpackFromString(int size1, int size2, String st)
	size = m_spec.m_dtrans_vector.size();
	int[][] yy_nxt = new int[size][];
	for (elem=0; elem<size; elem++) {
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(elem);
	    CUtility.ASSERT(dtrans.m_dtrans.length==m_spec.m_dtrans_ncols);
	    yy_nxt[elem] = dtrans.m_dtrans;
	}
	m_outstream.print
	  ("\tprivate int yy_nxt[][] = unpackFromString(");
	emit_table_as_string(yy_nxt);
	m_outstream.println(");");
	m_outstream.println();
      }

  /***************************************************************
    Function: emit_driver
    Description: Output an integer table as a string.  Written by
    Raimondas Lencevicius 6/24/98; reorganized by CSA 9-Aug-1999.
    From his original comments:
	   yy_nxt[][] values are coded into a string
	   by printing integers and representing
	   integer sequences as "value:length" pairs.
    **************************************************************/
  private void emit_table_as_string(int[][] ia) {
	int sequenceLength = 0; // RL - length of the number sequence
	boolean sequenceStarted = false; // RL - has number sequence started?
	int previousInt = -20; // RL - Bogus -20 state.
	
	// RL - Output matrix size
	m_outstream.print(ia.length);
	m_outstream.print(",");
	m_outstream.print(ia.length>0?ia[0].length:0);
	m_outstream.println(",");

	StringBuffer outstr = new StringBuffer();

	//  RL - Output matrix 
	for (int elem = 0; elem < ia.length; ++elem)
	  {
	    for (int i = 0; i < ia[elem].length; ++i)
	      {
		int writeInt = ia[elem][i];
		if (writeInt == previousInt) // RL - sequence?
		  {
		    if (sequenceStarted)
		      {
			sequenceLength++;
		      }
		    else
		      {
			outstr.append(writeInt);
			outstr.append(":");
			sequenceLength = 2;
			sequenceStarted = true;
		      }
		  }
		else // RL - no sequence or end sequence
		  {
		    if (sequenceStarted)
		      {
			outstr.append(sequenceLength);
			outstr.append(",");
			sequenceLength = 0;
			sequenceStarted = false;
		      }
		    else
		      {
			if (previousInt != -20)
			  {
			    outstr.append(previousInt);
			    outstr.append(",");
			  }
		      }
		  }
		previousInt = writeInt;
		// CSA: output in 75 character chunks.
		if (outstr.length() > 75) {
		  String s = outstr.toString();
		  m_outstream.println("\""+s.substring(0,75)+"\" +");
		  outstr = new StringBuffer(s.substring(75));
		}
	      }
	  }
	if (sequenceStarted)
	  {
	    outstr.append(sequenceLength);
	  }
	else
	  {
	    outstr.append(previousInt);
	  }    
	// CSA: output in 75 character chunks.
	if (outstr.length() > 75) {
	  String s = outstr.toString();
	  m_outstream.println("\""+s.substring(0,75)+"\" +");
	  outstr = new StringBuffer(s.substring(75));
	}
	m_outstream.print("\""+outstr+"\"");
  }

  /***************************************************************
    Function: emit_driver
    Description: 
    **************************************************************/
  private void emit_driver
    (
     )
      throws java.io.IOException
	{
	  if (CUtility.DEBUG)
	    {
	      CUtility.ASSERT(null != m_spec);
	      CUtility.ASSERT(null != m_outstream);
	    }
	  
	  emit_table();

	  if (m_spec.m_integer_type)
	    {
	      m_outstream.print("\tpublic int ");
	      m_outstream.print(new String(m_spec.m_function_name));
	      m_outstream.println(" ()");
	    }
	  else if (m_spec.m_intwrap_type)
	    {
	      m_outstream.print("\tpublic java.lang.Integer ");
	      m_outstream.print(new String(m_spec.m_function_name));
	      m_outstream.println(" ()");
	    }
	  else
	    {
	      m_outstream.print("\tpublic ");
	      m_outstream.print(new String(m_spec.m_type_name));
	      m_outstream.print(" ");
	      m_outstream.print(new String(m_spec.m_function_name));
	      m_outstream.println(" ()");
	    }

	  /*m_outstream.println("\t\tthrows java.io.IOException {");*/
	  m_outstream.print("\t\tthrows java.io.IOException");
	  if (null != m_spec.m_yylex_throw_code)
	    {
	      m_outstream.print(", "); 
	      m_outstream.print(new String(m_spec.m_yylex_throw_code,0,
						m_spec.m_yylex_throw_read));
	      m_outstream.println();
	      m_outstream.println("\t\t{");
	    }
	  else
	    {
	      m_outstream.println(" {");
	    }

	  m_outstream.println("\t\tint yy_lookahead;");
	  m_outstream.println("\t\tint yy_anchor = YY_NO_ANCHOR;");
	  /*m_outstream.println("\t\tint yy_state "
	    + "= yy_initial_dtrans(yy_lexical_state);");*/
	  m_outstream.println("\t\tint yy_state " 
				 + "= yy_state_dtrans[yy_lexical_state];");
	  m_outstream.println("\t\tint yy_next_state = YY_NO_STATE;");
	  /*m_outstream.println("\t\tint yy_prev_stave = YY_NO_STATE;");*/
	  m_outstream.println("\t\tint yy_last_accept_state = YY_NO_STATE;");
    	  m_outstream.println("\t\tboolean yy_initial = true;");
	  m_outstream.println("\t\tint yy_this_accept;");
	  m_outstream.println();

	  m_outstream.println("\t\tyy_mark_start();");
	  /*m_outstream.println("\t\tyy_this_accept = yy_accept(yy_state);");*/
	  m_outstream.println("\t\tyy_this_accept = yy_acpt[yy_state];");
	  m_outstream.println("\t\tif (YY_NOT_ACCEPT != yy_this_accept) {");
	  m_outstream.println("\t\t\tyy_last_accept_state = yy_state;");
	  m_outstream.println("\t\t\tyy_mark_end();");
	  m_outstream.println("\t\t}");

	  if (NOT_EDBG)
	    {
	      m_outstream.println("\t\tjava.lang.System.out.println(\"Begin\");");
	    }

	  m_outstream.println("\t\twhile (true) {");

	  m_outstream.println("\t\t\tif (yy_initial && yy_at_bol) "+
			                 "yy_lookahead = YY_BOL;");
	  m_outstream.println("\t\t\telse yy_lookahead = yy_advance();");
	  m_outstream.println("\t\t\tyy_next_state = YY_F;");
	  /*m_outstream.println("\t\t\t\tyy_next_state = "
				 + "yy_next(yy_state,yy_lookahead);");*/
	  m_outstream.println("\t\t\tyy_next_state = "
 	   + "yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];");

	  if (NOT_EDBG)
	    {
	      m_outstream.println("java.lang.System.out.println(\"Current state: \"" 
				     + " + yy_state");
	      m_outstream.println("+ \"\tCurrent input: \""); 
	      m_outstream.println(" + ((char) yy_lookahead));");
	    }
	  if (NOT_EDBG)
	    {
	      m_outstream.println("\t\t\tjava.lang.System.out.println(\"State = \"" 
				     + "+ yy_state);");
	      m_outstream.println("\t\t\tjava.lang.System.out.println(\"Accepting status = \"" 
				     + "+ yy_this_accept);");
	      m_outstream.println("\t\t\tjava.lang.System.out.println(\"Last accepting state = \"" 
				     + "+ yy_last_accept_state);");
	      m_outstream.println("\t\t\tjava.lang.System.out.println(\"Next state = \"" 
				     + "+ yy_next_state);");
	      m_outstream.println("\t\t\tjava.lang.System.out.println(\"Lookahead input = \"" 
				     + "+ ((char) yy_lookahead));");
	    }

	  // handle bare EOF.
	  m_outstream.println("\t\t\tif (YY_EOF == yy_lookahead " 
				 + "&& true == yy_initial) {");
	  if (null != m_spec.m_eof_code)
	    {
	      m_outstream.println("\t\t\t\tyy_do_eof();");
	    }
	  if (true == m_spec.m_integer_type)
	    {
	      m_outstream.println("\t\t\t\treturn YYEOF;");
	    }
	  else if (null != m_spec.m_eof_value_code) 
	    {
	      m_outstream.print(new String(m_spec.m_eof_value_code,0,
						m_spec.m_eof_value_read));
	    }
	  else
	    {
	      m_outstream.println("\t\t\t\treturn null;");
	    }
	  m_outstream.println("\t\t\t}");

	  m_outstream.println("\t\t\tif (YY_F != yy_next_state) {");
	  m_outstream.println("\t\t\t\tyy_state = yy_next_state;");
     	  m_outstream.println("\t\t\t\tyy_initial = false;");
     	  /*m_outstream.println("\t\t\t\tyy_this_accept = yy_accept(yy_state);");*/
	  m_outstream.println("\t\t\t\tyy_this_accept = yy_acpt[yy_state];");
	  m_outstream.println("\t\t\t\tif (YY_NOT_ACCEPT != yy_this_accept) {");
	  m_outstream.println("\t\t\t\t\tyy_last_accept_state = yy_state;");
	  m_outstream.println("\t\t\t\t\tyy_mark_end();");
	  m_outstream.println("\t\t\t\t}");
	  /*m_outstream.println("\t\t\t\tyy_prev_state = yy_state;");*/
	  /*m_outstream.println("\t\t\t\tyy_state = yy_next_state;");*/
	  m_outstream.println("\t\t\t}");

	  m_outstream.println("\t\t\telse {");
	  
	  m_outstream.println("\t\t\t\tif (YY_NO_STATE == yy_last_accept_state) {");
	  

	  /*m_outstream.println("\t\t\t\t\tyy_error(YY_E_MATCH,false);");
    	  m_outstream.println("\t\t\t\t\tyy_initial = true;");
	  m_outstream.println("\t\t\t\t\tyy_state "
				 + "= yy_state_dtrans[yy_lexical_state];");
	  m_outstream.println("\t\t\t\t\tyy_next_state = YY_NO_STATE;");*/
	  /*m_outstream.println("\t\t\t\t\tyy_prev_state = YY_NO_STATE;");*/
	  /*m_outstream.println("\t\t\t\t\tyy_last_accept_state = YY_NO_STATE;");
	  m_outstream.println("\t\t\t\t\tyy_mark_start();");*/
	  /*m_outstream.println("\t\t\t\t\tyy_this_accept = yy_accept(yy_state);");*/
	  /*m_outstream.println("\t\t\t\t\tyy_this_accept = yy_acpt[yy_state];");
	  m_outstream.println("\t\t\t\t\tif (YY_NOT_ACCEPT != yy_this_accept) {");
	  m_outstream.println("\t\t\t\t\t\tyy_last_accept_state = yy_state;");
	  m_outstream.println("\t\t\t\t\t}");*/

	  m_outstream.println("\t\t\t\t\tthrow (new Error(\"Lexical Error: Unmatched Input.\"));");
	  m_outstream.println("\t\t\t\t}");

	  m_outstream.println("\t\t\t\telse {");

	  m_outstream.println("\t\t\t\t\tyy_anchor = yy_acpt[yy_last_accept_state];");
	  /*m_outstream.println("\t\t\t\t\tyy_anchor " 
	    + "= yy_accept(yy_last_accept_state);");*/
	  m_outstream.println("\t\t\t\t\tif (0 != (YY_END & yy_anchor)) {");
	  m_outstream.println("\t\t\t\t\t\tyy_move_end();");
	  m_outstream.println("\t\t\t\t\t}");
	  m_outstream.println("\t\t\t\t\tyy_to_mark();");

	  m_outstream.println("\t\t\t\t\tswitch (yy_last_accept_state) {");

	  emit_actions("\t\t\t\t\t");

	  m_outstream.println("\t\t\t\t\tdefault:");
	  m_outstream.println("\t\t\t\t\t\tyy_error(YY_E_INTERNAL,false);");
	  /*m_outstream.println("\t\t\t\t\t\treturn null;");*/
	  m_outstream.println("\t\t\t\t\tcase -1:");
	  m_outstream.println("\t\t\t\t\t}");
	  
    	  m_outstream.println("\t\t\t\t\tyy_initial = true;");
	  m_outstream.println("\t\t\t\t\tyy_state "
				 + "= yy_state_dtrans[yy_lexical_state];");
	  m_outstream.println("\t\t\t\t\tyy_next_state = YY_NO_STATE;");
	  /*m_outstream.println("\t\t\t\t\tyy_prev_state = YY_NO_STATE;");*/
	  m_outstream.println("\t\t\t\t\tyy_last_accept_state = YY_NO_STATE;");

	  m_outstream.println("\t\t\t\t\tyy_mark_start();");

	  /*m_outstream.println("\t\t\t\t\tyy_this_accept = yy_accept(yy_state);");*/
	  m_outstream.println("\t\t\t\t\tyy_this_accept = yy_acpt[yy_state];");
	  m_outstream.println("\t\t\t\t\tif (YY_NOT_ACCEPT != yy_this_accept) {");
	  m_outstream.println("\t\t\t\t\t\tyy_last_accept_state = yy_state;");
	  m_outstream.println("\t\t\t\t\t\tyy_mark_end();");
	  m_outstream.println("\t\t\t\t\t}");

	  m_outstream.println("\t\t\t\t}");	  
	  m_outstream.println("\t\t\t}");
	  m_outstream.println("\t\t}");
	  m_outstream.println("\t}");

	  /*m_outstream.println("\t\t\t\t");
	  m_outstream.println("\t\t\t");
	  m_outstream.println("\t\t\t");
	  m_outstream.println("\t\t\t");
	  m_outstream.println("\t\t\t");
	  m_outstream.println("\t\t}");*/
	}
  
  /***************************************************************
    Function: emit_actions
    Description:     
    **************************************************************/
  private void emit_actions 
    (
     String tabs
     )
      throws java.io.IOException
	{
	  int elem;
	  int size;
	  int bogus_index;
	  CAccept accept;
	  
	  if (CUtility.DEBUG)
	    {
	      CUtility.ASSERT(m_spec.m_accept_vector.size() 
			      == m_spec.m_anchor_array.length);
	    }

	  bogus_index = -2;
	  size = m_spec.m_accept_vector.size();
	  for (elem = 0; elem < size; ++elem)
	    {
	      accept = (CAccept) m_spec.m_accept_vector.elementAt(elem);
	      if (null != accept) 
		{
		  m_outstream.println(tabs + "case " + elem 
					 + ":");
		  m_outstream.print(tabs + "\t");
		  m_outstream.print(new String(accept.m_action,0,
						    accept.m_action_read));
		  m_outstream.println();
		  m_outstream.println(tabs + "case " + bogus_index + ":");
		  m_outstream.println(tabs + "\tbreak;");
		  --bogus_index;
		}
	    }
	}
  
  /***************************************************************
    Function: emit_footer
    Description:     
    **************************************************************/
  private void emit_footer
    (
     )
      throws java.io.IOException
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != m_spec);
	    CUtility.ASSERT(null != m_outstream);
	  }

	m_outstream.println("}");
      }
}

/***************************************************************
  Class: CBunch
  **************************************************************/
class CBunch
{
  /***************************************************************
    Member Variables
    **************************************************************/
  Vector m_nfa_set; /* Vector of CNfa states in dfa state. */
  SparseBitSet m_nfa_bit; /* BitSet representation of CNfa labels. */
  CAccept m_accept; /* Accepting actions, or null if nonaccepting state. */
  int m_anchor; /* Anchors on regular expression. */
  int m_accept_index; /* CNfa index corresponding to accepting actions. */

  /***************************************************************
    Function: CBunch
    Description: Constructor.
    **************************************************************/
  CBunch
    (
     )
      {
	m_nfa_set = null;
	m_nfa_bit = null;
	m_accept = null;
	m_anchor = CSpec.NONE;
	m_accept_index = -1;
      }
}

/***************************************************************
  Class: CMakeNfa
  **************************************************************/
class CMakeNfa
{
  /***************************************************************
    Member Variables
    **************************************************************/
  private CSpec m_spec;
  private CLexGen m_lexGen;
  private CInput m_input;

  /***************************************************************
    Function: CMakeNfa
    Description: Constructor.
    **************************************************************/
  CMakeNfa
    (
     )
      {
	reset();
      }

  /***************************************************************
    Function: reset
    Description: Resets CMakeNfa member variables.
    **************************************************************/
  private void reset
    (
     )
      {
	m_input = null;
	m_lexGen = null;
	m_spec = null;
      }

  /***************************************************************
    Function: set
    Description: Sets CMakeNfa member variables.
    **************************************************************/
  private void set
    (
     CLexGen lexGen,
     CSpec spec,
     CInput input
     )
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != input);
	    CUtility.ASSERT(null != lexGen);
	    CUtility.ASSERT(null != spec);
	  }

	m_input = input;
	m_lexGen = lexGen;
	m_spec = spec;
      }

  /***************************************************************
    Function: allocate_BOL_EOF
    Description: Expands character class to include special BOL and
    EOF characters.  Puts numeric index of these characters in
    input CSpec.
    **************************************************************/
  void allocate_BOL_EOF
    (
     CSpec spec
     )
	{
	  CUtility.ASSERT(CSpec.NUM_PSEUDO==2);
	  spec.BOL = spec.m_dtrans_ncols++;
	  spec.EOF = spec.m_dtrans_ncols++;
	}

  /***************************************************************
    Function: thompson
    Description: High level access function to module.
    Deposits result in input CSpec.
    **************************************************************/
  void thompson
    (
     CLexGen lexGen,
     CSpec spec,
     CInput input
     )
      throws java.io.IOException      
	{
	  int i;
	  CNfa elem;
	  int size;

	  /* Set member variables. */
	  reset();
	  set(lexGen,spec,input);

	  size = m_spec.m_states.size();
	  m_spec.m_state_rules = new Vector[size];
	  for (i = 0; i < size; ++i)
	    {
	      m_spec.m_state_rules[i] = new Vector();
	    }

	  /* Initialize current token variable 
	     and create nfa. */
	  /*m_spec.m_current_token = m_lexGen.EOS;
	  m_lexGen.advance();*/

	  m_spec.m_nfa_start = machine();
	  
	  /* Set labels in created nfa machine. */
	  size = m_spec.m_nfa_states.size();
	  for (i = 0; i < size; ++i)
	    {
	      elem = (CNfa) m_spec.m_nfa_states.elementAt(i);
	      elem.m_label = i;
	    }

	  /* Debugging output. */
	  if (CUtility.DO_DEBUG)
	    {
	      m_lexGen.print_nfa();
	    }

	  if (m_spec.m_verbose)
	    {
	      System.out.println("NFA comprised of " 
				 + (m_spec.m_nfa_states.size() + 1) 
				 + " states.");
	    }

	  reset();
	}
     
  /***************************************************************
    Function: discardCNfa
    Description: 
    **************************************************************/
  private void discardCNfa
    (
     CNfa nfa
     )
      {
	m_spec.m_nfa_states.removeElement(nfa);
      }

  /***************************************************************
    Function: processStates
    Description:
    **************************************************************/
  private void processStates
    (
     SparseBitSet states,
     CNfa current
     )
      {
	int size;
	int i;
	
	size = m_spec.m_states.size();
	for (i = 0; i <  size; ++i)
	  {
	    if (states.get(i))
	      {
		m_spec.m_state_rules[i].addElement(current);
	      }
	  }
      }

  /***************************************************************
    Function: machine
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private CNfa machine
    (
     )
      throws java.io.IOException 
      {
	CNfa start;
	CNfa p;
	SparseBitSet states;

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.enter("machine",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	start = CAlloc.newCNfa(m_spec);
	p = start;
	    
	states = m_lexGen.getStates();

	/* Begin: Added for states. */
	m_spec.m_current_token = m_lexGen.EOS;
	m_lexGen.advance();
	/* End: Added for states. */
	
	if (m_lexGen.END_OF_INPUT != m_spec.m_current_token) // CSA fix.
	  {
	    p.m_next = rule();
	    
	    processStates(states,p.m_next);
	  }

	while (m_lexGen.END_OF_INPUT != m_spec.m_current_token)
	  {
	    /* Make state changes HERE. */
	    states = m_lexGen.getStates();
	
	    /* Begin: Added for states. */
	    m_lexGen.advance();
	    if (m_lexGen.END_OF_INPUT == m_spec.m_current_token)
	      { 
		break;
	      }
	    /* End: Added for states. */
	    
	    p.m_next2 = CAlloc.newCNfa(m_spec);
	    p = p.m_next2;
	    p.m_next = rule();
	    
	    processStates(states,p.m_next);
	  }

	// CSA: add pseudo-rules for BOL and EOF
	SparseBitSet all_states = new SparseBitSet();
	for (int i = 0; i < m_spec.m_states.size(); ++i)
		all_states.set(i);
	p.m_next2 = CAlloc.newCNfa(m_spec);
	p = p.m_next2;
	p.m_next = CAlloc.newCNfa(m_spec);
	p.m_next.m_edge = CNfa.CCL;
	p.m_next.m_next = CAlloc.newCNfa(m_spec);
	p.m_next.m_set = new CSet();
	p.m_next.m_set.add(m_spec.BOL);
	p.m_next.m_set.add(m_spec.EOF);
	p.m_next.m_next.m_accept = // do-nothing accept rule
	    new CAccept(new char[0], 0, m_input.m_line_number+1);
	processStates(all_states,p.m_next);
	// CSA: done. 

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.leave("machine",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	return start;
      }
  
  /***************************************************************
    Function: rule
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private CNfa rule
    (
     )
      throws java.io.IOException 
      {
	CNfaPair pair; 
	CNfa p;
	CNfa start = null;
	CNfa end = null;
	int anchor = CSpec.NONE;

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.enter("rule",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	pair = CAlloc.newCNfaPair();

	if (m_lexGen.AT_BOL == m_spec.m_current_token)
	  {
	    anchor = anchor | CSpec.START;
	    m_lexGen.advance();
	    expr(pair);

	    // CSA: fixed beginning-of-line operator. 8-aug-1999
	    start = CAlloc.newCNfa(m_spec);
	    start.m_edge = m_spec.BOL;
	    start.m_next = pair.m_start;
	    end = pair.m_end;
	  }
	else
	  {
	    expr(pair);
	    start = pair.m_start;
	    end = pair.m_end;
	  }

	if (m_lexGen.AT_EOL == m_spec.m_current_token)
	  {
	    m_lexGen.advance();
	    // CSA: fixed end-of-line operator. 8-aug-1999
	    CNfaPair nlpair = CAlloc.newNLPair(m_spec);
	    end.m_next = CAlloc.newCNfa(m_spec);
	    end.m_next.m_next = nlpair.m_start;
	    end.m_next.m_next2 = CAlloc.newCNfa(m_spec);
	    end.m_next.m_next2.m_edge = m_spec.EOF;
	    end.m_next.m_next2.m_next = nlpair.m_end;
	    end = nlpair.m_end;
	    anchor = anchor | CSpec.END;
	  }

	/* Check for null rules. Charles Fischer found this bug. [CSA] */
	if (end==null)
	    CError.parse_error(CError.E_ZERO, m_input.m_line_number);

	/* Handle end of regular expression.  See page 103. */
	end.m_accept = m_lexGen.packAccept();
	end.m_anchor = anchor;

	/* Begin: Removed for states. */
	/*m_lexGen.advance();*/
	/* End: Removed for states. */

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.leave("rule",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	return start;
      }
	    
  /***************************************************************
    Function: expr
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private void expr
    (
     CNfaPair pair
     )
      throws java.io.IOException 
      {
	CNfaPair e2_pair;
	CNfa p;
	
	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.enter("expr",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != pair);
	  }

	e2_pair = CAlloc.newCNfaPair();

	cat_expr(pair);
	
	while (m_lexGen.OR == m_spec.m_current_token)
	  {
	    m_lexGen.advance();
	    cat_expr(e2_pair);

	    p = CAlloc.newCNfa(m_spec);
	    p.m_next2 = e2_pair.m_start;
	    p.m_next = pair.m_start;
	    pair.m_start = p;
	    
	    p = CAlloc.newCNfa(m_spec);
	    pair.m_end.m_next = p;
	    e2_pair.m_end.m_next = p;
	    pair.m_end = p;
	  }

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.leave("expr",m_spec.m_lexeme,m_spec.m_current_token);
	  }
      }
	    
  /***************************************************************
    Function: cat_expr
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private void cat_expr
    (
     CNfaPair pair
     )
      throws java.io.IOException 
      {
	CNfaPair e2_pair;

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.enter("cat_expr",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != pair);
	  }
	
	e2_pair = CAlloc.newCNfaPair();
	
	if (first_in_cat(m_spec.m_current_token))
	  {
	    factor(pair);
	  }

	while (first_in_cat(m_spec.m_current_token))
	  {
	    factor(e2_pair);

	    /* Destroy */
	    pair.m_end.mimic(e2_pair.m_start);
	    discardCNfa(e2_pair.m_start);
	    
	    pair.m_end = e2_pair.m_end;
	  }

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.leave("cat_expr",m_spec.m_lexeme,m_spec.m_current_token);
	  }
      }
  
  /***************************************************************
    Function: first_in_cat
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private boolean first_in_cat
    (
     int token
     )
      {
	switch (token)
	  {
	  case CLexGen.CLOSE_PAREN:
	  case CLexGen.AT_EOL:
	  case CLexGen.OR:
	  case CLexGen.EOS:
	    return false;
	    
	  case CLexGen.CLOSURE:
	  case CLexGen.PLUS_CLOSE:
	  case CLexGen.OPTIONAL:
	    CError.parse_error(CError.E_CLOSE,m_input.m_line_number);
	    return false;

	  case CLexGen.CCL_END:
	    CError.parse_error(CError.E_BRACKET,m_input.m_line_number);
	    return false;

	  case CLexGen.AT_BOL:
	    CError.parse_error(CError.E_BOL,m_input.m_line_number);
	    return false;

	  default:
	    break;
	  }

	return true;
      }

  /***************************************************************
    Function: factor
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private void factor
    (
     CNfaPair pair
     )
      throws java.io.IOException 
      {
	CNfa start = null;
	CNfa end = null;

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.enter("factor",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	term(pair);

	if (m_lexGen.CLOSURE == m_spec.m_current_token
	    || m_lexGen.PLUS_CLOSE == m_spec.m_current_token
	    || m_lexGen.OPTIONAL == m_spec.m_current_token)
	  {
	    start = CAlloc.newCNfa(m_spec);
	    end = CAlloc.newCNfa(m_spec);
	    
	    start.m_next = pair.m_start;
	    pair.m_end.m_next = end;

	    if (m_lexGen.CLOSURE == m_spec.m_current_token
		|| m_lexGen.OPTIONAL == m_spec.m_current_token)
	      {
		start.m_next2 = end;
	      }
	    
	    if (m_lexGen.CLOSURE == m_spec.m_current_token
		|| m_lexGen.PLUS_CLOSE == m_spec.m_current_token)
	      {
		pair.m_end.m_next2 = pair.m_start;
	      }
	    
	    pair.m_start = start;
	    pair.m_end = end;
	    m_lexGen.advance();
	  }

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.leave("factor",m_spec.m_lexeme,m_spec.m_current_token);
	  }
      }
      
  /***************************************************************
    Function: term
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private void term
    (
     CNfaPair pair
     )
      throws java.io.IOException 
      {
	CNfa start;
	boolean isAlphaL;
	int c;

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.enter("term",m_spec.m_lexeme,m_spec.m_current_token);
	  }

	if (m_lexGen.OPEN_PAREN == m_spec.m_current_token)
	  {
	    m_lexGen.advance();
	    expr(pair);

	    if (m_lexGen.CLOSE_PAREN == m_spec.m_current_token)
	      {
		m_lexGen.advance();
	      }
	    else
	      {
		CError.parse_error(CError.E_SYNTAX,m_input.m_line_number);
	      }
	  }
	else
	  {
	    start = CAlloc.newCNfa(m_spec);
	    pair.m_start = start;

	    start.m_next = CAlloc.newCNfa(m_spec);
	    pair.m_end = start.m_next;

	    if (m_lexGen.L == m_spec.m_current_token &&
		Character.isLetter(m_spec.m_lexeme)) 
	      {
		isAlphaL = true;
	      } 
	    else 
	      {
		isAlphaL = false;
	      }
	    if (false == (m_lexGen.ANY == m_spec.m_current_token
			  || m_lexGen.CCL_START == m_spec.m_current_token
			  || (m_spec.m_ignorecase && isAlphaL)))
	      {
		start.m_edge = m_spec.m_lexeme;
		m_lexGen.advance();
	      }
	    else
	      {
		start.m_edge = CNfa.CCL;
		
		start.m_set = new CSet();

		/* Match case-insensitive letters using character class. */
		if (m_spec.m_ignorecase && isAlphaL) 
		  {
		    start.m_set.addncase(m_spec.m_lexeme);
		  }
		/* Match dot (.) using character class. */
		else if (m_lexGen.ANY == m_spec.m_current_token)
		  {
		    start.m_set.add('\n');
		    start.m_set.add('\r');
		    // CSA: exclude BOL and EOF from character classes
		    start.m_set.add(m_spec.BOL);
		    start.m_set.add(m_spec.EOF);
		    start.m_set.complement();
		  }
		else
		  {
		    m_lexGen.advance();
		    if (m_lexGen.AT_BOL == m_spec.m_current_token)
		      {
			m_lexGen.advance();

			// CSA: exclude BOL and EOF from character classes
			start.m_set.add(m_spec.BOL);
			start.m_set.add(m_spec.EOF);
			start.m_set.complement();
		      }
		    if (false == (m_lexGen.CCL_END == m_spec.m_current_token))
		      {
			dodash(start.m_set);
		      }
		    /*else
		      {
			for (c = 0; c <= ' '; ++c)
			  {
			    start.m_set.add((byte) c);
			  }
		      }*/
		  }
		m_lexGen.advance();
	      }
	  }

	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.leave("term",m_spec.m_lexeme,m_spec.m_current_token);
	  }
      }

  /***************************************************************
    Function: dodash
    Description: Recursive descent regular expression parser.
    **************************************************************/
  private void dodash
    (
     CSet set
     )
      throws java.io.IOException 
	{
	  int first = -1;
	  
	  if (CUtility.DESCENT_DEBUG)
	    {
	      CUtility.enter("dodash",m_spec.m_lexeme,m_spec.m_current_token);
	    }
	  
	  while (m_lexGen.EOS != m_spec.m_current_token 
		 && m_lexGen.CCL_END != m_spec.m_current_token)
	    {
	      // DASH loses its special meaning if it is first in class.
	      if (m_lexGen.DASH == m_spec.m_current_token && -1 != first)
		{
		  m_lexGen.advance();
		  // DASH loses its special meaning if it is last in class.
		  if (m_spec.m_current_token == m_lexGen.CCL_END)
		    {
		      // 'first' already in set.
		      set.add('-');
		      break;
		    }
		  for ( ; first <= m_spec.m_lexeme; ++first)
		    {
		      if (m_spec.m_ignorecase) 
			set.addncase((char)first);
		      else
			set.add(first);
		    }  
		}
	      else
		{
		  first = m_spec.m_lexeme;
		  if (m_spec.m_ignorecase)
		    set.addncase(m_spec.m_lexeme);
		  else
		    set.add(m_spec.m_lexeme);
		}

	      m_lexGen.advance();
	    }
	  
	if (CUtility.DESCENT_DEBUG)
	  {
	    CUtility.leave("dodash",m_spec.m_lexeme,m_spec.m_current_token);
	  }
      }
}

/**
 * Extract character classes from NFA and simplify.
 * @author C. Scott Ananian 25-Jul-1999
 */
class CSimplifyNfa
{
  private int[] ccls; // character class mapping.
  private int original_charset_size; // original charset size
  private int mapped_charset_size; // reduced charset size

  void simplify(CSpec m_spec) {
    computeClasses(m_spec); // initialize fields.
    
    // now rewrite the NFA using our character class mapping.
    for (Enumeration e=m_spec.m_nfa_states.elements(); e.hasMoreElements(); ) {
      CNfa nfa = (CNfa) e.nextElement();
      if (nfa.m_edge==CNfa.EMPTY || nfa.m_edge==CNfa.EPSILON)
	continue; // no change.
      if (nfa.m_edge==CNfa.CCL) {
	CSet ncset = new CSet();
	ncset.map(nfa.m_set, ccls); // map it.
	nfa.m_set = ncset;
      } else { // single character
	nfa.m_edge = ccls[nfa.m_edge]; // map it.
      }
    }

    // now update m_spec with the mapping.
    m_spec.m_ccls_map = ccls;
    m_spec.m_dtrans_ncols = mapped_charset_size;
  }
  /** Compute minimum set of character classes needed to disambiguate
   *  edges.  We optimistically assume that every character belongs to
   *  a single character class, and then incrementally split classes
   *  as we see edges that require discrimination between characters in
   *  the class. [CSA, 25-Jul-1999] */
  private void computeClasses(CSpec m_spec) {
    this.original_charset_size = m_spec.m_dtrans_ncols;
    this.ccls = new int[original_charset_size]; // initially all zero.

    int nextcls = 1;
    SparseBitSet clsA = new SparseBitSet(), clsB = new SparseBitSet();
    Hashtable h = new Hashtable();
    
    System.out.print("Working on character classes.");
    for (Enumeration e=m_spec.m_nfa_states.elements(); e.hasMoreElements(); ) {
      CNfa nfa = (CNfa) e.nextElement();
      if (nfa.m_edge==CNfa.EMPTY || nfa.m_edge==CNfa.EPSILON)
	continue; // no discriminatory information.
      clsA.clearAll(); clsB.clearAll();
      for (int i=0; i<ccls.length; i++)
	if (nfa.m_edge==i || // edge labeled with a character
	    nfa.m_edge==CNfa.CCL && nfa.m_set.contains(i)) // set of characters
	  clsA.set(ccls[i]);
	else
	  clsB.set(ccls[i]);
      // now figure out which character classes we need to split.
      clsA.and(clsB); // split the classes which show up on both sides of edge
      System.out.print(clsA.size()==0?".":":");
      if (clsA.size()==0) continue; // nothing to do.
      // and split them.
      h.clear(); // h will map old to new class name
      for (int i=0; i<ccls.length; i++)
	if (clsA.get(ccls[i])) // a split class
	  if (nfa.m_edge==i ||
	      nfa.m_edge==CNfa.CCL && nfa.m_set.contains(i)) { // on A side
	    Integer split = new Integer(ccls[i]);
	    if (!h.containsKey(split))
	      h.put(split, new Integer(nextcls++)); // make new class
	    ccls[i] = ((Integer)h.get(split)).intValue();
	  }
    }
    System.out.println();
    System.out.println("NFA has "+nextcls+" distinct character classes.");
    
    this.mapped_charset_size = nextcls;
  }
}

/***************************************************************
  Class: CMinimize
 **************************************************************/
class CMinimize
{
  /***************************************************************
    Member Variables
    **************************************************************/
  CSpec m_spec;
  Vector m_group;
  int m_ingroup[];

  /***************************************************************
    Function: CMinimize
    Description: Constructor.
    **************************************************************/
  CMinimize 
    (
     )
      {
	reset();
      }
  
  /***************************************************************
    Function: reset
    Description: Resets member variables.
    **************************************************************/
  private void reset
    (
     )
      {
	m_spec = null;
	m_group = null;
	m_ingroup = null;
      }

  /***************************************************************
    Function: set
    Description: Sets member variables.
    **************************************************************/
  private void set
    (
     CSpec spec
     )
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != spec);
	  }

	m_spec = spec;
	m_group = null;
	m_ingroup = null;
      }

  /***************************************************************
    Function: min_dfa
    Description: High-level access function to module.
    **************************************************************/
  void min_dfa
    (
     CSpec spec
     )
      {
	set(spec);

	/* Remove redundant states. */
	minimize();

	/* Column and row compression. 
	   Save accept states in auxilary vector. */
	reduce();

	reset();
      }

  /***************************************************************
    Function: col_copy
    Description: Copies source column into destination column.
    **************************************************************/
  private void col_copy
    (
     int dest,
     int src
     )
      {
	int n;
	int i;
	CDTrans dtrans;

	n = m_spec.m_dtrans_vector.size();
	for (i = 0; i < n; ++i)
	  {
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(i);
	    dtrans.m_dtrans[dest] = dtrans.m_dtrans[src]; 
	  }
      }	
	
  /***************************************************************
    Function: trunc_col
    Description: Truncates each column to the 'correct' length.
    **************************************************************/
  private void trunc_col
    (
     )
      {
	int n;
	int i;
	CDTrans dtrans;

	n = m_spec.m_dtrans_vector.size();
	for (i = 0; i < n; ++i)
	  {
	    int[] ndtrans = new int[m_spec.m_dtrans_ncols];
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(i);
	    System.arraycopy(dtrans.m_dtrans, 0, ndtrans, 0, ndtrans.length);
	    dtrans.m_dtrans = ndtrans;
	  }
      }
  /***************************************************************
    Function: row_copy
    Description: Copies source row into destination row.
    **************************************************************/
  private void row_copy
    (
     int dest,
     int src
     )
      {
	CDTrans dtrans;

	dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(src);
	m_spec.m_dtrans_vector.setElementAt(dtrans,dest); 
      }	
	
  /***************************************************************
    Function: col_equiv
    Description: 
    **************************************************************/
  private boolean col_equiv
    (
     int col1,
     int col2
     )
      {
	int n;
	int i;
	CDTrans dtrans;

	n = m_spec.m_dtrans_vector.size();
	for (i = 0; i < n; ++i)
	  {
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(i);
	    if (dtrans.m_dtrans[col1] != dtrans.m_dtrans[col2]) 
	      {
		return false;
	      }
	  }
	
	return true;
      }

  /***************************************************************
    Function: row_equiv
    Description: 
    **************************************************************/
  private boolean row_equiv
    (
     int row1,
     int row2
     )
      {
	int i;
	CDTrans dtrans1;
	CDTrans dtrans2;

	dtrans1 = (CDTrans) m_spec.m_dtrans_vector.elementAt(row1);
	dtrans2 = (CDTrans) m_spec.m_dtrans_vector.elementAt(row2);
	
	for (i = 0; i < m_spec.m_dtrans_ncols; ++i)
	  {
	    if (dtrans1.m_dtrans[i] != dtrans2.m_dtrans[i]) 
	      {
		return false;
	      }
	  }
	
	return true;
      }

  /***************************************************************
    Function: reduce
    Description: 
    **************************************************************/
  private void reduce
    (
     )
      {
	int i;
	int j;
	int k;
	int nrows;
	int reduced_ncols;
	int reduced_nrows;
	SparseBitSet set;
	CDTrans dtrans;
	int size;

	set = new SparseBitSet();
	
	/* Save accept nodes and anchor entries. */
	size = m_spec.m_dtrans_vector.size();
	m_spec.m_anchor_array = new int[size];
	m_spec.m_accept_vector = new Vector();
	for (i = 0; i < size; ++i)
	  {
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(i);
	    m_spec.m_accept_vector.addElement(dtrans.m_accept);
	    m_spec.m_anchor_array[i] = dtrans.m_anchor;
	    dtrans.m_accept = null;
	  }
	
	/* Allocate column map. */
	m_spec.m_col_map = new int[m_spec.m_dtrans_ncols];
	for (i = 0; i < m_spec.m_dtrans_ncols; ++i)
	  {
	    m_spec.m_col_map[i] = -1;
	  }

	/* Process columns for reduction. */
	for (reduced_ncols = 0; ; ++reduced_ncols)
	  {
	    if (CUtility.DEBUG)
	      {
		for (i = 0; i < reduced_ncols; ++i)
		  {
		    CUtility.ASSERT(-1 != m_spec.m_col_map[i]);
		  }
	      }

	    for (i = reduced_ncols; i < m_spec.m_dtrans_ncols; ++i)
	      {
		if (-1 == m_spec.m_col_map[i])
		  {
		    break;
		  }
	      }

	    if (i >= m_spec.m_dtrans_ncols)
	      {
		break;
	      }

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(false == set.get(i));
		CUtility.ASSERT(-1 == m_spec.m_col_map[i]);
	      }

	    set.set(i);
	    
	    m_spec.m_col_map[i] = reduced_ncols;
	    
	    /* UNDONE: Optimize by doing all comparisons in one batch. */
	    for (j = i + 1; j < m_spec.m_dtrans_ncols; ++j)
	      {
		if (-1 == m_spec.m_col_map[j] && true == col_equiv(i,j))
		  {
		    m_spec.m_col_map[j] = reduced_ncols;
		  }
	      }
	  }

	/* Reduce columns. */
	k = 0;
	for (i = 0; i < m_spec.m_dtrans_ncols; ++i)
	  {
	    if (set.get(i))
	      {
		++k;

		set.clear(i);
		
		j = m_spec.m_col_map[i];
		
		if (CUtility.DEBUG)
		  {
		    CUtility.ASSERT(j <= i);
		  }
		
		if (j == i)
		  {
		    continue;
		  }
		
		col_copy(j,i);
	      }
	  }
	m_spec.m_dtrans_ncols = reduced_ncols;
	/* truncate m_dtrans at proper length (freeing extra) */
	trunc_col();

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(k == reduced_ncols);
	  }

	/* Allocate row map. */
	nrows = m_spec.m_dtrans_vector.size();
	m_spec.m_row_map = new int[nrows];
	for (i = 0; i < nrows; ++i)
	  {
	    m_spec.m_row_map[i] = -1;
	  }

	/* Process rows to reduce. */
	for (reduced_nrows = 0; ; ++reduced_nrows)
	  {
	    if (CUtility.DEBUG)
	      {
		for (i = 0; i < reduced_nrows; ++i)
		  {
		    CUtility.ASSERT(-1 != m_spec.m_row_map[i]);
		  }
	      }

	    for (i = reduced_nrows; i < nrows; ++i)
	      {
		if (-1 == m_spec.m_row_map[i])
		  {
		    break;
		  }
	      }

	    if (i >= nrows)
	      {
		break;
	      }

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(false == set.get(i));
		CUtility.ASSERT(-1 == m_spec.m_row_map[i]);
	      }

	    set.set(i);

	    m_spec.m_row_map[i] = reduced_nrows;
	    
	    /* UNDONE: Optimize by doing all comparisons in one batch. */
	    for (j = i + 1; j < nrows; ++j)
	      {
		if (-1 == m_spec.m_row_map[j] && true == row_equiv(i,j))
		  {
		    m_spec.m_row_map[j] = reduced_nrows;
		  }
	      }
	  }

	/* Reduce rows. */
	k = 0;
	for (i = 0; i < nrows; ++i)
	  {
	    if (set.get(i))
	      {
		++k;

		set.clear(i);
		
		j = m_spec.m_row_map[i];
		
		if (CUtility.DEBUG)
		  {
		    CUtility.ASSERT(j <= i);
		  }
		
		if (j == i)
		  {
		    continue;
		  }
		
		row_copy(j,i);
	      }
	  }
	m_spec.m_dtrans_vector.setSize(reduced_nrows);

	if (CUtility.DEBUG)
	  {
	    /*System.out.println("k = " + k + "\nreduced_nrows = " + reduced_nrows + "");*/
	    CUtility.ASSERT(k == reduced_nrows);
	  }
      }

  /***************************************************************
    Function: fix_dtrans
    Description: Updates CDTrans table after minimization 
    using groups, removing redundant transition table states.
    **************************************************************/
  private void fix_dtrans
    (
     )
      {
	Vector new_vector;
	int i;
	int size;
	Vector dtrans_group;
	CDTrans first;
	int c;

	new_vector = new Vector();

	size = m_spec.m_state_dtrans.length;
	for (i = 0; i < size; ++i)
	  {
	    if (CDTrans.F != m_spec.m_state_dtrans[i])
	      {
		m_spec.m_state_dtrans[i] = m_ingroup[m_spec.m_state_dtrans[i]];
	      }
	  }

	size = m_group.size();
	for (i = 0; i < size; ++i)
	  {
	    dtrans_group = (Vector) m_group.elementAt(i);
	    first = (CDTrans) dtrans_group.elementAt(0);
	    new_vector.addElement(first);

	    for (c = 0; c < m_spec.m_dtrans_ncols; ++c)
	      {
		if (CDTrans.F != first.m_dtrans[c])
		  {
		    first.m_dtrans[c] = m_ingroup[first.m_dtrans[c]];
		  }
	      }
	  }

	m_group = null;
	m_spec.m_dtrans_vector = new_vector;
      }

  /***************************************************************
    Function: minimize
    Description: Removes redundant transition table states.
    **************************************************************/
  private void minimize
    (
     )
      {
	Vector dtrans_group;
	Vector new_group;
	int i;
	int j;
	int old_group_count;
	int group_count;
	CDTrans next;
	CDTrans first;
	int goto_first;
	int goto_next;
	int c;
	int group_size;
	boolean added;

	init_groups();

	group_count = m_group.size();
	old_group_count = group_count - 1;

	while (old_group_count != group_count)
	  {
	    old_group_count = group_count;

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(m_group.size() == group_count);
	      }

	    for (i = 0; i < group_count; ++i)
	      {
		dtrans_group = (Vector) m_group.elementAt(i);

		group_size = dtrans_group.size();
		if (group_size <= 1)
		  {
		    continue;
		  }

		new_group = new Vector();
		added = false;
		
		first = (CDTrans) dtrans_group.elementAt(0);
		for (j = 1; j < group_size; ++j)
		  {
		    next = (CDTrans) dtrans_group.elementAt(j);

		    for (c = 0; c < m_spec.m_dtrans_ncols; ++c)
		      {
			goto_first = first.m_dtrans[c];
			goto_next = next.m_dtrans[c];

			if (goto_first != goto_next
			    && (goto_first == CDTrans.F
				|| goto_next == CDTrans.F
				|| m_ingroup[goto_next] != m_ingroup[goto_first]))
			  {
			    if (CUtility.DEBUG)
			      {
				CUtility.ASSERT(dtrans_group.elementAt(j) == next);
			      }
			    
			    dtrans_group.removeElementAt(j);
			    --j;
			    --group_size;
			    new_group.addElement(next);
			    if (false == added)
			      {
				added = true;
				++group_count;
				m_group.addElement(new_group);
			      }
			    m_ingroup[next.m_label] = m_group.size() - 1;

			    if (CUtility.DEBUG)
			      {
				CUtility.ASSERT(m_group.contains(new_group)
						== true);
				CUtility.ASSERT(m_group.contains(dtrans_group)
						== true);
				CUtility.ASSERT(dtrans_group.contains(first)
						== true);
				CUtility.ASSERT(dtrans_group.contains(next)
						== false);
				CUtility.ASSERT(new_group.contains(first)
						== false);
				CUtility.ASSERT(new_group.contains(next)
						== true);
				CUtility.ASSERT(dtrans_group.size() == group_size);
				CUtility.ASSERT(i == m_ingroup[first.m_label]);
				CUtility.ASSERT((m_group.size() - 1) 
						== m_ingroup[next.m_label]);
			      }

			    break;
			  }
		      }
		  }
	      }
	  }

	System.out.println(m_group.size() + " states after removal of redundant states.");

	if (m_spec.m_verbose
	    && true == CUtility.OLD_DUMP_DEBUG)
	  {
	    System.out.println();
	    System.out.println("States grouped as follows after minimization");
	    pgroups();
	  }

	fix_dtrans();
      }

  /***************************************************************
    Function: init_groups
    Description:
    **************************************************************/
  private void init_groups
    (
     )
      {
	int i;
	int j;
	int group_count;
	int size;
	CAccept accept;
	CDTrans dtrans;
	Vector dtrans_group;
	CDTrans first;
	boolean group_found;

	m_group = new Vector();
	group_count = 0;
	
	size = m_spec.m_dtrans_vector.size();
	m_ingroup = new int[size];
	
	for (i = 0; i < size; ++i)
	  {
	    group_found = false;
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(i);

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(i == dtrans.m_label);
		CUtility.ASSERT(false == group_found);
		CUtility.ASSERT(group_count == m_group.size());
	      }
	    
	    for (j = 0; j < group_count; ++j)
	      {
		dtrans_group = (Vector) m_group.elementAt(j);
		
		if (CUtility.DEBUG)
		  {
		    CUtility.ASSERT(false == group_found);
		    CUtility.ASSERT(0 < dtrans_group.size());
		  }

		first = (CDTrans) dtrans_group.elementAt(0);
		
		if (CUtility.SLOW_DEBUG)
		  {
		    CDTrans check;
		    int k;
		    int s;

		    s = dtrans_group.size();
		    CUtility.ASSERT(0 < s);

		    for (k = 1; k < s; ++k)
		      {
			check = (CDTrans) dtrans_group.elementAt(k);
			CUtility.ASSERT(check.m_accept == first.m_accept);
		      }
		  }

		if (first.m_accept == dtrans.m_accept)
		  {
		    dtrans_group.addElement(dtrans);
		    m_ingroup[i] = j;
		    group_found = true;
		    
		    if (CUtility.DEBUG)
		      {
			CUtility.ASSERT(j == m_ingroup[dtrans.m_label]);
		      }

		    break;
		  }
	      }
	    
	    if (false == group_found)
	      {
		dtrans_group = new Vector();
		dtrans_group.addElement(dtrans);
		m_ingroup[i] = m_group.size();
		m_group.addElement(dtrans_group);
		++group_count;
	      }
	  }
	
	if (m_spec.m_verbose
	    && true == CUtility.OLD_DUMP_DEBUG)
	  {
	    System.out.println("Initial grouping:");
	    pgroups();
	    System.out.println();
	  }
      }

  /***************************************************************
    Function: pset
    **************************************************************/
  private void pset
    (
     Vector dtrans_group
     )
      {
	int i;
	int size;
	CDTrans dtrans;

	size = dtrans_group.size();
	for (i = 0; i < size; ++i)
	  {
	    dtrans = (CDTrans) dtrans_group.elementAt(i);
	    System.out.print(dtrans.m_label + " ");
	  }
      }
  
  /***************************************************************
    Function: pgroups
    **************************************************************/
  private void pgroups
    (
     )
      {
	int i;
	int dtrans_size;
	int group_size;
	
	group_size = m_group.size();
	for (i = 0; i < group_size; ++i)
	  {
	    System.out.print("\tGroup " + i + " {");
	    pset((Vector) m_group.elementAt(i));
	    System.out.println("}");
	    System.out.println();
	  }
	
	System.out.println();
	dtrans_size = m_spec.m_dtrans_vector.size();
	for (i = 0; i < dtrans_size; ++i)
	  {
	    System.out.println("\tstate " + i 
			       + " is in group " 
			       + m_ingroup[i]);
	  }
      }
}

/***************************************************************
  Class: CNfa2Dfa
 **************************************************************/
class CNfa2Dfa
{
  /***************************************************************
    Member Variables
    **************************************************************/
  private CSpec m_spec;
  private int m_unmarked_dfa;
  private CLexGen m_lexGen;

  /***************************************************************
    Constants
    **************************************************************/
  private static final int NOT_IN_DSTATES = -1;

  /***************************************************************
    Function: CNfa2Dfa
    **************************************************************/
  CNfa2Dfa
    (
     )
      {
	reset();
      }

  /***************************************************************
    Function: set 
    Description: 
    **************************************************************/
  private void set
    (
     CLexGen lexGen,
     CSpec spec
     )
      {
	m_lexGen = lexGen;
	m_spec = spec;
	m_unmarked_dfa = 0;
      }

  /***************************************************************
    Function: reset 
    Description: 
    **************************************************************/
  private void reset
    (
     )
      {
	m_lexGen = null;
	m_spec = null;
	m_unmarked_dfa = 0;
      }

  /***************************************************************
    Function: make_dfa
    Description: High-level access function to module.
    **************************************************************/
  void make_dfa
    (
     CLexGen lexGen,
     CSpec spec
     )
      {
	int i;

	reset();
	set(lexGen,spec);

	make_dtrans();
	free_nfa_states();

	if (m_spec.m_verbose && true == CUtility.OLD_DUMP_DEBUG)
	  {
	    System.out.println(m_spec.m_dfa_states.size()
			       + " DFA states in original machine.");
	  }

	free_dfa_states();
      }     

   /***************************************************************
    Function: make_dtrans
    Description: Creates uncompressed CDTrans transition table.
    **************************************************************/
  private void make_dtrans
    (
     )
     /* throws java.lang.CloneNotSupportedException*/
      {
	CDfa next;
	CDfa dfa;
	CBunch bunch;
	int i;
	int nextstate;
	int size;
	CDTrans dtrans;
	CNfa nfa;
	int istate;
	int nstates;
	
	System.out.print("Working on DFA states.");

	/* Reference passing type and initializations. */
	bunch = new CBunch();
	m_unmarked_dfa = 0;

	/* Allocate mapping array. */
	nstates = m_spec.m_state_rules.length;
	m_spec.m_state_dtrans = new int[nstates];

	for (istate = 0; nstates > istate; ++istate)
	  {
	    /* CSA bugfix: if we skip all zero size rules, then
	       an specification with no rules produces an illegal
	       lexer (0 states) instead of a lexer that rejects
	       everything (1 nonaccepting state). [27-Jul-1999]
	    if (0 == m_spec.m_state_rules[istate].size())
	      {
		m_spec.m_state_dtrans[istate] = CDTrans.F;
		continue;
	      }
	    */
		
	    /* Create start state and initialize fields. */
	    bunch.m_nfa_set = (Vector) m_spec.m_state_rules[istate].clone();
	    sortStates(bunch.m_nfa_set);
	    
	    bunch.m_nfa_bit = new SparseBitSet();
	    
	    /* Initialize bit set. */
	    size = bunch.m_nfa_set.size();
	    for (i = 0; size > i; ++i)
	      {
		nfa = (CNfa) bunch.m_nfa_set.elementAt(i);
		bunch.m_nfa_bit.set(nfa.m_label);
	      }
	    
	    bunch.m_accept = null;
	    bunch.m_anchor = CSpec.NONE;
	    bunch.m_accept_index = CUtility.INT_MAX;
	    
	    e_closure(bunch);
	    add_to_dstates(bunch);
	    
	    m_spec.m_state_dtrans[istate] = m_spec.m_dtrans_vector.size();

	    /* Main loop of CDTrans creation. */
	    while (null != (dfa = get_unmarked()))
	      {
		System.out.print(".");
		System.out.flush();
		
		if (CUtility.DEBUG)
		  {
		    CUtility.ASSERT(false == dfa.m_mark);
		  }

		/* Get first unmarked node, then mark it. */
		dfa.m_mark = true;
		
		/* Allocate new CDTrans, then initialize fields. */
		dtrans = new CDTrans(m_spec.m_dtrans_vector.size(),m_spec);
		dtrans.m_accept = dfa.m_accept;
		dtrans.m_anchor = dfa.m_anchor;
		
		/* Set CDTrans array for each character transition. */
		for (i = 0; i < m_spec.m_dtrans_ncols; ++i)
		  {
		    if (CUtility.DEBUG)
		      {
			CUtility.ASSERT(0 <= i);
			CUtility.ASSERT(m_spec.m_dtrans_ncols > i);
		      }
		    
		    /* Create new dfa set by attempting character transition. */
		    move(dfa.m_nfa_set,dfa.m_nfa_bit,i,bunch);
		    if (null != bunch.m_nfa_set)
		      {
			e_closure(bunch);
		      }
		    
		    if (CUtility.DEBUG)
		      {
			CUtility.ASSERT((null == bunch.m_nfa_set 
					 && null == bunch.m_nfa_bit)
					|| (null != bunch.m_nfa_set 
					    && null != bunch.m_nfa_bit));
		      }
		    
		    /* Create new state or set state to empty. */
		    if (null == bunch.m_nfa_set)
		      {
			nextstate = CDTrans.F;
		      }
		    else 
		      {
			nextstate = in_dstates(bunch);
			
			if (NOT_IN_DSTATES == nextstate)
			  {
			    nextstate = add_to_dstates(bunch);
			  }
		      }
		    
		    if (CUtility.DEBUG)
		      {
			CUtility.ASSERT(nextstate < m_spec.m_dfa_states.size());
		      }
		    
		    dtrans.m_dtrans[i] = nextstate;
		  }
		
		if (CUtility.DEBUG)
		  {
		    CUtility.ASSERT(m_spec.m_dtrans_vector.size() == dfa.m_label);
		  }
		
		m_spec.m_dtrans_vector.addElement(dtrans);
	      }
	  }

	System.out.println();
      }

  /***************************************************************
    Function: free_dfa_states
    **************************************************************/  
  private void free_dfa_states
    (
     )
      {
	m_spec.m_dfa_states = null;
	m_spec.m_dfa_sets = null;
      }

  /***************************************************************
    Function: free_nfa_states
    **************************************************************/  
  private void free_nfa_states
    (
     )
      {
	/* UNDONE: Remove references to nfas from within dfas. */
	/* UNDONE: Don't free CAccepts. */

	m_spec.m_nfa_states = null;
	m_spec.m_nfa_start = null;
	m_spec.m_state_rules = null;
      }

  /***************************************************************
    Function: e_closure
    Description: Alters and returns input set.
    **************************************************************/
  private void e_closure
    (
     CBunch bunch
     )
      {
	Stack nfa_stack;
	int size;
	int i;
	CNfa state;

	/* Debug checks. */
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != bunch);
	    CUtility.ASSERT(null != bunch.m_nfa_set);
	    CUtility.ASSERT(null != bunch.m_nfa_bit);
	  }

	bunch.m_accept = null;
	bunch.m_anchor = CSpec.NONE;
	bunch.m_accept_index = CUtility.INT_MAX;
	
	/* Create initial stack. */
	nfa_stack = new Stack();
	size = bunch.m_nfa_set.size();
	for (i = 0; i < size; ++i)
	  {
	    state = (CNfa) bunch.m_nfa_set.elementAt(i);
	    
	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(bunch.m_nfa_bit.get(state.m_label));
	      }

	    nfa_stack.push(state);
	  }

	/* Main loop. */
	while (false == nfa_stack.empty())
	  {
	    state = (CNfa) nfa_stack.pop();
	    
	    if (CUtility.OLD_DUMP_DEBUG)
	      {
		if (null != state.m_accept)
		  {
		    System.out.println("Looking at accepting state " + state.m_label
				       + " with <"
				       + (new String(state.m_accept.m_action,0,
						     state.m_accept.m_action_read))
				       + ">");
		  }
	      }

	    if (null != state.m_accept 
		&& state.m_label < bunch.m_accept_index)
	      {
		bunch.m_accept_index = state.m_label;
		bunch.m_accept = state.m_accept;
		bunch.m_anchor = state.m_anchor;

		if (CUtility.OLD_DUMP_DEBUG)
		  {
		    System.out.println("Found accepting state " + state.m_label
				       + " with <"
				       + (new String(state.m_accept.m_action,0,
						     state.m_accept.m_action_read))
				       + ">");
		  }

		if (CUtility.DEBUG)
		  {
		    CUtility.ASSERT(null != bunch.m_accept);
		    CUtility.ASSERT(CSpec.NONE == bunch.m_anchor
				    || 0 != (bunch.m_anchor & CSpec.END)
				    || 0 != (bunch.m_anchor & CSpec.START));
		  }
	      }

	    if (CNfa.EPSILON == state.m_edge)
	      {
		if (null != state.m_next)
		  {
		    if (false == bunch.m_nfa_set.contains(state.m_next))
		      {
			if (CUtility.DEBUG)
			  {
			    CUtility.ASSERT(false == bunch.m_nfa_bit.get(state.m_next.m_label));
			  }
			
			bunch.m_nfa_bit.set(state.m_next.m_label);
			bunch.m_nfa_set.addElement(state.m_next);
			nfa_stack.push(state.m_next);
		      }
		  }

		if (null != state.m_next2)
		  {
		    if (false == bunch.m_nfa_set.contains(state.m_next2))
		      {
			if (CUtility.DEBUG)
			  {
			    CUtility.ASSERT(false == bunch.m_nfa_bit.get(state.m_next2.m_label));
			  }
			
			bunch.m_nfa_bit.set(state.m_next2.m_label);
			bunch.m_nfa_set.addElement(state.m_next2);
			nfa_stack.push(state.m_next2);
		      }
		  }
	      }
	  }

	if (null != bunch.m_nfa_set)
	  {
	    sortStates(bunch.m_nfa_set);
	  }

	return;
      }

  /***************************************************************
    Function: move
    Description: Returns null if resulting NFA set is empty.
    **************************************************************/
  void move
    (
     Vector nfa_set,
     SparseBitSet nfa_bit,
     int b,
     CBunch bunch
     )
      {
	int size;
	int index;
	CNfa state;
	
	bunch.m_nfa_set = null;
	bunch.m_nfa_bit = null;

	size = nfa_set.size();
	for (index = 0; index < size; ++index)
	  {
	    state = (CNfa) nfa_set.elementAt(index);
	    
	    if (b == state.m_edge
		|| (CNfa.CCL == state.m_edge
		    && true == state.m_set.contains(b)))
	      {
		if (null == bunch.m_nfa_set)
		  {
		    if (CUtility.DEBUG)
		      {
			CUtility.ASSERT(null == bunch.m_nfa_bit);
		      }
		    
		    bunch.m_nfa_set = new Vector();
		    /*bunch.m_nfa_bit 
			= new SparseBitSet(m_spec.m_nfa_states.size());*/
		    bunch.m_nfa_bit = new SparseBitSet();
		  }

		bunch.m_nfa_set.addElement(state.m_next);
		/*System.out.println("Size of bitset: " + bunch.m_nfa_bit.size());
		System.out.println("Reference index: " + state.m_next.m_label);
		System.out.flush();*/
		bunch.m_nfa_bit.set(state.m_next.m_label);
	      }
	  }
	
	if (null != bunch.m_nfa_set)
	  {
	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(null != bunch.m_nfa_bit);
	      }
	    
	    sortStates(bunch.m_nfa_set);
	  }

	return;
      }

  /***************************************************************
    Function: sortStates
    **************************************************************/
  private void sortStates
    (
     Vector nfa_set
     )
      {
	CNfa elem;
	int begin;
	int size;
	int index;
	int value;
	int smallest_index;
	int smallest_value;
	CNfa begin_elem;

	size = nfa_set.size();
	for (begin = 0; begin < size; ++begin)
	  {
	    elem = (CNfa) nfa_set.elementAt(begin);
	    smallest_value = elem.m_label;
	    smallest_index = begin;

	    for (index = begin + 1; index < size; ++index)
	      {
		elem = (CNfa) nfa_set.elementAt(index);
		value = elem.m_label;

		if (value < smallest_value)
		  {
		    smallest_index = index;
		    smallest_value = value;
		  }
	      }

	    begin_elem = (CNfa) nfa_set.elementAt(begin);
	    elem = (CNfa) nfa_set.elementAt(smallest_index);
	    nfa_set.setElementAt(elem,begin);
	    nfa_set.setElementAt(begin_elem,smallest_index);
	  }

	if (CUtility.OLD_DEBUG)
	  {
	    System.out.print("NFA vector indices: ");  
	    
	    for (index = 0; index < size; ++index)
	      {
		elem = (CNfa) nfa_set.elementAt(index);
		System.out.print(elem.m_label + " ");
	      }
	    System.out.println();
	  }	

	return;
      }

  /***************************************************************
    Function: get_unmarked
    Description: Returns next unmarked DFA state.
    **************************************************************/
  private CDfa get_unmarked
    (
     )
      {
	int size;
	CDfa dfa;

	size = m_spec.m_dfa_states.size();
	while (m_unmarked_dfa < size)
	  {
	    dfa = (CDfa) m_spec.m_dfa_states.elementAt(m_unmarked_dfa);

	    if (false == dfa.m_mark)
	      {
		if (CUtility.OLD_DUMP_DEBUG)
		  {
		    System.out.print("*");
		    System.out.flush();
		  }

		if (m_spec.m_verbose && true == CUtility.OLD_DUMP_DEBUG)
		  {
		    System.out.println("---------------");
		    System.out.print("working on DFA state " 
				     + m_unmarked_dfa
				     + " = NFA states: ");
		    m_lexGen.print_set(dfa.m_nfa_set);
		    System.out.println();
		  }

		return dfa;
	      }

	    ++m_unmarked_dfa;
	  }

	return null;
      }
  
  /***************************************************************
    function: add_to_dstates
    Description: Takes as input a CBunch with details of
    a dfa state that needs to be created.
    1) Allocates a new dfa state and saves it in 
    the appropriate CSpec vector.
    2) Initializes the fields of the dfa state
    with the information in the CBunch.
    3) Returns index of new dfa.
    **************************************************************/
  private int add_to_dstates
    (
     CBunch bunch
     )
      {
	CDfa dfa;
	
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != bunch.m_nfa_set);
	    CUtility.ASSERT(null != bunch.m_nfa_bit);
	    CUtility.ASSERT(null != bunch.m_accept 
			    || CSpec.NONE == bunch.m_anchor);
	  }

	/* Allocate, passing CSpec so dfa label can be set. */
	dfa = CAlloc.newCDfa(m_spec);
	
	/* Initialize fields, including the mark field. */
	dfa.m_nfa_set = (Vector) bunch.m_nfa_set.clone();
	dfa.m_nfa_bit = (SparseBitSet) bunch.m_nfa_bit.clone();
	dfa.m_accept = bunch.m_accept;
	dfa.m_anchor = bunch.m_anchor;
	dfa.m_mark = false;
	
	/* Register dfa state using BitSet in CSpec Hashtable. */
	m_spec.m_dfa_sets.put(dfa.m_nfa_bit,dfa);
	/*registerCDfa(dfa);*/

	if (CUtility.OLD_DUMP_DEBUG)
	  {
	    System.out.print("Registering set : ");
	    m_lexGen.print_set(dfa.m_nfa_set);
	    System.out.println();
	  }

	return dfa.m_label;
      }

  /***************************************************************
    Function: in_dstates
    **************************************************************/
  private int in_dstates
    (
     CBunch bunch
     )
      {
	CDfa dfa;
	
	if (CUtility.OLD_DEBUG)
	  {
	    System.out.print("Looking for set : ");
	    m_lexGen.print_set(bunch.m_nfa_set);
	  }

	dfa = (CDfa) m_spec.m_dfa_sets.get(bunch.m_nfa_bit);

	if (null != dfa)
	  {
	    if (CUtility.OLD_DUMP_DEBUG)
	      {
		System.out.println(" FOUND!");
	      }
	    
	    return dfa.m_label;
	  }

	if (CUtility.OLD_DUMP_DEBUG)
	  {
	    System.out.println(" NOT FOUND!");
	  }
	return NOT_IN_DSTATES;
      }

}

/***************************************************************
  Class: CAlloc
  **************************************************************/
class CAlloc
{
  /***************************************************************
    Function: newCDfa
    **************************************************************/
  static CDfa newCDfa
    (
     CSpec spec
     )
      {
	CDfa dfa;
	
	dfa = new CDfa(spec.m_dfa_states.size());
	spec.m_dfa_states.addElement(dfa);

	return dfa;
      }

  /***************************************************************
    Function: newCNfaPair
    Description: 
    **************************************************************/
  static CNfaPair newCNfaPair
    (
     )
      {
	CNfaPair pair = new CNfaPair();
	
	return pair;
      }
  /***************************************************************
    Function: newNLPair
    Description: return a new CNfaPair that matches a new 
                 line: (\r\n?|[\n\uu2028\uu2029])
		 Added by CSA 8-Aug-1999, updated 10-Aug-1999
    **************************************************************/
  static CNfaPair newNLPair(CSpec spec) {
    CNfaPair pair = newCNfaPair();
    pair.m_end=newCNfa(spec); // newline accepting state
    pair.m_start=newCNfa(spec); // new state with two epsilon edges
    pair.m_start.m_next = newCNfa(spec);
    pair.m_start.m_next.m_edge = CNfa.CCL;
    pair.m_start.m_next.m_set = new CSet();
    pair.m_start.m_next.m_set.add('\n');
    if (spec.m_dtrans_ncols-CSpec.NUM_PSEUDO > 2029) {
      pair.m_start.m_next.m_set.add(2028); /*U+2028 is LS, the line separator*/
      pair.m_start.m_next.m_set.add(2029); /*U+2029 is PS, the paragraph sep.*/
    }
    pair.m_start.m_next.m_next = pair.m_end; // accept '\n', U+2028, or U+2029
    pair.m_start.m_next2 = newCNfa(spec);
    pair.m_start.m_next2.m_edge = '\r';
    pair.m_start.m_next2.m_next = newCNfa(spec);
    pair.m_start.m_next2.m_next.m_next = pair.m_end; // accept '\r';
    pair.m_start.m_next2.m_next.m_next2 = newCNfa(spec);
    pair.m_start.m_next2.m_next.m_next2.m_edge = '\n';
    pair.m_start.m_next2.m_next.m_next2.m_next = pair.m_end; // accept '\r\n';
    return pair;
  }

  /***************************************************************
    Function: newCNfa
    Description: 
    **************************************************************/
  static CNfa newCNfa
    (
     CSpec spec
     )
      {
	CNfa p;

	/* UNDONE: Buffer this? */

	p = new CNfa();
	
	/*p.m_label = spec.m_nfa_states.size();*/
	spec.m_nfa_states.addElement(p);
	p.m_edge = CNfa.EPSILON;
	
	return p;
      }
}

/***************************************************************
  Class: Main
  Description: Top-level lexical analyzer generator function.
 **************************************************************/
public class Main
{
  /***************************************************************
    Function: main
    **************************************************************/
  public static void main
    (
     String arg[]
     )
    throws java.io.IOException
      {
	CLexGen lg;

	if (arg.length < 1)
	  {
	    System.out.println("Usage: JLex.Main <filename>");
	    return;
	  }

	/* Note: For debuging, it may be helpful to remove the try/catch
	   block and permit the Exception to propagate to the top level. 
	   This gives more information. */
	try 
	  {	
	    lg = new CLexGen(arg[0]);
	    lg.generate();
	  }
	catch (Error e)
	  {
	    System.out.println(e.getMessage());
	  }
      }
}    

/***************************************************************
  Class: CDTrans
  **************************************************************/
class CDTrans
{
  /*************************************************************
    Member Variables
    ***********************************************************/
  int m_dtrans[];
  CAccept m_accept;
  int m_anchor;
  int m_label;

  /*************************************************************
    Constants
    ***********************************************************/
  static final int F = -1;

  /*************************************************************
    Function: CTrans
    ***********************************************************/
  CDTrans
    (
     int label,
     CSpec spec
     )
      {
	m_dtrans = new int[spec.m_dtrans_ncols];
	m_accept = null;
	m_anchor = CSpec.NONE;
	m_label = label;
      }
}

/***************************************************************
  Class: CDfa
  **************************************************************/
class CDfa 
{
  /***************************************************************
    Member Variables
    ***********************************************************/
  int m_group;
  boolean m_mark;
  CAccept m_accept;
  int m_anchor;
  Vector m_nfa_set;
  SparseBitSet m_nfa_bit;
  int m_label;

  /***************************************************************
    Function: CDfa
    **************************************************************/
  CDfa
    (
     int label
     )
      {
	m_group = 0;
	m_mark = false;

	m_accept = null;
	m_anchor = CSpec.NONE;

	m_nfa_set = null;
	m_nfa_bit = null;

	m_label = label;
      }
}

/***************************************************************
  Class: CAccept
 **************************************************************/
class CAccept
{
  /***************************************************************
    Member Variables
    **************************************************************/
  char m_action[];
  int m_action_read;
  int m_line_number;

  /***************************************************************
    Function: CAccept
    **************************************************************/
  CAccept
    (
     char action[],
     int action_read,
     int line_number
     )
      {
	int elem;

	m_action_read = action_read;

	m_action = new char[m_action_read];
	for (elem = 0; elem < m_action_read; ++elem)
	  {
	    m_action[elem] = action[elem];
	  }

	m_line_number = line_number;
      }

  /***************************************************************
    Function: CAccept
    **************************************************************/
  CAccept
    (
     CAccept accept
     )
      {
	int elem;

	m_action_read = accept.m_action_read;
	
	m_action = new char[m_action_read];
	for (elem = 0; elem < m_action_read; ++elem)
	  {
	    m_action[elem] = accept.m_action[elem];
	  }

	m_line_number = accept.m_line_number;
      }

  /***************************************************************
    Function: mimic
    **************************************************************/
  void mimic
    (
     CAccept accept
     )
      {
	int elem;

	m_action_read = accept.m_action_read;
	
	m_action = new char[m_action_read];
	for (elem = 0; elem < m_action_read; ++elem)
	  {
	    m_action[elem] = accept.m_action[elem];
	  }
      }
}

/***************************************************************
  Class: CAcceptAnchor
  **************************************************************/
class CAcceptAnchor
{
  /***************************************************************
    Member Variables
    **************************************************************/
  CAccept m_accept;
  int m_anchor;

  /***************************************************************
    Function: CAcceptAnchor
    **************************************************************/
  CAcceptAnchor
    (
     )
      {
	m_accept = null;
	m_anchor = CSpec.NONE;
      }
}

/***************************************************************
  Class: CNfaPair
  **************************************************************/
class CNfaPair
{
  /***************************************************************
    Member Variables
    **************************************************************/
  CNfa m_start;
  CNfa m_end;
  
  /***************************************************************
    Function: CNfaPair
    **************************************************************/
  CNfaPair
    (
     )
      {
	m_start = null;
	m_end = null;
      }
}

/***************************************************************
  Class: CInput
  Description: 
 **************************************************************/
class CInput
{
  /***************************************************************
    Member Variables
    **************************************************************/
  private java.io.BufferedReader m_input; /* JLex specification file. */

  boolean m_eof_reached; /* Whether EOF has been encountered. */
  boolean m_pushback_line; 

  char m_line[]; /* Line buffer. */
  int m_line_read; /* Number of bytes read into line buffer. */
  int m_line_index; /* Current index into line buffer. */

  int m_line_number; /* Current line number. */

  /***************************************************************
    Constants
    **************************************************************/
  static final boolean EOF = true;
  static final boolean NOT_EOF = false;
  
  /***************************************************************
    Function: CInput
    Description: 
    **************************************************************/
  CInput
    (
     java.io.Reader input
     )
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != input);
	  }

	/* Initialize input stream. */
	m_input = new java.io.BufferedReader(input);

	/* Initialize buffers and index counters. */
	m_line = null;
	m_line_read = 0;
	m_line_index = 0;

	/* Initialize state variables. */
	m_eof_reached = false;
	m_line_number = 0;
	m_pushback_line = false;
      }

  /***************************************************************
    Function: getLine
    Description: Returns true on EOF, false otherwise.
    Guarantees not to return a blank line, or a line
    of zero length.
    **************************************************************/
  boolean getLine 
    (
     )
      throws java.io.IOException
      {
	String lineStr;
	int elem;
	
	/* Has EOF already been reached? */
	if (m_eof_reached)
	  {
	    return EOF;
	  }
	
	/* Pushback current line? */
	if (m_pushback_line)
	  {
	    m_pushback_line = false;

	    /* Check for empty line. */
	    for (elem = 0; elem < m_line_read; ++elem)
	      {
		if (false == CUtility.isspace(m_line[elem]))
		  {
		    break;
		  }
	      }

	    /* Nonempty? */
	    if (elem < m_line_read)
	      {
		m_line_index = 0;
		return NOT_EOF;
	      }
	  }

	while (true)
	  {
	    if (null == (lineStr = m_input.readLine()))
	      {
		m_eof_reached = true;
		m_line_index = 0;
		return EOF;
	      }
	    m_line = (lineStr + "\n").toCharArray();
	    m_line_read=m_line.length;
	    ++m_line_number;
	    
	    /* Check for empty lines and discard them. */
	    elem = 0;
	    while (CUtility.isspace(m_line[elem])) 
	      {
		++elem;
		if (elem == m_line_read)
		  {
		    break;
		  }
	      }
	    
	    if (elem < m_line_read)
	      {
		break;
	      }
	  }

	m_line_index = 0;
	return NOT_EOF;
      }
}

/********************************************************
  Class: Utility
  *******************************************************/
class CUtility 
{
  /********************************************************
    Constants
    *******************************************************/
  static final boolean DEBUG = true;
  static final boolean SLOW_DEBUG = true;
  static final boolean DUMP_DEBUG = true;
  /*static final boolean DEBUG = false;
  static final boolean SLOW_DEBUG = false;
  static final boolean DUMP_DEBUG = false;*/
  static final boolean DESCENT_DEBUG = false;
  static final boolean OLD_DEBUG = false;
  static final boolean OLD_DUMP_DEBUG = false;
  static final boolean FOODEBUG = false;
  static final boolean DO_DEBUG = false;
  
  /********************************************************
    Constants: Integer Bounds
    *******************************************************/
  static final int INT_MAX = 2147483647;

  static final int MAX_SEVEN_BIT = 127;
  static final int MAX_EIGHT_BIT = 255;
  static final int MAX_SIXTEEN_BIT=65535;

  /********************************************************
    Function: enter
    Description: Debugging routine.
    *******************************************************/
  static void enter
    (
     String descent,
     char lexeme,
     int token
     )
      {
	System.out.println("Entering " + descent 
			   + " [lexeme: " + lexeme 
			   + "] [token: " + token + "]");
      }

  /********************************************************
    Function: leave
    Description: Debugging routine.
    *******************************************************/
  static void leave
    (
     String descent,
     char lexeme,
     int token
     )
      {
	System.out.println("Leaving " + descent 
			   + " [lexeme:" + lexeme 
			   + "] [token:" + token + "]");
      }

  /********************************************************
    Function: ASSERT
    Description: Debugging routine.
    *******************************************************/
  static void ASSERT
    (
     boolean expr
     )
      {
	if (DEBUG && false == expr)
	  {
	    System.out.println("Assertion Failed");
	    throw new Error("Assertion Failed.");
	  }
      }

  /***************************************************************
    Function: doubleSize
    **************************************************************/
  static char[] doubleSize
    (
     char oldBuffer[]
     )
      {
	char newBuffer[] = new char[2 * oldBuffer.length];
	int elem;

	for (elem = 0; elem < oldBuffer.length; ++elem)
	  {
	    newBuffer[elem] = oldBuffer[elem];
	  }

	return newBuffer;
      }

  /***************************************************************
    Function: doubleSize
    **************************************************************/
  static byte[] doubleSize
    (
     byte oldBuffer[]
     )
      {
	byte newBuffer[] = new byte[2 * oldBuffer.length];
	int elem;

	for (elem = 0; elem < oldBuffer.length; ++elem)
	  {
	    newBuffer[elem] = oldBuffer[elem];
	  }

	return newBuffer;
      }

  /********************************************************
    Function: hex2bin
    *******************************************************/
  static char hex2bin
    (
     char c
     )
      {
	if ('0' <= c && '9' >= c)
	  {
	    return (char) (c - '0');
	  }
	else if ('a' <= c && 'f' >= c)
	  {
	    return (char) (c - 'a' + 10);
	  }	    
	else if ('A' <= c && 'F' >= c)
	  {
	    return (char) (c - 'A' + 10);
	  }
	
	CError.impos("Bad hexidecimal digit" + c);
	return 0;
      }

  /********************************************************
    Function: ishexdigit
    *******************************************************/
  static boolean ishexdigit
    (
     char c
     )
      {
	if (('0' <= c && '9' >= c)
	    || ('a' <= c && 'f' >= c)
	    || ('A' <= c && 'F' >= c))
	  {
	    return true;
	  }

	return false;
      }

  /********************************************************
    Function: oct2bin
    *******************************************************/
  static char oct2bin
    (
     char c
     )
      {
	if ('0' <= c && '7' >= c)
	  {
	    return (char) (c - '0');
	  }
	
	CError.impos("Bad octal digit " + c);
	return 0;
      }

  /********************************************************
    Function: isoctdigit
    *******************************************************/
  static boolean isoctdigit
    (
     char c
     )
      {
	if ('0' <= c && '7' >= c)
	  {
	    return true;
	  }

	return false;
      }
	
  /********************************************************
    Function: isspace
    *******************************************************/
  static boolean isspace
    (
     char c
     )
      {
	if ('\b' == c 
	    || '\t' == c
	    || '\n' == c
	    || '\f' == c
	    || '\r' == c
	    || ' ' == c)
	  {
	    return true;
	  }
	
	return false;
      }

  /********************************************************
    Function: isnewline
    *******************************************************/
  static boolean isnewline
    (
     char c
     )
      {
	if ('\n' == c
	    || '\r' == c)
	    {
	    return true;
	  }
	
	return false;
      }

  /********************************************************
    Function: bytencmp
    Description: Compares up to n elements of 
    byte array a[] against byte array b[].
    The first byte comparison is made between 
    a[a_first] and b[b_first].  Comparisons continue
    until the null terminating byte '\0' is reached
    or until n bytes are compared.
    Return Value: Returns 0 if arrays are the 
    same up to and including the null terminating byte 
    or up to and including the first n bytes,
    whichever comes first.
    *******************************************************/
  static int bytencmp
    (
     byte a[],
     int a_first,
     byte b[],
     int b_first,
     int n
     )
      {
	int elem;

	for (elem = 0; elem < n; ++elem)
	  {
	    /*System.out.print((char) a[a_first + elem]);
	    System.out.print((char) b[b_first + elem]);*/
			     
	    if ('\0' == a[a_first + elem] && '\0' == b[b_first + elem])
	      {
		/*System.out.println("return 0");*/
		return 0;
	      }
	    if (a[a_first + elem] < b[b_first + elem])
	      {
		/*System.out.println("return 1");*/
		return 1;
	      }
	    else if (a[a_first + elem] > b[b_first + elem])
	      {
		/*System.out.println("return -1");*/
		return -1;
	      }
	  }

	/*System.out.println("return 0");*/
	return 0;
      }

  /********************************************************
    Function: charncmp
    *******************************************************/
  static int charncmp
    (
     char a[],
     int a_first,
     char b[],
     int b_first,
     int n
     )
      {
	int elem;

	for (elem = 0; elem < n; ++elem)
	  {
	    if ('\0' == a[a_first + elem] && '\0' == b[b_first + elem])
	      {
		return 0;
	      }
	    if (a[a_first + elem] < b[b_first + elem])
	      {
		return 1;
	      }
	    else if (a[a_first + elem] > b[b_first + elem])
	      {
		return -1;
	      }
	  }

	return 0;
      }
}

/********************************************************
  Class: CError
  *******************************************************/
class CError 
{
  /********************************************************
    Function: impos
    Description:
    *******************************************************/
  static void impos
    (
     String message
     )
      {
	System.out.println("JLex Error: " + message);
      }

  /********************************************************
    Constants
    Description: Error codes for parse_error().
    *******************************************************/
  static final int E_BADEXPR = 0;
  static final int E_PAREN = 1;
  static final int E_LENGTH = 2;
  static final int E_BRACKET = 3;
  static final int E_BOL = 4;
  static final int E_CLOSE = 5;
  static final int E_NEWLINE = 6;
  static final int E_BADMAC = 7;
  static final int E_NOMAC = 8;
  static final int E_MACDEPTH = 9;
  static final int E_INIT = 10;
  static final int E_EOF = 11;
  static final int E_DIRECT = 12;
  static final int E_INTERNAL = 13;
  static final int E_STATE = 14;
  static final int E_MACDEF = 15;
  static final int E_SYNTAX = 16;
  static final int E_BRACE = 17;
  static final int E_DASH = 18;
  static final int E_ZERO = 19;
  static final int E_BADCTRL = 20;
  
  /********************************************************
    Constants
    Description: String messages for parse_error();
    *******************************************************/
  static final String errmsg[] = 
    {
      "Malformed regular expression.",
      "Missing close parenthesis.",
      "Too many regular expressions or expression too long.",
      "Missing [ in character class.",
      "^ must be at start of expression or after [.",
      "+ ? or * must follow an expression or subexpression.",
      "Newline in quoted string.",
      "Missing } in macro expansion.",
      "Macro does not exist.",
      "Macro expansions nested too deeply.",
      "JLex has not been successfully initialized.",
      "Unexpected end-of-file found.",
      "Undefined or badly-formed JLex directive.",
      "Internal JLex error.",
      "Unitialized state name.",
      "Badly formed macro definition.",
      "Syntax error.",
      "Missing brace at start of lexical action.",
      "Special character dash - in character class [...] must\n"
	+ "\tbe preceded by start-of-range character.",
      "Zero-length regular expression.",
      "Illegal \\^C-style escape sequence (character following caret must\n"
        + "\tbe alphabetic).",
    };
  
  /********************************************************
    Function: parse_error
    Description:
    *******************************************************/
  static void parse_error
    (
     int error_code,
     int line_number
     )
      {
	System.out.println("Error: Parse error at line " 
			   + line_number + ".");
	System.out.println("Description: " + errmsg[error_code]);
	throw new Error("Parse error.");
      }
}

/********************************************************
  Class: CSet
  *******************************************************/
class CSet 
{
  /********************************************************
    Member Variables
    *******************************************************/
  private SparseBitSet m_set;
  private boolean m_complement;

  /********************************************************
    Function: CSet
    *******************************************************/
  CSet
    (
     )
    {
      m_set = new SparseBitSet();
      m_complement = false;
    }

  /********************************************************
    Function: complement
    *******************************************************/
  void complement
    (
     )
      {
	m_complement = true;
      }

  /********************************************************
    Function: add
    *******************************************************/
  void add
    (
     int i
     )
      {
	m_set.set(i);
      }

  /********************************************************
    Function: addncase
    *******************************************************/
  void addncase // add, ignoring case.
    (
     char c
     )
      {
	/* Do this in a Unicode-friendly way. */
	/* (note that duplicate adds have no effect) */
	add(c);
	add(Character.toLowerCase(c));
	add(Character.toTitleCase(c));
	add(Character.toUpperCase(c));
      }
  
  /********************************************************
    Function: contains
    *******************************************************/
  boolean contains
    (
     int i
     )
      {
	boolean result;
	
	result = m_set.get(i);
	
	if (m_complement)
	  {
	    return (false == result);
	  }
	
	return result;
      }

  /********************************************************
    Function: mimic
    *******************************************************/
  void mimic
    (
     CSet set
     )
      {
	m_complement = set.m_complement;
	m_set = (SparseBitSet) set.m_set.clone();
      } 

  /** Map set using character classes [CSA] */
  void map(CSet set, int[] mapping) {
    m_complement = set.m_complement;
    m_set.clearAll();
    for (Enumeration e=set.m_set.elements(); e.hasMoreElements(); ) {
      int old_value =((Integer)e.nextElement()).intValue();
      if (old_value<mapping.length) // skip unmapped characters
	m_set.set(mapping[old_value]);
    }
  }
}

/********************************************************
  Class: CNfa
  *******************************************************/
class CNfa
{
  /********************************************************
    Member Variables
    *******************************************************/
  int m_edge;  /* Label for edge type:
			 character code, 
			 CCL (character class), 
			 [STATE,
			 SCL (state class),]
			 EMPTY, 
			 EPSILON. */
  
  CSet m_set;  /* Set to store character classes. */
  CNfa m_next;  /* Next state (or null if none). */
  
  CNfa m_next2;  /* Another state with type == EPSILON
			   and null if not used.  
			   The NFA construction should result in two
			   outgoing edges only if both are EPSILON edges. */
  
  CAccept m_accept;  /* Set to null if nonaccepting state. */
  int m_anchor;  /* Says if and where pattern is anchored. */

  int m_label;

  SparseBitSet m_states;

  /********************************************************
    Constants
    *******************************************************/
  static final int NO_LABEL = -1;

  /********************************************************
    Constants: Edge Types
    Note: Edge transitions on one specific character
    are labelled with the character Ascii (Unicode)
    codes.  So none of the constants below should
    overlap with the natural character codes.
    *******************************************************/
  static final int CCL = -1;
  static final int EMPTY = -2;
  static final int EPSILON = -3;
   
  /********************************************************
    Function: CNfa
    *******************************************************/
 CNfa
    (
     )
    {
      m_edge = EMPTY;
      m_set = null;
      m_next = null;
      m_next2 = null;
      m_accept = null;
      m_anchor = CSpec.NONE;
      m_label = NO_LABEL;
      m_states = null;
    }

  /********************************************************
    Function: mimic
    Description: Converts this NFA state into a copy of
    the input one.
    *******************************************************/
  void mimic
    (
     CNfa nfa
     )
      {
	m_edge = nfa.m_edge;
	
	if (null != nfa.m_set)
	  {
	    if (null == m_set)
	      {
		m_set = new CSet();
	      }
	    m_set.mimic(nfa.m_set);
	  }
	else
	  {
	    m_set = null;
	  }

	m_next = nfa.m_next;
	m_next2 = nfa.m_next2;
	m_accept = nfa.m_accept;
	m_anchor = nfa.m_anchor;

	if (null != nfa.m_states)
	  {
	    m_states = (SparseBitSet) nfa.m_states.clone();
	  }
	else
	  {
	    m_states = null;
	  }
      }
}

/***************************************************************
  Class: CLexGen
  **************************************************************/
class CLexGen 
{
  /***************************************************************
    Member Variables
    **************************************************************/
  private java.io.Reader m_instream; /* JLex specification file. */
  private java.io.PrintWriter m_outstream; /* Lexical analyzer source file. */

  private CInput m_input; /* Input buffer class. */

  private Hashtable m_tokens; /* Hashtable that maps characters to their 
				 corresponding lexical code for
				 the internal lexical analyzer. */
  private CSpec m_spec; /* Spec class holds information
			   about the generated lexer. */
  private boolean m_init_flag; /* Flag set to true only upon 
				  successful initialization. */

  private CMakeNfa m_makeNfa; /* NFA machine generator module. */
  private CNfa2Dfa m_nfa2dfa; /* NFA to DFA machine (transition table) 
				 conversion module. */
  private CMinimize m_minimize; /* Transition table compressor. */
  private CSimplifyNfa m_simplifyNfa; /* NFA simplifier using char classes */
  private CEmit m_emit; /* Output module that emits source code
			   into the generated lexer file. */


  /********************************************************
    Constants
    *******************************************************/
  private static final boolean ERROR = false;
  private static final boolean NOT_ERROR = true;
  private static final int BUFFER_SIZE = 1024;

  /********************************************************
    Constants: Token Types
    *******************************************************/
  static final int EOS = 1;
  static final int ANY = 2;
  static final int AT_BOL = 3;
  static final int AT_EOL = 4;
  static final int CCL_END = 5;
  static final int CCL_START = 6;
  static final int CLOSE_CURLY = 7;
  static final int CLOSE_PAREN = 8;
  static final int CLOSURE = 9;
  static final int DASH = 10;
  static final int END_OF_INPUT = 11;
  static final int L = 12;
  static final int OPEN_CURLY = 13;
  static final int OPEN_PAREN = 14;
  static final int OPTIONAL = 15;
  static final int OR = 16;
  static final int PLUS_CLOSE = 17;

  /***************************************************************
    Function: CLexGen
    **************************************************************/
  CLexGen 
    (
     String filename
     )
      throws java.io.FileNotFoundException, java.io.IOException
      {
	/* Successful initialization flag. */
	m_init_flag = false;
	
	/* Open input stream. */
	m_instream = new java.io.FileReader(filename);
	if (null == m_instream)
	  {
	    System.out.println("Error: Unable to open input file "
			       + filename + ".");
	    return;
	  }

	/* Open output stream. */
	m_outstream 
	  = new java.io.PrintWriter(new java.io.BufferedWriter(
		new java.io.FileWriter(filename + ".java")));
	if (null == m_outstream)
	  {
	    System.out.println("Error: Unable to open output file "
			       + filename + ".java.");
	    return;
	  }

	/* Create input buffer class. */
	m_input = new CInput(m_instream);

	/* Initialize character hash table. */
	m_tokens = new Hashtable();
	m_tokens.put(new Character('$'),new Integer(AT_EOL));
	m_tokens.put(new Character('('),new Integer(OPEN_PAREN));
	m_tokens.put(new Character(')'),new Integer(CLOSE_PAREN));
	m_tokens.put(new Character('*'),new Integer(CLOSURE));
	m_tokens.put(new Character('+'),new Integer(PLUS_CLOSE));
	m_tokens.put(new Character('-'),new Integer(DASH));
	m_tokens.put(new Character('.'),new Integer(ANY));
	m_tokens.put(new Character('?'),new Integer(OPTIONAL));
	m_tokens.put(new Character('['),new Integer(CCL_START));
	m_tokens.put(new Character(']'),new Integer(CCL_END));
	m_tokens.put(new Character('^'),new Integer(AT_BOL));
	m_tokens.put(new Character('{'),new Integer(OPEN_CURLY));
	m_tokens.put(new Character('|'),new Integer(OR));
	m_tokens.put(new Character('}'),new Integer(CLOSE_CURLY));
      
	/* Initialize spec structure. */
	m_spec = new CSpec(this);
	
	/* Nfa to dfa converter. */
	m_nfa2dfa = new CNfa2Dfa();
	m_minimize = new CMinimize();
	m_makeNfa = new CMakeNfa();
	m_simplifyNfa = new CSimplifyNfa();

	m_emit = new CEmit();

	/* Successful initialization flag. */
	m_init_flag = true;
      }

  /***************************************************************
    Function: generate
    Description: 
    **************************************************************/
  void generate
    (
     )
      throws java.io.IOException, java.io.FileNotFoundException
      {
	if (false == m_init_flag)
	  {
	    CError.parse_error(CError.E_INIT,0);
	  }

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	    CUtility.ASSERT(m_init_flag);
	  }

	/*m_emit.emit_imports(m_spec,m_outstream);*/

	if (m_spec.m_verbose)
	  {
	    System.out.println("Processing first section -- user code.");
	  }
	userCode();
	if (m_input.m_eof_reached)
	  {
	    CError.parse_error(CError.E_EOF,m_input.m_line_number);
	  }

	if (m_spec.m_verbose)
	  {
	    System.out.println("Processing second section -- " 
			       + "JLex declarations.");
	  }
	userDeclare();
	if (m_input.m_eof_reached)
	  {
	    CError.parse_error(CError.E_EOF,m_input.m_line_number);
	  }

	if (m_spec.m_verbose)
	  {
	    System.out.println("Processing third section -- lexical rules.");
	  }
	userRules();
 	if (CUtility.DO_DEBUG)
	  {
	    print_header();
	  }

	if (m_spec.m_verbose)
	  {
	    System.out.println("Outputting lexical analyzer code.");
	  }
	m_emit.emit(m_spec,m_outstream);

	if (m_spec.m_verbose && true == CUtility.OLD_DUMP_DEBUG)
	  {
	    details();
	  }
	
	m_outstream.close();
      }

  /***************************************************************
    Function: userCode
    Description: Process first section of specification,
    echoing it into output file.
    **************************************************************/
  private void userCode
    (
     )
      throws java.io.IOException
      {
	int count = 0;

	if (false == m_init_flag)
	  {
	    CError.parse_error(CError.E_INIT,0);
	  }

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	  }

	if (m_input.m_eof_reached)
	  {
	    CError.parse_error(CError.E_EOF,0);
	  }

	while (true)
	  {
	    if (m_input.getLine())
	      {
		/* Eof reached. */
		CError.parse_error(CError.E_EOF,0);
	      }
	    
	    if (2 <= m_input.m_line_read 
		&& '%' == m_input.m_line[0]
		&& '%' == m_input.m_line[1])
	      {
		/* Discard remainder of line. */
		m_input.m_line_index = m_input.m_line_read;
		return;
	      }

	    m_outstream.print(new String(m_input.m_line,0,
					      m_input.m_line_read));
	  }
      }

  /***************************************************************
    Function: getName
    **************************************************************/
  private char[] getName
    (
     )
      {
	char buffer[];
	int elem;

	/* Skip white space. */
	while (m_input.m_line_index < m_input.m_line_read
	       && true == CUtility.isspace(m_input.m_line[m_input.m_line_index]))
	  {
	    ++m_input.m_line_index;
	  }

	/* No name? */
	if (m_input.m_line_index >= m_input.m_line_read)
	  {
	    CError.parse_error(CError.E_DIRECT,0);
	  }

	/* Determine length. */
	elem = m_input.m_line_index;
	while (elem < m_input.m_line_read
	       && false == CUtility.isnewline(m_input.m_line[elem]))
	  {
	    ++elem;
	  } 

	/* Allocate non-terminated buffer of exact length. */
	buffer = new char[elem - m_input.m_line_index];
	
	/* Copy. */
	elem = 0;
	while (m_input.m_line_index < m_input.m_line_read
	       && false == CUtility.isnewline(m_input.m_line[m_input.m_line_index]))
	  {
	    buffer[elem] = m_input.m_line[m_input.m_line_index];
	    ++elem;
	    ++m_input.m_line_index;
	  }

	return buffer;
      }

  private final int CLASS_CODE = 0;
  private final int INIT_CODE = 1;
  private final int EOF_CODE = 2;
  private final int INIT_THROW_CODE = 3;
  private final int YYLEX_THROW_CODE = 4;
  private final int EOF_THROW_CODE = 5;
  private final int EOF_VALUE_CODE = 6;

  /***************************************************************
    Function: packCode
    Description:
    **************************************************************/
  private char[] packCode
    (
     char start_dir[],
     char end_dir[],
     char prev_code[],
     int prev_read,
     int specified
     )
      throws java.io.IOException
      {
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(INIT_CODE == specified 
			    || CLASS_CODE == specified
			    || EOF_CODE == specified
			    || EOF_VALUE_CODE == specified
			    || INIT_THROW_CODE == specified
			    || YYLEX_THROW_CODE == specified
			    || EOF_THROW_CODE == specified);
	  }

	if (0 != CUtility.charncmp(m_input.m_line,
				   0,
				   start_dir,
				   0,
				   start_dir.length - 1))
	  {
	    CError.parse_error(CError.E_INTERNAL,0);
	  }
	
	if (null == prev_code)
	  {
	    prev_code = new char[BUFFER_SIZE];
	    prev_read = 0;
	  }
	
	if (prev_read >= prev_code.length)
	  {
	    prev_code = CUtility.doubleSize(prev_code);
	  }
	
	m_input.m_line_index = start_dir.length - 1;
	while (true)
	  {
	    while (m_input.m_line_index >= m_input.m_line_read)
	      {
		if (m_input.getLine())
		  {
		    CError.parse_error(CError.E_EOF,m_input.m_line_number);
		  }
		
		if (0 == CUtility.charncmp(m_input.m_line,
					   0,
					   end_dir,
					   0,
					   end_dir.length - 1))
		  {
		    m_input.m_line_index = end_dir.length - 1;
		    
		    switch (specified)
		      {
		      case CLASS_CODE:
			m_spec.m_class_read = prev_read;
			break;
			
		      case INIT_CODE:
			m_spec.m_init_read = prev_read;
			break;
			
		      case EOF_CODE:
			m_spec.m_eof_read = prev_read;
			break;

		      case EOF_VALUE_CODE:
			m_spec.m_eof_value_read = prev_read;
			break;

		      case INIT_THROW_CODE:
			m_spec.m_init_throw_read = prev_read;
			break;

		      case YYLEX_THROW_CODE:
			m_spec.m_yylex_throw_read = prev_read;
			break;
			
		      case EOF_THROW_CODE:
			m_spec.m_eof_throw_read = prev_read;
			break;
			
		      default:
			CError.parse_error(CError.E_INTERNAL,m_input.m_line_number);
			break;
		      }

		    return prev_code;
		  }
	      }

	    while (m_input.m_line_index < m_input.m_line_read)
	      {
		prev_code[prev_read] = m_input.m_line[m_input.m_line_index];
		++prev_read;
		++m_input.m_line_index;

		if (prev_read >= prev_code.length)
		  {
		    prev_code = CUtility.doubleSize(prev_code);
		  }
	      }
	  }
      }

  /***************************************************************
    Member Variables: JLex directives.
    **************************************************************/
  private char m_state_dir[] = { 
    '%', 's', 't', 
    'a', 't', 'e',
    '\0'
    };
  
  private char m_char_dir[] = { 
    '%', 'c', 'h',
    'a', 'r',
    '\0'
    };

  private char m_line_dir[] = { 
    '%', 'l', 'i',
    'n', 'e',
    '\0'
    };

  private char m_cup_dir[] = { 
    '%', 'c', 'u',
    'p', 
    '\0'
    };

  private char m_class_dir[] = { 
    '%', 'c', 'l', 
    'a', 's', 's',
    '\0'
    };

  private char m_implements_dir[] = { 
    '%', 'i', 'm', 'p', 'l', 'e', 'm', 'e', 'n', 't', 's', 
    '\0'
    };

  private char m_function_dir[] = { 
    '%', 'f', 'u',
    'n', 'c', 't',
    'i', 'o', 'n',
    '\0'
    };

  private char m_type_dir[] = { 
    '%', 't', 'y',
    'p', 'e',
    '\0'
    };

  private char m_integer_dir[] = { 
    '%', 'i', 'n',
    't', 'e', 'g', 
    'e', 'r',
    '\0'
    };

  private char m_intwrap_dir[] = { 
    '%', 'i', 'n',
    't', 'w', 'r', 
    'a', 'p',
    '\0'
    };

  private char m_full_dir[] = { 
    '%', 'f', 'u', 
    'l', 'l',
    '\0'
    };

  private char m_unicode_dir[] = { 
    '%', 'u', 'n', 
    'i', 'c', 'o',
    'd', 'e',
    '\0'
    };

  private char m_ignorecase_dir[] = {
    '%', 'i', 'g',
    'n', 'o', 'r',
    'e', 'c', 'a', 
    's', 'e',
    '\0'
    };

  private char m_notunix_dir[] = { 
    '%', 'n', 'o',
    't', 'u', 'n', 
    'i', 'x',
    '\0'
    };

  private char m_init_code_dir[] = { 
    '%', 'i', 'n', 
    'i', 't', '{',
    '\0'
    };

  private char m_init_code_end_dir[] = { 
    '%', 'i', 'n', 
    'i', 't', '}',
    '\0'
    };

  private char m_init_throw_code_dir[] = { 
    '%', 'i', 'n', 
    'i', 't', 't',
    'h', 'r', 'o',
    'w', '{',
    '\0'
    };

  private char m_init_throw_code_end_dir[] = { 
    '%', 'i', 'n', 
    'i', 't', 't',
    'h', 'r', 'o',
    'w', '}',
    '\0'
    };

  private char m_yylex_throw_code_dir[] = { 
    '%', 'y', 'y', 'l', 
    'e', 'x', 't',
    'h', 'r', 'o',
    'w', '{',
    '\0'
    };

  private char m_yylex_throw_code_end_dir[] = { 
    '%', 'y', 'y', 'l', 
    'e', 'x', 't',
    'h', 'r', 'o',
    'w', '}',
    '\0'
    };

  private char m_eof_code_dir[] = { 
    '%', 'e', 'o', 
    'f', '{',
    '\0'
    };

  private char m_eof_code_end_dir[] = { 
    '%', 'e', 'o', 
    'f', '}',
    '\0'
    };

  private char m_eof_value_code_dir[] = { 
    '%', 'e', 'o', 
    'f', 'v', 'a', 
    'l', '{',
    '\0'
    };

  private char m_eof_value_code_end_dir[] = { 
    '%', 'e', 'o', 
    'f', 'v', 'a',
    'l', '}',
    '\0'
    };

  private char m_eof_throw_code_dir[] = { 
    '%', 'e', 'o', 
    'f', 't', 'h',
    'r', 'o', 'w',
    '{',
    '\0'
    };

  private char m_eof_throw_code_end_dir[] = { 
    '%', 'e', 'o', 
    'f', 't', 'h',
    'r', 'o', 'w',
    '}',
    '\0'
    };

  private char m_class_code_dir[] = { 
    '%', '{',
    '\0'
    };

  private char m_class_code_end_dir[] = { 
    '%', '}',
    '\0'
    };

  private char m_yyeof_dir[] = { 
    '%', 'y', 'y',
    'e', 'o', 'f',
    '\0'
    };
  
  private char m_public_dir[] = { 
    '%', 'p', 'u',
    'b', 'l', 'i', 
    'c', '\0'
    };
  
  /***************************************************************
    Function: userDeclare
    Description:
    **************************************************************/
  private void userDeclare
    (
     )
      throws java.io.IOException
	{
	  int elem;
	  
	  if (CUtility.DEBUG)
	    {
	      CUtility.ASSERT(null != this);
	      CUtility.ASSERT(null != m_outstream);
	      CUtility.ASSERT(null != m_input);
	      CUtility.ASSERT(null != m_tokens);
	      CUtility.ASSERT(null != m_spec);
	    }

	  if (m_input.m_eof_reached)
	    {
	      /* End-of-file. */
	      CError.parse_error(CError.E_EOF,
				 m_input.m_line_number);
	    }

	  while (false == m_input.getLine())
	    {
	      /* Look for double percent. */
	      if (2 <= m_input.m_line_read 
		  && '%' == m_input.m_line[0] 
		  && '%' == m_input.m_line[1])
		{
		  /* Mess around with line. */
		  m_input.m_line_read -= 2;
		  System.arraycopy(m_input.m_line, 2,
				   m_input.m_line, 0, m_input.m_line_read);

		  m_input.m_pushback_line = true;
		  /* Check for and discard empty line. */
		  if (0 == m_input.m_line_read 
		      || '\n' == m_input.m_line[0])
		    {
		      m_input.m_pushback_line = false;
		    }

		  return;
		}

	      if (0 == m_input.m_line_read)
		{
		  continue;
		}

	      if ('%' == m_input.m_line[0])
		{
		  /* Special lex declarations. */
		  if (1 >= m_input.m_line_read)
		    {
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      continue;
		    }

		  switch (m_input.m_line[1])
		    {
		    case '{':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_class_code_dir,
						 0,
						 m_class_code_dir.length - 1))
			{
			  m_spec.m_class_code = packCode(m_class_code_dir,
							 m_class_code_end_dir,
							 m_spec.m_class_code,
							 m_spec.m_class_read,
							 CLASS_CODE);
			  break;
			}
	      
		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'c':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_char_dir,
						 0,
						 m_char_dir.length - 1))
			{
			  /* Set line counting to ON. */
			  m_input.m_line_index = m_char_dir.length;
			  m_spec.m_count_chars = true;
			  break;
			}	
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_class_dir, 
						      0,
						      m_class_dir.length - 1))
			{
			  m_input.m_line_index = m_class_dir.length;
			  m_spec.m_class_name = getName();
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_cup_dir,
						      0,
						      m_cup_dir.length - 1))
			{
			  /* Set Java CUP compatibility to ON. */
			  m_input.m_line_index = m_cup_dir.length;
			  m_spec.m_cup_compatible = true;
			  // this is what %cup does: [CSA, 27-Jul-1999]
			  m_spec.m_implements_name =
			      "java_cup.runtime.Scanner".toCharArray();
			  m_spec.m_function_name =
			      "next_token".toCharArray();
			  m_spec.m_type_name =
			      "java_cup.runtime.Symbol".toCharArray();
			  break;
			}
	      
		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;
		      
		    case 'e':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_eof_code_dir,
						 0,
						 m_eof_code_dir.length - 1))
			{
			  m_spec.m_eof_code = packCode(m_eof_code_dir,
						       m_eof_code_end_dir,
						       m_spec.m_eof_code,
						       m_spec.m_eof_read,
						       EOF_CODE);
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_eof_value_code_dir,
						      0,
						      m_eof_value_code_dir.length - 1))
			{
			  m_spec.m_eof_value_code = packCode(m_eof_value_code_dir,
							     m_eof_value_code_end_dir,
							     m_spec.m_eof_value_code,
							     m_spec.m_eof_value_read,
							     EOF_VALUE_CODE);
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_eof_throw_code_dir,
						      0,
						      m_eof_throw_code_dir.length - 1))
			{
			  m_spec.m_eof_throw_code = packCode(m_eof_throw_code_dir,
						       m_eof_throw_code_end_dir,
						       m_spec.m_eof_throw_code,
						       m_spec.m_eof_throw_read,
						       EOF_THROW_CODE);
			  break;
			}
	      
		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'f':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_function_dir,
						 0,
						 m_function_dir.length - 1))
			{
			  /* Set line counting to ON. */
			  m_input.m_line_index = m_function_dir.length;
			  m_spec.m_function_name = getName();
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_full_dir,
						      0,
						      m_full_dir.length - 1))
			{
			  m_input.m_line_index = m_full_dir.length;
			  m_spec.m_dtrans_ncols = CUtility.MAX_EIGHT_BIT + 1;
			  break;
			}

		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'i':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_integer_dir,
						 0,
						 m_integer_dir.length - 1))
			{
			  /* Set line counting to ON. */
			  m_input.m_line_index = m_integer_dir.length;
			  m_spec.m_integer_type = true;
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_intwrap_dir,
						      0,
						      m_intwrap_dir.length - 1))
			{
			  /* Set line counting to ON. */
			  m_input.m_line_index = m_integer_dir.length;
			  m_spec.m_intwrap_type = true;
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_init_code_dir,
						      0,
						      m_init_code_dir.length - 1))
			{
			  m_spec.m_init_code = packCode(m_init_code_dir,
							m_init_code_end_dir,
							m_spec.m_init_code,
							m_spec.m_init_read,
							INIT_CODE);
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_init_throw_code_dir,
						      0,
						      m_init_throw_code_dir.length - 1))
			{
			  m_spec.m_init_throw_code = packCode(m_init_throw_code_dir,
						       m_init_throw_code_end_dir,
						       m_spec.m_init_throw_code,
						       m_spec.m_init_throw_read,
						       INIT_THROW_CODE);
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_implements_dir, 
						      0,
						      m_implements_dir.length - 1))
			{
			  m_input.m_line_index = m_implements_dir.length;
			  m_spec.m_implements_name = getName();
			  break;
			}
		      else if (0 == CUtility.charncmp(m_input.m_line,
						      0,
						      m_ignorecase_dir,
						      0,
						      m_ignorecase_dir.length-1))
			{
			  /* Set m_ignorecase to ON. */
			  m_input.m_line_index = m_ignorecase_dir.length;
			  m_spec.m_ignorecase = true;
			  break;
			}

		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'l':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_line_dir,
						 0,
						 m_line_dir.length - 1))
			{
			  /* Set line counting to ON. */
			  m_input.m_line_index = m_line_dir.length;
			  m_spec.m_count_lines = true;
			  break;
			}

		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'n':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_notunix_dir,
						 0,
						 m_notunix_dir.length - 1))
			{
			  /* Set line counting to ON. */
			  m_input.m_line_index = m_notunix_dir.length;
			  m_spec.m_unix = false;
			  break;
			}

		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'p':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_public_dir,
						 0,
						 m_public_dir.length - 1))
			{
			  /* Set public flag. */
			  m_input.m_line_index = m_public_dir.length;
			  m_spec.m_public = true;
			  break;
			}

		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 's':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_state_dir,
						 0,
						 m_state_dir.length - 1))
			{
			  /* Recognize state list. */
			  m_input.m_line_index = m_state_dir.length;
			  saveStates();
			  break;
			}

		      /* Undefined directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;
		     
		    case 't':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_type_dir,
						 0,
						 m_type_dir.length - 1))
			{
			  /* Set Java CUP compatibility to ON. */
			  m_input.m_line_index = m_type_dir.length;
			  m_spec.m_type_name = getName();
			  break;
			}

		      /* Undefined directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'u':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_unicode_dir,
						 0,
						 m_unicode_dir.length - 1))
			{
			  m_input.m_line_index = m_unicode_dir.length;
			  m_spec.m_dtrans_ncols= CUtility.MAX_SIXTEEN_BIT + 1;
			  break;
			}

		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    case 'y':
		      if (0 == CUtility.charncmp(m_input.m_line,
						 0,
						 m_yyeof_dir,
						 0,
						 m_yyeof_dir.length - 1))
			{
			  m_input.m_line_index = m_yyeof_dir.length;
			  m_spec.m_yyeof = true;
			  break;
			} else if (0 == CUtility.charncmp(m_input.m_line,
							  0,
							  m_yylex_throw_code_dir,
							  0,
							  m_yylex_throw_code_dir.length - 1))
			{
			  m_spec.m_yylex_throw_code = packCode(m_yylex_throw_code_dir,
							       m_yylex_throw_code_end_dir,
						       m_spec.m_yylex_throw_code,
						       m_spec.m_yylex_throw_read,
						       YYLEX_THROW_CODE);
			  break;
			}


		      /* Bad directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;

		    default:
		      /* Undefined directive. */
		      CError.parse_error(CError.E_DIRECT,
					 m_input.m_line_number);
		      break;
		    }
		}
	      else
		{
		  /* Regular expression macro. */
		  m_input.m_line_index = 0;
		  saveMacro();
		}

	      if (CUtility.OLD_DEBUG)
		{
		  System.out.println("Line number " 
				     + m_input.m_line_number + ":"); 
		  System.out.print(new String(m_input.m_line,
					      0,m_input.m_line_read));
		}
	    }
	}
	 
  /***************************************************************
    Function: userRules
    Description: Processes third section of JLex 
    specification and creates minimized transition table.
    **************************************************************/
  private void userRules
    (
     )
      throws java.io.IOException
      {
	int code;

	if (false == m_init_flag)
	  {
	    CError.parse_error(CError.E_INIT,0);
	  }

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	  }

	/* UNDONE: Need to handle states preceding rules. */
	
	if (m_spec.m_verbose)
	  {
	    System.out.println("Creating NFA machine representation.");
	  }
	m_makeNfa.allocate_BOL_EOF(m_spec);
	m_makeNfa.thompson(this,m_spec,m_input);
	
	m_simplifyNfa.simplify(m_spec);

	/*print_nfa();*/

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(END_OF_INPUT == m_spec.m_current_token);
	  }

	if (m_spec.m_verbose)
	  {
	    System.out.println("Creating DFA transition table.");
	  }
	m_nfa2dfa.make_dfa(this,m_spec);

	if (CUtility.FOODEBUG) {
	  print_header();
	}

	if (m_spec.m_verbose)
	  {
	    System.out.println("Minimizing DFA transition table.");
	  }
	m_minimize.min_dfa(m_spec);
      }

  /***************************************************************
    Function: printccl
    Description: Debugging routine that outputs readable form
    of character class.
    **************************************************************/
  private void printccl
    (
     CSet set
     )
      {
	int i;
	
	System.out.print(" [");
	for (i = 0; i < m_spec.m_dtrans_ncols; ++i)
	  {
	    if (set.contains(i))
	      {
		System.out.print(interp_int(i));
	      }
	  }
	System.out.print(']');
      }

  /***************************************************************
    Function: plab
    Description:
    **************************************************************/
  private String plab
    (
     CNfa state
     )
      {
	int index;
	
	if (null == state)
	  {
	    return (new String("--"));
	  }

	index = m_spec.m_nfa_states.indexOf(state);
	
	return ((new Integer(index)).toString());
      }

  /***************************************************************
    Function: interp_int
    Description:
    **************************************************************/
  private String interp_int
    (
     int i
     )
      {
	switch (i)
	  {
	  case (int) '\b':
	    return (new String("\\b"));

	  case (int) '\t':
	    return (new String("\\t"));

	  case (int) '\n':
	    return (new String("\\n"));

	  case (int) '\f':
	    return (new String("\\f"));

	  case (int) '\r':
	    return (new String("\\r"));
	    
	  case (int) ' ':
	    return (new String("\\ "));
	    
	  default:
	    return ((new Character((char) i)).toString());
	  }
      }

  /***************************************************************
    Function: print_nfa
    Description:
    **************************************************************/
  void print_nfa
    (
     )
      {
	int elem;
	CNfa nfa;
	int size;
	Enumeration states;
	Integer index;
	int i;
	int j;
	int vsize;
	String state;
     
	System.out.println("--------------------- NFA -----------------------");
	
	size = m_spec.m_nfa_states.size();
	for (elem = 0; elem < size; ++elem)
	  {
	    nfa = (CNfa) m_spec.m_nfa_states.elementAt(elem);
	    
	    System.out.print("Nfa state " + plab(nfa) + ": ");
	    
	    if (null == nfa.m_next)
	      {
		System.out.print("(TERMINAL)");
	      }
	    else
	      {
		System.out.print("--> " + plab(nfa.m_next));
		System.out.print("--> " + plab(nfa.m_next2));
		
		switch (nfa.m_edge)
		  {
		  case CNfa.CCL:
		    printccl(nfa.m_set);
		    break;

		  case CNfa.EPSILON:
		    System.out.print(" EPSILON ");
		    break; 
		    
		  default:
		    System.out.print(" " + interp_int(nfa.m_edge));
		    break;
		  }
	      }

	    if (0 == elem)
	      {
		System.out.print(" (START STATE)");
	      }
	    
	    if (null != nfa.m_accept)
	      {
		System.out.print(" accepting " 
				 + ((0 != (nfa.m_anchor & CSpec.START)) ? "^" : "")
				 + "<" 
				 + (new String(nfa.m_accept.m_action,0,
					       nfa.m_accept.m_action_read))
				 + ">"
				 + ((0 != (nfa.m_anchor & CSpec.END)) ? "$" : ""));
	      }

	    System.out.println();
	  }

	states = m_spec.m_states.keys();
	while (states.hasMoreElements())
	  {
	    state = (String) states.nextElement();
	    index = (Integer) m_spec.m_states.get(state);

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(null != state);
		CUtility.ASSERT(null != index);
	      }

	    System.out.println("State \"" + state 
			       + "\" has identifying index " 
			       + index.toString() + ".");
	    System.out.print("\tStart states of matching rules: ");
	    
	    i = index.intValue();
	    vsize = m_spec.m_state_rules[i].size();
	    
	    for (j = 0; j < vsize; ++j)
	      {
		nfa = (CNfa) m_spec.m_state_rules[i].elementAt(j);

		System.out.print(m_spec.m_nfa_states.indexOf(nfa) + " ");
	      }

	    System.out.println();
	  }

	System.out.println("-------------------- NFA ----------------------");
      }

  /***************************************************************
    Function: getStates
    Description: Parses the state area of a rule,
    from the beginning of a line.
    < state1, state2 ... > regular_expression { action }
    Returns null on only EOF.  Returns all_states, 
    initialied properly to correspond to all states,
    if no states are found.
    Special Notes: This function treats commas as optional
    and permits states to be spread over multiple lines.
    **************************************************************/
  private SparseBitSet all_states = null;
  SparseBitSet getStates
    (
     )
      throws java.io.IOException
      {
	int start_state;
	int count_state;
	SparseBitSet states;
	String name;
	Integer index;
	int i;
	int size;
	
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	  }

	states = null;

	/* Skip white space. */
	while (CUtility.isspace(m_input.m_line[m_input.m_line_index]))
	  {
	    ++m_input.m_line_index;
    
	    while (m_input.m_line_index >= m_input.m_line_read)
	      {
		/* Must just be an empty line. */
		if (m_input.getLine())
		  {
		    /* EOF found. */
		    return null;
		  }
	      }
	  }

	/* Look for states. */
	if ('<' == m_input.m_line[m_input.m_line_index])
	  {
	    ++m_input.m_line_index;
	   
	    states = new SparseBitSet();

	    /* Parse states. */
	    while (true)
	      {
		/* We may have reached the end of the line. */
		while (m_input.m_line_index >= m_input.m_line_read)
		  {
		    if (m_input.getLine())
		      {
			/* EOF found. */
			CError.parse_error(CError.E_EOF,m_input.m_line_number);
			return states;
		      }
		  }

		while (true)
		  {
		    /* Skip white space. */
		    while (CUtility.isspace(m_input.m_line[m_input.m_line_index]))
		      {
			++m_input.m_line_index;
			
			while (m_input.m_line_index >= m_input.m_line_read)
			  {
			    if (m_input.getLine())
			      {
				/* EOF found. */
				CError.parse_error(CError.E_EOF,m_input.m_line_number);
				return states;
			      }
			  }
		      }
		    
		    if (',' != m_input.m_line[m_input.m_line_index])
		      {
			break;
		      }

		    ++m_input.m_line_index;
		  }

		if ('>' == m_input.m_line[m_input.m_line_index])
		  {
		    ++m_input.m_line_index;
		    if (m_input.m_line_index < m_input.m_line_read)
		      {
			m_advance_stop = true;
		      }
		    return states;
		  }

		/* Read in state name. */
		start_state = m_input.m_line_index;
		while (false == CUtility.isspace(m_input.m_line[m_input.m_line_index])
		       && ',' != m_input.m_line[m_input.m_line_index]
		       && '>' != m_input.m_line[m_input.m_line_index])
		  {
		    ++m_input.m_line_index;

		    if (m_input.m_line_index >= m_input.m_line_read)
		      {
			/* End of line means end of state name. */
			break;
		      }
		  }
		count_state = m_input.m_line_index - start_state;

		/* Save name after checking definition. */
		name = new String(m_input.m_line,
				  start_state,
				  count_state);
		index = (Integer) m_spec.m_states.get(name);
		if (null == index)
		  {
		    /* Uninitialized state. */
		    System.out.println("Uninitialized State Name: " + name);
		    CError.parse_error(CError.E_STATE,m_input.m_line_number);
		  }
		states.set(index.intValue());
	      }
	  }
	
	if (null == all_states)
	  {
	    all_states = new SparseBitSet();

	    size = m_spec.m_states.size();
	    for (i = 0; i < size; ++i)
	      {
		all_states.set(i);
	      }
	  }
	
	if (m_input.m_line_index < m_input.m_line_read)
	  {
	    m_advance_stop = true;
	  }
	return all_states;
      }

  /********************************************************
    Function: expandMacro
    Description: Returns false on error, true otherwise. 
    *******************************************************/
  private boolean expandMacro
    (
     )
      {
	int elem;
	int start_macro;
	int end_macro;
	int start_name;
	int count_name;
	String def;
	int def_elem;
	String name;
	char replace[];
	int rep_elem;

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	  }

	/* Check for macro. */
	if ('{' != m_input.m_line[m_input.m_line_index])
	  {
	    CError.parse_error(CError.E_INTERNAL,m_input.m_line_number);
	    return ERROR;
	  }
	
	start_macro = m_input.m_line_index;
	elem = m_input.m_line_index + 1;
	if (elem >= m_input.m_line_read)
	  {
	    CError.impos("Unfinished macro name");
	    return ERROR;
	  }
	
	/* Get macro name. */
	start_name = elem;
	while ('}' != m_input.m_line[elem])
	  {
	    ++elem;
	    if (elem >= m_input.m_line_read)
	      {
		CError.impos("Unfinished macro name at line " 
			     + m_input.m_line_number);
		return ERROR;
	      }
	  }
	count_name = elem - start_name;
	end_macro = elem;

	/* Check macro name. */
	if (0 == count_name)
	  {
	    CError.impos("Nonexistent macro name");
	    return ERROR;
	  }

	/* Debug checks. */
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(0 < count_name);
	  }

	/* Retrieve macro definition. */
	name = new String(m_input.m_line,start_name,count_name);
	def = (String) m_spec.m_macros.get(name);
	if (null == def)
	  {
	    /*CError.impos("Undefined macro \"" + name + "\".");*/
	    System.out.println("Error: Undefined macro \"" + name + "\".");
	    CError.parse_error(CError.E_NOMAC, m_input.m_line_number);
	    return ERROR;
	  }
	if (CUtility.OLD_DUMP_DEBUG)
	  {
	    System.out.println("expanded escape: " + def);
	  }
		
	/* Replace macro in new buffer,
	   beginning by copying first part of line buffer. */
	replace = new char[m_input.m_line.length];
	for (rep_elem = 0; rep_elem < start_macro; ++rep_elem)
	  {
	    replace[rep_elem] = m_input.m_line[rep_elem];

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(rep_elem < replace.length);
	      }
	  }
	
	/* Copy macro definition. */
	if (rep_elem >= replace.length)
	  {
	    replace = CUtility.doubleSize(replace);
	  }
	for (def_elem = 0; def_elem < def.length(); ++def_elem)
	  {
	    replace[rep_elem] = def.charAt(def_elem);
	    
	    ++rep_elem;
	    if (rep_elem >= replace.length)
	      {
		replace = CUtility.doubleSize(replace);
	      }
	  }

	/* Copy last part of line. */
       	if (rep_elem >= replace.length)
	  {
	    replace = CUtility.doubleSize(replace);
	  }
	for (elem = end_macro + 1; elem < m_input.m_line_read; ++elem)
	  {
	    replace[rep_elem] = m_input.m_line[elem];
	    
	    ++rep_elem;
	    if (rep_elem >= replace.length)
	      {
		replace = CUtility.doubleSize(replace);
	      }
	  } 
	
	/* Replace buffer. */
	m_input.m_line = replace;
	m_input.m_line_read = rep_elem;
	
	if (CUtility.OLD_DEBUG)
	  {
	    System.out.println(new String(m_input.m_line,0,m_input.m_line_read));
	  }
	return NOT_ERROR;
      }

  /***************************************************************
    Function: saveMacro
    Description: Saves macro definition of form:
    macro_name = macro_definition
    **************************************************************/
  private void saveMacro
    (
     )
      {
	int elem;
	int start_name;
	int count_name;
	int start_def;
	int count_def;
	boolean saw_escape;
	boolean in_quote;
	boolean in_ccl;

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	  }

	/* Macro declarations are of the following form:
	   macro_name macro_definition */

	elem = 0;
	
	/* Skip white space preceding macro name. */
	while (CUtility.isspace(m_input.m_line[elem]))
	  {
	    ++elem;
	    if (elem >= m_input.m_line_read)
	      {
		/* End of line has been reached,
		   and line was found to be empty. */
		return;
	      }
	  }

	/* Read macro name. */
	start_name = elem;
	while (false == CUtility.isspace(m_input.m_line[elem])
	       && '=' != m_input.m_line[elem])
	  {
	    ++elem;
	    if (elem >= m_input.m_line_read)
	      {
		/* Macro name but no associated definition. */
		CError.parse_error(CError.E_MACDEF,m_input.m_line_number);
	      }
	  }
	count_name = elem - start_name;

	/* Check macro name. */
	if (0 == count_name) 
	  {
	    /* Nonexistent macro name. */
	    CError.parse_error(CError.E_MACDEF,m_input.m_line_number);
	  }

	/* Skip white space between name and definition. */
	while (CUtility.isspace(m_input.m_line[elem]))
	  {
	    ++elem;
	    if (elem >= m_input.m_line_read)
	      {
		/* Macro name but no associated definition. */
		CError.parse_error(CError.E_MACDEF,m_input.m_line_number);
	      }
	  }

	if ('=' == m_input.m_line[elem])
	  {
	    ++elem;
	    if (elem >= m_input.m_line_read)
	      {
		/* Macro name but no associated definition. */
		CError.parse_error(CError.E_MACDEF,m_input.m_line_number);
	      }
	  }
	else /* macro definition without = */
		CError.parse_error(CError.E_MACDEF,m_input.m_line_number);

	/* Skip white space between name and definition. */
	while (CUtility.isspace(m_input.m_line[elem]))
	  {
	    ++elem;
	    if (elem >= m_input.m_line_read)
	      {
		/* Macro name but no associated definition. */
		CError.parse_error(CError.E_MACDEF,m_input.m_line_number);
	      }
	  }

	/* Read macro definition. */
	start_def = elem;
	in_quote = false;
	in_ccl = false;
	saw_escape = false;
	while (false == CUtility.isspace(m_input.m_line[elem])
	       || true == in_quote
	       || true == in_ccl
	       || true == saw_escape)
	  {
	    if ('\"' == m_input.m_line[elem] && false == saw_escape)
	      {
		in_quote = !in_quote;
	      }
	    
	    if ('\\' == m_input.m_line[elem] && false == saw_escape)
	      {
		saw_escape = true;
	      }
	    else
	      {
		saw_escape = false;
	      }
	    if (false == saw_escape && false == in_quote) { // CSA, 24-jul-99
	      if ('[' == m_input.m_line[elem] && false == in_ccl)
		in_ccl = true;
	      if (']' == m_input.m_line[elem] && true == in_ccl)
		in_ccl = false;
	    }

	    ++elem;
	    if (elem >= m_input.m_line_read)
	      {
		/* End of line. */
		break;
	      }
	  }
	count_def = elem - start_def;
	  
	/* Check macro definition. */
	if (0 == count_def) 
	  {
	    /* Nonexistent macro name. */
	    CError.parse_error(CError.E_MACDEF,m_input.m_line_number);
	  }

	/* Debug checks. */
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(0 < count_def);
	    CUtility.ASSERT(0 < count_name);
	    CUtility.ASSERT(null != m_spec.m_macros);
	  }

	if (CUtility.OLD_DEBUG)
	  {
	    System.out.println("macro name \""
			       + new String(m_input.m_line,start_name,count_name)
			       + "\".");
	    System.out.println("macro definition \""
			       + new String(m_input.m_line,start_def,count_def)
			       + "\".");
	  }

	/* Add macro name and definition to table. */
	m_spec.m_macros.put(new String(m_input.m_line,start_name,count_name),
			    new String(m_input.m_line,start_def,count_def));
      }

  /***************************************************************
    Function: saveStates
    Description: Takes state declaration and makes entries
    for them in state hashtable in CSpec structure.
    State declaration should be of the form:
    %state name0[, name1, name2 ...]
    (But commas are actually optional as long as there is 
    white space in between them.)
    **************************************************************/
  private void saveStates
    (
     )
      {
	int start_state;
	int count_state;

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	  }

	/* EOF found? */
	if (m_input.m_eof_reached)
	  {
	    return;
	  }

	/* Debug checks. */
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT('%' == m_input.m_line[0]);
	    CUtility.ASSERT('s' == m_input.m_line[1]);
	    CUtility.ASSERT(m_input.m_line_index <= m_input.m_line_read);
	    CUtility.ASSERT(0 <= m_input.m_line_index);
	    CUtility.ASSERT(0 <= m_input.m_line_read);
	  }

	/* Blank line?  No states? */
	if (m_input.m_line_index >= m_input.m_line_read)
	  {
	    return;
	  }

	while (m_input.m_line_index < m_input.m_line_read)
	  {
	    if (CUtility.OLD_DEBUG)
	      {
		System.out.println("line read " + m_input.m_line_read 
				   + "\tline index = " + m_input.m_line_index);
	      }

	    /* Skip white space. */
	    while (CUtility.isspace(m_input.m_line[m_input.m_line_index]))
	      {
		++m_input.m_line_index;
		if (m_input.m_line_index >= m_input.m_line_read)
		  {
		    /* No more states to be found. */
		    return;
		  }
	      }
	    
	    /* Look for state name. */
	    start_state = m_input.m_line_index;
	    while (false == CUtility.isspace(m_input.m_line[m_input.m_line_index])
		   && ',' != m_input.m_line[m_input.m_line_index])
	      {
		++m_input.m_line_index;
		if (m_input.m_line_index >= m_input.m_line_read)
		  {
		    /* End of line and end of state name. */
		    break;
		  }
	      }
	    count_state = m_input.m_line_index - start_state;

	    if (CUtility.OLD_DEBUG)
	      {
		System.out.println("State name \"" 
				   + new String(m_input.m_line,start_state,count_state)
				   + "\".");
		System.out.println("Integer index \"" 
				   + m_spec.m_states.size()
				   + "\".");
	      }

	    /* Enter new state name, along with unique index. */
	    m_spec.m_states.put(new String(m_input.m_line,start_state,count_state),
				new Integer(m_spec.m_states.size()));
	    
	    /* Skip comma. */
	    if (',' == m_input.m_line[m_input.m_line_index])
	      {
		++m_input.m_line_index;
		if (m_input.m_line_index >= m_input.m_line_read)
		  {
		    /* End of line. */
		    return;
		  }
	      }
	  }
      }

  /********************************************************
    Function: expandEscape
    Description: Takes escape sequence and returns
    corresponding character code.
    *******************************************************/
  private char expandEscape
    (
     )
      {
	char r;
	
	/* Debug checks. */
	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(m_input.m_line_index < m_input.m_line_read);
	    CUtility.ASSERT(0 < m_input.m_line_read);
	    CUtility.ASSERT(0 <= m_input.m_line_index);
	  }

	if ('\\' != m_input.m_line[m_input.m_line_index])
	  {
	    ++m_input.m_line_index;
	    return m_input.m_line[m_input.m_line_index - 1];
	  }
	else
	  {
	    boolean unicode_escape = false;
	    ++m_input.m_line_index;
	    switch (m_input.m_line[m_input.m_line_index])
	      {
	      case 'b':
		++m_input.m_line_index;
		return '\b';

	      case 't':
		++m_input.m_line_index;
		return '\t';

	      case 'n':
		++m_input.m_line_index;
		return '\n';

	      case 'f':
		++m_input.m_line_index;
		return '\f';

	      case 'r':
		++m_input.m_line_index;
		return '\r';

	      case '^':
		++m_input.m_line_index;
		r=Character.toUpperCase(m_input.m_line[m_input.m_line_index]);
		if (r<'@' || r>'Z') // non-fatal
		    CError.parse_error(CError.E_BADCTRL,m_input.m_line_number);
		r = (char) (r - '@');
		++m_input.m_line_index;
		return r;

	      case 'u':
		unicode_escape = true;
	      case 'x':
		++m_input.m_line_index;
		r = 0;
		for (int i=0; i<(unicode_escape?4:2); i++)
		  if (CUtility.ishexdigit(m_input.m_line[m_input.m_line_index]))
		    {
		      r = (char) (r << 4);
		      r = (char) (r | CUtility.hex2bin(m_input.m_line[m_input.m_line_index]));
		      ++m_input.m_line_index;
		    }
		  else break;
		
		return r;
		
	      default:
		if (false == CUtility.isoctdigit(m_input.m_line[m_input.m_line_index]))
		  {
		    r = m_input.m_line[m_input.m_line_index];
		    ++m_input.m_line_index;
		  }
		else
		  {
		    r = 0;
		    for (int i=0; i<3; i++)
		      if (CUtility.isoctdigit(m_input.m_line[m_input.m_line_index]))
			{
			  r = (char) (r << 3);
			  r = (char) (r | CUtility.oct2bin(m_input.m_line[m_input.m_line_index]));
			  ++m_input.m_line_index;
			}
		      else break;
		  }
		return r;
	      }
	  }
      }
	
  /********************************************************
    Function: packAccept
    Description: Packages and returns CAccept 
    for action next in input stream.
    *******************************************************/
  CAccept packAccept
    (
     )
      throws java.io.IOException
      {
	CAccept accept;
	char action[];
	int action_index;
	int brackets;
	boolean insinglequotes;
	boolean indoublequotes;
	boolean instarcomment;
	boolean inslashcomment;
	boolean escaped;
	boolean slashed;

	action = new char[BUFFER_SIZE];
	action_index = 0;

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != this);
	    CUtility.ASSERT(null != m_outstream);
	    CUtility.ASSERT(null != m_input);
	    CUtility.ASSERT(null != m_tokens);
	    CUtility.ASSERT(null != m_spec);
	  }

	/* Get a new line, if needed. */
	while (m_input.m_line_index >= m_input.m_line_read)
	  {
	    if (m_input.getLine())
	      {
		CError.parse_error(CError.E_EOF,m_input.m_line_number);
		return null;
	      }
	  }
	
	/* Look for beginning of action. */
	while (CUtility.isspace(m_input.m_line[m_input.m_line_index]))
	  {
	    ++m_input.m_line_index;
	    
	    /* Get a new line, if needed. */
	    while (m_input.m_line_index >= m_input.m_line_read)
	      {
		if (m_input.getLine())
		  {
		    CError.parse_error(CError.E_EOF,m_input.m_line_number);
		    return null;
		  }
	      }
	  }
	
	/* Look for brackets. */
	if ('{' != m_input.m_line[m_input.m_line_index])
	  {
	    CError.parse_error(CError.E_BRACE,m_input.m_line_number); 
	  }
	
	/* Copy new line into action buffer. */
	brackets = 0;
	insinglequotes = indoublequotes = inslashcomment = instarcomment =
	escaped  = slashed = false;
	while (true)
	  {
	    action[action_index] = m_input.m_line[m_input.m_line_index];

	    /* Look for quotes. */
	    if ((insinglequotes || indoublequotes) && escaped)
		escaped=false; // only protects one char, but this is enough.
	    else if ((insinglequotes || indoublequotes) &&
		     '\\' == m_input.m_line[m_input.m_line_index])
		escaped=true;
	    else if (!(insinglequotes || inslashcomment || instarcomment) &&
		     '\"' == m_input.m_line[m_input.m_line_index])
		indoublequotes=!indoublequotes; // unescaped double quote.
	    else if (!(indoublequotes || inslashcomment || instarcomment) &&
		     '\'' == m_input.m_line[m_input.m_line_index])
		insinglequotes=!insinglequotes; // unescaped single quote.
	    /* Look for comments. */
	    if (instarcomment) { // inside "/*" comment; look for "*/"
		if (slashed && '/' == m_input.m_line[m_input.m_line_index])
		    instarcomment = slashed = false;
		else // note that inside a star comment, slashed means starred
		    slashed = ('*' == m_input.m_line[m_input.m_line_index]);
	    } else if (!inslashcomment && !insinglequotes && !indoublequotes) {
	        // not in comment, look for /* or //
		inslashcomment = 
		    (slashed && '/' == m_input.m_line[m_input.m_line_index]);
		instarcomment =
		    (slashed && '*' == m_input.m_line[m_input.m_line_index]);
		slashed = ('/' == m_input.m_line[m_input.m_line_index]);
	    }

	    /* Look for brackets. */
	    if (!insinglequotes && !indoublequotes &&
		!instarcomment && !inslashcomment) {
	      if ('{' == m_input.m_line[m_input.m_line_index])
		{
		  ++brackets;
		}
	      else if ('}' == m_input.m_line[m_input.m_line_index])
		{
		  --brackets;
		
		  if (0 == brackets)
		    {
		      ++action_index;
		      ++m_input.m_line_index;

		      break;
		    }
		}
	    }
	    
	    ++action_index;
	    /* Double the buffer size, if needed. */
	    if (action_index >= action.length)
	      {
		action = CUtility.doubleSize(action);
	      }

	    ++m_input.m_line_index;
	    /* Get a new line, if needed. */
	    while (m_input.m_line_index >= m_input.m_line_read)
	      {
		inslashcomment = slashed = false;
		if (insinglequotes || indoublequotes) { // non-fatal
		    CError.parse_error(CError.E_NEWLINE,m_input.m_line_number);
		    insinglequotes = indoublequotes = false;
		}
		if (m_input.getLine())
		  {
		    CError.parse_error(CError.E_SYNTAX,m_input.m_line_number);
		    return null;
		  }
	      }
	  }
	    
	accept = new CAccept(action,action_index,m_input.m_line_number);

	if (CUtility.DEBUG)
	  {
	    CUtility.ASSERT(null != accept);
	  }

	if (CUtility.DESCENT_DEBUG)
	  {
	    System.out.print("Accepting action:");
	    System.out.println(new String(accept.m_action,0,accept.m_action_read));
	  }

	return accept;
      }

  /********************************************************
    Function: advance
    Description: Returns code for next token.
    *******************************************************/
  private boolean m_advance_stop = false;
  int advance
    (
     )
      throws java.io.IOException
      {
	boolean saw_escape = false;
	Integer code;
	
	/*if (m_input.m_line_index > m_input.m_line_read) {
	  System.out.println("m_input.m_line_index = " + m_input.m_line_index);
	  System.out.println("m_input.m_line_read = " + m_input.m_line_read);
	  CUtility.ASSERT(m_input.m_line_index <= m_input.m_line_read);
	}*/

	if (m_input.m_eof_reached)
	  {
	    /* EOF has already been reached,
	       so return appropriate code. */

	    m_spec.m_current_token = END_OF_INPUT;
	    m_spec.m_lexeme = '\0';
	    return m_spec.m_current_token;
	  }

	/* End of previous regular expression?
	   Refill line buffer? */
	if (EOS == m_spec.m_current_token
	    /* ADDED */
	    || m_input.m_line_index >= m_input.m_line_read)
	    /* ADDED */
	  {
	    if (m_spec.m_in_quote)
	      {
		CError.parse_error(CError.E_SYNTAX,m_input.m_line_number);
	      }
	    
	    while (true)
	      {
		if (false == m_advance_stop  
		    || m_input.m_line_index >= m_input.m_line_read)
		  {
		    if (m_input.getLine())
		      {
			/* EOF has already been reached,
			   so return appropriate code. */
			
			m_spec.m_current_token = END_OF_INPUT;
			m_spec.m_lexeme = '\0';
			return m_spec.m_current_token;
		      }
		    m_input.m_line_index = 0;
		  }
		else
		  {
		    m_advance_stop = false;
		  }

		while (m_input.m_line_index < m_input.m_line_read
		       && true == CUtility.isspace(m_input.m_line[m_input.m_line_index]))
		  {
		    ++m_input.m_line_index;
		  }
		
		if (m_input.m_line_index < m_input.m_line_read)
		  {
		    break;
		  }
	      }
	  }
	
	if (CUtility.DEBUG) {
	  CUtility.ASSERT(m_input.m_line_index <= m_input.m_line_read);
	}

	while (true)
	  {
	    if (false == m_spec.m_in_quote
		&& '{' == m_input.m_line[m_input.m_line_index])
	      {
		if (false == expandMacro())
		  {
		    break;
		  }
	       
		if (m_input.m_line_index >= m_input.m_line_read)
		  {
		    m_spec.m_current_token = EOS;
		    m_spec.m_lexeme = '\0';
		    return m_spec.m_current_token;
		  }
	      }
	    else if ('\"' == m_input.m_line[m_input.m_line_index])
	      {
		m_spec.m_in_quote = !m_spec.m_in_quote;
		++m_input.m_line_index;
		
		if (m_input.m_line_index >= m_input.m_line_read)
		  {
		    m_spec.m_current_token = EOS;
		    m_spec.m_lexeme = '\0';
		    return m_spec.m_current_token;
		  }
	      }
	    else
	      {
		break;
	      }
	  }

	if (m_input.m_line_index > m_input.m_line_read) {
	  System.out.println("m_input.m_line_index = " + m_input.m_line_index);
	  System.out.println("m_input.m_line_read = " + m_input.m_line_read);
	  CUtility.ASSERT(m_input.m_line_index <= m_input.m_line_read);
	}

	/* Look for backslash, and corresponding 
	   escape sequence. */
	if ('\\' == m_input.m_line[m_input.m_line_index])
	  {
	    saw_escape = true;
	  }
	else
	  {
	    saw_escape = false;
	  }

	if (false == m_spec.m_in_quote)
	  {
	    if (false == m_spec.m_in_ccl &&
		CUtility.isspace(m_input.m_line[m_input.m_line_index]))
	      {
		/* White space means the end of 
		   the current regular expression. */

		m_spec.m_current_token = EOS;
		m_spec.m_lexeme = '\0';
		return m_spec.m_current_token;
	      }

	    /* Process escape sequence, if needed. */
	    if (saw_escape)
	      {
		m_spec.m_lexeme = expandEscape();
	      }
	    else
	      {
		m_spec.m_lexeme = m_input.m_line[m_input.m_line_index];
		++m_input.m_line_index;
	      }
	  }
	else
	  {
	    if (saw_escape 
		&& (m_input.m_line_index + 1) < m_input.m_line_read
		&& '\"' == m_input.m_line[m_input.m_line_index + 1])
	      {
		m_spec.m_lexeme = '\"';
		m_input.m_line_index = m_input.m_line_index + 2;
	      }
	    else
	      {
		m_spec.m_lexeme = m_input.m_line[m_input.m_line_index];
		++m_input.m_line_index;
	      }
	  }
	
	code = (Integer) m_tokens.get(new Character(m_spec.m_lexeme));
	if (m_spec.m_in_quote || true == saw_escape)
	  {
	    m_spec.m_current_token = L;
	  }
	else
	  {
	    if (null == code)
	      {
		m_spec.m_current_token = L;
	      }
	    else
	      {
		m_spec.m_current_token = code.intValue();
	      }
	  }

	if (CCL_START == m_spec.m_current_token) m_spec.m_in_ccl = true;
	if (CCL_END   == m_spec.m_current_token) m_spec.m_in_ccl = false;

	if (CUtility.FOODEBUG)
	  {
	    System.out.println("Lexeme: " + m_spec.m_lexeme
			       + "\tToken: " + m_spec.m_current_token
			       + "\tIndex: " + m_input.m_line_index);
	  }

	return m_spec.m_current_token;
      }

  /***************************************************************
    Function: details
    Description: High level debugging routine.
    **************************************************************/
  private void details
    (
     )
      {
	Enumeration names;
	String name;
	String def;
	Enumeration states;
	String state;
	Integer index;
	int elem;
	int size;

	System.out.println();
	System.out.println("\t** Macros **");
	names = m_spec.m_macros.keys();
	while (names.hasMoreElements())
	  {
	    name = (String) names.nextElement();
	    def = (String) m_spec.m_macros.get(name);

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(null != name);
		CUtility.ASSERT(null != def);
	      }

	    System.out.println("Macro name \"" + name 
			       + "\" has definition \"" 
			       + def + "\".");
	  }

	System.out.println();
	System.out.println("\t** States **");
	states = m_spec.m_states.keys();
	while (states.hasMoreElements())
	  {
	    state = (String) states.nextElement();
	    index = (Integer) m_spec.m_states.get(state);

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(null != state);
		CUtility.ASSERT(null != index);
	      }

	    System.out.println("State \"" + state 
			       + "\" has identifying index " 
			       + index.toString() + ".");
	  }
	    
	System.out.println();
	System.out.println("\t** Character Counting **");
	if (false == m_spec.m_count_chars)
	  {
	    System.out.println("Character counting is off.");
	  }
	else
	  {
	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(m_spec.m_count_lines);
	      }

	    System.out.println("Character counting is on.");
	  }

	System.out.println();
	System.out.println("\t** Line Counting **");
	if (false == m_spec.m_count_lines)
	  {
	    System.out.println("Line counting is off.");
	  }
	else
	  {
	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(m_spec.m_count_lines);
	      }

	    System.out.println("Line counting is on.");
	  }

	System.out.println();
	System.out.println("\t** Operating System Specificity **");
	if (false == m_spec.m_unix)
	  {
	    System.out.println("Not generating UNIX-specific code.");
	    System.out.println("(This means that \"\\r\\n\" is a "
			       + "newline, rather than \"\\n\".)");
	  }
	else
	  {
	    System.out.println("Generating UNIX-specific code.");
	    System.out.println("(This means that \"\\n\" is a " 
			       + "newline, rather than \"\\r\\n\".)");
	  }

	System.out.println();
	System.out.println("\t** Java CUP Compatibility **");
	if (false == m_spec.m_cup_compatible)
	  {
	    System.out.println("Generating CUP compatible code.");
	    System.out.println("(Scanner implements "
			       + "java_cup.runtime.Scanner.)");
	  }
	else
	  {
	    System.out.println("Not generating CUP compatible code.");
	  }
	
	if (CUtility.FOODEBUG) {
	  if (null != m_spec.m_nfa_states && null != m_spec.m_nfa_start)
	    {
	      System.out.println();
	      System.out.println("\t** NFA machine **");
	      print_nfa();
	  }
	}

	if (null != m_spec.m_dtrans_vector)
	  {
	    System.out.println();
	    System.out.println("\t** DFA transition table **");
	    /*print_header();*/
	  }

	/*if (null != m_spec.m_accept_vector && null != m_spec.m_anchor_array)
	  {
	    System.out.println();
	    System.out.println("\t** Accept States and Anchor Vector **");
	    print_accept();
	  }*/
      }

  /***************************************************************
    function: print_set
    **************************************************************/
  void print_set
    (
     Vector nfa_set
     )
      {
	int size; 
	int elem;
	CNfa nfa;

	size = nfa_set.size();

	if (0 == size)
	  {
	    System.out.print("empty ");
	  }
	
	for (elem = 0; elem < size; ++elem)
	  {
	    nfa = (CNfa) nfa_set.elementAt(elem);
	    /*System.out.print(m_spec.m_nfa_states.indexOf(nfa) + " ");*/
	    System.out.print(nfa.m_label + " ");
	  }
      }

   /***************************************************************
     Function: print_header
     **************************************************************/
  private void print_header
    (
     )
      {
	Enumeration states;
	int i;
	int j;
	int chars_printed=0;
	CDTrans dtrans;
	int last_transition;
	String str;
	CAccept accept;
	String state;
	Integer index;

	System.out.println("/*---------------------- DFA -----------------------");
	
	states = m_spec.m_states.keys();
	while (states.hasMoreElements())
	  {
	    state = (String) states.nextElement();
	    index = (Integer) m_spec.m_states.get(state);

	    if (CUtility.DEBUG)
	      {
		CUtility.ASSERT(null != state);
		CUtility.ASSERT(null != index);
	      }

	    System.out.println("State \"" + state 
			       + "\" has identifying index " 
			       + index.toString() + ".");

	    i = index.intValue();
	    if (CDTrans.F != m_spec.m_state_dtrans[i])
	      {
		System.out.println("\tStart index in transition table: "
				   + m_spec.m_state_dtrans[i]);
	      }
	    else
	      {
		System.out.println("\tNo associated transition states.");
	      }
	  }

	for (i = 0; i < m_spec.m_dtrans_vector.size(); ++i)
	  {
	    dtrans = (CDTrans) m_spec.m_dtrans_vector.elementAt(i);

	    if (null == m_spec.m_accept_vector && null == m_spec.m_anchor_array)
	      {
		if (null == dtrans.m_accept)
		  {
		    System.out.print(" * State " + i + " [nonaccepting]");
		  }
		else
		  {
		    System.out.print(" * State " + i 
				     + " [accepting, line "
				     + dtrans.m_accept.m_line_number 
				     + " <"
				     + (new String(dtrans.m_accept.m_action,0,
						   dtrans.m_accept.m_action_read))
				     + ">]");
		    if (CSpec.NONE != dtrans.m_anchor)
		      {
			System.out.print(" Anchor: "
					 + ((0 != (dtrans.m_anchor & CSpec.START)) 
					    ? "start " : "")
					 + ((0 != (dtrans.m_anchor & CSpec.END)) 
					    ? "end " : ""));
		      }
		  }
	      }
	    else
	      {
		accept = (CAccept) m_spec.m_accept_vector.elementAt(i);

		if (null == accept)
		  {
		    System.out.print(" * State " + i + " [nonaccepting]");
		  }
		else
		  {
		    System.out.print(" * State " + i 
				     + " [accepting, line "
				     + accept.m_line_number 
				     + " <"
				     + (new String(accept.m_action,0,
						   accept.m_action_read))
				     + ">]");
		    if (CSpec.NONE != m_spec.m_anchor_array[i])
		      {
			System.out.print(" Anchor: "
					 + ((0 != (m_spec.m_anchor_array[i] & CSpec.START)) 
					    ? "start " : "")
					 + ((0 != (m_spec.m_anchor_array[i] & CSpec.END)) 
					    ? "end " : ""));
		      }
		  }
	      }

	    last_transition = -1;
	    for (j = 0; j < m_spec.m_dtrans_ncols; ++j)
	      {
		if (CDTrans.F != dtrans.m_dtrans[j])
		  {
		    if (last_transition != dtrans.m_dtrans[j])
		      {
			System.out.println();
			System.out.print(" *    goto " + dtrans.m_dtrans[j]
					 + " on ");
			chars_printed = 0;
		      }
		    
		    str = interp_int((int) j);
		    System.out.print(str);
				
		    chars_printed = chars_printed + str.length(); 
		    if (56 < chars_printed)
		      {
			System.out.println();
			System.out.print(" *             ");
			chars_printed = 0;
		      }
		    
		    last_transition = dtrans.m_dtrans[j];
		  }
	      }
	    System.out.println();
	  }
	System.out.println(" */");
	System.out.println();
      }
}

/*
 * SparseBitSet 25-Jul-1999.
 * C. Scott Ananian <cananian@alumni.princeton.edu>
 *
 * Re-implementation of the standard java.util.BitSet to support sparse
 * sets, which we need to efficiently support unicode character classes.
 */

/**
 * A set of bits. The set automatically grows as more bits are
 * needed. 
 *
 * @version 	1.00, 25 Jul 1999
 * @author C. Scott Ananian
 */
final class SparseBitSet implements Cloneable {
    /** Sorted array of bit-block offsets. */
    int  offs[];
    /** Array of bit-blocks; each holding BITS bits. */
    long bits[];
    /** Number of blocks currently in use. */
    int size;
    /** log base 2 of BITS, for the identity: x/BITS == x >> LG_BITS */
    static final private int LG_BITS = 6;
    /** Number of bits in a block. */
    static final private int BITS = 1<<LG_BITS;
    /** BITS-1, using the identity: x % BITS == x & (BITS-1) */
    static final private int BITS_M1 = BITS-1;

    /**
     * Creates an empty set.
     */
    public SparseBitSet() {
	bits = new long[4];
	offs = new int [4];
	size = 0;
    }

    /**
     * Creates an empty set with the specified size.
     * @param nbits the size of the set
     */
    public SparseBitSet(int nbits) {
	this();
    }

    /**
     * Creates an empty set with the same size as the given set.
     */
    public SparseBitSet(SparseBitSet set) {
	bits = new long[set.size];
	offs = new int [set.size];
	size = 0;
    }

    private void new_block(int bnum) {
	new_block(bsearch(bnum), bnum);
    }
    private void new_block(int idx, int bnum) {
	if (size==bits.length) { // resize
	    long[] nbits = new long[size*3];
	    int [] noffs = new int [size*3];
	    System.arraycopy(bits, 0, nbits, 0, size);
	    System.arraycopy(offs, 0, noffs, 0, size);
	    bits = nbits;
	    offs = noffs;
	}
	CUtility.ASSERT(size<bits.length);
	insert_block(idx, bnum);
    }
    private void insert_block(int idx, int bnum) {
	CUtility.ASSERT(idx<=size);
	CUtility.ASSERT(idx==size || offs[idx]!=bnum);
	System.arraycopy(bits, idx, bits, idx+1, size-idx);
	System.arraycopy(offs, idx, offs, idx+1, size-idx);
	offs[idx]=bnum;
	bits[idx]=0; //clear them bits.
	size++;
    }
    private int bsearch(int bnum) {
	int l=0, r=size; // search interval is [l, r)
	while (l<r) {
	    int p = (l+r)/2;
	    if (bnum<offs[p]) r=p;
	    else if (bnum>offs[p]) l=p+1;
	    else return p;
	}
	CUtility.ASSERT(l==r);
	return l; // index at which the bnum *should* be, if it's not.
    }
	    
    /**
     * Sets a bit.
     * @param bit the bit to be set
     */
    public void set(int bit) {
	int bnum = bit >> LG_BITS;
	int idx  = bsearch(bnum);
	if (idx >= size || offs[idx]!=bnum)
	    new_block(idx, bnum);
	bits[idx] |= (1L << (bit & BITS_M1) );
    }

    /**
     * Clears a bit.
     * @param bit the bit to be cleared
     */
    public void clear(int bit) {
	int bnum = bit >> LG_BITS;
	int idx  = bsearch(bnum);
	if (idx >= size || offs[idx]!=bnum)
	    new_block(idx, bnum);
	bits[idx] &= ~(1L << (bit & BITS_M1) );
    }

    /**
     * Clears all bits.
     */
    public void clearAll() {
	size = 0;
    }

    /**
     * Gets a bit.
     * @param bit the bit to be gotten
     */
    public boolean get(int bit) {
	int bnum = bit >> LG_BITS;
	int idx  = bsearch(bnum);
	if (idx >= size || offs[idx]!=bnum)
	    return false;
	return 0 != ( bits[idx] & (1L << (bit & BITS_M1) ) );
    }

    /**
     * Logically ANDs this bit set with the specified set of bits.
     * @param set the bit set to be ANDed with
     */
    public void and(SparseBitSet set) {
	binop(this, set, AND);
    }

    /**
     * Logically ORs this bit set with the specified set of bits.
     * @param set the bit set to be ORed with
     */
    public void or(SparseBitSet set) {
	binop(this, set, OR);
    }

    /**
     * Logically XORs this bit set with the specified set of bits.
     * @param set the bit set to be XORed with
     */
    public void xor(SparseBitSet set) {
	binop(this, set, XOR);
    }

    // BINARY OPERATION MACHINERY
    private static interface BinOp {
	public long op(long a, long b);
    }
    private static final BinOp AND = new BinOp() {
	public final long op(long a, long b) { return a & b; }
    };
    private static final BinOp OR = new BinOp() {
	public final long op(long a, long b) { return a | b; }
    };
    private static final BinOp XOR = new BinOp() {
	public final long op(long a, long b) { return a ^ b; }
    };
    private static final void binop(SparseBitSet a, SparseBitSet b, BinOp op) {
	int  nsize = a.size + b.size;
	long[] nbits; 
	int [] noffs;
	int a_zero, a_size;
	// be very clever and avoid allocating more memory if we can.
	if (a.bits.length < nsize) { // oh well, have to make working space.
	    nbits = new long[nsize];
	    noffs = new int [nsize];
	    a_zero  = 0; a_size = a.size;
	} else { // reduce, reuse, recycle!
	    nbits = a.bits;
	    noffs = a.offs;
	    a_zero = a.bits.length - a.size; a_size = a.bits.length;
	    System.arraycopy(a.bits, 0, a.bits, a_zero, a.size);
	    System.arraycopy(a.offs, 0, a.offs, a_zero, a.size);
	}
	// ok, crunch through and binop those sets!
	nsize = 0;
	for (int i=a_zero, j=0; i<a_size || j<b.size; ) {
	    long nb; int no;
	    if (i<a_size && (j>=b.size || a.offs[i] < b.offs[j])) {
		nb = op.op(a.bits[i], 0);
		no = a.offs[i];
		i++;
	    } else if (j<b.size && (i>=a_size || a.offs[i] > b.offs[j])) {
		nb = op.op(0, b.bits[j]);
		no = b.offs[j];
		j++;
	    } else { // equal keys; merge.
		nb = op.op(a.bits[i], b.bits[j]);
		no = a.offs[i];
		i++; j++;
	    }
	    if (nb!=0) {
		nbits[nsize] = nb;
		noffs[nsize] = no;
		nsize++;
	    }
	}
	a.bits = nbits;
	a.offs = noffs;
	a.size = nsize;
    }

    /**
     * Gets the hashcode.
     */
    public int hashCode() {
	long h = 1234;
	for (int i=0; i<size; i++)
	    h ^= bits[i] * offs[i];
	return (int)((h >> 32) ^ h);
    }

    /**
     * Calculates and returns the set's size
     */
    public int size() {
	return (size==0)?0:((1+offs[size-1]) << LG_BITS);
    }

    /**
     * Compares this object against the specified object.
     * @param obj the object to commpare with
     * @return true if the objects are the same; false otherwise.
     */
    public boolean equals(Object obj) {
	if ((obj != null) && (obj instanceof SparseBitSet))
	    return equals(this, (SparseBitSet)obj); 
	return false;
    }
    /**
     * Compares two SparseBitSets for equality.
     * @return true if the objects are the same; false otherwise.
     */
    public static boolean equals(SparseBitSet a, SparseBitSet b) {
	for (int i=0, j=0; i<a.size || j<b.size; ) {
	    if (i<a.size && (j>=b.size || a.offs[i] < b.offs[j])) {
		if (a.bits[i++]!=0) return false;
	    } else if (j<b.size && (i>=a.size || a.offs[i] > b.offs[j])) {
		if (b.bits[j++]!=0) return false;
	    } else { // equal keys
		if (a.bits[i++]!=b.bits[j++]) return false;
	    }
	}
	return true;
    }

    /**
     * Clones the SparseBitSet.
     */
    public Object clone() {
	try { 
	    SparseBitSet set = (SparseBitSet)super.clone();
	    set.bits = (long[]) bits.clone();
	    set.offs = (int []) offs.clone();
	    return set;
	} catch (CloneNotSupportedException e) {
	    // this shouldn't happen, since we are Cloneable
	    throw new InternalError();
	}
    }

    /**
     * Return an <code>Enumeration</code> of <code>Integer</code>s
     * which represent set bit indices in this SparseBitSet.
     */
    public Enumeration elements() {
	return new Enumeration() {
	    int idx=-1, bit=BITS;
	    { advance(); }
	    public boolean hasMoreElements() {
		return (idx<size);
	    }
	    public Object nextElement() {
		int r = bit + (offs[idx] << LG_BITS);
		advance();
		return new Integer(r);
	    }
	    private void advance() {
		while (idx<size) {
		    while (++bit<BITS)
			if (0!=(bits[idx] & (1L<<bit)))
			    return;
		    idx++; bit=-1;
		}
	    }
	};
    }
    /**
     * Converts the SparseBitSet to a String.
     */
    public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append('{');
	for (Enumeration e=elements(); e.hasMoreElements(); ) {
	    if (sb.length() > 1) sb.append(", ");
	    sb.append(e.nextElement());
	}
	sb.append('}');
	return sb.toString();
    }

    /** Check validity. */
    private boolean isValid() {
	if (bits.length!=offs.length) return false;
	if (size>bits.length) return false;
	if (size!=0 && 0<=offs[0]) return false;
	for (int i=1; i<size; i++)
	    if (offs[i] < offs[i-1])
		    return false;
	return true;
    }
    /** Self-test. */
    public static void main(String[] args) {
	final int ITER = 500;
	final int RANGE= 65536;
	SparseBitSet a = new SparseBitSet();
	CUtility.ASSERT(!a.get(0) && !a.get(1));
	CUtility.ASSERT(!a.get(123329));
	a.set(0); CUtility.ASSERT(a.get(0) && !a.get(1));
	a.set(1); CUtility.ASSERT(a.get(0) && a.get(1));
	a.clearAll();
	CUtility.ASSERT(!a.get(0) && !a.get(1));
	java.util.Random r = new java.util.Random();
	java.util.Vector v = new java.util.Vector();
	for (int n=0; n<ITER; n++) {
	    int rr = ((r.nextInt()>>>1) % RANGE) << 1;
	    a.set(rr); v.addElement(new Integer(rr));
	    // check that all the numbers are there.
	    CUtility.ASSERT(a.get(rr) && !a.get(rr+1) && !a.get(rr-1));
	    for (int i=0; i<v.size(); i++)
		CUtility.ASSERT(a.get(((Integer)v.elementAt(i)).intValue()));
	}
	SparseBitSet b = (SparseBitSet) a.clone();
	CUtility.ASSERT(a.equals(b) && b.equals(a));
	for (int n=0; n<ITER/2; n++) {
	    int rr = (r.nextInt()>>>1) % v.size();
	    int m = ((Integer)v.elementAt(rr)).intValue();
	    b.clear(m); v.removeElementAt(rr);
	    // check that numbers are removed properly.
	    CUtility.ASSERT(!b.get(m));
	}
	CUtility.ASSERT(!a.equals(b));
	SparseBitSet c = (SparseBitSet) a.clone();
	SparseBitSet d = (SparseBitSet) a.clone();
	c.and(a);
	CUtility.ASSERT(c.equals(a) && a.equals(c));
	c.xor(a);
	CUtility.ASSERT(!c.equals(a) && c.size()==0);
	d.or(b);
	CUtility.ASSERT(d.equals(a) && !b.equals(d));
	d.and(b);
	CUtility.ASSERT(!d.equals(a) && b.equals(d));
	d.xor(a);
	CUtility.ASSERT(!d.equals(a) && !b.equals(d));
	c.or(d); c.or(b);
	CUtility.ASSERT(c.equals(a) && a.equals(c));
	c = (SparseBitSet) d.clone();
	c.and(b);
	CUtility.ASSERT(c.size()==0);
	System.out.println("Success.");
    }
}

/************************************************************************
  JLEX COPYRIGHT NOTICE, LICENSE AND DISCLAIMER.
  
  Copyright 1996 by Elliot Joel Berk
  
  Permission to use, copy, modify, and distribute this software and its
  documentation for any purpose and without fee is hereby granted,
  provided that the above copyright notice appear in all copies and that
  both the copyright notice and this permission notice and warranty
  disclaimer appear in supporting documentation, and that the name of
  Elliot Joel Berk not be used in advertising or publicity pertaining 
  to distribution of the software without specific, written prior permission.
  
  Elliot Joel Berk disclaims all warranties with regard to this software, 
  including all implied warranties of merchantability and fitness.  In no event
  shall Elliot Joel Berk be liable for any special, indirect or consequential
  damages or any damages whatsoever resulting from loss of use, data or
  profits, whether in an action of contract, negligence or other
  tortious action, arising out of or in connection with the use or
  performance of this software.
  ***********************************************************************/
// set emacs indentation
// Local Variables:
// c-basic-offset:2
// End:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                deps/JLex/SparseBitSet$1.class                                                                      0000666 0002035 0002035 00000000600 14202043766 015377  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 
      <init> ()V Code LineNumberTable op (JJ)J 
SourceFile 	Main.java EnclosingMethod    JLex/SparseBitSet$1   InnerClasses java/lang/Object JLex/SparseBitSet$BinOp BinOp JLex/SparseBitSet 0                     *� �          �  	 
          !�          �                           
                                                                                                                                deps/JLex/SparseBitSet$2.class                                                                      0000666 0002035 0002035 00000000600 14202043766 015400  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 
      <init> ()V Code LineNumberTable op (JJ)J 
SourceFile 	Main.java EnclosingMethod    JLex/SparseBitSet$2   InnerClasses java/lang/Object JLex/SparseBitSet$BinOp BinOp JLex/SparseBitSet 0                     *� �          �  	 
          !��          �                           
                                                                                                                                deps/JLex/SparseBitSet$3.class                                                                      0000666 0002035 0002035 00000000600 14202043766 015401  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 
      <init> ()V Code LineNumberTable op (JJ)J 
SourceFile 	Main.java EnclosingMethod    JLex/SparseBitSet$3   InnerClasses java/lang/Object JLex/SparseBitSet$BinOp BinOp JLex/SparseBitSet 0                     *� �          �  	 
          !��          �                           
                                                                                                                                deps/JLex/SparseBitSet$4.class                                                                      0000666 0002035 0002035 00000001750 14202043766 015411  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 ;	  #
  $	  %	  &
  '	 ! (	 ! ) *
  +	 ! , - 0 1 idx I bit this$0 LJLex/SparseBitSet; <init> (LJLex/SparseBitSet;)V Code LineNumberTable hasMoreElements ()Z StackMapTable nextElement ()Ljava/lang/Object; advance ()V 
SourceFile 	Main.java EnclosingMethod 2 3 4           5  6 7 java/lang/Integer  8 9 : JLex/SparseBitSet$4   InnerClasses java/lang/Object java/util/Enumeration JLex/SparseBitSet elements ()Ljava/util/Enumeration; size offs [I (I)V bits [J                                 9     *+� *� *� *@� *� �          ( 	) *        7     *� *� � � � �          ,     @        B     "*� *� � *� .x`<*� � Y� 	�          / 0 1        �     J*� *� � � >*Y� `Z� @� 	*� � 
*� /
*� y���۱*Y� `� *� ����          4 5 6 67 78 I:      (            ! " /   
                                deps/JLex/SparseBitSet$BinOp.class                                                                  0000666 0002035 0002035 00000000277 14202043766 016260  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3    op (JJ)J 
SourceFile 	Main.java  JLex/SparseBitSet$BinOp BinOp InnerClasses java/lang/Object JLex/SparseBitSet                   
   
    	
                                                                                                                                                                                                                                                                                                                                 deps/JLex/SparseBitSet.class                                                                        0000666 0002035 0002035 00000014343 14202043766 015263  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ����   3 �
 L �	  �	  �	  �
  �
  �
  �
 � �
 � �
  ���������	  �
  �	  �	  � N �      � �
  �
 L �
 � � U
 � � S � �
  � �
  � �
   �
   �
  � � �
   � �
   � � �
   �
   �
  � ��
  �
  � �
 / � �
 1 �
 / �    �
 5 �
 1 �
 1 �
 1 �
 5 �
  �
  �
  �
 1 �
  �
  �
  �
  �	 � � �
 � � �
 F � �
 H � �
 J � � � � BinOp InnerClasses   offs [I bits [J size I LG_BITS ConstantValue    BITS   @ BITS_M1   ? AND LJLex/SparseBitSet$BinOp; OR XOR <init> ()V Code LineNumberTable (I)V (LJLex/SparseBitSet;)V 	new_block (II)V StackMapTable insert_block bsearch (I)I set clear clearAll get (I)Z and or xor binop B(LJLex/SparseBitSet;LJLex/SparseBitSet;LJLex/SparseBitSet$BinOp;)V � � hashCode ()I equals (Ljava/lang/Object;)Z )(LJLex/SparseBitSet;LJLex/SparseBitSet;)Z clone ()Ljava/lang/Object; � elements ()Ljava/util/Enumeration; toString ()Ljava/lang/String; � � isValid ()Z main ([Ljava/lang/String;)V � � <clinit> 
SourceFile 	Main.java c d T U R S V W m n i j � � � � � � l j _ ` w x a ` b ` � � JLex/SparseBitSet }  � � U S $java/lang/CloneNotSupportedException java/lang/InternalError JLex/SparseBitSet$4 c h java/lang/StringBuffer � � � � � � � � | ,  � � � � � � � � r s o g q d java/util/Random java/util/Vector � | java/lang/Integer c g � � V | � � � | } ~ p g � g t h v h u h � � Success. � � � JLex/SparseBitSet$1 JLex/SparseBitSet$2 JLex/SparseBitSet$3 java/lang/Object java/lang/Cloneable JLex/SparseBitSet$BinOp java/util/Enumeration java/lang/System 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V JLex/CUtility ASSERT (Z)V op (JJ)J append (C)Ljava/lang/StringBuffer; hasMoreElements length ,(Ljava/lang/String;)Ljava/lang/StringBuffer; nextElement ,(Ljava/lang/Object;)Ljava/lang/StringBuffer; nextInt 
addElement (Ljava/lang/Object;)V 	elementAt (I)Ljava/lang/Object; intValue removeElementAt out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V 0  L  M 	   R S     T U     V W    X W  Y    Z  [ W  Y    \  ] W  Y    ^  _ `    a `    b `     c d  e   @     *� *�� *�
� *� �    f      0 1 2 3 4  c g  e   !     *� �    f   
   ; <  c h  e   F     *� *+� �� *+� �
� *� �    f      A B C D E  i g  e   '     **� � �    f   
   H 
I  i j  e   �     b*� *� �� >*� h�N*� h�
:*� -*� � *� *� � *-� *� *� *� �� � � 	*� 
�    f   * 
  K L M N -O <P AQ GS [T aU k    � G@  l j  e   �     m*� � � � 	*� � *� .� � � 	*� *� `*� d� *� *� `*� d� *� O*� 	P*Y� `� �    f   "   W X *Y ?Z T[ [\ b] l^ k   	 @@  m n  e   �     L=*� >� 4`l6*� .� 	>� *� .� `=� ����� � � 	�    f   & 	  ` a b c $d 7e :f =g Jh k    � � � @  o g  e   m     3z=*� >*� � *� .� 	*� *� \/
?~y�P�    f      p q r s #t 2u k    �   p g  e   q     7z=*� >*� � *� .� 	*� *� \/
?~y �P�    f      | } ~  #� 6� k    �   q d  e   "     *� �    f   
   � �  r s  e   p     7z=*� >*� � *� .� �	*� /
?~y�� � �    f      � � � � � k    � @  t h  e   %     	*+� � �    f   
   � �  u h  e   %     	*+� � �    f   
   � �  v h  e   %     	*+� � �    f   
   � �  w x  e  #    U*� +� `>*� �� �:�
:6*� 6� F*� :*� :*� �*� d6*� �6*� *� *� � *� *� *� � >66	� 	+� � �� <	+� � *� .+� 	.� ",*� /	�  7
*� .6�� h	+� � :� *� .+� 	.� ",	+� 	/�  7
+� 	.6�	� (,*� /+� 	/�  7
*� .6��	
	�� 
PO���5*� *� *� �    f   �    � 
� � � � )� /� 5� H� Z� l� n� �� �� �� �� �� �� �� ����$�*�1�7�=�@�C�I�O�T� k   4 � )� B  y y z    �   � $� �   { |  e   e     - @>*� � *� /*� .�i�@���� {���    f      � � � � %� k   
 � �   V |  e   ?     *� � � *� *� d.`x�    f      � k    O  } ~  e   ?     +� +� � *+� � ��    f      �    k     	 }   e   �     �=>*� � +� � y*� � *+� � *� .+� .� *� �/	�����+� � **� � *� .+� .� +� �/	�����*� �/+� �/�����    f       	 3
 C b r � k    � �   � �  e   u     5*� � L+*� � � � � +*� � � � � +�L� Y� �    + ,   f         * , - k    l �  � �  e   !     	� Y*� �    f      (  � �  e   �     F�  Y� !L+{� "W*� #M,� $ �  +� %� 
+&� 'W+,� ( � )W���+}� "W+� *�    f      A B C D ,E :G AH k    �  � ��   � �  e   �     U*� �*� �� �*� *� �� �*� � *� .� �<*� � *� .*� d.� ������    f   "   M N O 0P :Q KR MP SS k    � �  	 � �  e  �  
  �� Y� N-� +� -� +� � � 	-,� +� � � 	-� --� +� -� +� � � 	-� --� +� -� +� � � 	-� .-� +� -� +� � � 	� /Y� 0:� 1Y� 2:6�� y� 3|4px6-� -� 5Y� 6� 7-� +� -`� +� -d� +� � � 	6� 8� -� 9� 5� :� +� 	���߄���-� ;� :-� <� -� <� � � 	6 �� G� 3|� 8p6� 9� 5� :6		� =� >	� +� � � 	����-� <� � � 	-� ;� :-� ;� :-� ?-� <� -� <� � � 	-� @-� <� � A� � � 	� B-� <� � <� � � 	� ?-� <� � <� � � 	-� @-� <� � <� � � 	� B� B-� <� -� <� � � 	� ;� :� ?� A� � � 	� CD� E�    f   � -  Y Z  [ 1\ N] k^ o_ �` �a �b �c �d �f �g �hgbj#k=lHmWnfotq�l�s�t�u�v�w�x�y�z�{|}2~8S�a�{��������� k   h &�    y@@@@@�  � �� L@� � #� �  y@� � A@� @� 0 y y@@ @ @@&@@  � d  e   ?      � FY� G� � HY� I� � JY� K� �    f      � 
� �  �    � P   *  N  O
        J      H      F                                                                                                                                                                                                                                                                                                  DuplicateSymException.java                                                                          0000666 0002035 0002035 00000000072 14222101202 015164  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  public class DuplicateSymException extends Exception {
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                      EmptySymTableException.java                                                                         0000666 0002035 0002035 00000000073 14222101211 015321  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  public class EmptySymTableException extends Exception {
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ErrMsg.java                                                                                         0000666 0002035 0002035 00000001536 14202047561 012126  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  /**
 * ErrMsg
 *
 * This class is used to generate warning and fatal error messages.
 */
class ErrMsg {
    /**
     * Generates a fatal error message.
     * @param lineNum line number for error location
     * @param charNum character number (i.e., column) for error location
     * @param msg associated message for error
     */
    static void fatal(int lineNum, int charNum, String msg) {
        System.err.println(lineNum + ":" + charNum + " ****ERROR**** " + msg);
    }

    /**
     * Generates a warning message.
     * @param lineNum line number for warning location
     * @param charNum character number (i.e., column) for warning location
     * @param msg associated message for warning
     */
    static void warn(int lineNum, int charNum, String msg) {
        System.err.println(lineNum + ":" + charNum + " ****WARNING**** " + msg);
    }
}
                                                                                                                                                                  Makefile                                                                                            0000666 0002035 0002035 00000003154 14222100405 011507  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  ###
# This Makefile can be used to make a parser for the minim language
# (parser.class) and to make a program (P4.class) that tests the 
# parser and the unparse and name-analysis methods in ast.java.
#
# make clean removes all generated files
#
###

JC = javac
FLAGS = -g  
CP = ./deps:.

P4.class: P4.java parser.class Yylex.class ASTnode.class
	$(JC) $(FLAGS) -cp $(CP) P4.java

parser.class: parser.java ASTnode.class Yylex.class ErrMsg.class
	$(JC) $(FLAGS) -cp $(CP) parser.java

parser.java: minim.cup
	java -cp $(CP) java_cup.Main < minim.cup

Yylex.class: minim.jlex.java sym.class ErrMsg.class
	$(JC) $(FLAGS) -cp $(CP) minim.jlex.java

ASTnode.class: ast.java SymTable.class
	$(JC) $(FLAGS) -cp $(CP) ast.java

minim.jlex.java: minim.jlex sym.class
	java -cp $(CP) JLex.Main minim.jlex

sym.class: sym.java
	$(JC) $(FLAGS) -cp $(CP) sym.java

sym.java: minim.cup
	java -cp $(CP) java_cup.Main < minim.cup

ErrMsg.class: ErrMsg.java
	$(JC) $(FLAGS) -cp $(CP) ErrMsg.java

Sym.class: Sym.java
	$(JC) $(FLAGS) -cp $(CP) Sym.java

SymTable.class: SymTable.java Sym.class DuplicateSymException.class EmptySymTableException.class
	$(JC) $(FLAGS) -cp $(CP) SymTable.java

DuplicateSymException.class: DuplicateSymException.java
	$(JC) $(FLAGS) -cp $(CP) DuplicateSymException.java

EmptySymTableException.class: EmptySymTableException.java
	$(JC) $(FLAGS) -cp $(CP) EmptySymTableException.java

##test
test:
	java -cp $(CP) P4 nameErrors.minim nameErrors.out
	java -cp $(CP) P4 test.minim test.out

###
# clean
###
clean:
	rm -f *~ *.class parser.java minim.jlex.java sym.java

## cleantest (delete test artifacts)
cleantest:
	rm -f *.out
                                                                                                                                                                                                                                                                                                                                                                                                                    minim.cup                                                                                           0000666 0002035 0002035 00000026205 14222073474 011712  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  /**********************************************************************
 Java CUP specification for a parser for minim programs
 **********************************************************************/

import java_cup.runtime.*;
import java.util.*;

/* The code below redefines method syntax_error to give better error messages
 * than just "Syntax error"
 */
parser code {:

public void syntax_error(Symbol currToken) {
    if (currToken.value == null) {
        ErrMsg.fatal(0,0, "Syntax error at end of file");
    }
    else {
        ErrMsg.fatal(((TokenVal)currToken.value).lineNum,
                     ((TokenVal)currToken.value).charNum,
                     "Syntax error");
    }
    System.exit(-1);
}
:};


/* Terminals (tokens returned by the scanner) */
terminal                INT;
terminal                BOOL;
terminal                VOID;
terminal TokenVal       TRUE;
terminal TokenVal       FALSE;
terminal                STRUCT;
terminal                INPUT;
terminal                DISP;
terminal                IF;
terminal                ELSE;
terminal                WHILE;
terminal                RETURN;
terminal IdTokenVal     ID;
terminal IntLitTokenVal INTLITERAL;
terminal StrLitTokenVal STRINGLITERAL;
terminal                LCURLY;
terminal                RCURLY;
terminal                LPAREN;
terminal                RPAREN;
terminal                SEMICOLON;
terminal                COMMA;
terminal                DOT;
terminal                WRITE;
terminal                READ;
terminal                PLUSPLUS;
terminal                MINUSMINUS;
terminal                PLUS;
terminal                MINUS;
terminal                TIMES;
terminal                DIVIDE;
terminal                NOT;
terminal                AND;
terminal                OR;
terminal                EQUALS;
terminal                NOTEQUALS;
terminal                LESS;
terminal                GREATER;
terminal                LESSEQ;
terminal                GREATEREQ;
terminal                ASSIGN;


/* Nonterminals */
non terminal ProgramNode      program;
non terminal LinkedList       declList;
non terminal DeclNode         decl;
non terminal LinkedList       varDeclList;
non terminal VarDeclNode      varDecl;
non terminal FnDeclNode       fnDecl;
non terminal StructDeclNode   structDecl;
non terminal LinkedList       structBody;
non terminal LinkedList       formals;
non terminal LinkedList       formalsList;
non terminal FormalDeclNode   formalDecl;
non terminal FnBodyNode       fnBody;
non terminal LinkedList       stmtList;
non terminal StmtNode         stmt;
non terminal AssignExpNode    assignExp;
non terminal ExpNode          exp;
non terminal ExpNode          term;
non terminal CallExpNode      fncall;
non terminal LinkedList       actualList;
non terminal TypeNode         type;
non terminal ExpNode          loc;
non terminal IdNode           id;
 
 
/* Precedence and associativity declarations */
precedence right ASSIGN;
precedence left OR;
precedence left AND;
precedence nonassoc EQUALS, NOTEQUALS, LESS, GREATER, LESSEQ, GREATEREQ;
precedence left PLUS, MINUS;
precedence left TIMES, DIVIDE;
precedence right NOT;

start with program;


/* Grammar with actions */
program         ::= declList: d
                {: RESULT = new ProgramNode(new DeclListNode(d));
                :}
                ;

declList        ::= declList:dl decl:d
                {: dl.addLast(d);
                   RESULT = dl;
                :}
                | /* epsilon */
                {: RESULT = new LinkedList<DeclNode>();
                :}
                ;

decl            ::= varDecl:v
                {: RESULT = v;
                :}
                | fnDecl:f
                {: RESULT = f;
                :}
                | structDecl:s
                {: RESULT = s;
                :}				
                ;

varDeclList     ::= varDeclList:vdl varDecl:vd
                {: vdl.addLast(vd);
                   RESULT = vdl;
                :}
                | /* epsilon */
                {: RESULT = new LinkedList<VarDeclNode>();
                :}
                ;

varDecl         ::= type:t id:i SEMICOLON
                {: RESULT = new VarDeclNode(t, i, VarDeclNode.NOT_STRUCT);
                :}
                | STRUCT id:t id:i SEMICOLON
                {: RESULT = new VarDeclNode(new StructNode(t), i, 0);
                :}
                ;

fnDecl          ::= type:t id:i formals:f fnBody:fb
                {: RESULT = new FnDeclNode(t, i, new FormalsListNode(f), fb);
                :}
                ;

structDecl      ::= STRUCT id:i LCURLY structBody:sb RCURLY SEMICOLON
                {: RESULT = new StructDeclNode(i, new DeclListNode(sb));
                :}
                ;

structBody      ::=  structBody:sb varDecl:vd 
                {: sb.addLast(vd);
                   RESULT = sb;
                :}
                | varDecl:vd
                {: LinkedList<VarDeclNode> list = 
				                           new LinkedList<VarDeclNode>();
                   list.addLast(vd);
                   RESULT = list;
                :}
                ;

formals         ::= LPAREN RPAREN
                {: RESULT = new LinkedList<FormalDeclNode>();
                :}
                | LPAREN formalsList:fl RPAREN
                {: RESULT = fl;
                :}
                ;

formalsList     ::= formalDecl:fd
                {: LinkedList<FormalDeclNode> list = 
				                              new LinkedList<FormalDeclNode>();
                   list.addLast(fd);
                   RESULT = list;
                :}
                | formalDecl:fd COMMA formalsList:fl
                {: fl.addFirst(fd);
                   RESULT = fl;
                :}

                ;

formalDecl      ::= type:t id:i
                {: RESULT = new FormalDeclNode(t, i);
                :}
                ;

fnBody          ::= LCURLY varDeclList:vdl stmtList:sl RCURLY
                {: RESULT = new FnBodyNode(
                            new DeclListNode(vdl), new StmtListNode(sl));
                :}
                ;

stmtList        ::= stmtList:sl stmt:s
                {: sl.addLast(s);
				   RESULT = sl;
                :}
                | /* epsilon */
                {: RESULT = new LinkedList<StmtNode>();
                :}
                ;

stmt            ::= assignExp:ae SEMICOLON
                {: RESULT = new AssignStmtNode(ae);
				:}
                | loc:lc PLUSPLUS SEMICOLON
                {: RESULT = new PostIncStmtNode(lc);
                :}
                | loc:lc MINUSMINUS SEMICOLON
                {: RESULT = new PostDecStmtNode(lc);
                :}
                | INPUT READ loc:lc SEMICOLON
                {: RESULT = new ReadStmtNode(lc);
                :}				
                | DISP WRITE exp:e SEMICOLON
                {: RESULT = new WriteStmtNode(e);
                :}				
                | IF exp:e LCURLY varDeclList:vdl stmtList:sl RCURLY
                {: RESULT = new IfStmtNode(e, 
				                new DeclListNode(vdl), new StmtListNode(sl));
                :}				
                | IF exp:e LCURLY varDeclList:vdlt stmtList:slt RCURLY ELSE LCURLY varDeclList:vdle stmtList:sle RCURLY
                {: RESULT = new IfElseStmtNode(e, 
				                new DeclListNode(vdlt), new StmtListNode(slt),
								new DeclListNode(vdle), new StmtListNode(sle));
                :}	
                | WHILE exp:e LCURLY varDeclList:vdl stmtList:sl RCURLY
                {: RESULT = new WhileStmtNode(e, 
				                new DeclListNode(vdl), new StmtListNode(sl));
                :}				
                | RETURN exp:e SEMICOLON
                {: RESULT = new ReturnStmtNode(e);
                :}
				| RETURN SEMICOLON
                {: RESULT = new ReturnStmtNode(null);
                :}
				| fncall:f SEMICOLON
				{: RESULT = new CallStmtNode(f);
				:}
                ;				

assignExp       ::= loc:lc ASSIGN exp:e
                {: RESULT = new AssignExpNode(lc, e);
				:}
				;
				
exp             ::= assignExp:ae
                {: RESULT = ae;
				:}
                | exp:e1 PLUS exp:e2
                {: RESULT = new PlusNode(e1, e2);
                :}				
                | exp:e1 MINUS exp:e2
                {: RESULT = new MinusNode(e1, e2);
                :}					
                | exp:e1 TIMES exp:e2
                {: RESULT = new TimesNode(e1, e2);
                :}	
                | exp:e1 DIVIDE exp:e2
                {: RESULT = new DivideNode(e1, e2);
                :}	
                | NOT exp:e
                {: RESULT = new NotNode(e);
                :}	
                | exp:e1 AND exp:e2
                {: RESULT = new AndNode(e1, e2);
                :}	
                | exp:e1 OR exp:e2
                {: RESULT = new OrNode(e1, e2);
                :}	
                | exp:e1 EQUALS exp:e2
                {: RESULT = new EqualsNode(e1, e2);
                :}	
                | exp:e1 NOTEQUALS exp:e2
                {: RESULT = new NotEqualsNode(e1, e2);
                :}	
                | exp:e1 LESS exp:e2
                {: RESULT = new LessNode(e1, e2);
                :}	
                | exp:e1 GREATER exp:e2
                {: RESULT = new GreaterNode(e1, e2);
                :}	
                | exp:e1 LESSEQ exp:e2
                {: RESULT = new LessEqNode(e1, e2);
                :}	
                | exp:e1 GREATEREQ exp:e2
                {: RESULT = new GreaterEqNode(e1, e2);
                :}	
                | MINUS exp:e
                {: RESULT = new UnaryMinusNode(e);
                :}	
                | term:t
                {: RESULT = t;
                :}
                ;	
				
term            ::= loc:lc
                {: RESULT = lc;
                :}
				| INTLITERAL:i
				{: RESULT = new IntLitNode(i.lineNum, i.charNum, i.intVal);
				:}
				| STRINGLITERAL:s
				{: RESULT = new StringLitNode(s.lineNum, s.charNum, s.strVal);
				:}
				| TRUE:t
				{: RESULT = new TrueNode(t.lineNum, t.charNum);
				:}
				| FALSE:f
				{: RESULT = new FalseNode(f.lineNum, f.charNum);
				:}
				| LPAREN exp:e RPAREN
				{: RESULT = e;
				:}
				| fncall:f
				{: RESULT = f;
				:}
                ;	

fncall          ::= id:i LPAREN RPAREN
                {: RESULT = new CallExpNode(i, 
				                new ExpListNode(new LinkedList<ExpNode>()));
				:}
				| id:i LPAREN actualList:al RPAREN
                {: RESULT = new CallExpNode(i, new ExpListNode(al));
				:}
				;
				
actualList      ::= exp:e
                {: LinkedList<ExpNode> list = new LinkedList<ExpNode>();
				   list.addLast(e);
				   RESULT = list;
				:}
				| actualList:al COMMA exp:e
				{: al.addLast(e);
				   RESULT = al;
				:}
				;

type            ::= INT
                {: RESULT = new IntNode();
                :}
                | BOOL
                {: RESULT = new BoolNode();
                :}
                | VOID
                {: RESULT = new VoidNode();
                :}
                ;

loc             ::= id:i
                {: RESULT = i;
				:}
				| loc:lc DOT id:i
				{: RESULT = new DotAccessExpNode(lc, i);
				:}
				;				
				
id              ::= ID:i
                {: RESULT = new IdNode(i.lineNum, i.charNum, i.idVal);
                :}
                ;
				                                                                                                                                                                                                                                                                                                                                                                                           minim.jlex                                                                                          0000666 0002035 0002035 00000024115 14210776367 012073  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  import java_cup.runtime.*; // defines the Symbol class

// The generated scanner will return a Symbol for each token that it finds.
// A Symbol contains an Object field named value; that field will be of type
// TokenVal, defined below.
//
// A TokenVal object contains the line number on which the token occurs as
// well as the number of the character on that line that starts the token.
// Some tokens (literals and IDs) also include the value of the token.
  
class TokenVal {
  // fields
    int lineNum;
    int charNum;
  // constructor
    TokenVal(int lineNum, int charNum) {
        this.lineNum = lineNum;
        this.charNum = charNum;
    }
}
  
class IntLitTokenVal extends TokenVal {
  // new field: the value of the integer literal
    int intVal;
  // constructor
    IntLitTokenVal(int lineNum, int charNum, int intVal) {
        super(lineNum, charNum);
        this.intVal = intVal;
    }
}
  
class IdTokenVal extends TokenVal {
  // new field: the value of the identifier
    String idVal;
  // constructor
    IdTokenVal(int lineNum, int charNum, String idVal) {
        super(lineNum, charNum);
        this.idVal = idVal;
    }
}
  
class StrLitTokenVal extends TokenVal {
  // new field: the value of the string literal
    String strVal;
  // constructor
    StrLitTokenVal(int lineNum, int charNum, String strVal) {
        super(lineNum, charNum);
        this.strVal = strVal;
    }
}
  
// The following class is used to keep track of the character number at 
// which the current token starts on its line.
class CharNum {
    static int num = 1;
}
%%

DIGIT=        [0-9]
WHITESPACE=   [\040\t]
LETTER=       [a-zA-Z]
ESCAPEDCHAR=   [nt'\"?\\]
NOTNEWLINEORESCAPEDCHAR=   [^\nnt'\"?\\]
NOTNEWLINEORQUOTE= [^\n\"]
NOTNEWLINEORQUOTEORESCAPE= [^\n\"\\]

%implements java_cup.runtime.Scanner
%function next_token
%type java_cup.runtime.Symbol

%eofval{
return new Symbol(sym.EOF);
%eofval}

%line

%%

"bool"    { Symbol S = new Symbol(sym.BOOL, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"int"     { Symbol S = new Symbol(sym.INT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"void"    { Symbol S = new Symbol(sym.VOID, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"true"    { Symbol S = new Symbol(sym.TRUE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"false"   { Symbol S = new Symbol(sym.FALSE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"struct"  { Symbol S = new Symbol(sym.STRUCT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

"input"   { Symbol S = new Symbol(sym.INPUT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"disp"    { Symbol S = new Symbol(sym.DISP, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"if"      { Symbol S = new Symbol(sym.IF, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"else"    { Symbol S = new Symbol(sym.ELSE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"while"   { Symbol S = new Symbol(sym.WHILE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"return"  { Symbol S = new Symbol(sym.RETURN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
({LETTER}|"_")({LETTER}|{DIGIT}|"_")* {
            Symbol S = new Symbol(sym.ID, 
                             new IdTokenVal(yyline+1, CharNum.num, yytext()));
            CharNum.num += yytext().length();
            return S;
          }

{DIGIT}+  { double val = Double.parseDouble(yytext());
            int intVal;
            if (val > Integer.MAX_VALUE) {
                ErrMsg.warn(yyline+1, CharNum.num,
                            "integer literal too large; using max value");
                intVal = Integer.MAX_VALUE;
            } else {
                intVal = Integer.parseInt(yytext());
            }
            Symbol S = new Symbol(sym.INTLITERAL,
                             new IntLitTokenVal(yyline+1, CharNum.num, intVal));
            CharNum.num += yytext().length();
            return S;
          }

          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*\" {
            String strVal = yytext();
            Symbol S = new Symbol(sym.STRINGLITERAL,
                             new StrLitTokenVal(yyline+1, CharNum.num, strVal));
            CharNum.num += yytext().length();
            return S;
          }
          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})* {
            // unterminated string
            ErrMsg.fatal(yyline+1, CharNum.num,
                         "ignoring unterminated string literal");
          }
          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*\\{NOTNEWLINEORESCAPEDCHAR}({NOTNEWLINEORQUOTE})*\" {
            // bad escape character
            ErrMsg.fatal(yyline+1, CharNum.num,
                         "ignoring string literal with bad escaped character");
            CharNum.num += yytext().length();
          }
          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*(\\{NOTNEWLINEORESCAPEDCHAR})?({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*\\? {
            // bad escape character
            ErrMsg.fatal(yyline+1, CharNum.num,
             "ignoring unterminated string literal with bad escaped character");
          }          
          
\n        { CharNum.num = 1; }

{WHITESPACE}+  { CharNum.num += yytext().length(); }

("//*"|"%")[^\n]*  { // comment - ignore. Note: don't need to update char num 
            // since everything to end of line will be ignored
          }

"{"       { Symbol S = new Symbol(sym.LCURLY, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"}"       { Symbol S = new Symbol(sym.RCURLY, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
"("       { Symbol S = new Symbol(sym.LPAREN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

")"       { Symbol S = new Symbol(sym.RPAREN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

";"       { Symbol S = new Symbol(sym.SEMICOLON, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
","       { Symbol S = new Symbol(sym.COMMA, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }          
          
"."       { Symbol S = new Symbol(sym.DOT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }          
          
"<<"      { Symbol S = new Symbol(sym.WRITE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

">>"      { Symbol S = new Symbol(sym.READ, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }
          
"++"      { Symbol S = new Symbol(sym.PLUSPLUS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

"--"      { Symbol S = new Symbol(sym.MINUSMINUS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"+"       { Symbol S = new Symbol(sym.PLUS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
"-"       { Symbol S = new Symbol(sym.MINUS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }          
          
"*"       { Symbol S = new Symbol(sym.TIMES, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }              
          
"/"       { Symbol S = new Symbol(sym.DIVIDE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"!"       { Symbol S = new Symbol(sym.NOT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
"&&"      { Symbol S = new Symbol(sym.AND, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

"||"      { Symbol S = new Symbol(sym.OR, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

"=="      { Symbol S = new Symbol(sym.EQUALS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }
          
"!="      { Symbol S = new Symbol(sym.NOTEQUALS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }          
          
"<"       { Symbol S = new Symbol(sym.LESS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }              
          
">"       { Symbol S = new Symbol(sym.GREATER, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"<="      { Symbol S = new Symbol(sym.LESSEQ, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

">="      { Symbol S = new Symbol(sym.GREATEREQ, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }          

"="       { Symbol S = new Symbol(sym.ASSIGN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }    

.         { ErrMsg.fatal(yyline+1, CharNum.num,
                         "ignoring illegal character: " + yytext());
            CharNum.num++;
          }
                                                                                                                                                                                                                                                                                                                                                                                                                                                   P4.java                                                                                             0000666 0002035 0002035 00000003613 14222075400 011203  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  import java.io.*;
import java_cup.runtime.*;

/****
 * Main program to test the minim parser.
 *
 * There should be 2 command-line arguments:
 * 1. the file to be parsed
 * 2. the output file into which the AST built by the parser should be unparsed
 ****/

public class P4 {
    public static void main(String[] args)
        throws IOException // may be thrown by the scanner
    {
        // check for command-line args
        if (args.length != 2) {
            System.err.println("please supply name of file to be parsed " +
			                   "and name of file for unparsed version");
            System.exit(-1);
        }

        // open input file
        FileReader inFile = null;
        try {
            inFile = new FileReader(args[0]);
        } catch (FileNotFoundException ex) {
            System.err.println("file " + args[0] + " not found");
            System.exit(-1);
        }

        // open output file
        PrintWriter outFile = null;
        try {
            outFile = new PrintWriter(args[1]);
        } catch (FileNotFoundException ex) {
            System.err.println("file " + args[1] +
                               " could not be opened for writing");
            System.exit(-1);
        }

        parser P = new parser(new Yylex(inFile));

        Symbol root = null; // the parser will return a Symbol whose value
                            // field is the translation of the root nonterminal
                            // (i.e., of the nonterminal "program")

        try {
            root = P.parse(); // do the parse
            System.out.println ("program parsed correctly");
        } catch (Exception ex){
            System.err.println("exception occured during parse: " + ex);
            System.exit(-1);
        }
		
		// ****** Add name analysis part here ******
		
        ((ASTnode)root.value).unparse(outFile, 0);
        outFile.close();

        return;
    }
}
                                                                                                                     Sym.java                                                                                            0000666 0002035 0002035 00000000277 14222101145 011467  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  public class Sym {
	private String type;
	
	public Sym(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return type;
	}
}

                                                                                                                                                                                                                                                                                                                                 SymTable.java                                                                                       0000666 0002035 0002035 00000002713 14222101164 012435  0                                                                                                    ustar   hasti                           hasti                                                                                                                                                                                                                  import java.util.*;

public class SymTable {
	private List<HashMap<String, Sym>> list;
	
	public SymTable() {
		list = new LinkedList<HashMap<String, Sym>>();
		list.add(new HashMap<String, Sym>());
	}
	
	public void addDecl(String name, Sym sym) 
	throws DuplicateSymException, EmptySymTableException {
		if (name == null || sym == null)
			throw new IllegalArgumentException();
		
		if (list.isEmpty())
			throw new EmptySymTableException();
		
		HashMap<String, Sym> symTab = list.get(0);
		if (symTab.containsKey(name))
			throw new DuplicateSymException();
		
		symTab.put(name, sym);
	}
	
	public void addScope() {
		list.add(0, new HashMap<String, Sym>());
	}
	
	public Sym lookupLocal(String name) 
	throws EmptySymTableException {
		if (list.isEmpty())
			throw new EmptySymTableException();
		
		HashMap<String, Sym> symTab = list.get(0); 
		return symTab.get(name);
	}
	
	public Sym lookupGlobal(String name) 
	throws EmptySymTableException {
		if (list.isEmpty())
			throw new EmptySymTableException();
		
		for (HashMap<String, Sym> symTab : list) {
			Sym sym = symTab.get(name);
			if (sym != null)
				return sym;
		}
		return null;
	}
	
	public void removeScope() throws EmptySymTableException {
		if (list.isEmpty())
			throw new EmptySymTableException();
		list.remove(0);
	}
	
	public void print() {
		System.out.print("\n** Sym Table **\n");
		for (HashMap<String, Sym> symTab : list) {
			System.out.println(symTab.toString());
		}
		System.out.println();
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     