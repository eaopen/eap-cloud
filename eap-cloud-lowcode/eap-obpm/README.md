集成OpenBPM的两种方式：
方式一： 调用OpenBPM的服务，类似微服务调用方式
方式二： 将OpenBPM合并到EAP作为单体模块(暂不考虑)

默认采用方式一，集成已有的OpenBPM项目
独立OpenBPM服务
eap-module-obpm/eap-obpm-server

特别需要注意用户整合方式：
方式一: 分开用户管理，用户和组织进行同步
eap-module-lowcode/eap-integration-obpm

方式二: 合并采用eap用户，obpm需要做用户集成
eap-module-obpm/eap-obpm-adapter

长期方案：
OpenBPM服务独立，但集成eap用户

短期方案：
OpenBPM服务独立，用户也分开

