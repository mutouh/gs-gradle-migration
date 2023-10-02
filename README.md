# gs-gradle-migration

Demo project for migrating from maven to gradle.

## project structure

```shell
gs-gradle-migration
├── multi-module-shop
│   ├── gradle
│   ├── multi-module-shop-common
│   ├── multi-module-shop-product
│   ├── build.gradle
│   ├── gradlew
│   ├── gradlew.bat
│   ├── pom.xml
│   └── settings.gradle
└── README.md
```

- multi-module-shop: first demo project which also is a multi-module project
- multi-module-shop-product: submodule of shop, also an application
- multi-module-shop-common: submodule of shop, also a dependency of `multi-module-shop-product`
