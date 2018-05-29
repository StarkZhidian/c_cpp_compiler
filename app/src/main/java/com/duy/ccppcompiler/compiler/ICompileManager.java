/*
 * Copyright 2018 Mr Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.ccppcompiler.compiler;

import android.support.annotation.MainThread;

import com.duy.ccppcompiler.compiler.shell.CommandResult;

import java.io.File;

/**
 * Created by Duy on 25-Apr-18.
 */

public interface ICompileManager {
    @MainThread
    void onNewMessage(CharSequence charSequence);


    /**
     * This method will be call to prepare UI
     */
    @MainThread
    void onPrepareCompile();

    /**
     * Compile source files
     */
    @MainThread
    void compile(File[] srcFiles);

    /**
     * This method will be call when compile success
     */
    @MainThread
    void onCompileSuccess(CommandResult compileResult);

    /**
     * This method will be call when compile failed with error
     */
    @MainThread
    void onCompileFailed(CommandResult compileResult);

}
