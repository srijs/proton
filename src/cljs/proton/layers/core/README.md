## Core configuration layer

This layer contains the base functionality of proton.

### Install

The core layer should get included by default. No installation needed.

### Configuration

- `proton.core.showTabBar`: Whether the tab bar should be visible by default
- `proton.core.relativeLineNumbers`: Whether relative line numbers should be enabled by default
- `proton.core.quickOpenProvider`: Which provider should be used for cmd+p and friends. Values are `:normal` or `:nuclide`. Nuclide replaces all QuickOpens with facebook nuclide ones. 
