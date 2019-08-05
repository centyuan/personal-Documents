awk语言的最基本功能是在文件或者字符串中基于指定规则浏览和抽取信息，awk抽取信息后，才能进行其他文本操作。完整的awk脚本通常用来格式化文本文件中的信息。

1:只查看test.txt文件（100行）内第20到第30行的内容（企业面试）
awk '{if(NR>=20 && NR<=30) print $1}' test.txt  
2:已知
  cat test.txt
I am Poe,my qq is 33794712
命令: awk -F '[ ,]+' '{print $3" "$7}' test.txt  #-F以什么分割

