/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { SparkhipsterTestModule } from '../../../test.module';
import { BookDetailComponent } from 'app/entities/book/book-detail.component';
import { Book } from 'app/shared/model/book.model';

describe('Component Tests', () => {
    describe('Book Management Detail Component', () => {
        let comp: BookDetailComponent;
        let fixture: ComponentFixture<BookDetailComponent>;
        const route = ({ data: of({ book: new Book('9fec3727-3421-4967-b213-ba36557ca194') }) } as any) as ActivatedRoute;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [SparkhipsterTestModule],
                declarations: [BookDetailComponent],
                providers: [{ provide: ActivatedRoute, useValue: route }]
            })
                .overrideTemplate(BookDetailComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(BookDetailComponent);
            comp = fixture.componentInstance;
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
                // GIVEN

                // WHEN
                comp.ngOnInit();

                // THEN
                expect(comp.book).toEqual(jasmine.objectContaining({ id: '9fec3727-3421-4967-b213-ba36557ca194' }));
            });
        });
    });
});
