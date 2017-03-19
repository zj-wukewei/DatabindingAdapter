# DatabindingAdapter
databinding版本的adapter


## Usage

#### Step 1. Create a class implements LayoutResId, for example:

```java
public class ImageModel implements LayoutResId {

    private String name;
    private String avater;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAvater() {
        return avater;
    }


    public void setAvater(String avater) {
        this.avater = avater;
    }


    @Override
    public int getLayoutRes() {
        return R.layout.layout_item_two;
    }
}
```

#### Step 2.  SuperAdapter , for example:

```java

    SuperAdapter<LayoutResId> mAdapter;
    SuperAdapter<UserModel> mSingleTypeAdapter;


    for (int i = 0; i < 20; i++) {
                UserModel user = new UserModel();
                user.setName("wukewei");
                user.setAvater("wukewei lover");
                ImageModel image = new ImageModel();
                image.setName("1111111");
                image.setAvater("22222222222");
                mDatas.add(image);
                mDatas.add(user);
            }
            mAdapter = new SuperAdapter<>(this);
            mSingleTypeAdapter = new SuperAdapter<>(this);
            mAdapter.addAll(mDatas);
            mBinding.rv.setLayoutManager(new LinearLayoutManager(this));
            mBinding.rv.setAdapter(mAdapter);

```

# Special thanks
https://github.com/markzhai/DataBindingAdapter

License
-------

    Copyright 2016 wukewei.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
