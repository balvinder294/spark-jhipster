import { NgModule } from '@angular/core';

import { SparkhipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [SparkhipsterSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [SparkhipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class SparkhipsterSharedCommonModule {}
